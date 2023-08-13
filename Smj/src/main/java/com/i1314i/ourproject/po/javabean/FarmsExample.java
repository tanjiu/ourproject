package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FarmsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FarmsExample() {
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

        public Criteria andYangzhiIdIsNull() {
            addCriterion("yangzhi_id is null");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdIsNotNull() {
            addCriterion("yangzhi_id is not null");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdEqualTo(Integer value) {
            addCriterion("yangzhi_id =", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdNotEqualTo(Integer value) {
            addCriterion("yangzhi_id <>", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdGreaterThan(Integer value) {
            addCriterion("yangzhi_id >", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("yangzhi_id >=", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdLessThan(Integer value) {
            addCriterion("yangzhi_id <", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdLessThanOrEqualTo(Integer value) {
            addCriterion("yangzhi_id <=", value, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdIn(List<Integer> values) {
            addCriterion("yangzhi_id in", values, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdNotIn(List<Integer> values) {
            addCriterion("yangzhi_id not in", values, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdBetween(Integer value1, Integer value2) {
            addCriterion("yangzhi_id between", value1, value2, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andYangzhiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("yangzhi_id not between", value1, value2, "yangzhiId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andZhenJieIsNull() {
            addCriterion("zhen_jie is null");
            return (Criteria) this;
        }

        public Criteria andZhenJieIsNotNull() {
            addCriterion("zhen_jie is not null");
            return (Criteria) this;
        }

        public Criteria andZhenJieEqualTo(String value) {
            addCriterion("zhen_jie =", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieNotEqualTo(String value) {
            addCriterion("zhen_jie <>", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieGreaterThan(String value) {
            addCriterion("zhen_jie >", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieGreaterThanOrEqualTo(String value) {
            addCriterion("zhen_jie >=", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieLessThan(String value) {
            addCriterion("zhen_jie <", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieLessThanOrEqualTo(String value) {
            addCriterion("zhen_jie <=", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieLike(String value) {
            addCriterion("zhen_jie like", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieNotLike(String value) {
            addCriterion("zhen_jie not like", value, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieIn(List<String> values) {
            addCriterion("zhen_jie in", values, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieNotIn(List<String> values) {
            addCriterion("zhen_jie not in", values, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieBetween(String value1, String value2) {
            addCriterion("zhen_jie between", value1, value2, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andZhenJieNotBetween(String value1, String value2) {
            addCriterion("zhen_jie not between", value1, value2, "zhenJie");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Date value) {
            addCriterionForJDBCDate("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Date value) {
            addCriterionForJDBCDate("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Date value) {
            addCriterionForJDBCDate("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Date> values) {
            addCriterionForJDBCDate("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoIsNull() {
            addCriterion("cun_lan_guimo is null");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoIsNotNull() {
            addCriterion("cun_lan_guimo is not null");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoEqualTo(String value) {
            addCriterion("cun_lan_guimo =", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoNotEqualTo(String value) {
            addCriterion("cun_lan_guimo <>", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoGreaterThan(String value) {
            addCriterion("cun_lan_guimo >", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoGreaterThanOrEqualTo(String value) {
            addCriterion("cun_lan_guimo >=", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoLessThan(String value) {
            addCriterion("cun_lan_guimo <", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoLessThanOrEqualTo(String value) {
            addCriterion("cun_lan_guimo <=", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoLike(String value) {
            addCriterion("cun_lan_guimo like", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoNotLike(String value) {
            addCriterion("cun_lan_guimo not like", value, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoIn(List<String> values) {
            addCriterion("cun_lan_guimo in", values, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoNotIn(List<String> values) {
            addCriterion("cun_lan_guimo not in", values, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoBetween(String value1, String value2) {
            addCriterion("cun_lan_guimo between", value1, value2, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andCunLanGuimoNotBetween(String value1, String value2) {
            addCriterion("cun_lan_guimo not between", value1, value2, "cunLanGuimo");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangIsNull() {
            addCriterion("nian_chulan_liang is null");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangIsNotNull() {
            addCriterion("nian_chulan_liang is not null");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangEqualTo(String value) {
            addCriterion("nian_chulan_liang =", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangNotEqualTo(String value) {
            addCriterion("nian_chulan_liang <>", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangGreaterThan(String value) {
            addCriterion("nian_chulan_liang >", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangGreaterThanOrEqualTo(String value) {
            addCriterion("nian_chulan_liang >=", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangLessThan(String value) {
            addCriterion("nian_chulan_liang <", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangLessThanOrEqualTo(String value) {
            addCriterion("nian_chulan_liang <=", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangLike(String value) {
            addCriterion("nian_chulan_liang like", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangNotLike(String value) {
            addCriterion("nian_chulan_liang not like", value, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangIn(List<String> values) {
            addCriterion("nian_chulan_liang in", values, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangNotIn(List<String> values) {
            addCriterion("nian_chulan_liang not in", values, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangBetween(String value1, String value2) {
            addCriterion("nian_chulan_liang between", value1, value2, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andNianChulanLiangNotBetween(String value1, String value2) {
            addCriterion("nian_chulan_liang not between", value1, value2, "nianChulanLiang");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNull() {
            addCriterion("fuzeren is null");
            return (Criteria) this;
        }

        public Criteria andFuzerenIsNotNull() {
            addCriterion("fuzeren is not null");
            return (Criteria) this;
        }

        public Criteria andFuzerenEqualTo(String value) {
            addCriterion("fuzeren =", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotEqualTo(String value) {
            addCriterion("fuzeren <>", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThan(String value) {
            addCriterion("fuzeren >", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenGreaterThanOrEqualTo(String value) {
            addCriterion("fuzeren >=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThan(String value) {
            addCriterion("fuzeren <", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLessThanOrEqualTo(String value) {
            addCriterion("fuzeren <=", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenLike(String value) {
            addCriterion("fuzeren like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotLike(String value) {
            addCriterion("fuzeren not like", value, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenIn(List<String> values) {
            addCriterion("fuzeren in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotIn(List<String> values) {
            addCriterion("fuzeren not in", values, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenBetween(String value1, String value2) {
            addCriterion("fuzeren between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andFuzerenNotBetween(String value1, String value2) {
            addCriterion("fuzeren not between", value1, value2, "fuzeren");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNull() {
            addCriterion("lianxiren is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNotNull() {
            addCriterion("lianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenEqualTo(String value) {
            addCriterion("lianxiren =", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotEqualTo(String value) {
            addCriterion("lianxiren <>", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThan(String value) {
            addCriterion("lianxiren >", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren >=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThan(String value) {
            addCriterion("lianxiren <", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThanOrEqualTo(String value) {
            addCriterion("lianxiren <=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLike(String value) {
            addCriterion("lianxiren like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotLike(String value) {
            addCriterion("lianxiren not like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenIn(List<String> values) {
            addCriterion("lianxiren in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotIn(List<String> values) {
            addCriterion("lianxiren not in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenBetween(String value1, String value2) {
            addCriterion("lianxiren between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotBetween(String value1, String value2) {
            addCriterion("lianxiren not between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIsNull() {
            addCriterion("lianxiren_tel is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIsNotNull() {
            addCriterion("lianxiren_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelEqualTo(String value) {
            addCriterion("lianxiren_tel =", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotEqualTo(String value) {
            addCriterion("lianxiren_tel <>", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelGreaterThan(String value) {
            addCriterion("lianxiren_tel >", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren_tel >=", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLessThan(String value) {
            addCriterion("lianxiren_tel <", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLessThanOrEqualTo(String value) {
            addCriterion("lianxiren_tel <=", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLike(String value) {
            addCriterion("lianxiren_tel like", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotLike(String value) {
            addCriterion("lianxiren_tel not like", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIn(List<String> values) {
            addCriterion("lianxiren_tel in", values, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotIn(List<String> values) {
            addCriterion("lianxiren_tel not in", values, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelBetween(String value1, String value2) {
            addCriterion("lianxiren_tel between", value1, value2, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotBetween(String value1, String value2) {
            addCriterion("lianxiren_tel not between", value1, value2, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Double value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Double value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Double value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Double value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Double value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Double value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Double> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Double> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Double value1, Double value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Double value1, Double value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Double value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Double value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Double value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Double value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Double value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Double value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Double> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Double> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Double value1, Double value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Double value1, Double value2) {
            addCriterion("y not between", value1, value2, "y");
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