package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.GongYingXinXiMapper;
import com.i1314i.ourproject.mapper.HuiNongImageMapper;
import com.i1314i.ourproject.po.javabean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-12-20 9:23
 */
@Service
public class GongYingXinXiService {

    @Autowired
    GongYingXinXiMapper gongYingXinXiMapper;
    @Autowired
    HuiNongImageMapper huiNongImageMapper;
    @Autowired
    HuiNongChanPinZhongLeiService huiNongChanPinZhongLeiService;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<GongYingXinXi> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            GongYingXinXiExample gongYingXinXi = new GongYingXinXiExample();
            gongYingXinXi.setOrderByClause(" gong_ying_id desc ");
            List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(gongYingXinXi);
            for(GongYingXinXi gongYingXinXi1:list){
                if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                    HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                    gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                    System.out.println("图片路径是："+huiNongImage.getImageUrls());
                }
            }
            return list;
        } else {
            GongYingXinXiExample gongYingXinXi = new GongYingXinXiExample();
            GongYingXinXiExample.Criteria criteria = gongYingXinXi.createCriteria();
            criteria.andBumenEqualTo(bumen);
            gongYingXinXi.setOrderByClause(" gong_ying_id desc ");
            List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(gongYingXinXi);
            for(GongYingXinXi gongYingXinXi1:list){
                if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                    HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                    gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                    System.out.println("图片路径是："+huiNongImage.getImageUrls());
                }
            }
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<GongYingXinXi> getAll() {
        GongYingXinXiExample gongYingXinXi = new GongYingXinXiExample();
        gongYingXinXi.setOrderByClause(" gong_ying_id desc ");
        List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(gongYingXinXi);
        for(GongYingXinXi gongYingXinXi1:list){
            if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                System.out.println("图片路径是："+huiNongImage.getImageUrls());
            }
        }
        return list;
    }


    /**
     * 管理端获得所有审核通过的数据
     *
     * @return
     */
    public List<GongYingXinXi> getTongGuoData(HttpServletRequest request) {
        GongYingXinXiExample example = new GongYingXinXiExample();
        GongYingXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShenheEqualTo("true");
        example.setOrderByClause(" gong_ying_id desc ");
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 &&bumen != null) {
//            criteria.andBumenEqualTo(bumen);
//        }
        List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(example);
        for(GongYingXinXi gongYingXinXi1:list){
            if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                System.out.println("图片路径是："+huiNongImage.getImageUrls());
            }
        }
        return list;
    }

    /**
     * 管理端获得所有待审核的数据
     *
     * @return
     */
    public List<GongYingXinXi> getBuTongGuoData(HttpServletRequest request) {
        GongYingXinXiExample example = new GongYingXinXiExample();
        GongYingXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShenheEqualTo("false");
        example.setOrderByClause(" gong_ying_id desc ");
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            criteria.andBumenEqualTo(bumen);
//        }
        List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(example);
        for(GongYingXinXi gongYingXinXi1:list){
            if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                System.out.println("图片路径是："+huiNongImage.getImageUrls());
            }
        }
        return list;
    }

    /**
     * 管理端获得所有未审核通过的数据
     *
     * @return
     */
    public List<GongYingXinXi> getWeiTongGuoData(HttpServletRequest request) {
        GongYingXinXiExample example = new GongYingXinXiExample();
        GongYingXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andShenheEqualTo("wait");
        example.setOrderByClause(" gong_ying_id desc ");
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            criteria.andBumenEqualTo(bumen);
//        }
        List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(example);
        for(GongYingXinXi gongYingXinXi1:list){
            if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                System.out.println("图片路径是："+huiNongImage.getImageUrls());
            }
        }
        return list;
    }

    /**
     * 插入一条数据，带部门
     */
    public boolean insertAdmin(GongYingXinXi gongYingXinXi, HttpServletRequest request) {
        gongYingXinXi.setTime(new Date());
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            gongYingXinXi.setBumen(bumen);
//        } else {
//            gongYingXinXi.setBumen(0);
//        }
        int n = gongYingXinXiMapper.insertSelective(gongYingXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(GongYingXinXi gongYingXinXi) {
        gongYingXinXi.setTime(new Date());
        if(gongYingXinXi.getChanPinMingCheng()!=null){
            HuiNongChanPinZhongLei huiNongChanPinZhongLei=huiNongChanPinZhongLeiService.getDataByMingCheng(gongYingXinXi.getChanPinMingCheng());
            if(huiNongChanPinZhongLei!=null&&huiNongChanPinZhongLei.getLeiBie()!=null)
                gongYingXinXi.setBeiyong3(huiNongChanPinZhongLei.getLeiBie());
        }
        int n = gongYingXinXiMapper.insertSelective(gongYingXinXi);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public GongYingXinXi getGongYingXinXiByPrimaryKey(int id) {
        GongYingXinXi gongYingXinXi = gongYingXinXiMapper.selectByPrimaryKey(id);
        if(gongYingXinXi!=null&& gongYingXinXi.getImageId()!=null&&gongYingXinXi.getImageId()!=0){
            HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi.getImageId());
            gongYingXinXi.setImageUrl(huiNongImage.getImageUrls());
            System.out.println("图片路径是："+huiNongImage.getImageUrls());
        }
        return gongYingXinXi;
    }

    /**
     * 根据多个名称进行模糊查询审核通过的
     */
    public List<GongYingXinXi> getGongYingXinXiByMoHu(List<String> lists) {
        List<GongYingXinXi> listAll = new ArrayList<GongYingXinXi>();
        for (String aaa : lists) {
            GongYingXinXiExample example = new GongYingXinXiExample();
            example.setOrderByClause(" gong_ying_id desc");
            GongYingXinXiExample.Criteria criteria = example.createCriteria();
            criteria.andChanPinMingChengLike("%" + aaa + "%");
            criteria.andShenheEqualTo("true");
            List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(example);
            if (list.size() > 0){
                for(GongYingXinXi gongYingXinXi1:list){
                    if(gongYingXinXi1!=null&& gongYingXinXi1.getImageId()!=null&&gongYingXinXi1.getImageId()!=0){
                        HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(gongYingXinXi1.getImageId());
                        gongYingXinXi1.setImageUrl(huiNongImage.getImageUrls());
                        System.out.println("图片路径是："+huiNongImage.getImageUrls());
                    }
                }
                listAll.addAll(list);
            }

        }
        return listAll;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id) {
        int n = gongYingXinXiMapper.deleteByPrimaryKey(id);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids) {
        GongYingXinXiExample example = new GongYingXinXiExample();
        GongYingXinXiExample.Criteria criteria = example.createCriteria();
        criteria.andGongYingIdIn(ids);
        int n = gongYingXinXiMapper.deleteByExample(example);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(GongYingXinXi gongYingXinXi) {
        if(gongYingXinXi.getChanPinMingCheng()!=null){
            HuiNongChanPinZhongLei huiNongChanPinZhongLei=huiNongChanPinZhongLeiService.getDataByMingCheng(gongYingXinXi.getChanPinMingCheng());
            if(huiNongChanPinZhongLei!=null&&huiNongChanPinZhongLei.getLeiBie()!=null)
                gongYingXinXi.setBeiyong3(huiNongChanPinZhongLei.getLeiBie());
        }
        int n = gongYingXinXiMapper.updateByPrimaryKeySelective(gongYingXinXi);
        if (n > 0)
            return true;
        return false;
    }

//    /**
//     * 查询出所有的时间
//     */
//    public List<String> slectTimes(){
//        List<String> list=gongYingXinXiMapper.slectTimes();
//        return  list;
//    }



    /**
     * 根据类别返回数据
     */
    public List<GongYingXinXi> getDataByLeiBie(List<String> lists) {
        List<GongYingXinXi> listAll=new ArrayList<GongYingXinXi>();
        for(int i=0;i<lists.size();i++){
            GongYingXinXiExample example=new GongYingXinXiExample();
            example.setOrderByClause(" gong_ying_id desc ");
            GongYingXinXiExample.Criteria criteria=example.createCriteria();
            criteria.andBeiyong3EqualTo(lists.get(i));
            List<GongYingXinXi> list = gongYingXinXiMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
    }
}
