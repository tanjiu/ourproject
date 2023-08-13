package com.i1314i.ourproject.po.javabean;

/**
 * @author 叹久
 * @create 2018-10-05 9:53
 */

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * 用来检索土壤养分含量的po类,不是自动生成的，需要添加注解
 */
@Component
public class SouSuo {

    //土壤养分表中的字段
    private List<Double> ph;

    private List<Double> organicMatter;

    private List<Double> totalNitrogen;

    private List<Double> jianJieDan;

    private List<Double> effectivePhosphorus;

    private List<Double> huanXiaoJia;

    private List<Double> suXiaoJia;

    private List<Double> jiaoHuanXingGai;

    private List<Double> jiaoHuanXingMei;

    private List<Double> youXiaoTie;

    private List<Double> youXiaoMeng;

    private List<Double> youXiaoTong;

    private List<Double> youXiaoXin;

    private List<Double> shuiRongTaiPeng;

    private List<Double> youXiaoMu;

    private List<Double> youXiaoLiu;

    private List<Double> youXiaoGui;

    //补贴服务表里面的money字段检索
    private List<Double> money;
    //补贴发放时间范围
    private List<Date> fafangtime;
    //补贴信息发布时间范围
    private List<Date> fabuShijian;

    public SouSuo() {
    }

    public List<Date> getFabuShijian() {
        return fabuShijian;
    }

    public void setFabuShijian(List<Date> fabuShijian) {
        this.fabuShijian = fabuShijian;
    }

    public List<Double> getYouXiaoMeng() {
        return youXiaoMeng;
    }

    public void setYouXiaoMeng(List<Double> youXiaoMeng) {
        this.youXiaoMeng = youXiaoMeng;
    }

    public List<Double> getYouXiaoTong() {
        return youXiaoTong;
    }

    public void setYouXiaoTong(List<Double> youXiaoTong) {
        this.youXiaoTong = youXiaoTong;
    }

    public List<Double> getYouXiaoXin() {
        return youXiaoXin;
    }

    public void setYouXiaoXin(List<Double> youXiaoXin) {
        this.youXiaoXin = youXiaoXin;
    }

    public List<Double> getShuiRongTaiPeng() {
        return shuiRongTaiPeng;
    }

    public void setShuiRongTaiPeng(List<Double> shuiRongTaiPeng) {
        this.shuiRongTaiPeng = shuiRongTaiPeng;
    }

    public List<Double> getYouXiaoMu() {
        return youXiaoMu;
    }

    public void setYouXiaoMu(List<Double> youXiaoMu) {
        this.youXiaoMu = youXiaoMu;
    }

    public List<Double> getYouXiaoLiu() {
        return youXiaoLiu;
    }

    public void setYouXiaoLiu(List<Double> youXiaoLiu) {
        this.youXiaoLiu = youXiaoLiu;
    }

    public List<Double> getYouXiaoGui() {
        return youXiaoGui;
    }

    public void setYouXiaoGui(List<Double> youXiaoGui) {
        this.youXiaoGui = youXiaoGui;
    }

    public List<Double> getPh() {
        return ph;
    }

    public void setPh(List<Double> ph) {
        this.ph = ph;
    }

    public List<Double> getOrganicMatter() {
        return organicMatter;
    }

    public void setOrganicMatter(List<Double> organicMatter) {
        this.organicMatter = organicMatter;
    }

    public List<Double> getTotalNitrogen() {
        return totalNitrogen;
    }

    public void setTotalNitrogen(List<Double> totalNitrogen) {
        this.totalNitrogen = totalNitrogen;
    }

    public List<Double> getJianJieDan() {
        return jianJieDan;
    }

    public void setJianJieDan(List<Double> jianJieDan) {
        this.jianJieDan = jianJieDan;
    }

    public List<Double> getEffectivePhosphorus() {
        return effectivePhosphorus;
    }

    public void setEffectivePhosphorus(List<Double> effectivePhosphorus) {
        this.effectivePhosphorus = effectivePhosphorus;
    }

    public List<Double> getHuanXiaoJia() {
        return huanXiaoJia;
    }

    public void setHuanXiaoJia(List<Double> huanXiaoJia) {
        this.huanXiaoJia = huanXiaoJia;
    }

    public List<Double> getSuXiaoJia() {
        return suXiaoJia;
    }

    public void setSuXiaoJia(List<Double> suXiaoJia) {
        this.suXiaoJia = suXiaoJia;
    }

    public List<Double> getJiaoHuanXingGai() {
        return jiaoHuanXingGai;
    }

    public void setJiaoHuanXingGai(List<Double> jiaoHuanXingGai) {
        this.jiaoHuanXingGai = jiaoHuanXingGai;
    }

    public List<Double> getJiaoHuanXingMei() {
        return jiaoHuanXingMei;
    }

    public void setJiaoHuanXingMei(List<Double> jiaoHuanXingMei) {
        this.jiaoHuanXingMei = jiaoHuanXingMei;
    }

    public List<Double> getYouXiaoTie() {
        return youXiaoTie;
    }

    public void setYouXiaoTie(List<Double> youXiaoTie) {
        this.youXiaoTie = youXiaoTie;
    }

    public List<Double> getMoney() {
        return money;
    }

    public void setMoney(List<Double> money) {
        this.money = money;
    }

    public List<Date> getFafangtime() {
        return fafangtime;
    }

    public void setFafangtime(List<Date> fafangtime) {
        this.fafangtime = fafangtime;
    }
}
