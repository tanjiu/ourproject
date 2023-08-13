package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XianDaiHuaJiXieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XianDaiHuaJiXieExample() {
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

        public Criteria andMianJiIdIsNull() {
            addCriterion("mian_ji_id is null");
            return (Criteria) this;
        }

        public Criteria andMianJiIdIsNotNull() {
            addCriterion("mian_ji_id is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiIdEqualTo(Integer value) {
            addCriterion("mian_ji_id =", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdNotEqualTo(Integer value) {
            addCriterion("mian_ji_id <>", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdGreaterThan(Integer value) {
            addCriterion("mian_ji_id >", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mian_ji_id >=", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdLessThan(Integer value) {
            addCriterion("mian_ji_id <", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdLessThanOrEqualTo(Integer value) {
            addCriterion("mian_ji_id <=", value, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdIn(List<Integer> values) {
            addCriterion("mian_ji_id in", values, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdNotIn(List<Integer> values) {
            addCriterion("mian_ji_id not in", values, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdBetween(Integer value1, Integer value2) {
            addCriterion("mian_ji_id between", value1, value2, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mian_ji_id not between", value1, value2, "mianJiId");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengIsNull() {
            addCriterion("mian_ji_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengIsNotNull() {
            addCriterion("mian_ji_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengEqualTo(String value) {
            addCriterion("mian_ji_ming_cheng =", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengNotEqualTo(String value) {
            addCriterion("mian_ji_ming_cheng <>", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengGreaterThan(String value) {
            addCriterion("mian_ji_ming_cheng >", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("mian_ji_ming_cheng >=", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengLessThan(String value) {
            addCriterion("mian_ji_ming_cheng <", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengLessThanOrEqualTo(String value) {
            addCriterion("mian_ji_ming_cheng <=", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengLike(String value) {
            addCriterion("mian_ji_ming_cheng like", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengNotLike(String value) {
            addCriterion("mian_ji_ming_cheng not like", value, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengIn(List<String> values) {
            addCriterion("mian_ji_ming_cheng in", values, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengNotIn(List<String> values) {
            addCriterion("mian_ji_ming_cheng not in", values, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengBetween(String value1, String value2) {
            addCriterion("mian_ji_ming_cheng between", value1, value2, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiMingChengNotBetween(String value1, String value2) {
            addCriterion("mian_ji_ming_cheng not between", value1, value2, "mianJiMingCheng");
            return (Criteria) this;
        }

        public Criteria andMianJiNumIsNull() {
            addCriterion("mian_ji_num is null");
            return (Criteria) this;
        }

        public Criteria andMianJiNumIsNotNull() {
            addCriterion("mian_ji_num is not null");
            return (Criteria) this;
        }

        public Criteria andMianJiNumEqualTo(Double value) {
            addCriterion("mian_ji_num =", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumNotEqualTo(Double value) {
            addCriterion("mian_ji_num <>", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumGreaterThan(Double value) {
            addCriterion("mian_ji_num >", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumGreaterThanOrEqualTo(Double value) {
            addCriterion("mian_ji_num >=", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumLessThan(Double value) {
            addCriterion("mian_ji_num <", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumLessThanOrEqualTo(Double value) {
            addCriterion("mian_ji_num <=", value, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumIn(List<Double> values) {
            addCriterion("mian_ji_num in", values, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumNotIn(List<Double> values) {
            addCriterion("mian_ji_num not in", values, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumBetween(Double value1, Double value2) {
            addCriterion("mian_ji_num between", value1, value2, "mianJiNum");
            return (Criteria) this;
        }

        public Criteria andMianJiNumNotBetween(Double value1, Double value2) {
            addCriterion("mian_ji_num not between", value1, value2, "mianJiNum");
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