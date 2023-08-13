package com.i1314i.ourproject.mapper;

import com.i1314i.ourproject.po.department.Department;
import com.i1314i.ourproject.po.shiro.Permission;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @author 平行时空
 * @created 2018-10-14 14:58
 **/
@Mapper
public interface DepartmentMapper {
  List<Department>findAllDepartmentList();
//  List<Department> findSelfDepartmentList(String departmentId);
  Department findDepartmentById(String departmentId);
  List<Department> listParents();
  List<Department> listByParent(String parentId);
  Integer saveDepartment(Department department);
  Integer insertDepartment(Department department);

  Integer delDepartment(@Param("id") String id);
}
