package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class ReservoirExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReservoirExample() {
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

        public Criteria andShuikuIdIsNull() {
            addCriterion("shuiku_id is null");
            return (Criteria) this;
        }

        public Criteria andShuikuIdIsNotNull() {
            addCriterion("shuiku_id is not null");
            return (Criteria) this;
        }

        public Criteria andShuikuIdEqualTo(Integer value) {
            addCriterion("shuiku_id =", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdNotEqualTo(Integer value) {
            addCriterion("shuiku_id <>", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdGreaterThan(Integer value) {
            addCriterion("shuiku_id >", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shuiku_id >=", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdLessThan(Integer value) {
            addCriterion("shuiku_id <", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdLessThanOrEqualTo(Integer value) {
            addCriterion("shuiku_id <=", value, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdIn(List<Integer> values) {
            addCriterion("shuiku_id in", values, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdNotIn(List<Integer> values) {
            addCriterion("shuiku_id not in", values, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdBetween(Integer value1, Integer value2) {
            addCriterion("shuiku_id between", value1, value2, "shuikuId");
            return (Criteria) this;
        }

        public Criteria andShuikuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shuiku_id not between", value1, value2, "shuikuId");
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

        public Criteria andAllCapacityIsNull() {
            addCriterion("all_capacity is null");
            return (Criteria) this;
        }

        public Criteria andAllCapacityIsNotNull() {
            addCriterion("all_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andAllCapacityEqualTo(Double value) {
            addCriterion("all_capacity =", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotEqualTo(Double value) {
            addCriterion("all_capacity <>", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityGreaterThan(Double value) {
            addCriterion("all_capacity >", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityGreaterThanOrEqualTo(Double value) {
            addCriterion("all_capacity >=", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityLessThan(Double value) {
            addCriterion("all_capacity <", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityLessThanOrEqualTo(Double value) {
            addCriterion("all_capacity <=", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityIn(List<Double> values) {
            addCriterion("all_capacity in", values, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotIn(List<Double> values) {
            addCriterion("all_capacity not in", values, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityBetween(Double value1, Double value2) {
            addCriterion("all_capacity between", value1, value2, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotBetween(Double value1, Double value2) {
            addCriterion("all_capacity not between", value1, value2, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelIsNull() {
            addCriterion("xingli_water_level is null");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelIsNotNull() {
            addCriterion("xingli_water_level is not null");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelEqualTo(Double value) {
            addCriterion("xingli_water_level =", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelNotEqualTo(Double value) {
            addCriterion("xingli_water_level <>", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelGreaterThan(Double value) {
            addCriterion("xingli_water_level >", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("xingli_water_level >=", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelLessThan(Double value) {
            addCriterion("xingli_water_level <", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelLessThanOrEqualTo(Double value) {
            addCriterion("xingli_water_level <=", value, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelIn(List<Double> values) {
            addCriterion("xingli_water_level in", values, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelNotIn(List<Double> values) {
            addCriterion("xingli_water_level not in", values, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelBetween(Double value1, Double value2) {
            addCriterion("xingli_water_level between", value1, value2, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXingliWaterLevelNotBetween(Double value1, Double value2) {
            addCriterion("xingli_water_level not between", value1, value2, "xingliWaterLevel");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIsNull() {
            addCriterion("water_storage is null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIsNotNull() {
            addCriterion("water_storage is not null");
            return (Criteria) this;
        }

        public Criteria andWaterStorageEqualTo(Double value) {
            addCriterion("water_storage =", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageNotEqualTo(Double value) {
            addCriterion("water_storage <>", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageGreaterThan(Double value) {
            addCriterion("water_storage >", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageGreaterThanOrEqualTo(Double value) {
            addCriterion("water_storage >=", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageLessThan(Double value) {
            addCriterion("water_storage <", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageLessThanOrEqualTo(Double value) {
            addCriterion("water_storage <=", value, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageIn(List<Double> values) {
            addCriterion("water_storage in", values, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageNotIn(List<Double> values) {
            addCriterion("water_storage not in", values, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageBetween(Double value1, Double value2) {
            addCriterion("water_storage between", value1, value2, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andWaterStorageNotBetween(Double value1, Double value2) {
            addCriterion("water_storage not between", value1, value2, "waterStorage");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelIsNull() {
            addCriterion("xunxian_water_level is null");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelIsNotNull() {
            addCriterion("xunxian_water_level is not null");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelEqualTo(Double value) {
            addCriterion("xunxian_water_level =", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelNotEqualTo(Double value) {
            addCriterion("xunxian_water_level <>", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelGreaterThan(Double value) {
            addCriterion("xunxian_water_level >", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("xunxian_water_level >=", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelLessThan(Double value) {
            addCriterion("xunxian_water_level <", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelLessThanOrEqualTo(Double value) {
            addCriterion("xunxian_water_level <=", value, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelIn(List<Double> values) {
            addCriterion("xunxian_water_level in", values, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelNotIn(List<Double> values) {
            addCriterion("xunxian_water_level not in", values, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelBetween(Double value1, Double value2) {
            addCriterion("xunxian_water_level between", value1, value2, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andXunxianWaterLevelNotBetween(Double value1, Double value2) {
            addCriterion("xunxian_water_level not between", value1, value2, "xunxianWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelIsNull() {
            addCriterion("now_water_level is null");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelIsNotNull() {
            addCriterion("now_water_level is not null");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelEqualTo(Double value) {
            addCriterion("now_water_level =", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelNotEqualTo(Double value) {
            addCriterion("now_water_level <>", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelGreaterThan(Double value) {
            addCriterion("now_water_level >", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelGreaterThanOrEqualTo(Double value) {
            addCriterion("now_water_level >=", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelLessThan(Double value) {
            addCriterion("now_water_level <", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelLessThanOrEqualTo(Double value) {
            addCriterion("now_water_level <=", value, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelIn(List<Double> values) {
            addCriterion("now_water_level in", values, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelNotIn(List<Double> values) {
            addCriterion("now_water_level not in", values, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelBetween(Double value1, Double value2) {
            addCriterion("now_water_level between", value1, value2, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowWaterLevelNotBetween(Double value1, Double value2) {
            addCriterion("now_water_level not between", value1, value2, "nowWaterLevel");
            return (Criteria) this;
        }

        public Criteria andNowStorageIsNull() {
            addCriterion("now_storage is null");
            return (Criteria) this;
        }

        public Criteria andNowStorageIsNotNull() {
            addCriterion("now_storage is not null");
            return (Criteria) this;
        }

        public Criteria andNowStorageEqualTo(Double value) {
            addCriterion("now_storage =", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageNotEqualTo(Double value) {
            addCriterion("now_storage <>", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageGreaterThan(Double value) {
            addCriterion("now_storage >", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageGreaterThanOrEqualTo(Double value) {
            addCriterion("now_storage >=", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageLessThan(Double value) {
            addCriterion("now_storage <", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageLessThanOrEqualTo(Double value) {
            addCriterion("now_storage <=", value, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageIn(List<Double> values) {
            addCriterion("now_storage in", values, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageNotIn(List<Double> values) {
            addCriterion("now_storage not in", values, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageBetween(Double value1, Double value2) {
            addCriterion("now_storage between", value1, value2, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andNowStorageNotBetween(Double value1, Double value2) {
            addCriterion("now_storage not between", value1, value2, "nowStorage");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Double value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Double value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Double value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Double value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Double value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Double value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Double> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Double> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Double value1, Double value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Double value1, Double value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Double value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Double value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Double value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Double value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Double value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Double value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Double> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Double> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Double value1, Double value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Double value1, Double value2) {
            addCriterion("y not between", value1, value2, "y");
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