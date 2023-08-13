package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AgriculturalPolicyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgriculturalPolicyExample() {
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

        public Criteria andZhengceIdIsNull() {
            addCriterion("zhengce_id is null");
            return (Criteria) this;
        }

        public Criteria andZhengceIdIsNotNull() {
            addCriterion("zhengce_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhengceIdEqualTo(Integer value) {
            addCriterion("zhengce_id =", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdNotEqualTo(Integer value) {
            addCriterion("zhengce_id <>", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdGreaterThan(Integer value) {
            addCriterion("zhengce_id >", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhengce_id >=", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdLessThan(Integer value) {
            addCriterion("zhengce_id <", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdLessThanOrEqualTo(Integer value) {
            addCriterion("zhengce_id <=", value, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdIn(List<Integer> values) {
            addCriterion("zhengce_id in", values, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdNotIn(List<Integer> values) {
            addCriterion("zhengce_id not in", values, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdBetween(Integer value1, Integer value2) {
            addCriterion("zhengce_id between", value1, value2, "zhengceId");
            return (Criteria) this;
        }

        public Criteria andZhengceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zhengce_id not between", value1, value2, "zhengceId");
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

        public Criteria andFabushijianIsNull() {
            addCriterion("fabushijian is null");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNotNull() {
            addCriterion("fabushijian is not null");
            return (Criteria) this;
        }

        public Criteria andFabushijianEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian =", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian <>", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThan(Date value) {
            addCriterionForJDBCDate("fabushijian >", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian >=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThan(Date value) {
            addCriterionForJDBCDate("fabushijian <", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian <=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianIn(List<Date> values) {
            addCriterionForJDBCDate("fabushijian in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("fabushijian not in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabushijian between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabushijian not between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabudanweiIsNull() {
            addCriterion("fabudanwei is null");
            return (Criteria) this;
        }

        public Criteria andFabudanweiIsNotNull() {
            addCriterion("fabudanwei is not null");
            return (Criteria) this;
        }

        public Criteria andFabudanweiEqualTo(String value) {
            addCriterion("fabudanwei =", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiNotEqualTo(String value) {
            addCriterion("fabudanwei <>", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiGreaterThan(String value) {
            addCriterion("fabudanwei >", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiGreaterThanOrEqualTo(String value) {
            addCriterion("fabudanwei >=", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiLessThan(String value) {
            addCriterion("fabudanwei <", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiLessThanOrEqualTo(String value) {
            addCriterion("fabudanwei <=", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiLike(String value) {
            addCriterion("fabudanwei like", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiNotLike(String value) {
            addCriterion("fabudanwei not like", value, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiIn(List<String> values) {
            addCriterion("fabudanwei in", values, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiNotIn(List<String> values) {
            addCriterion("fabudanwei not in", values, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiBetween(String value1, String value2) {
            addCriterion("fabudanwei between", value1, value2, "fabudanwei");
            return (Criteria) this;
        }

        public Criteria andFabudanweiNotBetween(String value1, String value2) {
            addCriterion("fabudanwei not between", value1, value2, "fabudanwei");
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