package com.i1314i.ourproject.controller.api;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.mapper.DictMapper;

import com.i1314i.ourproject.po.Dict;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/dicts")
public class DictController {
	@Autowired
	private ResultMap resultMap;
	@Autowired
	private DictMapper dictMapper;

	@RequiresPermissions("dict:add")
	@PostMapping
	@ApiOperation(value = "保存")
	public ResultMap save(@RequestBody Dict dict) {
		Dict d = dictMapper.getByTypeAndK(dict.getType(), dict.getK());
		if (d != null) {
			return resultMap.start().code("100").msg("类型和key已存在");
		}
		dictMapper.save(dict);

		 return resultMap.start().code("200").msg("保存成功").data(dict);
	}

	@GetMapping("/{id}")
	@ApiOperation(value = "根据id获取")
	public Dict get(@PathVariable Long id) {
		return dictMapper.getById(id);
	}

	@RequiresPermissions("dict:add")
	@PutMapping
	@ApiOperation(value = "修改")
	public ResultMap update(@RequestBody Dict dict) {

		try{
			dictMapper.update(dict);
			return resultMap.start().code("200").msg("修改成功");
		}catch (Exception e){

		}
		return resultMap.start().code("100").msg("修改失败");
	}

	@RequiresPermissions("dict:query")
	@PostMapping(value = "/dictsList")
	@ApiOperation(value = "列表")
	public ResultMap list(@RequestBody Dict dict, HttpServletRequest request) {
		try {
			PageHelper.startPage(dict.getCurrentPage(),dict.getPageSize());
			List<Dict>dictList=dictMapper.list(dict);
			PageInfo<Dict> pageInfo = new PageInfo<Dict>(dictList);
			return resultMap.start().code("200").msg("获取信息成功").data(pageInfo);
		}catch (Exception e){
			return resultMap.start().code("100").msg("获取信息失败");
		}
	}



	@RequiresPermissions("dict:del")
	@DeleteMapping("/{id}")
	@ApiOperation(value = "删除")
	public void delete(@PathVariable Long id) {
		dictMapper.delete(id);
	}

	@GetMapping(params = "type")
	public List<Dict> listByType(String type) {
		return dictMapper.listByType(type);
	}
}
