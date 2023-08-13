package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HudongMapper;
import com.i1314i.ourproject.po.javabean.Hudong;
import com.i1314i.ourproject.po.javabean.HudongExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-10-05 21:16
 */
@Service
public class
HudongService {
    @Autowired
    HudongMapper huDongMapper;


    /**
     * 获取所有数据
     *
     * @return
     */
    public List<Hudong> getAll() {
        return huDongMapper.selectByExample(null);
    }

    /**
     * 插入一条数据
     */
    public boolean insert(
            Hudong huDong) {
        int n = huDongMapper.insertSelective(huDong);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询一条数据
     */
    public Hudong getDataByPrimaryKey(int id) {

        Hudong huDong = huDongMapper.selectByPrimaryKey(id);
        return huDong;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = huDongMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {

        HudongExample example = new
                HudongExample();

        HudongExample.Criteria criteria = example.createCriteria();
        criteria.andHudongIdIn(ids);
        int n = huDongMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据留言内容进行模糊搜索
     */
    public List<
            Hudong> getByContent(String content) {

        HudongExample example = new
                HudongExample();

        HudongExample.Criteria criteria = example.createCriteria();
        criteria.andContentLike("%" + content + "%");
        List<
                Hudong> list = huDongMapper.selectByExample(example);
        return list;
    }
}
