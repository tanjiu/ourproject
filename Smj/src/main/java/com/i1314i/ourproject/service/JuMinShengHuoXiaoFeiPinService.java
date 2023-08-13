package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.JuMinShengHuoXiaoFeiPinMapper;
import com.i1314i.ourproject.po.javabean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-11-19 18:11
 */
@Service
public class JuMinShengHuoXiaoFeiPinService {

    @Autowired
    private JuMinShengHuoXiaoFeiPinMapper juMinShengHuoXiaoFeiPinMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<JuMinShengHuoXiaoFeiPin> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            JuMinShengHuoXiaoFeiPinExample juMinShengHuoXiaoFeiPin = new JuMinShengHuoXiaoFeiPinExample();
            juMinShengHuoXiaoFeiPin.setOrderByClause(" shijian desc ");
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(juMinShengHuoXiaoFeiPin);
            return list;
        } else {
            JuMinShengHuoXiaoFeiPinExample juMinShengHuoXiaoFeiPin = new JuMinShengHuoXiaoFeiPinExample();
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria = juMinShengHuoXiaoFeiPin.createCriteria();
            criteria.andBumenEqualTo(bumen);
            juMinShengHuoXiaoFeiPin.setOrderByClause(" shijian desc ");
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(juMinShengHuoXiaoFeiPin);
            return list;
        }
    }

    /**
     * 获得所有数据
     *
     * @return
     */
    public List<JuMinShengHuoXiaoFeiPin> getAll() {
        JuMinShengHuoXiaoFeiPinExample juMinShengHuoXiaoFeiPin = new JuMinShengHuoXiaoFeiPinExample();
        juMinShengHuoXiaoFeiPin.setOrderByClause(" shijian desc ");
        List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(juMinShengHuoXiaoFeiPin);
        return list;
    }


    /**
     * 插入一条数据
     */
    public boolean insert(JuMinShengHuoXiaoFeiPin juMinShengHuoXiaoFeiPin,HttpServletRequest request) {
//        HttpSession session = request.getSession(false);
//        Integer bumen = (Integer) session.getAttribute("fdepid");
//        if (bumen != 0 && bumen != null) {
//            juMinShengHuoXiaoFeiPin.setBumen(bumen);
//        } else {
//            juMinShengHuoXiaoFeiPin.setBumen(0);
//        }
        int n = juMinShengHuoXiaoFeiPinMapper.insertSelective(juMinShengHuoXiaoFeiPin);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public JuMinShengHuoXiaoFeiPin getJuMinShengHuoXiaoFeiPinByPrimaryKey(int id) {
        JuMinShengHuoXiaoFeiPin juMinShengHuoXiaoFeiPin = juMinShengHuoXiaoFeiPinMapper.selectByPrimaryKey(id);
        return juMinShengHuoXiaoFeiPin;
    }

    /**
     * 根据多个商品名称进行查询
     */
    public List<JuMinShengHuoXiaoFeiPin> getJuMinShengHuoXiaoFeiPinByMoHu(List<String> lists) {
        List<JuMinShengHuoXiaoFeiPin> listAll=new ArrayList<JuMinShengHuoXiaoFeiPin>();
        for(String aaa:lists){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian desc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(aaa);
            if("大豆油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }else  if("花生油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0){
                List<JuMinShengHuoXiaoFeiPin> listee=list.subList(0,7);
                Collections.reverse(listee);
                listAll.addAll(listee);
            }
        }
        return listAll;
    }


    /**
     * 根据多个商品名称进行查询，每种返回一条，放到一个里面
     */
    public List<JuMinShengHuoXiaoFeiPin> getJuMinShengHuoXiaoFeiPinByMoHuThreeAndOne(List<String> lists,List<String> list2,List<String> list3) {
        List<JuMinShengHuoXiaoFeiPin> listAll=new ArrayList<JuMinShengHuoXiaoFeiPin>();
        for(String aaa:lists){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian desc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(aaa);
            if("大豆油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }else  if("花生油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0){
                listAll.add(list.get(0));
            }
        }
        for(String aaa:list2){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian desc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(aaa);
            if("大豆油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }else  if("花生油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0){
                listAll.add(list.get(0));
            }
        }
        for(String aaa:list3){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian desc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(aaa);
            if("大豆油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }else  if("花生油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0){
                listAll.add(list.get(0));
            }
        }
        return listAll;
    }

    /**
     * 根据名称查询出一条数据
     * @param mingcheng
     * @return
     */
    public JuMinShengHuoXiaoFeiPin selectTypeOne(String mingcheng){
            JuMinShengHuoXiaoFeiPin juMinShengHuoXiaoFeiPin=juMinShengHuoXiaoFeiPinMapper.selectTypeOne(mingcheng);
            return  juMinShengHuoXiaoFeiPin;
    }

    /**
     * 根据单个商品名称进行查询，返回全部数据，升序
     */
    public List<JuMinShengHuoXiaoFeiPin> getJuMinShengHuoXiaoFeiPinByMoHus(List<String> lists) {
        List<JuMinShengHuoXiaoFeiPin> listAll=new ArrayList<JuMinShengHuoXiaoFeiPin>();
        for(String aaa:lists){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian asc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(aaa);
            if("大豆油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
                criteria.andGuiGeDengJiNotEqualTo("(散装)");
            }else  if("花生油".equals(aaa)){
                criteria.andGuiGeDengJiNotEqualTo("散装");
            }
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
    }


    /**
     * 根据商品名称查询，返回全部数据，升序,未用------------------------------------------------------------
     */
    public List<JuMinShengHuoXiaoFeiPin> getJuMinShengHuoByMoHuAndMingCheng(List<String> lists) {
        List<JuMinShengHuoXiaoFeiPin> listAll=new ArrayList<JuMinShengHuoXiaoFeiPin>();
        for(int i=0;i<lists.size();i++){
            JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
            example.setOrderByClause(" shijian asc");
            JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
            criteria.andShangpinMingchengEqualTo(lists.get(i));
            List<JuMinShengHuoXiaoFeiPin> list = juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
            if(list.size()>0)
                listAll.addAll(list);
        }
        return listAll;
    }

    /**
     * 查询出所有的时间
     */
    public List<String> slectTimes(){
        List<String> list=juMinShengHuoXiaoFeiPinMapper.slectTimes();
        return  list;
    }
    /**
     * 根据时间删除数据
     */
    public boolean deleteByTime(Date time){
        JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
        JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
        criteria.andShijianEqualTo(time);
         int a=juMinShengHuoXiaoFeiPinMapper.deleteByExample(example);
        if(a>0)
            return true;
        return false;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=juMinShengHuoXiaoFeiPinMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
        JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
        criteria.andJuMinShengHuoIdIn(ids);
        int n=juMinShengHuoXiaoFeiPinMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(JuMinShengHuoXiaoFeiPin juMinShengHuoXiaoFeiPin){
        int n=juMinShengHuoXiaoFeiPinMapper.updateByPrimaryKeySelective(juMinShengHuoXiaoFeiPin);
        if(n>0)
            return true;
        return false;
    }
    /**
     *   根据具体时间查询数据
     */
    public List<JuMinShengHuoXiaoFeiPin> getDataByTime(Date time){
        JuMinShengHuoXiaoFeiPinExample example=new JuMinShengHuoXiaoFeiPinExample();
        JuMinShengHuoXiaoFeiPinExample.Criteria criteria=example.createCriteria();
        criteria.andShijianEqualTo(time);
        List<JuMinShengHuoXiaoFeiPin> list=juMinShengHuoXiaoFeiPinMapper.selectByExample(example);
        return list;
    }



}
