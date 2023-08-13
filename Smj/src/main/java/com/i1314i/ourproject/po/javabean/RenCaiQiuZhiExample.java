package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class RenCaiQiuZhiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RenCaiQiuZhiExample() {
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

        public Criteria andRencaiIdIsNull() {
            addCriterion("rencai_id is null");
            return (Criteria) this;
        }

        public Criteria andRencaiIdIsNotNull() {
            addCriterion("rencai_id is not null");
            return (Criteria) this;
        }

        public Criteria andRencaiIdEqualTo(Integer value) {
            addCriterion("rencai_id =", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdNotEqualTo(Integer value) {
            addCriterion("rencai_id <>", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdGreaterThan(Integer value) {
            addCriterion("rencai_id >", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rencai_id >=", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdLessThan(Integer value) {
            addCriterion("rencai_id <", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdLessThanOrEqualTo(Integer value) {
            addCriterion("rencai_id <=", value, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdIn(List<Integer> values) {
            addCriterion("rencai_id in", values, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdNotIn(List<Integer> values) {
            addCriterion("rencai_id not in", values, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdBetween(Integer value1, Integer value2) {
            addCriterion("rencai_id between", value1, value2, "rencaiId");
            return (Criteria) this;
        }

        public Criteria andRencaiIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rencai_id not between", value1, value2, "rencaiId");
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andXueliIsNull() {
            addCriterion("xueli is null");
            return (Criteria) this;
        }

        public Criteria andXueliIsNotNull() {
            addCriterion("xueli is not null");
            return (Criteria) this;
        }

        public Criteria andXueliEqualTo(String value) {
            addCriterion("xueli =", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotEqualTo(String value) {
            addCriterion("xueli <>", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThan(String value) {
            addCriterion("xueli >", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliGreaterThanOrEqualTo(String value) {
            addCriterion("xueli >=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThan(String value) {
            addCriterion("xueli <", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLessThanOrEqualTo(String value) {
            addCriterion("xueli <=", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliLike(String value) {
            addCriterion("xueli like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotLike(String value) {
            addCriterion("xueli not like", value, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliIn(List<String> values) {
            addCriterion("xueli in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotIn(List<String> values) {
            addCriterion("xueli not in", values, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliBetween(String value1, String value2) {
            addCriterion("xueli between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andXueliNotBetween(String value1, String value2) {
            addCriterion("xueli not between", value1, value2, "xueli");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangIsNull() {
            addCriterion("qiuzhifangxiang is null");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangIsNotNull() {
            addCriterion("qiuzhifangxiang is not null");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangEqualTo(String value) {
            addCriterion("qiuzhifangxiang =", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangNotEqualTo(String value) {
            addCriterion("qiuzhifangxiang <>", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangGreaterThan(String value) {
            addCriterion("qiuzhifangxiang >", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangGreaterThanOrEqualTo(String value) {
            addCriterion("qiuzhifangxiang >=", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangLessThan(String value) {
            addCriterion("qiuzhifangxiang <", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangLessThanOrEqualTo(String value) {
            addCriterion("qiuzhifangxiang <=", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangLike(String value) {
            addCriterion("qiuzhifangxiang like", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangNotLike(String value) {
            addCriterion("qiuzhifangxiang not like", value, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangIn(List<String> values) {
            addCriterion("qiuzhifangxiang in", values, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangNotIn(List<String> values) {
            addCriterion("qiuzhifangxiang not in", values, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangBetween(String value1, String value2) {
            addCriterion("qiuzhifangxiang between", value1, value2, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andQiuzhifangxiangNotBetween(String value1, String value2) {
            addCriterion("qiuzhifangxiang not between", value1, value2, "qiuzhifangxiang");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieIsNull() {
            addCriterion("gerenjianjie is null");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieIsNotNull() {
            addCriterion("gerenjianjie is not null");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieEqualTo(String value) {
            addCriterion("gerenjianjie =", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieNotEqualTo(String value) {
            addCriterion("gerenjianjie <>", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieGreaterThan(String value) {
            addCriterion("gerenjianjie >", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieGreaterThanOrEqualTo(String value) {
            addCriterion("gerenjianjie >=", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieLessThan(String value) {
            addCriterion("gerenjianjie <", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieLessThanOrEqualTo(String value) {
            addCriterion("gerenjianjie <=", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieLike(String value) {
            addCriterion("gerenjianjie like", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieNotLike(String value) {
            addCriterion("gerenjianjie not like", value, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieIn(List<String> values) {
            addCriterion("gerenjianjie in", values, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieNotIn(List<String> values) {
            addCriterion("gerenjianjie not in", values, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieBetween(String value1, String value2) {
            addCriterion("gerenjianjie between", value1, value2, "gerenjianjie");
            return (Criteria) this;
        }

        public Criteria andGerenjianjieNotBetween(String value1, String value2) {
            addCriterion("gerenjianjie not between", value1, value2, "gerenjianjie");
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

        public Criteria andShenheIsNull() {
            addCriterion("shenhe is null");
            return (Criteria) this;
        }

        public Criteria andShenheIsNotNull() {
            addCriterion("shenhe is not null");
            return (Criteria) this;
        }

        public Criteria andShenheEqualTo(String value) {
            addCriterion("shenhe =", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotEqualTo(String value) {
            addCriterion("shenhe <>", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThan(String value) {
            addCriterion("shenhe >", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheGreaterThanOrEqualTo(String value) {
            addCriterion("shenhe >=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThan(String value) {
            addCriterion("shenhe <", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLessThanOrEqualTo(String value) {
            addCriterion("shenhe <=", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheLike(String value) {
            addCriterion("shenhe like", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotLike(String value) {
            addCriterion("shenhe not like", value, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheIn(List<String> values) {
            addCriterion("shenhe in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotIn(List<String> values) {
            addCriterion("shenhe not in", values, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheBetween(String value1, String value2) {
            addCriterion("shenhe between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andShenheNotBetween(String value1, String value2) {
            addCriterion("shenhe not between", value1, value2, "shenhe");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianIsNull() {
            addCriterion("gongzuodidian is null");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianIsNotNull() {
            addCriterion("gongzuodidian is not null");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianEqualTo(Integer value) {
            addCriterion("gongzuodidian =", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianNotEqualTo(Integer value) {
            addCriterion("gongzuodidian <>", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianGreaterThan(Integer value) {
            addCriterion("gongzuodidian >", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianGreaterThanOrEqualTo(Integer value) {
            addCriterion("gongzuodidian >=", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianLessThan(Integer value) {
            addCriterion("gongzuodidian <", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianLessThanOrEqualTo(Integer value) {
            addCriterion("gongzuodidian <=", value, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianIn(List<Integer> values) {
            addCriterion("gongzuodidian in", values, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianNotIn(List<Integer> values) {
            addCriterion("gongzuodidian not in", values, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianBetween(Integer value1, Integer value2) {
            addCriterion("gongzuodidian between", value1, value2, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andGongzuodidianNotBetween(Integer value1, Integer value2) {
            addCriterion("gongzuodidian not between", value1, value2, "gongzuodidian");
            return (Criteria) this;
        }

        public Criteria andYuanyinIsNull() {
            addCriterion("yuanyin is null");
            return (Criteria) this;
        }

        public Criteria andYuanyinIsNotNull() {
            addCriterion("yuanyin is not null");
            return (Criteria) this;
        }

        public Criteria andYuanyinEqualTo(String value) {
            addCriterion("yuanyin =", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotEqualTo(String value) {
            addCriterion("yuanyin <>", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinGreaterThan(String value) {
            addCriterion("yuanyin >", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinGreaterThanOrEqualTo(String value) {
            addCriterion("yuanyin >=", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLessThan(String value) {
            addCriterion("yuanyin <", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLessThanOrEqualTo(String value) {
            addCriterion("yuanyin <=", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinLike(String value) {
            addCriterion("yuanyin like", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotLike(String value) {
            addCriterion("yuanyin not like", value, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinIn(List<String> values) {
            addCriterion("yuanyin in", values, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotIn(List<String> values) {
            addCriterion("yuanyin not in", values, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinBetween(String value1, String value2) {
            addCriterion("yuanyin between", value1, value2, "yuanyin");
            return (Criteria) this;
        }

        public Criteria andYuanyinNotBetween(String value1, String value2) {
            addCriterion("yuanyin not between", value1, value2, "yuanyin");
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

        public Criteria andBeiyong5IsNull() {
            addCriterion("beiyong5 is null");
            return (Criteria) this;
        }

        public Criteria andBeiyong5IsNotNull() {
            addCriterion("beiyong5 is not null");
            return (Criteria) this;
        }

        public Criteria andBeiyong5EqualTo(String value) {
            addCriterion("beiyong5 =", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotEqualTo(String value) {
            addCriterion("beiyong5 <>", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThan(String value) {
            addCriterion("beiyong5 >", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5GreaterThanOrEqualTo(String value) {
            addCriterion("beiyong5 >=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThan(String value) {
            addCriterion("beiyong5 <", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5LessThanOrEqualTo(String value) {
            addCriterion("beiyong5 <=", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5Like(String value) {
            addCriterion("beiyong5 like", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotLike(String value) {
            addCriterion("beiyong5 not like", value, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5In(List<String> values) {
            addCriterion("beiyong5 in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotIn(List<String> values) {
            addCriterion("beiyong5 not in", values, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5Between(String value1, String value2) {
            addCriterion("beiyong5 between", value1, value2, "beiyong5");
            return (Criteria) this;
        }

        public Criteria andBeiyong5NotBetween(String value1, String value2) {
            addCriterion("beiyong5 not between", value1, value2, "beiyong5");
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