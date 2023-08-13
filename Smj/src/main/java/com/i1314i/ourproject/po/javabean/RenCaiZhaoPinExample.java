package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RenCaiZhaoPinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RenCaiZhaoPinExample() {
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

        public Criteria andZhaopinIdIsNull() {
            addCriterion("zhaopin_id is null");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdIsNotNull() {
            addCriterion("zhaopin_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdEqualTo(Integer value) {
            addCriterion("zhaopin_id =", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdNotEqualTo(Integer value) {
            addCriterion("zhaopin_id <>", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdGreaterThan(Integer value) {
            addCriterion("zhaopin_id >", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhaopin_id >=", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdLessThan(Integer value) {
            addCriterion("zhaopin_id <", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdLessThanOrEqualTo(Integer value) {
            addCriterion("zhaopin_id <=", value, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdIn(List<Integer> values) {
            addCriterion("zhaopin_id in", values, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdNotIn(List<Integer> values) {
            addCriterion("zhaopin_id not in", values, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdBetween(Integer value1, Integer value2) {
            addCriterion("zhaopin_id between", value1, value2, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhaopinIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zhaopin_id not between", value1, value2, "zhaopinId");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNull() {
            addCriterion("zhiwei is null");
            return (Criteria) this;
        }

        public Criteria andZhiweiIsNotNull() {
            addCriterion("zhiwei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiweiEqualTo(String value) {
            addCriterion("zhiwei =", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotEqualTo(String value) {
            addCriterion("zhiwei <>", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThan(String value) {
            addCriterion("zhiwei >", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiGreaterThanOrEqualTo(String value) {
            addCriterion("zhiwei >=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThan(String value) {
            addCriterion("zhiwei <", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLessThanOrEqualTo(String value) {
            addCriterion("zhiwei <=", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiLike(String value) {
            addCriterion("zhiwei like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotLike(String value) {
            addCriterion("zhiwei not like", value, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiIn(List<String> values) {
            addCriterion("zhiwei in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotIn(List<String> values) {
            addCriterion("zhiwei not in", values, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiBetween(String value1, String value2) {
            addCriterion("zhiwei between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andZhiweiNotBetween(String value1, String value2) {
            addCriterion("zhiwei not between", value1, value2, "zhiwei");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieIsNull() {
            addCriterion("gong_zuo_jian_jie is null");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieIsNotNull() {
            addCriterion("gong_zuo_jian_jie is not null");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieEqualTo(String value) {
            addCriterion("gong_zuo_jian_jie =", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieNotEqualTo(String value) {
            addCriterion("gong_zuo_jian_jie <>", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieGreaterThan(String value) {
            addCriterion("gong_zuo_jian_jie >", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieGreaterThanOrEqualTo(String value) {
            addCriterion("gong_zuo_jian_jie >=", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieLessThan(String value) {
            addCriterion("gong_zuo_jian_jie <", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieLessThanOrEqualTo(String value) {
            addCriterion("gong_zuo_jian_jie <=", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieLike(String value) {
            addCriterion("gong_zuo_jian_jie like", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieNotLike(String value) {
            addCriterion("gong_zuo_jian_jie not like", value, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieIn(List<String> values) {
            addCriterion("gong_zuo_jian_jie in", values, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieNotIn(List<String> values) {
            addCriterion("gong_zuo_jian_jie not in", values, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieBetween(String value1, String value2) {
            addCriterion("gong_zuo_jian_jie between", value1, value2, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andGongZuoJianJieNotBetween(String value1, String value2) {
            addCriterion("gong_zuo_jian_jie not between", value1, value2, "gongZuoJianJie");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNull() {
            addCriterion("min_age is null");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNotNull() {
            addCriterion("min_age is not null");
            return (Criteria) this;
        }

        public Criteria andMinAgeEqualTo(Integer value) {
            addCriterion("min_age =", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotEqualTo(Integer value) {
            addCriterion("min_age <>", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThan(Integer value) {
            addCriterion("min_age >", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_age >=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThan(Integer value) {
            addCriterion("min_age <", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThanOrEqualTo(Integer value) {
            addCriterion("min_age <=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeIn(List<Integer> values) {
            addCriterion("min_age in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotIn(List<Integer> values) {
            addCriterion("min_age not in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeBetween(Integer value1, Integer value2) {
            addCriterion("min_age between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_age not between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNull() {
            addCriterion("max_age is null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNotNull() {
            addCriterion("max_age is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeEqualTo(Integer value) {
            addCriterion("max_age =", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotEqualTo(Integer value) {
            addCriterion("max_age <>", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThan(Integer value) {
            addCriterion("max_age >", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_age >=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThan(Integer value) {
            addCriterion("max_age <", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThanOrEqualTo(Integer value) {
            addCriterion("max_age <=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIn(List<Integer> values) {
            addCriterion("max_age in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotIn(List<Integer> values) {
            addCriterion("max_age not in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeBetween(Integer value1, Integer value2) {
            addCriterion("max_age between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_age not between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("xueli is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("xueli is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("xueli =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("xueli <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("xueli >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("xueli >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("xueli <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("xueli <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("xueli like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("xueli not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("xueli in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("xueli not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("xueli between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("xueli not between", value1, value2, "xueli");
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

        public Criteria andGongZuoDiDianIsNull() {
            addCriterion("gong_zuo_di_dian is null");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianIsNotNull() {
            addCriterion("gong_zuo_di_dian is not null");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianEqualTo(Integer value) {
            addCriterion("gong_zuo_di_dian =", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianNotEqualTo(Integer value) {
            addCriterion("gong_zuo_di_dian <>", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianGreaterThan(Integer value) {
            addCriterion("gong_zuo_di_dian >", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianGreaterThanOrEqualTo(Integer value) {
            addCriterion("gong_zuo_di_dian >=", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianLessThan(Integer value) {
            addCriterion("gong_zuo_di_dian <", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianLessThanOrEqualTo(Integer value) {
            addCriterion("gong_zuo_di_dian <=", value, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianIn(List<Integer> values) {
            addCriterion("gong_zuo_di_dian in", values, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianNotIn(List<Integer> values) {
            addCriterion("gong_zuo_di_dian not in", values, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianBetween(Integer value1, Integer value2) {
            addCriterion("gong_zuo_di_dian between", value1, value2, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andGongZuoDiDianNotBetween(Integer value1, Integer value2) {
            addCriterion("gong_zuo_di_dian not between", value1, value2, "gongZuoDiDian");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuIsNull() {
            addCriterion("min_xin_zi_dai_yu is null");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuIsNotNull() {
            addCriterion("min_xin_zi_dai_yu is not null");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuEqualTo(Double value) {
            addCriterion("min_xin_zi_dai_yu =", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuNotEqualTo(Double value) {
            addCriterion("min_xin_zi_dai_yu <>", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuGreaterThan(Double value) {
            addCriterion("min_xin_zi_dai_yu >", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuGreaterThanOrEqualTo(Double value) {
            addCriterion("min_xin_zi_dai_yu >=", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuLessThan(Double value) {
            addCriterion("min_xin_zi_dai_yu <", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuLessThanOrEqualTo(Double value) {
            addCriterion("min_xin_zi_dai_yu <=", value, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuIn(List<Double> values) {
            addCriterion("min_xin_zi_dai_yu in", values, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuNotIn(List<Double> values) {
            addCriterion("min_xin_zi_dai_yu not in", values, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuBetween(Double value1, Double value2) {
            addCriterion("min_xin_zi_dai_yu between", value1, value2, "minXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMinXinZiDaiYuNotBetween(Double value1, Double value2) {
            addCriterion("min_xin_zi_dai_yu not between", value1, value2, "minXinZiDaiYu");
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

        public Criteria andZhaoPinRenShuIsNull() {
            addCriterion("zhao_pin_ren_shu is null");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuIsNotNull() {
            addCriterion("zhao_pin_ren_shu is not null");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuEqualTo(Integer value) {
            addCriterion("zhao_pin_ren_shu =", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuNotEqualTo(Integer value) {
            addCriterion("zhao_pin_ren_shu <>", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuGreaterThan(Integer value) {
            addCriterion("zhao_pin_ren_shu >", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhao_pin_ren_shu >=", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuLessThan(Integer value) {
            addCriterion("zhao_pin_ren_shu <", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuLessThanOrEqualTo(Integer value) {
            addCriterion("zhao_pin_ren_shu <=", value, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuIn(List<Integer> values) {
            addCriterion("zhao_pin_ren_shu in", values, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuNotIn(List<Integer> values) {
            addCriterion("zhao_pin_ren_shu not in", values, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuBetween(Integer value1, Integer value2) {
            addCriterion("zhao_pin_ren_shu between", value1, value2, "zhaoPinRenShu");
            return (Criteria) this;
        }

        public Criteria andZhaoPinRenShuNotBetween(Integer value1, Integer value2) {
            addCriterion("zhao_pin_ren_shu not between", value1, value2, "zhaoPinRenShu");
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

        public Criteria andMaxXinZiDaiYuIsNull() {
            addCriterion("max_xin_zi_dai_yu is null");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuIsNotNull() {
            addCriterion("max_xin_zi_dai_yu is not null");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuEqualTo(Double value) {
            addCriterion("max_xin_zi_dai_yu =", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuNotEqualTo(Double value) {
            addCriterion("max_xin_zi_dai_yu <>", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuGreaterThan(Double value) {
            addCriterion("max_xin_zi_dai_yu >", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuGreaterThanOrEqualTo(Double value) {
            addCriterion("max_xin_zi_dai_yu >=", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuLessThan(Double value) {
            addCriterion("max_xin_zi_dai_yu <", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuLessThanOrEqualTo(Double value) {
            addCriterion("max_xin_zi_dai_yu <=", value, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuIn(List<Double> values) {
            addCriterion("max_xin_zi_dai_yu in", values, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuNotIn(List<Double> values) {
            addCriterion("max_xin_zi_dai_yu not in", values, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuBetween(Double value1, Double value2) {
            addCriterion("max_xin_zi_dai_yu between", value1, value2, "maxXinZiDaiYu");
            return (Criteria) this;
        }

        public Criteria andMaxXinZiDaiYuNotBetween(Double value1, Double value2) {
            addCriterion("max_xin_zi_dai_yu not between", value1, value2, "maxXinZiDaiYu");
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