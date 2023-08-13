package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LhmmZhiBiaoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LhmmZhiBiaoExample() {
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

        public Criteria andZhiBiaoFangIdIsNull() {
            addCriterion("zhi_biao_fang_id is null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdIsNotNull() {
            addCriterion("zhi_biao_fang_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdEqualTo(Integer value) {
            addCriterion("zhi_biao_fang_id =", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdNotEqualTo(Integer value) {
            addCriterion("zhi_biao_fang_id <>", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdGreaterThan(Integer value) {
            addCriterion("zhi_biao_fang_id >", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhi_biao_fang_id >=", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdLessThan(Integer value) {
            addCriterion("zhi_biao_fang_id <", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdLessThanOrEqualTo(Integer value) {
            addCriterion("zhi_biao_fang_id <=", value, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdIn(List<Integer> values) {
            addCriterion("zhi_biao_fang_id in", values, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdNotIn(List<Integer> values) {
            addCriterion("zhi_biao_fang_id not in", values, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdBetween(Integer value1, Integer value2) {
            addCriterion("zhi_biao_fang_id between", value1, value2, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIdNotBetween(Integer value1, Integer value2) {
            addCriterion("zhi_biao_fang_id not between", value1, value2, "zhiBiaoFangId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiIsNull() {
            addCriterion("zhi_biao_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiIsNotNull() {
            addCriterion("zhi_biao_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiEqualTo(String value) {
            addCriterion("zhi_biao_dan_wei =", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiNotEqualTo(String value) {
            addCriterion("zhi_biao_dan_wei <>", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiGreaterThan(String value) {
            addCriterion("zhi_biao_dan_wei >", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_biao_dan_wei >=", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiLessThan(String value) {
            addCriterion("zhi_biao_dan_wei <", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zhi_biao_dan_wei <=", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiLike(String value) {
            addCriterion("zhi_biao_dan_wei like", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiNotLike(String value) {
            addCriterion("zhi_biao_dan_wei not like", value, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiIn(List<String> values) {
            addCriterion("zhi_biao_dan_wei in", values, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiNotIn(List<String> values) {
            addCriterion("zhi_biao_dan_wei not in", values, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiBetween(String value1, String value2) {
            addCriterion("zhi_biao_dan_wei between", value1, value2, "zhiBiaoDanWei");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoDanWeiNotBetween(String value1, String value2) {
            addCriterion("zhi_biao_dan_wei not between", value1, value2, "zhiBiaoDanWei");
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