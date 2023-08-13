package com.i1314i.ourproject.po.log;

import com.i1314i.ourproject.utils.time.TimeTranUtil;

import java.text.ParseException;
import java.util.Date;

/**
 * @author 平行时空
 * @created 2018-12-10 17:05
 **/
public class RequestLogs implements Comparable<RequestLogs>{
    private String f_request_sysname;
    private String f_request_modelname;
    private String f_request_start;
    private String f_request_end;
    private String f_request_ip;
    private String f_request_user;
    private String f_operation_type;
    private String f_operation_desc;
    private Long f_operator_id;
    private String f_operator_name;
    private String f_logtype;
    private String f_exception_dsc;


    public String getF_request_sysname() {
        return f_request_sysname;
    }

    public void setF_request_sysname(String f_request_sysname) {
        this.f_request_sysname = f_request_sysname;
    }

    public String getF_request_modelname() {
        return f_request_modelname;
    }

    public void setF_request_modelname(String f_request_modelname) {
        this.f_request_modelname = f_request_modelname;
    }

    public String getF_request_start() {
        return f_request_start;
    }

    public void setF_request_start(String f_request_start) {
        this.f_request_start = f_request_start;
    }

    public String getF_request_end() {
        return f_request_end;
    }

    public void setF_request_end(String f_request_end) {
        this.f_request_end = f_request_end;
    }

    public String getF_request_ip() {
        return f_request_ip;
    }

    public void setF_request_ip(String f_request_ip) {
        this.f_request_ip = f_request_ip;
    }

    public String getF_request_user() {
        return f_request_user;
    }

    public void setF_request_user(String f_request_user) {
        this.f_request_user = f_request_user;
    }

    public String getF_operation_type() {
        return f_operation_type;
    }

    public void setF_operation_type(String f_operation_type) {
        this.f_operation_type = f_operation_type;
    }

    public String getF_operation_desc() {
        return f_operation_desc;
    }

    public void setF_operation_desc(String f_operation_desc) {
        this.f_operation_desc = f_operation_desc;
    }

    public Long getF_operator_id() {
        return f_operator_id;
    }

    public void setF_operator_id(Long f_operator_id) {
        this.f_operator_id = f_operator_id;
    }

    public String getF_operator_name() {
        return f_operator_name;
    }

    public void setF_operator_name(String f_operator_name) {
        this.f_operator_name = f_operator_name;
    }

    public String getF_logtype() {
        return f_logtype;
    }

    public void setF_logtype(String f_logtype) {
        this.f_logtype = f_logtype;
    }

    public String getF_exception_dsc() {
        return f_exception_dsc;
    }

    public void setF_exception_dsc(String f_exception_dsc) {
        this.f_exception_dsc = f_exception_dsc;
    }

    @Override
    public int compareTo(RequestLogs o) {
            return (int) (o.f_operator_id-this.f_operator_id);
    }

}
