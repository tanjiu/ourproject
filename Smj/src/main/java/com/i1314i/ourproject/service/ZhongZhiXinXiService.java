package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.ZhongZhiXinXiMapper;
import com.i1314i.ourproject.po.javabean.ZhongZhiXinXi;
import com.i1314i.ourproject.po.javabean.ZhongZhiXinXiExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 叹久
 * @create 2019-03-01 20:02
 */
@Service
public class ZhongZhiXinXiService {

    @Autowired
    private ZhongZhiXinXiMapper zhongZhiXinXiMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<ZhongZhiXinXi> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            ZhongZhiXinXiExample zhongZhiXinXiExample = new ZhongZhiXinXiExample();
            List<ZhongZhiXinXi> list = zhongZhiXinXiMapper.selectByExample(null);
            return list;
        } else {
            ZhongZhiXinXiExample zhongZhiXinXiExample = new ZhongZhiXinXiExample();
            List<ZhongZhiXinXi> list = zhongZhiXinXiMapper.selectByExample(null);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<ZhongZhiXinXi> getAll() {
        ZhongZhiXinXiExample zhongZhiXinXiExample = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = zhongZhiXinXiExample.createCriteria();
        List<ZhongZhiXinXi> list = zhongZhiXinXiMapper.selectByExample(null);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(ZhongZhiXinXi zhongZhiXinXi) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            zhongZhiXinXi.setBumen(bumen);
//        } else {
//            zhongZhiXinXi.setBumen(0);
//        }
        //判断如果存在该条数据，就删除后加入
        ZhongZhiXinXiExample example = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andJieDaoMingChengEqualTo(zhongZhiXinXi.getJieDaoMingCheng());
        List<ZhongZhiXinXi> list = zhongZhiXinXiMapper.selectByExample(example);
        if (list.size() > 0) {
            zhongZhiXinXiMapper.deleteByExample(example);
        }
        int n = zhongZhiXinXiMapper.insertSelective(zhongZhiXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public ZhongZhiXinXi getZhongZhiXinXiByPrimaryKey(int id) {
        ZhongZhiXinXiExample example = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andJieDaoIdEqualTo(id);
        List<ZhongZhiXinXi> list = zhongZhiXinXiMapper.selectByExample(example);
        if (list.size() > 0)
            return list.get(0);
        return null;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        ZhongZhiXinXiExample example = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andJieDaoIdEqualTo(id);
        int n = zhongZhiXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        ZhongZhiXinXiExample example = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andJieDaoIdIn(ids);
        int n = zhongZhiXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(ZhongZhiXinXi zhongZhiXinXi, HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        ZhongZhiXinXiExample example = new ZhongZhiXinXiExample();
        ZhongZhiXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andJieDaoIdEqualTo(zhongZhiXinXi.getJieDaoId());
        int n = zhongZhiXinXiMapper.updateByPrimaryKeySelective(zhongZhiXinXi);
        if (n > 0)
            return true;
        return false;
    }


}
