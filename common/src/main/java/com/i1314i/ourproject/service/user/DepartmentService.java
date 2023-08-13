package com.i1314i.ourproject.service.user;

import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.department.Department;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.po.zTree.Node;

import java.util.List;

/**
 * 部门业务层
 * @author 平行时空
 * @created 2018-10-14 11:55
 **/
public interface DepartmentService {
    List<Department> findDepartmentList();
    List<Department>findSelfDepartmentList(User user);
    List<Department> listParents();
    Department findDepartmentById(String id);
    List<Department>listDepartmentByParent(User user);
    PageInfo<Department> selectListDepartmentsPage(PageBean pageBean,User user);
    List<Department> selectListDepartmentsPage(User user);

    ResultMap saveDepartment(Department department);

    ResultMap insertDepartment(Department department);

    Integer delDepartment(String id);
}
