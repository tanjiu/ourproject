package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class YangZhiXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YangZhiXinXiExample() {
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

        public Criteria andShengChuIdIsNull() {
            addCriterion("sheng_chu_id is null");
            return (Criteria) this;
        }

        public Criteria andShengChuIdIsNotNull() {
            addCriterion("sheng_chu_id is not null");
            return (Criteria) this;
        }

        public Criteria andShengChuIdEqualTo(Integer value) {
            addCriterion("sheng_chu_id =", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdNotEqualTo(Integer value) {
            addCriterion("sheng_chu_id <>", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdGreaterThan(Integer value) {
            addCriterion("sheng_chu_id >", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sheng_chu_id >=", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdLessThan(Integer value) {
            addCriterion("sheng_chu_id <", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdLessThanOrEqualTo(Integer value) {
            addCriterion("sheng_chu_id <=", value, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdIn(List<Integer> values) {
            addCriterion("sheng_chu_id in", values, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdNotIn(List<Integer> values) {
            addCriterion("sheng_chu_id not in", values, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdBetween(Integer value1, Integer value2) {
            addCriterion("sheng_chu_id between", value1, value2, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sheng_chu_id not between", value1, value2, "shengChuId");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengIsNull() {
            addCriterion("sheng_chu_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengIsNotNull() {
            addCriterion("sheng_chu_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengEqualTo(String value) {
            addCriterion("sheng_chu_ming_cheng =", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengNotEqualTo(String value) {
            addCriterion("sheng_chu_ming_cheng <>", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengGreaterThan(String value) {
            addCriterion("sheng_chu_ming_cheng >", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_chu_ming_cheng >=", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengLessThan(String value) {
            addCriterion("sheng_chu_ming_cheng <", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengLessThanOrEqualTo(String value) {
            addCriterion("sheng_chu_ming_cheng <=", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengLike(String value) {
            addCriterion("sheng_chu_ming_cheng like", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengNotLike(String value) {
            addCriterion("sheng_chu_ming_cheng not like", value, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengIn(List<String> values) {
            addCriterion("sheng_chu_ming_cheng in", values, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengNotIn(List<String> values) {
            addCriterion("sheng_chu_ming_cheng not in", values, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengBetween(String value1, String value2) {
            addCriterion("sheng_chu_ming_cheng between", value1, value2, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andShengChuMingChengNotBetween(String value1, String value2) {
            addCriterion("sheng_chu_ming_cheng not between", value1, value2, "shengChuMingCheng");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangIsNull() {
            addCriterion("chu_lan_liang is null");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangIsNotNull() {
            addCriterion("chu_lan_liang is not null");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangEqualTo(Integer value) {
            addCriterion("chu_lan_liang =", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangNotEqualTo(Integer value) {
            addCriterion("chu_lan_liang <>", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangGreaterThan(Integer value) {
            addCriterion("chu_lan_liang >", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangGreaterThanOrEqualTo(Integer value) {
            addCriterion("chu_lan_liang >=", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangLessThan(Integer value) {
            addCriterion("chu_lan_liang <", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangLessThanOrEqualTo(Integer value) {
            addCriterion("chu_lan_liang <=", value, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangIn(List<Integer> values) {
            addCriterion("chu_lan_liang in", values, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangNotIn(List<Integer> values) {
            addCriterion("chu_lan_liang not in", values, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangBetween(Integer value1, Integer value2) {
            addCriterion("chu_lan_liang between", value1, value2, "chuLanLiang");
            return (Criteria) this;
        }

        public Criteria andChuLanLiangNotBetween(Integer value1, Integer value2) {
            addCriterion("chu_lan_liang not between", value1, value2, "chuLanLiang");
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

        public Criteria andBeiyong2EqualTo(Integer value) {
            addCriterion("beiyong2 =", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotEqualTo(Integer value) {
            addCriterion("beiyong2 <>", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThan(Integer value) {
            addCriterion("beiyong2 >", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2GreaterThanOrEqualTo(Integer value) {
            addCriterion("beiyong2 >=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThan(Integer value) {
            addCriterion("beiyong2 <", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2LessThanOrEqualTo(Integer value) {
            addCriterion("beiyong2 <=", value, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2In(List<Integer> values) {
            addCriterion("beiyong2 in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotIn(List<Integer> values) {
            addCriterion("beiyong2 not in", values, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2Between(Integer value1, Integer value2) {
            addCriterion("beiyong2 between", value1, value2, "beiyong2");
            return (Criteria) this;
        }

        public Criteria andBeiyong2NotBetween(Integer value1, Integer value2) {
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