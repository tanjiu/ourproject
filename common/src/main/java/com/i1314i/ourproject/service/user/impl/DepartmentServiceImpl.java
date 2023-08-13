package com.i1314i.ourproject.service.user.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.i1314i.ourproject.mapper.DepartmentMapper;
import com.i1314i.ourproject.po.ResultMap;
import com.i1314i.ourproject.po.User;
import com.i1314i.ourproject.po.department.Department;
import com.i1314i.ourproject.po.pageHelper.PageBean;
import com.i1314i.ourproject.po.shiro.Permission;
import com.i1314i.ourproject.po.shiro.Role;
import com.i1314i.ourproject.service.user.DepartmentService;
import com.i1314i.ourproject.service.user.UserService;
import com.i1314i.ourproject.utils.common.TemplateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 平行时空
 * @created 2018-10-14 15:01
 **/
@Service("departmentServices")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Autowired
    private UserService userServices;
    @Autowired
    private ResultMap resultMap;
    @Override
    public List<Department> findDepartmentList() {
        return departmentMapper.findAllDepartmentList();
    }



    @Override
    public List<Department> findSelfDepartmentList(User user) {
        List<Department>departmentList=findDepartmentList();
        final List<Department> departments = departmentList.stream().filter(l -> l.getType().equals(1)).collect(Collectors.toList());
        List<Department> firstLevel=null;
        Department department=departmentMapper.findDepartmentById(user.getDepartment());
        if(department.getParentId().equals("0")){
           firstLevel = departments.stream().filter(p -> p.getParentId().equals("0")).collect(Collectors.toList());
        }else {
            firstLevel = departments.stream().filter(p -> p.getDepartmentId().equals(user.getDepartment())).collect(Collectors.toList());
        }
        firstLevel.parallelStream().forEach(p -> {
            setChild(p, departments);
        });
        return firstLevel;
    }

    @Override
    public List<Department> listParents() {
        return departmentMapper.listParents();
    }

    @Override
    public Department findDepartmentById(String id) {
        return departmentMapper.findDepartmentById(id);
    }

    /**
     * 根据父id查询所有子集
     * @param user
     * @return
     */
    @Override
    public List<Department> listDepartmentByParent(User user) {
        Department department=departmentMapper.findDepartmentById(user.getDepartment());
        List<Department>departmentList=new ArrayList<>();
        List<Department>departments=new ArrayList<>();
        departments.add(department);
        while (departments.size()>0){
            Department d=departments.remove(0);
            List<Department>lists=departmentMapper.listByParent(d.getDepartmentId());
            if(lists.size()>0){
                departments.addAll(lists);
                departmentList.addAll(lists);
            }
        }

        return departmentList;
    }


    /**
     * 分页查看部门列表
     * @param pageBean
     * @return
     */
    @Override
    public PageInfo<Department> selectListDepartmentsPage(PageBean pageBean,User user) {
        PageHelper.startPage(pageBean.getCurrentPage(),pageBean.getPageSize());
        List<Department> list = listDepartmentByParent(user);
        if(!StringUtils.isEmpty(pageBean.getName())){
           list=searchDepartment(list,pageBean);
        }
        PageInfo<Department> pageInfo= new PageInfo<Department>(list);
        return pageInfo;
    }


    /**
     * 查询部门数据处理
     * @param departments
     * @param pageBean
     * @return
     */
    public List<Department>searchDepartment(List<Department> departments,PageBean pageBean){
        List<Department> searchDepatment=new ArrayList<>();
        departments.stream().forEach((s)->{
            if (s.getDepartmentName().contains(pageBean.getName())||s.getDepartmentName().toLowerCase().contains(pageBean.getName())){
                searchDepatment.add(s);
            }
        });
        return searchDepatment;
    }

    @Override
    public List<Department> selectListDepartmentsPage(User user) {
        List<Department> list = listDepartmentByParent(user);
        return list;
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultMap saveDepartment(Department department) {
            departmentMapper.saveDepartment(department);
            return resultMap.start().code("200").msg("更新数据成功");
    }
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ResultMap insertDepartment(Department department) {
        department.setDepartmentId(TemplateUtils.uuid());
        departmentMapper.insertDepartment(department);
        return resultMap.start().code("200").msg("插入数据成功");
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public Integer delDepartment(String id) {

        return  departmentMapper.delDepartment(id);
    }


    /**
     * 设置子元素
     * 2018.06.09
     *
     */
    private void setChild(Department d, List<Department> departments) {
        List<Department> child = departments.parallelStream().filter(a -> a.getParentId().equals(d.getDepartmentId())&&d.getType()==1).collect(Collectors.toList());
//        d.setChild(child);
        List<User>userList=userServices.findUserListByDepartmentId(d.getDepartmentId());
        List<Department>departmentList=new ArrayList<>();
        userList.forEach(c->departmentList.add(new Department(c.getNickName(),d.getParentId(),2)));
        if(departmentList!=null&&departmentList.size()>0){
            child.addAll(departmentList);
        }
        d.setChild(child);
        if (!CollectionUtils.isEmpty(child)) {
            child.parallelStream().forEach(c -> {
                //递归设置子元素，多级菜单支持
                setChild(c, departments);
            });
        }
    }
}
