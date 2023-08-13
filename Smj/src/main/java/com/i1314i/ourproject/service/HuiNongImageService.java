package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HuiNongImageMapper;
import com.i1314i.ourproject.po.javabean.HuiNongImage;
import com.i1314i.ourproject.po.javabean.HuiNongImageExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 9:55
 */
@Service
public class HuiNongImageService {
    @Autowired
    HuiNongImageMapper huiNongImageMapper;

    /**
     * 获得所有有关绿化苗木的数据
     *
     * @return
     */
    public List<HuiNongImage> getAll() {
        HuiNongImageExample huiNongImageExample=new HuiNongImageExample();
        HuiNongImageExample.Criteria criteria1=huiNongImageExample.createCriteria();
        criteria1.andBeiyong1EqualTo("1");
        List<HuiNongImage> list = huiNongImageMapper.selectByExample(huiNongImageExample);
        return list;
    }

    /**
     * 插入一条数据，如果是绿化苗木，就判断如果存在就删除后再插入
     * 如果是供应信息的，则shuming字段不能重复，否则会删除后重新插入，之前的供应信息的数据图片就没了
     */
    public int insert(HuiNongImage huiNongImage) {
//        if(exists(huiNongImage.getShuming())){
//            //如果树名已经存在，就更新那一条数据
//            List<HuiNongImage> list=huiNongImageMapper.selectByName(huiNongImage.getShuming());
//            huiNongImage.setImageId(list.get(0).getImageId());
//            HuiNongImageExample example=new HuiNongImageExample();
//            HuiNongImageExample.Criteria criteria=example.createCriteria();
//            criteria.andShumingEqualTo(huiNongImage.getShuming());
//          int n=  huiNongImageMapper.updateByExampleSelective(huiNongImage,example);
//            return n;
//        }else{
//            int n = huiNongImageMapper.insertSelective(huiNongImage);
//            if (n > 0)
//                return n;
//        }
            if (exists(huiNongImage.getShuming())) {
                HuiNongImageExample example = new HuiNongImageExample();
                HuiNongImageExample.Criteria criteria = example.createCriteria();
                criteria.andShumingEqualTo(huiNongImage.getShuming());
                int h = huiNongImageMapper.deleteByExample(example);
                if (h > 0) {
                    int n = huiNongImageMapper.insertSelective(huiNongImage);
                    if (n > 0){
                        HuiNongImageExample huiNongImageExample=new HuiNongImageExample();
                        HuiNongImageExample.Criteria criteria1=huiNongImageExample.createCriteria();
                        criteria1.andShumingEqualTo(huiNongImage.getShuming());
                        List<HuiNongImage> list2=huiNongImageMapper.selectByExample(huiNongImageExample);
                        if(list2.size()>0)
                            return list2.get(0).getImageId();
                    }
                }
            }else{
                int n = huiNongImageMapper.insertSelective(huiNongImage);
                if (n > 0){
                    HuiNongImageExample huiNongImageExample=new HuiNongImageExample();
                    HuiNongImageExample.Criteria criteria1=huiNongImageExample.createCriteria();
                    criteria1.andShumingEqualTo(huiNongImage.getShuming());
                    List<HuiNongImage> list2=huiNongImageMapper.selectByExample(huiNongImageExample);
                    if(list2.size()>0)
                        return list2.get(0).getImageId();
                }
            }
        return 0;
    }


    /**
     * 插入一条数据
     */
    public int insertTest(HuiNongImage huiNongImage) {
//        if(exists(huiNongImage.getShuming())){
//            //如果树名已经存在，就更新那一条数据
//            List<HuiNongImage> list=huiNongImageMapper.selectByName(huiNongImage.getShuming());
//            huiNongImage.setImageId(list.get(0).getImageId());
//            HuiNongImageExample example=new HuiNongImageExample();
//            HuiNongImageExample.Criteria criteria=example.createCriteria();
//            criteria.andShumingEqualTo(huiNongImage.getShuming());
//          int n=  huiNongImageMapper.updateByExampleSelective(huiNongImage,example);
//            return n;
//        }else{
//            int n = huiNongImageMapper.insertSelective(huiNongImage);
//            if (n > 0)
//                return n;
//        }
        if (exists(huiNongImage.getShuming())) {
            HuiNongImageExample example = new HuiNongImageExample();
            HuiNongImageExample.Criteria criteria = example.createCriteria();
            criteria.andShumingEqualTo(huiNongImage.getShuming());
            int h = huiNongImageMapper.deleteByExample(example);
            if (h > 0) {
                int n = huiNongImageMapper.insertSelective(huiNongImage);
                if (n > 0){
                    HuiNongImageExample huiNongImageExample=new HuiNongImageExample();
                    HuiNongImageExample.Criteria criteria1=huiNongImageExample.createCriteria();
                    criteria1.andShumingEqualTo(huiNongImage.getShuming());
                    List<HuiNongImage> list2=huiNongImageMapper.selectByExample(huiNongImageExample);
                    if(list2.size()>0)
                        return list2.get(0).getImageId();
                }
            }
        }else{
            int n = huiNongImageMapper.insertSelective(huiNongImage);
            if (n > 0){
                HuiNongImageExample huiNongImageExample=new HuiNongImageExample();
                HuiNongImageExample.Criteria criteria1=huiNongImageExample.createCriteria();
                criteria1.andShumingEqualTo(huiNongImage.getShuming());
                List<HuiNongImage> list2=huiNongImageMapper.selectByExample(huiNongImageExample);
                if(list2.size()>0)
                    return list2.get(0).getImageId();
            }
        }
        return 0;
    }

    /**
     * 根据主键查询
     */
    public HuiNongImage getHuiNongImageByPrimaryKey(int id) {
        HuiNongImage huiNongImage = huiNongImageMapper.selectByPrimaryKey(id);
        return huiNongImage;
    }


    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = huiNongImageMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }
    /**
     * 根据树名删除一条数据
     */
    public boolean deleteOneByName(String shuming) {
        HuiNongImageExample example = new HuiNongImageExample();
        HuiNongImageExample.Criteria criteria = example.createCriteria();
        criteria.andShumingEqualTo(shuming);
        int n = huiNongImageMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        HuiNongImageExample example = new HuiNongImageExample();
        HuiNongImageExample.Criteria criteria = example.createCriteria();
        criteria.andImageIdIn(ids);
        int n = huiNongImageMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(HuiNongImage huiNongImage) {
        int n = huiNongImageMapper.updateByPrimaryKeySelective(huiNongImage);
        if (n > 0)
            return true;
        return false;
    }


    /**
     * 判断一条记录是否存在
     */
    public boolean exists(String shuming) {
        HuiNongImageExample huiNongImageExample = new HuiNongImageExample();
        HuiNongImageExample.Criteria criteria = huiNongImageExample.createCriteria();
        criteria.andShumingEqualTo(shuming);
        List<HuiNongImage> list = huiNongImageMapper.selectByName(shuming);
        if (list.size() > 0)
            return true;
        return false;
    }
}
