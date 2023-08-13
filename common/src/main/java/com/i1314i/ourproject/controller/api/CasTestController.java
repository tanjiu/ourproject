package com.i1314i.ourproject.controller.api;

import com.i1314i.ourproject.utils.redisToken.user.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 平行时空
 * @created 2018-12-02 12:57
 **/
@RestController
@RequestMapping("user")
public class CasTestController {
    @Autowired
    private UserUtils userUtils;
    @RequestMapping("queryUser")
    public Map<String, String> queryUser(HttpServletRequest request){
        Map<String,String> map = new HashMap<>();
        map.put("name", "jcz");
        map.put("username",  userUtils.getCurrentUser("").getUsername());

        map.put("session", request.getSession().getId());
        return map;
    }
}
