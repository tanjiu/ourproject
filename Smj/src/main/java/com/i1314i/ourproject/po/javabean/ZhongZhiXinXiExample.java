package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ZhongZhiXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZhongZhiXinXiExample() {
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

        public Criteria andJieDaoMingChengIsNull() {
            addCriterion("jie_dao_ming_cheng is null");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengIsNotNull() {
            addCriterion("jie_dao_ming_cheng is not null");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengEqualTo(String value) {
            addCriterion("jie_dao_ming_cheng =", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengNotEqualTo(String value) {
            addCriterion("jie_dao_ming_cheng <>", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengGreaterThan(String value) {
            addCriterion("jie_dao_ming_cheng >", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("jie_dao_ming_cheng >=", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengLessThan(String value) {
            addCriterion("jie_dao_ming_cheng <", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengLessThanOrEqualTo(String value) {
            addCriterion("jie_dao_ming_cheng <=", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengLike(String value) {
            addCriterion("jie_dao_ming_cheng like", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengNotLike(String value) {
            addCriterion("jie_dao_ming_cheng not like", value, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengIn(List<String> values) {
            addCriterion("jie_dao_ming_cheng in", values, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengNotIn(List<String> values) {
            addCriterion("jie_dao_ming_cheng not in", values, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengBetween(String value1, String value2) {
            addCriterion("jie_dao_ming_cheng between", value1, value2, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andJieDaoMingChengNotBetween(String value1, String value2) {
            addCriterion("jie_dao_ming_cheng not between", value1, value2, "jieDaoMingCheng");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiIsNull() {
            addCriterion("bo_zhong_mian_ji is null");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiIsNotNull() {
            addCriterion("bo_zhong_mian_ji is not null");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiEqualTo(Double value) {
            addCriterion("bo_zhong_mian_ji =", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiNotEqualTo(Double value) {
            addCriterion("bo_zhong_mian_ji <>", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiGreaterThan(Double value) {
            addCriterion("bo_zhong_mian_ji >", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiGreaterThanOrEqualTo(Double value) {
            addCriterion("bo_zhong_mian_ji >=", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiLessThan(Double value) {
            addCriterion("bo_zhong_mian_ji <", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiLessThanOrEqualTo(Double value) {
            addCriterion("bo_zhong_mian_ji <=", value, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiIn(List<Double> values) {
            addCriterion("bo_zhong_mian_ji in", values, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiNotIn(List<Double> values) {
            addCriterion("bo_zhong_mian_ji not in", values, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiBetween(Double value1, Double value2) {
            addCriterion("bo_zhong_mian_ji between", value1, value2, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andBoZhongMianJiNotBetween(Double value1, Double value2) {
            addCriterion("bo_zhong_mian_ji not between", value1, value2, "boZhongMianJi");
            return (Criteria) this;
        }

        public Criteria andDanChanIsNull() {
            addCriterion("dan_chan is null");
            return (Criteria) this;
        }

        public Criteria andDanChanIsNotNull() {
            addCriterion("dan_chan is not null");
            return (Criteria) this;
        }

        public Criteria andDanChanEqualTo(Double value) {
            addCriterion("dan_chan =", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotEqualTo(Double value) {
            addCriterion("dan_chan <>", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanGreaterThan(Double value) {
            addCriterion("dan_chan >", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanGreaterThanOrEqualTo(Double value) {
            addCriterion("dan_chan >=", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanLessThan(Double value) {
            addCriterion("dan_chan <", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanLessThanOrEqualTo(Double value) {
            addCriterion("dan_chan <=", value, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanIn(List<Double> values) {
            addCriterion("dan_chan in", values, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotIn(List<Double> values) {
            addCriterion("dan_chan not in", values, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanBetween(Double value1, Double value2) {
            addCriterion("dan_chan between", value1, value2, "danChan");
            return (Criteria) this;
        }

        public Criteria andDanChanNotBetween(Double value1, Double value2) {
            addCriterion("dan_chan not between", value1, value2, "danChan");
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

        public Criteria andBeiyong4IsNull() {
            addCriterion("beiyong4 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4IsNotNull() {
            addCriterion("beiyong4 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong4EqualTo(String value) {
            addCriterion("beiyong4 =", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotEqualTo(String value) {
            addCriterion("beiyong4 <>", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThan(String value) {
            addCriterion("beiyong4 >", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong4 >=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThan(String value) {
            addCriterion("beiyong4 <", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4LessThanOrEqualTo(String value) {
            addCriterion("beiyong4 <=", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Like(String value) {
            addCriterion("beiyong4 like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotLike(String value) {
            addCriterion("beiyong4 not like", value, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4In(List<String> values) {
            addCriterion("beiyong4 in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotIn(List<String> values) {
            addCriterion("beiyong4 not in", values, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4Between(String value1, String value2) {
            addCriterion("beiyong4 between", value1, value2, "beiyong4");
            return (Criteria) this;
        }

        public Criteria andBeiyong4NotBetween(String value1, String value2) {
            addCriterion("beiyong4 not between", value1, value2, "beiyong4");
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