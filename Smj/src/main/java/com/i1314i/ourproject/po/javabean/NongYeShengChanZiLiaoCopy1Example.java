package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NongYeShengChanZiLiaoCopy1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NongYeShengChanZiLiaoCopy1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andShangPinIdIsNull() {
            addCriterion("shang_pin_id is null");
            return (Criteria) this;
        }

        public Criteria andShangPinIdIsNotNull() {
            addCriterion("shang_pin_id is not null");
            return (Criteria) this;
        }

        public Criteria andShangPinIdEqualTo(Integer value) {
            addCriterion("shang_pin_id =", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdNotEqualTo(Integer value) {
            addCriterion("shang_pin_id <>", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdGreaterThan(Integer value) {
            addCriterion("shang_pin_id >", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shang_pin_id >=", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdLessThan(Integer value) {
            addCriterion("shang_pin_id <", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdLessThanOrEqualTo(Integer value) {
            addCriterion("shang_pin_id <=", value, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdIn(List<Integer> values) {
            addCriterion("shang_pin_id in", values, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdNotIn(List<Integer> values) {
            addCriterion("shang_pin_id not in", values, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdBetween(Integer value1, Integer value2) {
            addCriterion("shang_pin_id between", value1, value2, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangPinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shang_pin_id not between", value1, value2, "shangPinId");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIsNull() {
            addCriterion("shangpin_mingcheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIsNotNull() {
            addCriterion("shangpin_mingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengEqualTo(String value) {
            addCriterion("shangpin_mingcheng =", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotEqualTo(String value) {
            addCriterion("shangpin_mingcheng <>", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengGreaterThan(String value) {
            addCriterion("shangpin_mingcheng >", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("shangpin_mingcheng >=", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLessThan(String value) {
            addCriterion("shangpin_mingcheng <", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLessThanOrEqualTo(String value) {
            addCriterion("shangpin_mingcheng <=", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLike(String value) {
            addCriterion("shangpin_mingcheng like", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotLike(String value) {
            addCriterion("shangpin_mingcheng not like", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIn(List<String> values) {
            addCriterion("shangpin_mingcheng in", values, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotIn(List<String> values) {
            addCriterion("shangpin_mingcheng not in", values, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengBetween(String value1, String value2) {
            addCriterion("shangpin_mingcheng between", value1, value2, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotBetween(String value1, String value2) {
            addCriterion("shangpin_mingcheng not between", value1, value2, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNull() {
            addCriterion("leibie is null");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNotNull() {
            addCriterion("leibie is not null");
            return (Criteria) this;
        }

        public Criteria andLeibieEqualTo(String value) {
            addCriterion("leibie =", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotEqualTo(String value) {
            addCriterion("leibie <>", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThan(String value) {
            addCriterion("leibie >", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThanOrEqualTo(String value) {
            addCriterion("leibie >=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThan(String value) {
            addCriterion("leibie <", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThanOrEqualTo(String value) {
            addCriterion("leibie <=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLike(String value) {
            addCriterion("leibie like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotLike(String value) {
            addCriterion("leibie not like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieIn(List<String> values) {
            addCriterion("leibie in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotIn(List<String> values) {
            addCriterion("leibie not in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieBetween(String value1, String value2) {
            addCriterion("leibie between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotBetween(String value1, String value2) {
            addCriterion("leibie not between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIsNull() {
            addCriterion("gui_ge_deng_ji is null");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIsNotNull() {
            addCriterion("gui_ge_deng_ji is not null");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiEqualTo(String value) {
            addCriterion("gui_ge_deng_ji =", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotEqualTo(String value) {
            addCriterion("gui_ge_deng_ji <>", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiGreaterThan(String value) {
            addCriterion("gui_ge_deng_ji >", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiGreaterThanOrEqualTo(String value) {
            addCriterion("gui_ge_deng_ji >=", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLessThan(String value) {
            addCriterion("gui_ge_deng_ji <", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLessThanOrEqualTo(String value) {
            addCriterion("gui_ge_deng_ji <=", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLike(String value) {
            addCriterion("gui_ge_deng_ji like", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotLike(String value) {
            addCriterion("gui_ge_deng_ji not like", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIn(List<String> values) {
            addCriterion("gui_ge_deng_ji in", values, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotIn(List<String> values) {
            addCriterion("gui_ge_deng_ji not in", values, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiBetween(String value1, String value2) {
            addCriterion("gui_ge_deng_ji between", value1, value2, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotBetween(String value1, String value2) {
            addCriterion("gui_ge_deng_ji not between", value1, value2, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIsNull() {
            addCriterion("ji_liang_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIsNotNull() {
            addCriterion("ji_liang_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiEqualTo(String value) {
            addCriterion("ji_liang_dan_wei =", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotEqualTo(String value) {
            addCriterion("ji_liang_dan_wei <>", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiGreaterThan(String value) {
            addCriterion("ji_liang_dan_wei >", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("ji_liang_dan_wei >=", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLessThan(String value) {
            addCriterion("ji_liang_dan_wei <", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLessThanOrEqualTo(String value) {
            addCriterion("ji_liang_dan_wei <=", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLike(String value) {
            addCriterion("ji_liang_dan_wei like", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotLike(String value) {
            addCriterion("ji_liang_dan_wei not like", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIn(List<String> values) {
            addCriterion("ji_liang_dan_wei in", values, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotIn(List<String> values) {
            addCriterion("ji_liang_dan_wei not in", values, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiBetween(String value1, String value2) {
            addCriterion("ji_liang_dan_wei between", value1, value2, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotBetween(String value1, String value2) {
            addCriterion("ji_liang_dan_wei not between", value1, value2, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiIsNull() {
            addCriterion("cai_bao_jia_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiIsNotNull() {
            addCriterion("cai_bao_jia_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiEqualTo(String value) {
            addCriterion("cai_bao_jia_dan_wei =", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiNotEqualTo(String value) {
            addCriterion("cai_bao_jia_dan_wei <>", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiGreaterThan(String value) {
            addCriterion("cai_bao_jia_dan_wei >", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("cai_bao_jia_dan_wei >=", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiLessThan(String value) {
            addCriterion("cai_bao_jia_dan_wei <", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiLessThanOrEqualTo(String value) {
            addCriterion("cai_bao_jia_dan_wei <=", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiLike(String value) {
            addCriterion("cai_bao_jia_dan_wei like", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiNotLike(String value) {
            addCriterion("cai_bao_jia_dan_wei not like", value, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiIn(List<String> values) {
            addCriterion("cai_bao_jia_dan_wei in", values, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiNotIn(List<String> values) {
            addCriterion("cai_bao_jia_dan_wei not in", values, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiBetween(String value1, String value2) {
            addCriterion("cai_bao_jia_dan_wei between", value1, value2, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andCaiBaoJiaDanWeiNotBetween(String value1, String value2) {
            addCriterion("cai_bao_jia_dan_wei not between", value1, value2, "caiBaoJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiIsNull() {
            addCriterion("zhi_biao_jie_shi is null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiIsNotNull() {
            addCriterion("zhi_biao_jie_shi is not null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi =", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi <>", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiGreaterThan(String value) {
            addCriterion("zhi_biao_jie_shi >", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi >=", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLessThan(String value) {
            addCriterion("zhi_biao_jie_shi <", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLessThanOrEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi <=", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLike(String value) {
            addCriterion("zhi_biao_jie_shi like", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotLike(String value) {
            addCriterion("zhi_biao_jie_shi not like", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiIn(List<String> values) {
            addCriterion("zhi_biao_jie_shi in", values, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotIn(List<String> values) {
            addCriterion("zhi_biao_jie_shi not in", values, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiBetween(String value1, String value2) {
            addCriterion("zhi_biao_jie_shi between", value1, value2, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotBetween(String value1, String value2) {
            addCriterion("zhi_biao_jie_shi not between", value1, value2, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andShijianIsNull() {
            addCriterion("shijian is null");
            return (Criteria) this;
        }

        public Criteria andShijianIsNotNull() {
            addCriterion("shijian is not null");
            return (Criteria) this;
        }

        public Criteria andShijianEqualTo(Date value) {
            addCriterionForJDBCDate("shijian =", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("shijian <>", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThan(Date value) {
            addCriterionForJDBCDate("shijian >", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shijian >=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThan(Date value) {
            addCriterionForJDBCDate("shijian <", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shijian <=", value, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianIn(List<Date> values) {
            addCriterionForJDBCDate("shijian in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("shijian not in", values, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shijian between", value1, value2, "shijian");
            return (Criteria) this;
        }

        public Criteria andShijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shijian not between", value1, value2, "shijian");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}