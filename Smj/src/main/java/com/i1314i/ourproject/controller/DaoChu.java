package com.i1314i.ourproject.controller;

import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.utils.excel.JavaPoiUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-03 16:32
 */

@RestController
public class DaoChu {
    @RequestMapping(value = "/down")
    public void down(HttpServletResponse response) throws Exception {
        JavaPoiUtil.setDownType(response,"下载文件",2003);
        List<User>users=new ArrayList<>();
        User user=new User();
        user.setUsername("test");
        user.setUserId("sss");
        users.add(user);
        String []map={"userId","username"};
        String []name={"姓名","姓名"};
        System.out.println(users.size());
        JavaPoiUtil.createWorkBooks(User.class,users,map,name).write(response.getOutputStream());

    }
}
