package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SubsidizedObjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SubsidizedObjectExample() {
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

        public Criteria andButieIdIsNull() {
            addCriterion("butie_id is null");
            return (Criteria) this;
        }

        public Criteria andButieIdIsNotNull() {
            addCriterion("butie_id is not null");
            return (Criteria) this;
        }

        public Criteria andButieIdEqualTo(Integer value) {
            addCriterion("butie_id =", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdNotEqualTo(Integer value) {
            addCriterion("butie_id <>", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdGreaterThan(Integer value) {
            addCriterion("butie_id >", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("butie_id >=", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdLessThan(Integer value) {
            addCriterion("butie_id <", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdLessThanOrEqualTo(Integer value) {
            addCriterion("butie_id <=", value, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdIn(List<Integer> values) {
            addCriterion("butie_id in", values, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdNotIn(List<Integer> values) {
            addCriterion("butie_id not in", values, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdBetween(Integer value1, Integer value2) {
            addCriterion("butie_id between", value1, value2, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieIdNotBetween(Integer value1, Integer value2) {
            addCriterion("butie_id not between", value1, value2, "butieId");
            return (Criteria) this;
        }

        public Criteria andButieMingchengIsNull() {
            addCriterion("butie_mingcheng is null");
            return (Criteria) this;
        }

        public Criteria andButieMingchengIsNotNull() {
            addCriterion("butie_mingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andButieMingchengEqualTo(String value) {
            addCriterion("butie_mingcheng =", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengNotEqualTo(String value) {
            addCriterion("butie_mingcheng <>", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengGreaterThan(String value) {
            addCriterion("butie_mingcheng >", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("butie_mingcheng >=", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengLessThan(String value) {
            addCriterion("butie_mingcheng <", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengLessThanOrEqualTo(String value) {
            addCriterion("butie_mingcheng <=", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengLike(String value) {
            addCriterion("butie_mingcheng like", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengNotLike(String value) {
            addCriterion("butie_mingcheng not like", value, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengIn(List<String> values) {
            addCriterion("butie_mingcheng in", values, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengNotIn(List<String> values) {
            addCriterion("butie_mingcheng not in", values, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengBetween(String value1, String value2) {
            addCriterion("butie_mingcheng between", value1, value2, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andButieMingchengNotBetween(String value1, String value2) {
            addCriterion("butie_mingcheng not between", value1, value2, "butieMingcheng");
            return (Criteria) this;
        }

        public Criteria andShenqingIsNull() {
            addCriterion("shenqing is null");
            return (Criteria) this;
        }

        public Criteria andShenqingIsNotNull() {
            addCriterion("shenqing is not null");
            return (Criteria) this;
        }

        public Criteria andShenqingEqualTo(String value) {
            addCriterion("shenqing =", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingNotEqualTo(String value) {
            addCriterion("shenqing <>", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingGreaterThan(String value) {
            addCriterion("shenqing >", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingGreaterThanOrEqualTo(String value) {
            addCriterion("shenqing >=", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingLessThan(String value) {
            addCriterion("shenqing <", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingLessThanOrEqualTo(String value) {
            addCriterion("shenqing <=", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingLike(String value) {
            addCriterion("shenqing like", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingNotLike(String value) {
            addCriterion("shenqing not like", value, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingIn(List<String> values) {
            addCriterion("shenqing in", values, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingNotIn(List<String> values) {
            addCriterion("shenqing not in", values, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingBetween(String value1, String value2) {
            addCriterion("shenqing between", value1, value2, "shenqing");
            return (Criteria) this;
        }

        public Criteria andShenqingNotBetween(String value1, String value2) {
            addCriterion("shenqing not between", value1, value2, "shenqing");
            return (Criteria) this;
        }

        public Criteria andFafangBumenIsNull() {
            addCriterion("fafang_bumen is null");
            return (Criteria) this;
        }

        public Criteria andFafangBumenIsNotNull() {
            addCriterion("fafang_bumen is not null");
            return (Criteria) this;
        }

        public Criteria andFafangBumenEqualTo(String value) {
            addCriterion("fafang_bumen =", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenNotEqualTo(String value) {
            addCriterion("fafang_bumen <>", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenGreaterThan(String value) {
            addCriterion("fafang_bumen >", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenGreaterThanOrEqualTo(String value) {
            addCriterion("fafang_bumen >=", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenLessThan(String value) {
            addCriterion("fafang_bumen <", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenLessThanOrEqualTo(String value) {
            addCriterion("fafang_bumen <=", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenLike(String value) {
            addCriterion("fafang_bumen like", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenNotLike(String value) {
            addCriterion("fafang_bumen not like", value, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenIn(List<String> values) {
            addCriterion("fafang_bumen in", values, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenNotIn(List<String> values) {
            addCriterion("fafang_bumen not in", values, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenBetween(String value1, String value2) {
            addCriterion("fafang_bumen between", value1, value2, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangBumenNotBetween(String value1, String value2) {
            addCriterion("fafang_bumen not between", value1, value2, "fafangBumen");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiIsNull() {
            addCriterion("fafang_xingshi is null");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiIsNotNull() {
            addCriterion("fafang_xingshi is not null");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiEqualTo(String value) {
            addCriterion("fafang_xingshi =", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiNotEqualTo(String value) {
            addCriterion("fafang_xingshi <>", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiGreaterThan(String value) {
            addCriterion("fafang_xingshi >", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiGreaterThanOrEqualTo(String value) {
            addCriterion("fafang_xingshi >=", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiLessThan(String value) {
            addCriterion("fafang_xingshi <", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiLessThanOrEqualTo(String value) {
            addCriterion("fafang_xingshi <=", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiLike(String value) {
            addCriterion("fafang_xingshi like", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiNotLike(String value) {
            addCriterion("fafang_xingshi not like", value, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiIn(List<String> values) {
            addCriterion("fafang_xingshi in", values, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiNotIn(List<String> values) {
            addCriterion("fafang_xingshi not in", values, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiBetween(String value1, String value2) {
            addCriterion("fafang_xingshi between", value1, value2, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangXingshiNotBetween(String value1, String value2) {
            addCriterion("fafang_xingshi not between", value1, value2, "fafangXingshi");
            return (Criteria) this;
        }

        public Criteria andFafangShijianIsNull() {
            addCriterion("fafang_shijian is null");
            return (Criteria) this;
        }

        public Criteria andFafangShijianIsNotNull() {
            addCriterion("fafang_shijian is not null");
            return (Criteria) this;
        }

        public Criteria andFafangShijianEqualTo(Date value) {
            addCriterionForJDBCDate("fafang_shijian =", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("fafang_shijian <>", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianGreaterThan(Date value) {
            addCriterionForJDBCDate("fafang_shijian >", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fafang_shijian >=", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianLessThan(Date value) {
            addCriterionForJDBCDate("fafang_shijian <", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fafang_shijian <=", value, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianIn(List<Date> values) {
            addCriterionForJDBCDate("fafang_shijian in", values, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("fafang_shijian not in", values, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fafang_shijian between", value1, value2, "fafangShijian");
            return (Criteria) this;
        }

        public Criteria andFafangShijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fafang_shijian not between", value1, value2, "fafangShijian");
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