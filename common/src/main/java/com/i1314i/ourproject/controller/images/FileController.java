package com.i1314i.ourproject.controller.images;


import com.i1314i.ourproject.annotation.LogAnnotation;
import com.i1314i.ourproject.mapper.FileMapper;
import com.i1314i.ourproject.po.file.FileInfo;
import com.i1314i.ourproject.po.file.LayuiFile;
import com.i1314i.ourproject.service.file.FileService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.FileUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(tags = "文件")
@RestController
@RequestMapping("/files")
public class FileController {

	@Autowired
	private FileService fileServices;
	@Autowired
	private FileMapper fileMapper;

	@LogAnnotation
	@PostMapping
	@ApiOperation(value = "文件上传")
	public FileInfo uploadFile(MultipartFile file) throws IOException {
		return fileServices.save(file);
	}

	/**
	 * layui富文本文件自定义上传
	 * 
	 * @param file
	 * @param domain
	 * @return
	 * @throws IOException
	 */
	@LogAnnotation
	@PostMapping("/layui")
	@ApiOperation(value = "layui富文本文件自定义上传")
	public LayuiFile uploadLayuiFile(MultipartFile file, String domain) throws IOException {
		FileInfo fileInfo = fileServices.save(file);

		LayuiFile layuiFile = new LayuiFile();
		layuiFile.setCode(0);
		LayuiFile.LayuiFileData data = new LayuiFile.LayuiFileData();
		layuiFile.setData(data);
		data.setSrc(domain + "/files" + fileInfo.getUrl());
		data.setTitle(file.getOriginalFilename());

		return layuiFile;
	}




//	@GetMapping
//	@ApiOperation(value = "文件查询")
//	@RequiresPermissions("sys:file:query")
//	public PageTableResponse listFiles(PageTableRequest request) {
//		return new PageTableHandler(new CountHandler() {
//
//			@Override
//			public int count(PageTableRequest request) {
//				return fileInfoDao.count(request.getParams());
//			}
//		}, new ListHandler() {
//
//			@Override
//			public List<FileInfo> list(PageTableRequest request) {
//				List<FileInfo> list = fileInfoDao.list(request.getParams(), request.getOffset(), request.getLimit());
//				return list;
//			}
//		}).handle(request);
//	}

	@LogAnnotation
	@DeleteMapping("/{id}")
	@ApiOperation(value = "文件删除")
	@RequiresPermissions("sys:file:del")
	public void delete(@PathVariable String id) {
		fileServices.delete(id);
	}



	@RequestMapping(value = "/uploadImage")
	private void uploadImage(HttpServletRequest request, HttpServletResponse response, @RequestParam MultipartFile[] upload) {

		response.setCharacterEncoding("UTF-8");
		//response.setHeader("X-Frame-Options", "SAMEORIGIN");
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		String callback = request.getParameter("CKEditorFuncNum");

		// 获得response,request
		Map<String, Object> m = new HashMap<String, Object>();

		if (!ServletFileUpload.isMultipartContent(request)) {
			m.put("error", 1);
			m.put("message", "请选择文件!");
		}

		String originalFileName = null;//上传的图片文件名
		String fileExtensionName = null;//上传图片的文件扩展名
		for (MultipartFile file : upload) {
			if (file.getSize() > 20 * 1024 * 1024) {
				out.println("<script type=\"text/javascript\">");
				out.println("window.parent.CKEDITOR.tools.callFunction(" + callback
						+ ",''," + "'文件大小不得大于20M');");
				out.println("</script>");

			}

			originalFileName = file.getOriginalFilename();

			fileExtensionName = originalFileName.substring(
					originalFileName.lastIndexOf("."), originalFileName.length()).toLowerCase();

			String[] imageExtensionNameArray = WebsiteConstant.IMAGE_EXTENSION_NAME_ARRAY;

			String allImageExtensionName = "";
			boolean isContain = false;//默认不包含上传图片文件扩展名
			for (int i = 0; i < imageExtensionNameArray.length; i++) {
				if (fileExtensionName.equals(imageExtensionNameArray[i])) {
					isContain = true;
				}
				if (i == 0) {
					allImageExtensionName += imageExtensionNameArray[i];
				} else {
					allImageExtensionName += " , " + imageExtensionNameArray[i];
				}

			}

			String newFileName = java.util.UUID.randomUUID().toString() + fileExtensionName;
			String uploadPath = WebsiteConstant.PIC_APP_FILE_SYSTEM_CKEDITOR_LOCATION;
			if (isContain) {//包含
				File pathFile = new File(uploadPath);
				if (!pathFile.exists()) { // 如果路径不存在，创建
					pathFile.mkdirs();
				}
				try {
					FileUtils.copyInputStreamToFile(file.getInputStream(), new File(uploadPath, newFileName));
					//    InputStream is=file.getInputStream();
					//    File toFile = new File(uploadPath, newFileName);
					//    OutputStream os = new FileOutputStream(toFile);
					//    byte[] buffer = new byte[1024];
					//    int length = 0;
					//    while ((length = is.read(buffer)) > 0) {
					//     os.write(buffer, 0, length);
					//    }
					//    is.close();
					//    os.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
				String imageUrl = WebsiteConstant.PIC_APP_SERVER_URL + "images/ckeditor/" + newFileName;
				// 返回"图像信息"选项卡并显示图片 ,在对应的文本框中显示图片资源url
				out.println("<script type=\"text/javascript\">");
				out.println("window.parent.CKEDITOR.tools.callFunction(" + callback
						+ ",'" + imageUrl + "','')");
				out.println("</script>");

			} else {
				out.println("<script type=\"text/javascript\">");
				out.println("window.parent.CKEDITOR.tools.callFunction(" + callback
						+ ",''," + "'文件格式不正确（必须为" + allImageExtensionName + "文件）');");
				out.println("</script>");
			}

		}
	}

	public static class WebsiteConstant {
		public static String[] IMAGE_EXTENSION_NAME_ARRAY = {".jpg", ".jpeg", ".png", ".gif", ".bmp"};
		public  static String PIC_APP_SERVER_URL = TemplateUtils.getPropertiesdata("other.properties","ckeditor.image.service.url");
		public  static String PIC_APP_FILE_SYSTEM_CKEDITOR_LOCATION = TemplateUtils.getPropertiesdata("other.properties","ckeditor.image.service.location");
		public  final int SUCCESS = 1; // 操作成功
	}
}
