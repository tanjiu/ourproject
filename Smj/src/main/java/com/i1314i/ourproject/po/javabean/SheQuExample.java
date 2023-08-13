package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class SheQuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SheQuExample() {
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

        public Criteria andSheQuIdIsNull() {
            addCriterion("she_qu_id is null");
            return (Criteria) this;
        }

        public Criteria andSheQuIdIsNotNull() {
            addCriterion("she_qu_id is not null");
            return (Criteria) this;
        }

        public Criteria andSheQuIdEqualTo(Integer value) {
            addCriterion("she_qu_id =", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdNotEqualTo(Integer value) {
            addCriterion("she_qu_id <>", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdGreaterThan(Integer value) {
            addCriterion("she_qu_id >", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("she_qu_id >=", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdLessThan(Integer value) {
            addCriterion("she_qu_id <", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdLessThanOrEqualTo(Integer value) {
            addCriterion("she_qu_id <=", value, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdIn(List<Integer> values) {
            addCriterion("she_qu_id in", values, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdNotIn(List<Integer> values) {
            addCriterion("she_qu_id not in", values, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdBetween(Integer value1, Integer value2) {
            addCriterion("she_qu_id between", value1, value2, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("she_qu_id not between", value1, value2, "sheQuId");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengIsNull() {
            addCriterion("she_qu_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengIsNotNull() {
            addCriterion("she_qu_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengEqualTo(String value) {
            addCriterion("she_qu_ming_cheng =", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengNotEqualTo(String value) {
            addCriterion("she_qu_ming_cheng <>", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengGreaterThan(String value) {
            addCriterion("she_qu_ming_cheng >", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("she_qu_ming_cheng >=", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengLessThan(String value) {
            addCriterion("she_qu_ming_cheng <", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengLessThanOrEqualTo(String value) {
            addCriterion("she_qu_ming_cheng <=", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengLike(String value) {
            addCriterion("she_qu_ming_cheng like", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengNotLike(String value) {
            addCriterion("she_qu_ming_cheng not like", value, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengIn(List<String> values) {
            addCriterion("she_qu_ming_cheng in", values, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengNotIn(List<String> values) {
            addCriterion("she_qu_ming_cheng not in", values, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengBetween(String value1, String value2) {
            addCriterion("she_qu_ming_cheng between", value1, value2, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andSheQuMingChengNotBetween(String value1, String value2) {
            addCriterion("she_qu_ming_cheng not between", value1, value2, "sheQuMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdIsNull() {
            addCriterion("jie_dao_id is null");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdIsNotNull() {
            addCriterion("jie_dao_id is not null");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdEqualTo(Integer value) {
            addCriterion("jie_dao_id =", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdNotEqualTo(Integer value) {
            addCriterion("jie_dao_id <>", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdGreaterThan(Integer value) {
            addCriterion("jie_dao_id >", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("jie_dao_id >=", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdLessThan(Integer value) {
            addCriterion("jie_dao_id <", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdLessThanOrEqualTo(Integer value) {
            addCriterion("jie_dao_id <=", value, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdIn(List<Integer> values) {
            addCriterion("jie_dao_id in", values, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdNotIn(List<Integer> values) {
            addCriterion("jie_dao_id not in", values, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdBetween(Integer value1, Integer value2) {
            addCriterion("jie_dao_id between", value1, value2, "jieDaoId");
            return (Criteria) this;
        }

        public Criteria andJieDaoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("jie_dao_id not between", value1, value2, "jieDaoId");
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