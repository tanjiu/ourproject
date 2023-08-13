package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AgriculturalSubsidiesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgriculturalSubsidiesExample() {
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

        public Criteria andFangfangdanweiIsNull() {
            addCriterion("fangfangdanwei is null");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiIsNotNull() {
            addCriterion("fangfangdanwei is not null");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiEqualTo(String value) {
            addCriterion("fangfangdanwei =", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiNotEqualTo(String value) {
            addCriterion("fangfangdanwei <>", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiGreaterThan(String value) {
            addCriterion("fangfangdanwei >", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiGreaterThanOrEqualTo(String value) {
            addCriterion("fangfangdanwei >=", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiLessThan(String value) {
            addCriterion("fangfangdanwei <", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiLessThanOrEqualTo(String value) {
            addCriterion("fangfangdanwei <=", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiLike(String value) {
            addCriterion("fangfangdanwei like", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiNotLike(String value) {
            addCriterion("fangfangdanwei not like", value, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiIn(List<String> values) {
            addCriterion("fangfangdanwei in", values, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiNotIn(List<String> values) {
            addCriterion("fangfangdanwei not in", values, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiBetween(String value1, String value2) {
            addCriterion("fangfangdanwei between", value1, value2, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFangfangdanweiNotBetween(String value1, String value2) {
            addCriterion("fangfangdanwei not between", value1, value2, "fangfangdanwei");
            return (Criteria) this;
        }

        public Criteria andFafangtimeIsNull() {
            addCriterion("fafangtime is null");
            return (Criteria) this;
        }

        public Criteria andFafangtimeIsNotNull() {
            addCriterion("fafangtime is not null");
            return (Criteria) this;
        }

        public Criteria andFafangtimeEqualTo(Date value) {
            addCriterionForJDBCDate("fafangtime =", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fafangtime <>", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fafangtime >", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fafangtime >=", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeLessThan(Date value) {
            addCriterionForJDBCDate("fafangtime <", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fafangtime <=", value, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeIn(List<Date> values) {
            addCriterionForJDBCDate("fafangtime in", values, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fafangtime not in", values, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fafangtime between", value1, value2, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andFafangtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fafangtime not between", value1, value2, "fafangtime");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiIsNull() {
            addCriterion("shou_yi_qun_ti is null");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiIsNotNull() {
            addCriterion("shou_yi_qun_ti is not null");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiEqualTo(String value) {
            addCriterion("shou_yi_qun_ti =", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiNotEqualTo(String value) {
            addCriterion("shou_yi_qun_ti <>", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiGreaterThan(String value) {
            addCriterion("shou_yi_qun_ti >", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiGreaterThanOrEqualTo(String value) {
            addCriterion("shou_yi_qun_ti >=", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiLessThan(String value) {
            addCriterion("shou_yi_qun_ti <", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiLessThanOrEqualTo(String value) {
            addCriterion("shou_yi_qun_ti <=", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiLike(String value) {
            addCriterion("shou_yi_qun_ti like", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiNotLike(String value) {
            addCriterion("shou_yi_qun_ti not like", value, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiIn(List<String> values) {
            addCriterion("shou_yi_qun_ti in", values, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiNotIn(List<String> values) {
            addCriterion("shou_yi_qun_ti not in", values, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiBetween(String value1, String value2) {
            addCriterion("shou_yi_qun_ti between", value1, value2, "shouYiQunTi");
            return (Criteria) this;
        }

        public Criteria andShouYiQunTiNotBetween(String value1, String value2) {
            addCriterion("shou_yi_qun_ti not between", value1, value2, "shouYiQunTi");
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

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andFabuShijianIsNull() {
            addCriterion("fabu_shijian is null");
            return (Criteria) this;
        }

        public Criteria andFabuShijianIsNotNull() {
            addCriterion("fabu_shijian is not null");
            return (Criteria) this;
        }

        public Criteria andFabuShijianEqualTo(Date value) {
            addCriterionForJDBCDate("fabu_shijian =", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("fabu_shijian <>", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianGreaterThan(Date value) {
            addCriterionForJDBCDate("fabu_shijian >", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabu_shijian >=", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianLessThan(Date value) {
            addCriterionForJDBCDate("fabu_shijian <", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabu_shijian <=", value, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianIn(List<Date> values) {
            addCriterionForJDBCDate("fabu_shijian in", values, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("fabu_shijian not in", values, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabu_shijian between", value1, value2, "fabuShijian");
            return (Criteria) this;
        }

        public Criteria andFabuShijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabu_shijian not between", value1, value2, "fabuShijian");
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