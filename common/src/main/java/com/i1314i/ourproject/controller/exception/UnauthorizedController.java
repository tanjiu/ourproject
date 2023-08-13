package com.i1314i.ourproject.controller.exception;


import com.i1314i.ourproject.po.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * @author 平行时空
 * @created 2018-09-21 17:22
 **/

@RestController
public class UnauthorizedController {
    @Autowired
    private ResultMap resultMap;
    @RequestMapping(path = "/unauthorized/{message}")
    public ResultMap unauthorized(@PathVariable String message) throws UnsupportedEncodingException {
        return resultMap.start().code("400").msg(message);
    }
}
