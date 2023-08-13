package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class ShiChangXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShiChangXinXiExample() {
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

        public Criteria andZuoWuIdIsNull() {
            addCriterion("zuo_wu_id is null");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdIsNotNull() {
            addCriterion("zuo_wu_id is not null");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdEqualTo(Integer value) {
            addCriterion("zuo_wu_id =", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdNotEqualTo(Integer value) {
            addCriterion("zuo_wu_id <>", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdGreaterThan(Integer value) {
            addCriterion("zuo_wu_id >", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zuo_wu_id >=", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdLessThan(Integer value) {
            addCriterion("zuo_wu_id <", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdLessThanOrEqualTo(Integer value) {
            addCriterion("zuo_wu_id <=", value, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdIn(List<Integer> values) {
            addCriterion("zuo_wu_id in", values, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdNotIn(List<Integer> values) {
            addCriterion("zuo_wu_id not in", values, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdBetween(Integer value1, Integer value2) {
            addCriterion("zuo_wu_id between", value1, value2, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zuo_wu_id not between", value1, value2, "zuoWuId");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengIsNull() {
            addCriterion("zuo_wu_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengIsNotNull() {
            addCriterion("zuo_wu_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengEqualTo(String value) {
            addCriterion("zuo_wu_ming_cheng =", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengNotEqualTo(String value) {
            addCriterion("zuo_wu_ming_cheng <>", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengGreaterThan(String value) {
            addCriterion("zuo_wu_ming_cheng >", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("zuo_wu_ming_cheng >=", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengLessThan(String value) {
            addCriterion("zuo_wu_ming_cheng <", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengLessThanOrEqualTo(String value) {
            addCriterion("zuo_wu_ming_cheng <=", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengLike(String value) {
            addCriterion("zuo_wu_ming_cheng like", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengNotLike(String value) {
            addCriterion("zuo_wu_ming_cheng not like", value, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengIn(List<String> values) {
            addCriterion("zuo_wu_ming_cheng in", values, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengNotIn(List<String> values) {
            addCriterion("zuo_wu_ming_cheng not in", values, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengBetween(String value1, String value2) {
            addCriterion("zuo_wu_ming_cheng between", value1, value2, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZuoWuMingChengNotBetween(String value1, String value2) {
            addCriterion("zuo_wu_ming_cheng not between", value1, value2, "zuoWuMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiIsNull() {
            addCriterion("zhong_zhi_mian_ji is null");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiIsNotNull() {
            addCriterion("zhong_zhi_mian_ji is not null");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiEqualTo(Double value) {
            addCriterion("zhong_zhi_mian_ji =", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiNotEqualTo(Double value) {
            addCriterion("zhong_zhi_mian_ji <>", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiGreaterThan(Double value) {
            addCriterion("zhong_zhi_mian_ji >", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiGreaterThanOrEqualTo(Double value) {
            addCriterion("zhong_zhi_mian_ji >=", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiLessThan(Double value) {
            addCriterion("zhong_zhi_mian_ji <", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiLessThanOrEqualTo(Double value) {
            addCriterion("zhong_zhi_mian_ji <=", value, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiIn(List<Double> values) {
            addCriterion("zhong_zhi_mian_ji in", values, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiNotIn(List<Double> values) {
            addCriterion("zhong_zhi_mian_ji not in", values, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiBetween(Double value1, Double value2) {
            addCriterion("zhong_zhi_mian_ji between", value1, value2, "zhongZhiMianJi");
            return (Criteria) this;
        }

        public Criteria andZhongZhiMianJiNotBetween(Double value1, Double value2) {
            addCriterion("zhong_zhi_mian_ji not between", value1, value2, "zhongZhiMianJi");
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

        public Criteria andBeiyong1EqualTo(Double value) {
            addCriterion("beiyong1 =", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotEqualTo(Double value) {
            addCriterion("beiyong1 <>", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThan(Double value) {
            addCriterion("beiyong1 >", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1GreaterThanOrEqualTo(Double value) {
            addCriterion("beiyong1 >=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThan(Double value) {
            addCriterion("beiyong1 <", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1LessThanOrEqualTo(Double value) {
            addCriterion("beiyong1 <=", value, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1In(List<Double> values) {
            addCriterion("beiyong1 in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotIn(List<Double> values) {
            addCriterion("beiyong1 not in", values, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1Between(Double value1, Double value2) {
            addCriterion("beiyong1 between", value1, value2, "beiyong1");
            return (Criteria) this;
        }

        public Criteria andBeiyong1NotBetween(Double value1, Double value2) {
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

        public Criteria andBeiyong2EqualTo(Double value) {
            addCriterion("beiyong2 =", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotEqualTo(Double value) {
            addCriterion("beiyong2 <>", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThan(Double value) {
            addCriterion("beiyong2 >", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThanOrEqualTo(Double value) {
            addCriterion("beiyong2 >=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThan(Double value) {
            addCriterion("beiyong2 <", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThanOrEqualTo(Double value) {
            addCriterion("beiyong2 <=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2In(List<Double> values) {
            addCriterion("beiyong2 in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotIn(List<Double> values) {
            addCriterion("beiyong2 not in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2Between(Double value1, Double value2) {
            addCriterion("beiyong2 between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotBetween(Double value1, Double value2) {
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

        public Criteria andDanweiIsNull() {
            addCriterion("danwei is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("danwei is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("danwei =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("danwei <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("danwei >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("danwei >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("danwei <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("danwei <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("danwei like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("danwei not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("danwei in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("danwei not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("danwei between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("danwei not between", value1, value2, "danwei");
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