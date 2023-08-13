package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HudongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HudongExample() {
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

        public Criteria andHudongIdIsNull() {
            addCriterion("hudong_id is null");
            return (Criteria) this;
        }

        public Criteria andHudongIdIsNotNull() {
            addCriterion("hudong_id is not null");
            return (Criteria) this;
        }

        public Criteria andHudongIdEqualTo(Integer value) {
            addCriterion("hudong_id =", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdNotEqualTo(Integer value) {
            addCriterion("hudong_id <>", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdGreaterThan(Integer value) {
            addCriterion("hudong_id >", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hudong_id >=", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdLessThan(Integer value) {
            addCriterion("hudong_id <", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdLessThanOrEqualTo(Integer value) {
            addCriterion("hudong_id <=", value, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdIn(List<Integer> values) {
            addCriterion("hudong_id in", values, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdNotIn(List<Integer> values) {
            addCriterion("hudong_id not in", values, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdBetween(Integer value1, Integer value2) {
            addCriterion("hudong_id between", value1, value2, "hudongId");
            return (Criteria) this;
        }

        public Criteria andHudongIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hudong_id not between", value1, value2, "hudongId");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andShichangIsNull() {
            addCriterion("shichang is null");
            return (Criteria) this;
        }

        public Criteria andShichangIsNotNull() {
            addCriterion("shichang is not null");
            return (Criteria) this;
        }

        public Criteria andShichangEqualTo(Integer value) {
            addCriterion("shichang =", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotEqualTo(Integer value) {
            addCriterion("shichang <>", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangGreaterThan(Integer value) {
            addCriterion("shichang >", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangGreaterThanOrEqualTo(Integer value) {
            addCriterion("shichang >=", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangLessThan(Integer value) {
            addCriterion("shichang <", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangLessThanOrEqualTo(Integer value) {
            addCriterion("shichang <=", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangIn(List<Integer> values) {
            addCriterion("shichang in", values, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotIn(List<Integer> values) {
            addCriterion("shichang not in", values, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangBetween(Integer value1, Integer value2) {
            addCriterion("shichang between", value1, value2, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotBetween(Integer value1, Integer value2) {
            addCriterion("shichang not between", value1, value2, "shichang");
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