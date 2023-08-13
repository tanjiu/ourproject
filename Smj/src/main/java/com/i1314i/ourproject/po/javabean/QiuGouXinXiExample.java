package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QiuGouXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QiuGouXinXiExample() {
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

        public Criteria andQiuGouIdIsNull() {
            addCriterion("qiu_gou_id is null");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdIsNotNull() {
            addCriterion("qiu_gou_id is not null");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdEqualTo(Integer value) {
            addCriterion("qiu_gou_id =", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdNotEqualTo(Integer value) {
            addCriterion("qiu_gou_id <>", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdGreaterThan(Integer value) {
            addCriterion("qiu_gou_id >", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("qiu_gou_id >=", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdLessThan(Integer value) {
            addCriterion("qiu_gou_id <", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdLessThanOrEqualTo(Integer value) {
            addCriterion("qiu_gou_id <=", value, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdIn(List<Integer> values) {
            addCriterion("qiu_gou_id in", values, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdNotIn(List<Integer> values) {
            addCriterion("qiu_gou_id not in", values, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdBetween(Integer value1, Integer value2) {
            addCriterion("qiu_gou_id between", value1, value2, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andQiuGouIdNotBetween(Integer value1, Integer value2) {
            addCriterion("qiu_gou_id not between", value1, value2, "qiuGouId");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIsNull() {
            addCriterion("chan_pin_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIsNotNull() {
            addCriterion("chan_pin_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng =", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng <>", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengGreaterThan(String value) {
            addCriterion("chan_pin_ming_cheng >", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng >=", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLessThan(String value) {
            addCriterion("chan_pin_ming_cheng <", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLessThanOrEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng <=", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLike(String value) {
            addCriterion("chan_pin_ming_cheng like", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotLike(String value) {
            addCriterion("chan_pin_ming_cheng not like", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIn(List<String> values) {
            addCriterion("chan_pin_ming_cheng in", values, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotIn(List<String> values) {
            addCriterion("chan_pin_ming_cheng not in", values, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengBetween(String value1, String value2) {
            addCriterion("chan_pin_ming_cheng between", value1, value2, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotBetween(String value1, String value2) {
            addCriterion("chan_pin_ming_cheng not between", value1, value2, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andFaBuRenIsNull() {
            addCriterion("fa_bu_ren is null");
            return (Criteria) this;
        }

        public Criteria andFaBuRenIsNotNull() {
            addCriterion("fa_bu_ren is not null");
            return (Criteria) this;
        }

        public Criteria andFaBuRenEqualTo(String value) {
            addCriterion("fa_bu_ren =", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenNotEqualTo(String value) {
            addCriterion("fa_bu_ren <>", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenGreaterThan(String value) {
            addCriterion("fa_bu_ren >", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenGreaterThanOrEqualTo(String value) {
            addCriterion("fa_bu_ren >=", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenLessThan(String value) {
            addCriterion("fa_bu_ren <", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenLessThanOrEqualTo(String value) {
            addCriterion("fa_bu_ren <=", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenLike(String value) {
            addCriterion("fa_bu_ren like", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenNotLike(String value) {
            addCriterion("fa_bu_ren not like", value, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenIn(List<String> values) {
            addCriterion("fa_bu_ren in", values, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenNotIn(List<String> values) {
            addCriterion("fa_bu_ren not in", values, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenBetween(String value1, String value2) {
            addCriterion("fa_bu_ren between", value1, value2, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andFaBuRenNotBetween(String value1, String value2) {
            addCriterion("fa_bu_ren not between", value1, value2, "faBuRen");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangIsNull() {
            addCriterion("cai_gou_liang is null");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangIsNotNull() {
            addCriterion("cai_gou_liang is not null");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangEqualTo(Double value) {
            addCriterion("cai_gou_liang =", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangNotEqualTo(Double value) {
            addCriterion("cai_gou_liang <>", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangGreaterThan(Double value) {
            addCriterion("cai_gou_liang >", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangGreaterThanOrEqualTo(Double value) {
            addCriterion("cai_gou_liang >=", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangLessThan(Double value) {
            addCriterion("cai_gou_liang <", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangLessThanOrEqualTo(Double value) {
            addCriterion("cai_gou_liang <=", value, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangIn(List<Double> values) {
            addCriterion("cai_gou_liang in", values, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangNotIn(List<Double> values) {
            addCriterion("cai_gou_liang not in", values, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangBetween(Double value1, Double value2) {
            addCriterion("cai_gou_liang between", value1, value2, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andCaiGouLiangNotBetween(Double value1, Double value2) {
            addCriterion("cai_gou_liang not between", value1, value2, "caiGouLiang");
            return (Criteria) this;
        }

        public Criteria andPinZhongIsNull() {
            addCriterion("pin_zhong is null");
            return (Criteria) this;
        }

        public Criteria andPinZhongIsNotNull() {
            addCriterion("pin_zhong is not null");
            return (Criteria) this;
        }

        public Criteria andPinZhongEqualTo(String value) {
            addCriterion("pin_zhong =", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongNotEqualTo(String value) {
            addCriterion("pin_zhong <>", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongGreaterThan(String value) {
            addCriterion("pin_zhong >", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongGreaterThanOrEqualTo(String value) {
            addCriterion("pin_zhong >=", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongLessThan(String value) {
            addCriterion("pin_zhong <", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongLessThanOrEqualTo(String value) {
            addCriterion("pin_zhong <=", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongLike(String value) {
            addCriterion("pin_zhong like", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongNotLike(String value) {
            addCriterion("pin_zhong not like", value, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongIn(List<String> values) {
            addCriterion("pin_zhong in", values, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongNotIn(List<String> values) {
            addCriterion("pin_zhong not in", values, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongBetween(String value1, String value2) {
            addCriterion("pin_zhong between", value1, value2, "pinZhong");
            return (Criteria) this;
        }

        public Criteria andPinZhongNotBetween(String value1, String value2) {
            addCriterion("pin_zhong not between", value1, value2, "pinZhong");
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

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCDate("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCDate("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCDate("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiIsNull() {
            addCriterion("huo_yuan_di_zhi is null");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiIsNotNull() {
            addCriterion("huo_yuan_di_zhi is not null");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiEqualTo(String value) {
            addCriterion("huo_yuan_di_zhi =", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiNotEqualTo(String value) {
            addCriterion("huo_yuan_di_zhi <>", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiGreaterThan(String value) {
            addCriterion("huo_yuan_di_zhi >", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiGreaterThanOrEqualTo(String value) {
            addCriterion("huo_yuan_di_zhi >=", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiLessThan(String value) {
            addCriterion("huo_yuan_di_zhi <", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiLessThanOrEqualTo(String value) {
            addCriterion("huo_yuan_di_zhi <=", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiLike(String value) {
            addCriterion("huo_yuan_di_zhi like", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiNotLike(String value) {
            addCriterion("huo_yuan_di_zhi not like", value, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiIn(List<String> values) {
            addCriterion("huo_yuan_di_zhi in", values, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiNotIn(List<String> values) {
            addCriterion("huo_yuan_di_zhi not in", values, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiBetween(String value1, String value2) {
            addCriterion("huo_yuan_di_zhi between", value1, value2, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andHuoYuanDiZhiNotBetween(String value1, String value2) {
            addCriterion("huo_yuan_di_zhi not between", value1, value2, "huoYuanDiZhi");
            return (Criteria) this;
        }

        public Criteria andBeiyong1IsNull() {
            addCriterion("beiyong1 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong1IsNotNull() {
            addCriterion("beiyong1 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong1EqualTo(String value) {
            addCriterion("beiyong1 =", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotEqualTo(String value) {
            addCriterion("beiyong1 <>", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThan(String value) {
            addCriterion("beiyong1 >", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong1 >=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThan(String value) {
            addCriterion("beiyong1 <", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThanOrEqualTo(String value) {
            addCriterion("beiyong1 <=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1Like(String value) {
            addCriterion("beiyong1 like", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotLike(String value) {
            addCriterion("beiyong1 not like", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1In(List<String> values) {
            addCriterion("beiyong1 in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotIn(List<String> values) {
            addCriterion("beiyong1 not in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1Between(String value1, String value2) {
            addCriterion("beiyong1 between", value1, value2, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotBetween(String value1, String value2) {
            addCriterion("beiyong1 not between", value1, value2, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong2IsNull() {
            addCriterion("beiyong2 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong2IsNotNull() {
            addCriterion("beiyong2 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong2EqualTo(String value) {
            addCriterion("beiyong2 =", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotEqualTo(String value) {
            addCriterion("beiyong2 <>", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThan(String value) {
            addCriterion("beiyong2 >", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong2 >=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThan(String value) {
            addCriterion("beiyong2 <", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThanOrEqualTo(String value) {
            addCriterion("beiyong2 <=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2Like(String value) {
            addCriterion("beiyong2 like", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotLike(String value) {
            addCriterion("beiyong2 not like", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2In(List<String> values) {
            addCriterion("beiyong2 in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotIn(List<String> values) {
            addCriterion("beiyong2 not in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2Between(String value1, String value2) {
            addCriterion("beiyong2 between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotBetween(String value1, String value2) {
            addCriterion("beiyong2 not between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andShenheIsNull() {
            addCriterion("shenhe is null");
            return (Criteria) this;
        }

        public Criteria andShenheIsNotNull() {
            addCriterion("shenhe is not null");
            return (Criteria) this;
        }

        public Criteria andShenheEqualTo(String value) {
            addCriterion("shenhe =", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotEqualTo(String value) {
            addCriterion("shenhe <>", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThan(String value) {
            addCriterion("shenhe >", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThanOrEqualTo(String value) {
            addCriterion("shenhe >=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThan(String value) {
            addCriterion("shenhe <", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThanOrEqualTo(String value) {
            addCriterion("shenhe <=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLike(String value) {
            addCriterion("shenhe like", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotLike(String value) {
            addCriterion("shenhe not like", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheIn(List<String> values) {
            addCriterion("shenhe in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotIn(List<String> values) {
            addCriterion("shenhe not in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheBetween(String value1, String value2) {
            addCriterion("shenhe between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotBetween(String value1, String value2) {
            addCriterion("shenhe not between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andYuanyinIsNull() {
            addCriterion("yuanyin is null");
            return (Criteria) this;
        }

        public Criteria andYuanyinIsNotNull() {
            addCriterion("yuanyin is not null");
            return (Criteria) this;
        }

        public Criteria andYuanyinEqualTo(String value) {
            addCriterion("yuanyin =", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotEqualTo(String value) {
            addCriterion("yuanyin <>", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinGreaterThan(String value) {
            addCriterion("yuanyin >", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinGreaterThanOrEqualTo(String value) {
            addCriterion("yuanyin >=", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLessThan(String value) {
            addCriterion("yuanyin <", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLessThanOrEqualTo(String value) {
            addCriterion("yuanyin <=", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLike(String value) {
            addCriterion("yuanyin like", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotLike(String value) {
            addCriterion("yuanyin not like", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinIn(List<String> values) {
            addCriterion("yuanyin in", values, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotIn(List<String> values) {
            addCriterion("yuanyin not in", values, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinBetween(String value1, String value2) {
            addCriterion("yuanyin between", value1, value2, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotBetween(String value1, String value2) {
            addCriterion("yuanyin not between", value1, value2, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andBeiyong3IsNull() {
            addCriterion("beiyong3 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3IsNotNull() {
            addCriterion("beiyong3 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3EqualTo(String value) {
            addCriterion("beiyong3 =", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotEqualTo(String value) {
            addCriterion("beiyong3 <>", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThan(String value) {
            addCriterion("beiyong3 >", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong3 >=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThan(String value) {
            addCriterion("beiyong3 <", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThanOrEqualTo(String value) {
            addCriterion("beiyong3 <=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3Like(String value) {
            addCriterion("beiyong3 like", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotLike(String value) {
            addCriterion("beiyong3 not like", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3In(List<String> values) {
            addCriterion("beiyong3 in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotIn(List<String> values) {
            addCriterion("beiyong3 not in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3Between(String value1, String value2) {
            addCriterion("beiyong3 between", value1, value2, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotBetween(String value1, String value2) {
            addCriterion("beiyong3 not between", value1, value2, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong4IsNull() {
            addCriterion("beiyong4 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4IsNotNull() {
            addCriterion("beiyong4 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4EqualTo(String value) {
            addCriterion("beiyong4 =", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotEqualTo(String value) {
            addCriterion("beiyong4 <>", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThan(String value) {
            addCriterion("beiyong4 >", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong4 >=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThan(String value) {
            addCriterion("beiyong4 <", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThanOrEqualTo(String value) {
            addCriterion("beiyong4 <=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Like(String value) {
            addCriterion("beiyong4 like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotLike(String value) {
            addCriterion("beiyong4 not like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4In(List<String> values) {
            addCriterion("beiyong4 in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotIn(List<String> values) {
            addCriterion("beiyong4 not in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Between(String value1, String value2) {
            addCriterion("beiyong4 between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotBetween(String value1, String value2) {
            addCriterion("beiyong4 not between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong5IsNull() {
            addCriterion("beiyong5 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong5IsNotNull() {
            addCriterion("beiyong5 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong5EqualTo(String value) {
            addCriterion("beiyong5 =", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotEqualTo(String value) {
            addCriterion("beiyong5 <>", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThan(String value) {
            addCriterion("beiyong5 >", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong5 >=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThan(String value) {
            addCriterion("beiyong5 <", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThanOrEqualTo(String value) {
            addCriterion("beiyong5 <=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5Like(String value) {
            addCriterion("beiyong5 like", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotLike(String value) {
            addCriterion("beiyong5 not like", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5In(List<String> values) {
            addCriterion("beiyong5 in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotIn(List<String> values) {
            addCriterion("beiyong5 not in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5Between(String value1, String value2) {
            addCriterion("beiyong5 between", value1, value2, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotBetween(String value1, String value2) {
            addCriterion("beiyong5 not between", value1, value2, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBumenIsNull() {
            addCriterion("bumen is null");
            return (Criteria) this;
        }

        public Criteria andBumenIsNotNull() {
            addCriterion("bumen is not null");
            return (Criteria) this;
        }

        public Criteria andBumenEqualTo(Integer value) {
            addCriterion("bumen =", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotEqualTo(Integer value) {
            addCriterion("bumen <>", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThan(Integer value) {
            addCriterion("bumen >", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenGreaterThanOrEqualTo(Integer value) {
            addCriterion("bumen >=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThan(Integer value) {
            addCriterion("bumen <", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenLessThanOrEqualTo(Integer value) {
            addCriterion("bumen <=", value, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenIn(List<Integer> values) {
            addCriterion("bumen in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotIn(List<Integer> values) {
            addCriterion("bumen not in", values, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenBetween(Integer value1, Integer value2) {
            addCriterion("bumen between", value1, value2, "bumen");
            return (Criteria) this;
        }

        public Criteria andBumenNotBetween(Integer value1, Integer value2) {
            addCriterion("bumen not between", value1, value2, "bumen");
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