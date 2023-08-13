package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HuiNongShouYeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuiNongShouYeExample() {
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

        public Criteria andXinXiIdIsNull() {
            addCriterion("xin_xi_id is null");
            return (Criteria) this;
        }

        public Criteria andXinXiIdIsNotNull() {
            addCriterion("xin_xi_id is not null");
            return (Criteria) this;
        }

        public Criteria andXinXiIdEqualTo(Integer value) {
            addCriterion("xin_xi_id =", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdNotEqualTo(Integer value) {
            addCriterion("xin_xi_id <>", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdGreaterThan(Integer value) {
            addCriterion("xin_xi_id >", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xin_xi_id >=", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdLessThan(Integer value) {
            addCriterion("xin_xi_id <", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdLessThanOrEqualTo(Integer value) {
            addCriterion("xin_xi_id <=", value, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdIn(List<Integer> values) {
            addCriterion("xin_xi_id in", values, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdNotIn(List<Integer> values) {
            addCriterion("xin_xi_id not in", values, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdBetween(Integer value1, Integer value2) {
            addCriterion("xin_xi_id between", value1, value2, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andXinXiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xin_xi_id not between", value1, value2, "xinXiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIsNull() {
            addCriterion("mian_ji is null");
            return (Criteria) this;
        }

        public Criteria andMianJiIsNotNull() {
            addCriterion("mian_ji is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiEqualTo(Double value) {
            addCriterion("mian_ji =", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotEqualTo(Double value) {
            addCriterion("mian_ji <>", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThan(Double value) {
            addCriterion("mian_ji >", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiGreaterThanOrEqualTo(Double value) {
            addCriterion("mian_ji >=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThan(Double value) {
            addCriterion("mian_ji <", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiLessThanOrEqualTo(Double value) {
            addCriterion("mian_ji <=", value, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiIn(List<Double> values) {
            addCriterion("mian_ji in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotIn(List<Double> values) {
            addCriterion("mian_ji not in", values, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiBetween(Double value1, Double value2) {
            addCriterion("mian_ji between", value1, value2, "mianJi");
            return (Criteria) this;
        }

        public Criteria andMianJiNotBetween(Double value1, Double value2) {
            addCriterion("mian_ji not between", value1, value2, "mianJi");
            return (Criteria) this;
        }

        public Criteria andShuLiangIsNull() {
            addCriterion("shu_liang is null");
            return (Criteria) this;
        }

        public Criteria andShuLiangIsNotNull() {
            addCriterion("shu_liang is not null");
            return (Criteria) this;
        }

        public Criteria andShuLiangEqualTo(Integer value) {
            addCriterion("shu_liang =", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotEqualTo(Integer value) {
            addCriterion("shu_liang <>", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangGreaterThan(Integer value) {
            addCriterion("shu_liang >", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shu_liang >=", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangLessThan(Integer value) {
            addCriterion("shu_liang <", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangLessThanOrEqualTo(Integer value) {
            addCriterion("shu_liang <=", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangIn(List<Integer> values) {
            addCriterion("shu_liang in", values, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotIn(List<Integer> values) {
            addCriterion("shu_liang not in", values, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangBetween(Integer value1, Integer value2) {
            addCriterion("shu_liang between", value1, value2, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotBetween(Integer value1, Integer value2) {
            addCriterion("shu_liang not between", value1, value2, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiIsNull() {
            addCriterion("mian_ji_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiIsNotNull() {
            addCriterion("mian_ji_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiEqualTo(String value) {
            addCriterion("mian_ji_dan_wei =", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiNotEqualTo(String value) {
            addCriterion("mian_ji_dan_wei <>", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiGreaterThan(String value) {
            addCriterion("mian_ji_dan_wei >", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("mian_ji_dan_wei >=", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiLessThan(String value) {
            addCriterion("mian_ji_dan_wei <", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiLessThanOrEqualTo(String value) {
            addCriterion("mian_ji_dan_wei <=", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiLike(String value) {
            addCriterion("mian_ji_dan_wei like", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiNotLike(String value) {
            addCriterion("mian_ji_dan_wei not like", value, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiIn(List<String> values) {
            addCriterion("mian_ji_dan_wei in", values, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiNotIn(List<String> values) {
            addCriterion("mian_ji_dan_wei not in", values, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiBetween(String value1, String value2) {
            addCriterion("mian_ji_dan_wei between", value1, value2, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andMianJiDanWeiNotBetween(String value1, String value2) {
            addCriterion("mian_ji_dan_wei not between", value1, value2, "mianJiDanWei");
            return (Criteria) this;
        }

        public Criteria andXiTypeIsNull() {
            addCriterion("xi_type is null");
            return (Criteria) this;
        }

        public Criteria andXiTypeIsNotNull() {
            addCriterion("xi_type is not null");
            return (Criteria) this;
        }

        public Criteria andXiTypeEqualTo(String value) {
            addCriterion("xi_type =", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeNotEqualTo(String value) {
            addCriterion("xi_type <>", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeGreaterThan(String value) {
            addCriterion("xi_type >", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeGreaterThanOrEqualTo(String value) {
            addCriterion("xi_type >=", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeLessThan(String value) {
            addCriterion("xi_type <", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeLessThanOrEqualTo(String value) {
            addCriterion("xi_type <=", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeLike(String value) {
            addCriterion("xi_type like", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeNotLike(String value) {
            addCriterion("xi_type not like", value, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeIn(List<String> values) {
            addCriterion("xi_type in", values, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeNotIn(List<String> values) {
            addCriterion("xi_type not in", values, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeBetween(String value1, String value2) {
            addCriterion("xi_type between", value1, value2, "xiType");
            return (Criteria) this;
        }

        public Criteria andXiTypeNotBetween(String value1, String value2) {
            addCriterion("xi_type not between", value1, value2, "xiType");
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

        public Criteria andNianChanLiangIsNull() {
            addCriterion("nian_chan_liang is null");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangIsNotNull() {
            addCriterion("nian_chan_liang is not null");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangEqualTo(Double value) {
            addCriterion("nian_chan_liang =", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangNotEqualTo(Double value) {
            addCriterion("nian_chan_liang <>", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangGreaterThan(Double value) {
            addCriterion("nian_chan_liang >", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangGreaterThanOrEqualTo(Double value) {
            addCriterion("nian_chan_liang >=", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangLessThan(Double value) {
            addCriterion("nian_chan_liang <", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangLessThanOrEqualTo(Double value) {
            addCriterion("nian_chan_liang <=", value, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangIn(List<Double> values) {
            addCriterion("nian_chan_liang in", values, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangNotIn(List<Double> values) {
            addCriterion("nian_chan_liang not in", values, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangBetween(Double value1, Double value2) {
            addCriterion("nian_chan_liang between", value1, value2, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangNotBetween(Double value1, Double value2) {
            addCriterion("nian_chan_liang not between", value1, value2, "nianChanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiIsNull() {
            addCriterion("nian_chan_liang_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiIsNotNull() {
            addCriterion("nian_chan_liang_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiEqualTo(String value) {
            addCriterion("nian_chan_liang_dan_wei =", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiNotEqualTo(String value) {
            addCriterion("nian_chan_liang_dan_wei <>", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiGreaterThan(String value) {
            addCriterion("nian_chan_liang_dan_wei >", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("nian_chan_liang_dan_wei >=", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiLessThan(String value) {
            addCriterion("nian_chan_liang_dan_wei <", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiLessThanOrEqualTo(String value) {
            addCriterion("nian_chan_liang_dan_wei <=", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiLike(String value) {
            addCriterion("nian_chan_liang_dan_wei like", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiNotLike(String value) {
            addCriterion("nian_chan_liang_dan_wei not like", value, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiIn(List<String> values) {
            addCriterion("nian_chan_liang_dan_wei in", values, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiNotIn(List<String> values) {
            addCriterion("nian_chan_liang_dan_wei not in", values, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiBetween(String value1, String value2) {
            addCriterion("nian_chan_liang_dan_wei between", value1, value2, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andNianChanLiangDanWeiNotBetween(String value1, String value2) {
            addCriterion("nian_chan_liang_dan_wei not between", value1, value2, "nianChanLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andDanChanIsNull() {
            addCriterion("dan_chan is null");
            return (Criteria) this;
        }

        public Criteria andDanChanIsNotNull() {
            addCriterion("dan_chan is not null");
            return (Criteria) this;
        }

        public Criteria andDanChanEqualTo(Double value) {
            addCriterion("dan_chan =", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotEqualTo(Double value) {
            addCriterion("dan_chan <>", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanGreaterThan(Double value) {
            addCriterion("dan_chan >", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanGreaterThanOrEqualTo(Double value) {
            addCriterion("dan_chan >=", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanLessThan(Double value) {
            addCriterion("dan_chan <", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanLessThanOrEqualTo(Double value) {
            addCriterion("dan_chan <=", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanIn(List<Double> values) {
            addCriterion("dan_chan in", values, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotIn(List<Double> values) {
            addCriterion("dan_chan not in", values, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanBetween(Double value1, Double value2) {
            addCriterion("dan_chan between", value1, value2, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotBetween(Double value1, Double value2) {
            addCriterion("dan_chan not between", value1, value2, "danChan");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNull() {
            addCriterion("da_type is null");
            return (Criteria) this;
        }

        public Criteria andDaTypeIsNotNull() {
            addCriterion("da_type is not null");
            return (Criteria) this;
        }

        public Criteria andDaTypeEqualTo(String value) {
            addCriterion("da_type =", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotEqualTo(String value) {
            addCriterion("da_type <>", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThan(String value) {
            addCriterion("da_type >", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("da_type >=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThan(String value) {
            addCriterion("da_type <", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLessThanOrEqualTo(String value) {
            addCriterion("da_type <=", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeLike(String value) {
            addCriterion("da_type like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotLike(String value) {
            addCriterion("da_type not like", value, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeIn(List<String> values) {
            addCriterion("da_type in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotIn(List<String> values) {
            addCriterion("da_type not in", values, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeBetween(String value1, String value2) {
            addCriterion("da_type between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andDaTypeNotBetween(String value1, String value2) {
            addCriterion("da_type not between", value1, value2, "daType");
            return (Criteria) this;
        }

        public Criteria andMingChengIsNull() {
            addCriterion("ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andMingChengIsNotNull() {
            addCriterion("ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andMingChengEqualTo(String value) {
            addCriterion("ming_cheng =", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengNotEqualTo(String value) {
            addCriterion("ming_cheng <>", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengGreaterThan(String value) {
            addCriterion("ming_cheng >", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("ming_cheng >=", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengLessThan(String value) {
            addCriterion("ming_cheng <", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengLessThanOrEqualTo(String value) {
            addCriterion("ming_cheng <=", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengLike(String value) {
            addCriterion("ming_cheng like", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengNotLike(String value) {
            addCriterion("ming_cheng not like", value, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengIn(List<String> values) {
            addCriterion("ming_cheng in", values, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengNotIn(List<String> values) {
            addCriterion("ming_cheng not in", values, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengBetween(String value1, String value2) {
            addCriterion("ming_cheng between", value1, value2, "mingCheng");
            return (Criteria) this;
        }

        public Criteria andMingChengNotBetween(String value1, String value2) {
            addCriterion("ming_cheng not between", value1, value2, "mingCheng");
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

        public Criteria andBeiyong3IsNull() {
            addCriterion("beiyong3 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3IsNotNull() {
            addCriterion("beiyong3 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong3EqualTo(Double value) {
            addCriterion("beiyong3 =", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotEqualTo(Double value) {
            addCriterion("beiyong3 <>", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThan(Double value) {
            addCriterion("beiyong3 >", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3GreaterThanOrEqualTo(Double value) {
            addCriterion("beiyong3 >=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThan(Double value) {
            addCriterion("beiyong3 <", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3LessThanOrEqualTo(Double value) {
            addCriterion("beiyong3 <=", value, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3In(List<Double> values) {
            addCriterion("beiyong3 in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotIn(List<Double> values) {
            addCriterion("beiyong3 not in", values, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3Between(Double value1, Double value2) {
            addCriterion("beiyong3 between", value1, value2, "beiyong3");
            return (Criteria) this;
        }

        public Criteria andBeiyong3NotBetween(Double value1, Double value2) {
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

        public Criteria andBeiyong4EqualTo(Double value) {
            addCriterion("beiyong4 =", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotEqualTo(Double value) {
            addCriterion("beiyong4 <>", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThan(Double value) {
            addCriterion("beiyong4 >", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThanOrEqualTo(Double value) {
            addCriterion("beiyong4 >=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThan(Double value) {
            addCriterion("beiyong4 <", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThanOrEqualTo(Double value) {
            addCriterion("beiyong4 <=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4In(List<Double> values) {
            addCriterion("beiyong4 in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotIn(List<Double> values) {
            addCriterion("beiyong4 not in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Between(Double value1, Double value2) {
            addCriterion("beiyong4 between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotBetween(Double value1, Double value2) {
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

        public Criteria andBeiyong5EqualTo(Integer value) {
            addCriterion("beiyong5 =", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotEqualTo(Integer value) {
            addCriterion("beiyong5 <>", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThan(Integer value) {
            addCriterion("beiyong5 >", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThanOrEqualTo(Integer value) {
            addCriterion("beiyong5 >=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThan(Integer value) {
            addCriterion("beiyong5 <", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThanOrEqualTo(Integer value) {
            addCriterion("beiyong5 <=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5In(List<Integer> values) {
            addCriterion("beiyong5 in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotIn(List<Integer> values) {
            addCriterion("beiyong5 not in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5Between(Integer value1, Integer value2) {
            addCriterion("beiyong5 between", value1, value2, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotBetween(Integer value1, Integer value2) {
            addCriterion("beiyong5 not between", value1, value2, "beiyong5");
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