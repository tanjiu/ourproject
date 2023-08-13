package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RecruitExample() {
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

        public Criteria andZhaogongIdIsNull() {
            addCriterion("zhaogong_id is null");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdIsNotNull() {
            addCriterion("zhaogong_id is not null");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdEqualTo(String value) {
            addCriterion("zhaogong_id =", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdNotEqualTo(String value) {
            addCriterion("zhaogong_id <>", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdGreaterThan(String value) {
            addCriterion("zhaogong_id >", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdGreaterThanOrEqualTo(String value) {
            addCriterion("zhaogong_id >=", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdLessThan(String value) {
            addCriterion("zhaogong_id <", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdLessThanOrEqualTo(String value) {
            addCriterion("zhaogong_id <=", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdLike(String value) {
            addCriterion("zhaogong_id like", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdNotLike(String value) {
            addCriterion("zhaogong_id not like", value, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdIn(List<String> values) {
            addCriterion("zhaogong_id in", values, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdNotIn(List<String> values) {
            addCriterion("zhaogong_id not in", values, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdBetween(String value1, String value2) {
            addCriterion("zhaogong_id between", value1, value2, "zhaogongId");
            return (Criteria) this;
        }

        public Criteria andZhaogongIdNotBetween(String value1, String value2) {
            addCriterion("zhaogong_id not between", value1, value2, "zhaogongId");
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

        public Criteria andStationIsNull() {
            addCriterion("station is null");
            return (Criteria) this;
        }

        public Criteria andStationIsNotNull() {
            addCriterion("station is not null");
            return (Criteria) this;
        }

        public Criteria andStationEqualTo(String value) {
            addCriterion("station =", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotEqualTo(String value) {
            addCriterion("station <>", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThan(String value) {
            addCriterion("station >", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationGreaterThanOrEqualTo(String value) {
            addCriterion("station >=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThan(String value) {
            addCriterion("station <", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLessThanOrEqualTo(String value) {
            addCriterion("station <=", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationLike(String value) {
            addCriterion("station like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotLike(String value) {
            addCriterion("station not like", value, "station");
            return (Criteria) this;
        }

        public Criteria andStationIn(List<String> values) {
            addCriterion("station in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotIn(List<String> values) {
            addCriterion("station not in", values, "station");
            return (Criteria) this;
        }

        public Criteria andStationBetween(String value1, String value2) {
            addCriterion("station between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andStationNotBetween(String value1, String value2) {
            addCriterion("station not between", value1, value2, "station");
            return (Criteria) this;
        }

        public Criteria andDemandIsNull() {
            addCriterion("demand is null");
            return (Criteria) this;
        }

        public Criteria andDemandIsNotNull() {
            addCriterion("demand is not null");
            return (Criteria) this;
        }

        public Criteria andDemandEqualTo(String value) {
            addCriterion("demand =", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotEqualTo(String value) {
            addCriterion("demand <>", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThan(String value) {
            addCriterion("demand >", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandGreaterThanOrEqualTo(String value) {
            addCriterion("demand >=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThan(String value) {
            addCriterion("demand <", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLessThanOrEqualTo(String value) {
            addCriterion("demand <=", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandLike(String value) {
            addCriterion("demand like", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotLike(String value) {
            addCriterion("demand not like", value, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandIn(List<String> values) {
            addCriterion("demand in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotIn(List<String> values) {
            addCriterion("demand not in", values, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandBetween(String value1, String value2) {
            addCriterion("demand between", value1, value2, "demand");
            return (Criteria) this;
        }

        public Criteria andDemandNotBetween(String value1, String value2) {
            addCriterion("demand not between", value1, value2, "demand");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("telphone not between", value1, value2, "telphone");
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

        public Criteria andFabutiemIsNull() {
            addCriterion("fabutiem is null");
            return (Criteria) this;
        }

        public Criteria andFabutiemIsNotNull() {
            addCriterion("fabutiem is not null");
            return (Criteria) this;
        }

        public Criteria andFabutiemEqualTo(Date value) {
            addCriterionForJDBCDate("fabutiem =", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemNotEqualTo(Date value) {
            addCriterionForJDBCDate("fabutiem <>", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemGreaterThan(Date value) {
            addCriterionForJDBCDate("fabutiem >", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabutiem >=", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemLessThan(Date value) {
            addCriterionForJDBCDate("fabutiem <", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabutiem <=", value, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemIn(List<Date> values) {
            addCriterionForJDBCDate("fabutiem in", values, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemNotIn(List<Date> values) {
            addCriterionForJDBCDate("fabutiem not in", values, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabutiem between", value1, value2, "fabutiem");
            return (Criteria) this;
        }

        public Criteria andFabutiemNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabutiem not between", value1, value2, "fabutiem");
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