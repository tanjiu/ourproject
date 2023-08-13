package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class HuiNongChanPinZhongLeiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HuiNongChanPinZhongLeiExample() {
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

        public Criteria andChanPinZhongLeiIdIsNull() {
            addCriterion("chan_pin_zhong_lei_id is null");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdIsNotNull() {
            addCriterion("chan_pin_zhong_lei_id is not null");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdEqualTo(Integer value) {
            addCriterion("chan_pin_zhong_lei_id =", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdNotEqualTo(Integer value) {
            addCriterion("chan_pin_zhong_lei_id <>", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdGreaterThan(Integer value) {
            addCriterion("chan_pin_zhong_lei_id >", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("chan_pin_zhong_lei_id >=", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdLessThan(Integer value) {
            addCriterion("chan_pin_zhong_lei_id <", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdLessThanOrEqualTo(Integer value) {
            addCriterion("chan_pin_zhong_lei_id <=", value, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdIn(List<Integer> values) {
            addCriterion("chan_pin_zhong_lei_id in", values, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdNotIn(List<Integer> values) {
            addCriterion("chan_pin_zhong_lei_id not in", values, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdBetween(Integer value1, Integer value2) {
            addCriterion("chan_pin_zhong_lei_id between", value1, value2, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinZhongLeiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("chan_pin_zhong_lei_id not between", value1, value2, "chanPinZhongLeiId");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIsNull() {
            addCriterion("chan_pin_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIsNotNull() {
            addCriterion("chan_pin_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng =", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng <>", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengGreaterThan(String value) {
            addCriterion("chan_pin_ming_cheng >", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng >=", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLessThan(String value) {
            addCriterion("chan_pin_ming_cheng <", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLessThanOrEqualTo(String value) {
            addCriterion("chan_pin_ming_cheng <=", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengLike(String value) {
            addCriterion("chan_pin_ming_cheng like", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotLike(String value) {
            addCriterion("chan_pin_ming_cheng not like", value, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengIn(List<String> values) {
            addCriterion("chan_pin_ming_cheng in", values, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotIn(List<String> values) {
            addCriterion("chan_pin_ming_cheng not in", values, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengBetween(String value1, String value2) {
            addCriterion("chan_pin_ming_cheng between", value1, value2, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andChanPinMingChengNotBetween(String value1, String value2) {
            addCriterion("chan_pin_ming_cheng not between", value1, value2, "chanPinMingCheng");
            return (Criteria) this;
        }

        public Criteria andLeiBieIsNull() {
            addCriterion("lei_bie is null");
            return (Criteria) this;
        }

        public Criteria andLeiBieIsNotNull() {
            addCriterion("lei_bie is not null");
            return (Criteria) this;
        }

        public Criteria andLeiBieEqualTo(String value) {
            addCriterion("lei_bie =", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieNotEqualTo(String value) {
            addCriterion("lei_bie <>", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieGreaterThan(String value) {
            addCriterion("lei_bie >", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("lei_bie >=", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieLessThan(String value) {
            addCriterion("lei_bie <", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieLessThanOrEqualTo(String value) {
            addCriterion("lei_bie <=", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieLike(String value) {
            addCriterion("lei_bie like", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieNotLike(String value) {
            addCriterion("lei_bie not like", value, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieIn(List<String> values) {
            addCriterion("lei_bie in", values, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieNotIn(List<String> values) {
            addCriterion("lei_bie not in", values, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieBetween(String value1, String value2) {
            addCriterion("lei_bie between", value1, value2, "leiBie");
            return (Criteria) this;
        }

        public Criteria andLeiBieNotBetween(String value1, String value2) {
            addCriterion("lei_bie not between", value1, value2, "leiBie");
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