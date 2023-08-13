package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.YangZhiXinXiMapper;
import com.i1314i.ourproject.po.javabean.YangZhiXinXi;
import com.i1314i.ourproject.po.javabean.YangZhiXinXiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-01 20:50
 */
@Service
public class YangZhiService {
    @Autowired
    private YangZhiXinXiMapper yangZhiXinXiMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<YangZhiXinXi> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            YangZhiXinXiExample yangZhiXinXiExample = new YangZhiXinXiExample();
            List<YangZhiXinXi> list = yangZhiXinXiMapper.selectByExample(null);
            return list;
        } else {
            YangZhiXinXiExample yangZhiXinXiExample = new YangZhiXinXiExample();
            List<YangZhiXinXi> list = yangZhiXinXiMapper.selectByExample(null);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<YangZhiXinXi> getAll() {
        YangZhiXinXiExample yangZhiXinXiExample = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = yangZhiXinXiExample.createCriteria();
        List<YangZhiXinXi> list = yangZhiXinXiMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(YangZhiXinXi yangZhiXinXi) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            yangZhiXinXi.setBumen(bumen);
//        } else {
//            yangZhiXinXi.setBumen(0);
//        }
        //判断如果存在该条数据，就删除后加入
        YangZhiXinXiExample example = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShengChuMingChengEqualTo(yangZhiXinXi.getShengChuMingCheng());
        List<YangZhiXinXi> list = yangZhiXinXiMapper.selectByExample(example);
        if (list.size() > 0) {
            yangZhiXinXiMapper.deleteByExample(example);
        }
        int n = yangZhiXinXiMapper.insertSelective(yangZhiXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public YangZhiXinXi getYangZhiXinXiByPrimaryKey(int id) {
        YangZhiXinXiExample example = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShengChuIdEqualTo(id);
        List<YangZhiXinXi> list = yangZhiXinXiMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        return null;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        YangZhiXinXiExample example = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShengChuIdEqualTo(id);
        int n = yangZhiXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        YangZhiXinXiExample example = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShengChuIdIn(ids);
        int n = yangZhiXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(YangZhiXinXi yangZhiXinXi, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        YangZhiXinXiExample example = new YangZhiXinXiExample();
        YangZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShengChuIdEqualTo(yangZhiXinXi.getShengChuId());
        int n = yangZhiXinXiMapper.updateByPrimaryKeySelective(yangZhiXinXi);
        if (n > 0)
            return true;
        return false;
    }

}
