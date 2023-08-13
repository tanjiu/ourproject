package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class GongZuoDiDianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GongZuoDiDianExample() {
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

        public Criteria andGongzuoIdIsNull() {
            addCriterion("gongzuo_id is null");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdIsNotNull() {
            addCriterion("gongzuo_id is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdEqualTo(Integer value) {
            addCriterion("gongzuo_id =", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdNotEqualTo(Integer value) {
            addCriterion("gongzuo_id <>", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdGreaterThan(Integer value) {
            addCriterion("gongzuo_id >", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gongzuo_id >=", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdLessThan(Integer value) {
            addCriterion("gongzuo_id <", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdLessThanOrEqualTo(Integer value) {
            addCriterion("gongzuo_id <=", value, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdIn(List<Integer> values) {
            addCriterion("gongzuo_id in", values, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdNotIn(List<Integer> values) {
            addCriterion("gongzuo_id not in", values, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdBetween(Integer value1, Integer value2) {
            addCriterion("gongzuo_id between", value1, value2, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andGongzuoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gongzuo_id not between", value1, value2, "gongzuoId");
            return (Criteria) this;
        }

        public Criteria andShiIsNull() {
            addCriterion("shi is null");
            return (Criteria) this;
        }

        public Criteria andShiIsNotNull() {
            addCriterion("shi is not null");
            return (Criteria) this;
        }

        public Criteria andShiEqualTo(String value) {
            addCriterion("shi =", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotEqualTo(String value) {
            addCriterion("shi <>", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThan(String value) {
            addCriterion("shi >", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiGreaterThanOrEqualTo(String value) {
            addCriterion("shi >=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThan(String value) {
            addCriterion("shi <", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLessThanOrEqualTo(String value) {
            addCriterion("shi <=", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiLike(String value) {
            addCriterion("shi like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotLike(String value) {
            addCriterion("shi not like", value, "shi");
            return (Criteria) this;
        }

        public Criteria andShiIn(List<String> values) {
            addCriterion("shi in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotIn(List<String> values) {
            addCriterion("shi not in", values, "shi");
            return (Criteria) this;
        }

        public Criteria andShiBetween(String value1, String value2) {
            addCriterion("shi between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andShiNotBetween(String value1, String value2) {
            addCriterion("shi not between", value1, value2, "shi");
            return (Criteria) this;
        }

        public Criteria andJieZhenIsNull() {
            addCriterion("jie_zhen is null");
            return (Criteria) this;
        }

        public Criteria andJieZhenIsNotNull() {
            addCriterion("jie_zhen is not null");
            return (Criteria) this;
        }

        public Criteria andJieZhenEqualTo(String value) {
            addCriterion("jie_zhen =", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenNotEqualTo(String value) {
            addCriterion("jie_zhen <>", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenGreaterThan(String value) {
            addCriterion("jie_zhen >", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenGreaterThanOrEqualTo(String value) {
            addCriterion("jie_zhen >=", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenLessThan(String value) {
            addCriterion("jie_zhen <", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenLessThanOrEqualTo(String value) {
            addCriterion("jie_zhen <=", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenLike(String value) {
            addCriterion("jie_zhen like", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenNotLike(String value) {
            addCriterion("jie_zhen not like", value, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenIn(List<String> values) {
            addCriterion("jie_zhen in", values, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenNotIn(List<String> values) {
            addCriterion("jie_zhen not in", values, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenBetween(String value1, String value2) {
            addCriterion("jie_zhen between", value1, value2, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andJieZhenNotBetween(String value1, String value2) {
            addCriterion("jie_zhen not between", value1, value2, "jieZhen");
            return (Criteria) this;
        }

        public Criteria andShequIsNull() {
            addCriterion("shequ is null");
            return (Criteria) this;
        }

        public Criteria andShequIsNotNull() {
            addCriterion("shequ is not null");
            return (Criteria) this;
        }

        public Criteria andShequEqualTo(String value) {
            addCriterion("shequ =", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequNotEqualTo(String value) {
            addCriterion("shequ <>", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequGreaterThan(String value) {
            addCriterion("shequ >", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequGreaterThanOrEqualTo(String value) {
            addCriterion("shequ >=", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequLessThan(String value) {
            addCriterion("shequ <", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequLessThanOrEqualTo(String value) {
            addCriterion("shequ <=", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequLike(String value) {
            addCriterion("shequ like", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequNotLike(String value) {
            addCriterion("shequ not like", value, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequIn(List<String> values) {
            addCriterion("shequ in", values, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequNotIn(List<String> values) {
            addCriterion("shequ not in", values, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequBetween(String value1, String value2) {
            addCriterion("shequ between", value1, value2, "shequ");
            return (Criteria) this;
        }

        public Criteria andShequNotBetween(String value1, String value2) {
            addCriterion("shequ not between", value1, value2, "shequ");
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