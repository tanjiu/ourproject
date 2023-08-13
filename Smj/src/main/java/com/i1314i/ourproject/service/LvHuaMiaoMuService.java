package com.i1314i.ourproject.service;

import com.i1314i.ourproject.mapper.HuiNongImageMapper;
import com.i1314i.ourproject.mapper.LvHuaMiaoMuMapper;
import com.i1314i.ourproject.po.javabean.*;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 叹久
 * @create 2018-11-19 18:31
 */
@Service
public class LvHuaMiaoMuService {
    @Autowired
    private LvHuaMiaoMuMapper lvHuaMiaoMuMapper;
    @Autowired
    private HuiNongImageMapper huiNongImageMapper;

    /**
     * 管理端获得所有数据
     *
     * @return
     */
    public List<LvHuaMiaoMu> getAllAdmin(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        if (bumen == 0 || bumen == null) {
            LvHuaMiaoMuExample lvHuaMiaoMuExample = new LvHuaMiaoMuExample();
            lvHuaMiaoMuExample.setOrderByClause(" shijian desc ");
            List<LvHuaMiaoMu> list = lvHuaMiaoMuMapper.selectByExample(lvHuaMiaoMuExample);
            for(LvHuaMiaoMu lvHuaMiaoMu:list){
                if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                    HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                    lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
                    System.out.println("图片路径是："+huiNongImage.getImageUrls());
                }
            }
            return list;
        } else {
            LvHuaMiaoMuExample lvHuaMiaoMuExample = new LvHuaMiaoMuExample();
            LvHuaMiaoMuExample.Criteria criteria = lvHuaMiaoMuExample.createCriteria();
            criteria.andBumenEqualTo(bumen);
            lvHuaMiaoMuExample.setOrderByClause(" shijian desc ");
            List<LvHuaMiaoMu> list = lvHuaMiaoMuMapper.selectByExample(lvHuaMiaoMuExample);
            for(LvHuaMiaoMu lvHuaMiaoMu:list){
                if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                    HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                    lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
                    System.out.println("图片路径是："+huiNongImage.getImageUrls());
                }
            }
            return list;
        }
    }

    /**
     * 获得所有数据，包括图片路径
     *
     * @return
     */
    public List<LvHuaMiaoMu> getAll() {
        LvHuaMiaoMuExample lvHuaMiaoMuExample = new LvHuaMiaoMuExample();
        lvHuaMiaoMuExample.setOrderByClause(" shijian desc ");
        List<LvHuaMiaoMu> list = lvHuaMiaoMuMapper.selectByExample(lvHuaMiaoMuExample);
        for(LvHuaMiaoMu lvHuaMiaoMu:list){
            if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
                System.out.println("图片路径是："+huiNongImage.getImageUrls());
            }
        }
        return list;
    }


    /**
     * 获得所有数据,不包括图片路径
     *
     * @return
     */
    public List<LvHuaMiaoMu> getAllAndNoUrl() {
        LvHuaMiaoMuExample lvHuaMiaoMuExample = new LvHuaMiaoMuExample();
        lvHuaMiaoMuExample.setOrderByClause(" shijian desc ");
        List<LvHuaMiaoMu> list = lvHuaMiaoMuMapper.selectByExample(lvHuaMiaoMuExample);
        return list;
    }

    /**
     * 插入一条数据
     */
    public boolean insert(LvHuaMiaoMu lvHuaMiaoMu) {
        int n = lvHuaMiaoMuMapper.insertSelective(lvHuaMiaoMu);
        if (n > 0)
            return true;
        return false;
    }

    /**
     * 根据主键查询
     */
    public LvHuaMiaoMu getLvHuaMiaoMuByPrimaryKey(int id) {
        LvHuaMiaoMu lvHuaMiaoMu = lvHuaMiaoMuMapper.selectByPrimaryKey(id);
        if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
            HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
            lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
        }
        return lvHuaMiaoMu;
    }



    /**
     * 根据名称进行模糊查询
     */
    public List<LvHuaMiaoMu> getLvHuaMiaoMuByMoHu(String biaoti,String dengji) {
        LvHuaMiaoMuExample example=new LvHuaMiaoMuExample();
        LvHuaMiaoMuExample.Criteria criteria=example.createCriteria();
        example.setOrderByClause(" shijian asc");
        criteria.andMingchengLike("%"+biaoti+"%");
        criteria.andGuiGeEqualTo(dengji);
        List<LvHuaMiaoMu> list = lvHuaMiaoMuMapper.selectByExample(example);
        for(LvHuaMiaoMu lvHuaMiaoMu:list){
            if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
            }
        }
        return list;
    }

    /**
     * 删除一条数据
     */
    public boolean deleteOneByPrimaryKey(int id){
        int n=lvHuaMiaoMuMapper.deleteByPrimaryKey(id);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键进行批量删除
     */
    public boolean deleteAllByPrimaryKey(List<Integer> ids){
        LvHuaMiaoMuExample example=new LvHuaMiaoMuExample();
        LvHuaMiaoMuExample.Criteria criteria=example.createCriteria();
        criteria.andMiaoMuIdIn(ids);
        int n=lvHuaMiaoMuMapper.deleteByExample(example);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 根据主键更新一条数据
     */
    public boolean updateByPrimaryKey(LvHuaMiaoMu lvHuaMiaoMu){
        int n=lvHuaMiaoMuMapper.updateByPrimaryKeySelective(lvHuaMiaoMu);
        if(n>0)
            return true;
        return false;
    }

    /**
     * 查询出所有的时间
     */
    public List<String> slectTimes(){
            List<String> list=lvHuaMiaoMuMapper.slectTimes();
        return  list;
    }
    /**
     * 管理端查询出所有的时间
     */
    public List<String> slectTimesAdmin(HttpServletRequest request){
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        //必须要知道物价局的代码是多少
        if (bumen == 0 ||"物价局".equals(bumen)) {
            List<String> list=lvHuaMiaoMuMapper.slectTimes();
            return  list;
        }
        return  null;
    }

    /**
     *   管理端根据具体时间查询数据
     */
    public List<LvHuaMiaoMu> getDataByTimeAdmin(Date time,HttpServletRequest request){
        HttpSession session = request.getSession(false);
        Integer bumen = (Integer) session.getAttribute("fdepid");
        //必须要知道物价局的代码是多少

        if (bumen == 0 ||"物价局".equals(bumen)) {
            LvHuaMiaoMuExample example=new LvHuaMiaoMuExample();
            LvHuaMiaoMuExample.Criteria criteria=example.createCriteria();
            criteria.andShijianEqualTo(time);
            List<LvHuaMiaoMu> list=lvHuaMiaoMuMapper.selectByExample(example);
            for(LvHuaMiaoMu lvHuaMiaoMu:list){
                if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                    HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                    lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
                }
            }
            return list;
        }
        return  null;
    }
    /**
     *   根据具体时间查询数据
     */
  public List<LvHuaMiaoMu> getDataByTime(Date time){
          LvHuaMiaoMuExample example=new LvHuaMiaoMuExample();
          LvHuaMiaoMuExample.Criteria criteria=example.createCriteria();
          criteria.andShijianEqualTo(time);
          List<LvHuaMiaoMu> list=lvHuaMiaoMuMapper.selectByExample(example);
          for(LvHuaMiaoMu lvHuaMiaoMu:list){
              if(lvHuaMiaoMu!=null&& lvHuaMiaoMu.getImageId()!=null&&lvHuaMiaoMu.getImageId()!=0){
                  HuiNongImage huiNongImage=  huiNongImageMapper.selectByPrimaryKey(lvHuaMiaoMu.getImageId());
                  lvHuaMiaoMu.setImageUrl(huiNongImage.getImageUrls());
              }
          }
          return list;
  }

    /**
     * 根据时间删除数据
     */
    public boolean deleteByTime(Date time){
        LvHuaMiaoMuExample example=new LvHuaMiaoMuExample();
        LvHuaMiaoMuExample.Criteria criteria=example.createCriteria();
        criteria.andShijianEqualTo(time);
        int a=lvHuaMiaoMuMapper.deleteByExample(example);
        if(a>0)
            return true;
        return false;
    }

    /**
     * 返回所有的树名
     */
    public List<String> selectAllName(){
        List<String> list=lvHuaMiaoMuMapper.selectAllName();
        return list;
    }

    /**
     * 根据树名更新外键
     */
    public boolean  updateWaiJianByShuMing(String shuming,Integer id){
        int n=lvHuaMiaoMuMapper.updateWaiJianByShuMing(shuming,id);
        if(n>0)
            return true;
        return false;
    }
}
