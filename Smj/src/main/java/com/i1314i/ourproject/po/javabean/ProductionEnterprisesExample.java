package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class ProductionEnterprisesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductionEnterprisesExample() {
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

        public Criteria andShengchanIdIsNull() {
            addCriterion("shengchan_id is null");
            return (Criteria) this;
        }

        public Criteria andShengchanIdIsNotNull() {
            addCriterion("shengchan_id is not null");
            return (Criteria) this;
        }

        public Criteria andShengchanIdEqualTo(Integer value) {
            addCriterion("shengchan_id =", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdNotEqualTo(Integer value) {
            addCriterion("shengchan_id <>", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdGreaterThan(Integer value) {
            addCriterion("shengchan_id >", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shengchan_id >=", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdLessThan(Integer value) {
            addCriterion("shengchan_id <", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdLessThanOrEqualTo(Integer value) {
            addCriterion("shengchan_id <=", value, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdIn(List<Integer> values) {
            addCriterion("shengchan_id in", values, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdNotIn(List<Integer> values) {
            addCriterion("shengchan_id not in", values, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdBetween(Integer value1, Integer value2) {
            addCriterion("shengchan_id between", value1, value2, "shengchanId");
            return (Criteria) this;
        }

        public Criteria andShengchanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shengchan_id not between", value1, value2, "shengchanId");
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

        public Criteria andJingyingFangshiIsNull() {
            addCriterion("jingying_fangshi is null");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiIsNotNull() {
            addCriterion("jingying_fangshi is not null");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiEqualTo(String value) {
            addCriterion("jingying_fangshi =", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiNotEqualTo(String value) {
            addCriterion("jingying_fangshi <>", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiGreaterThan(String value) {
            addCriterion("jingying_fangshi >", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiGreaterThanOrEqualTo(String value) {
            addCriterion("jingying_fangshi >=", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiLessThan(String value) {
            addCriterion("jingying_fangshi <", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiLessThanOrEqualTo(String value) {
            addCriterion("jingying_fangshi <=", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiLike(String value) {
            addCriterion("jingying_fangshi like", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiNotLike(String value) {
            addCriterion("jingying_fangshi not like", value, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiIn(List<String> values) {
            addCriterion("jingying_fangshi in", values, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiNotIn(List<String> values) {
            addCriterion("jingying_fangshi not in", values, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiBetween(String value1, String value2) {
            addCriterion("jingying_fangshi between", value1, value2, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andJingyingFangshiNotBetween(String value1, String value2) {
            addCriterion("jingying_fangshi not between", value1, value2, "jingyingFangshi");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneIsNull() {
            addCriterion("faren_telphone is null");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneIsNotNull() {
            addCriterion("faren_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneEqualTo(String value) {
            addCriterion("faren_telphone =", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneNotEqualTo(String value) {
            addCriterion("faren_telphone <>", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneGreaterThan(String value) {
            addCriterion("faren_telphone >", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("faren_telphone >=", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneLessThan(String value) {
            addCriterion("faren_telphone <", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneLessThanOrEqualTo(String value) {
            addCriterion("faren_telphone <=", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneLike(String value) {
            addCriterion("faren_telphone like", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneNotLike(String value) {
            addCriterion("faren_telphone not like", value, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneIn(List<String> values) {
            addCriterion("faren_telphone in", values, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneNotIn(List<String> values) {
            addCriterion("faren_telphone not in", values, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneBetween(String value1, String value2) {
            addCriterion("faren_telphone between", value1, value2, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andFarenTelphoneNotBetween(String value1, String value2) {
            addCriterion("faren_telphone not between", value1, value2, "farenTelphone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNull() {
            addCriterion("legal_representative is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIsNotNull() {
            addCriterion("legal_representative is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeEqualTo(String value) {
            addCriterion("legal_representative =", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotEqualTo(String value) {
            addCriterion("legal_representative <>", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThan(String value) {
            addCriterion("legal_representative >", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative >=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThan(String value) {
            addCriterion("legal_representative <", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLessThanOrEqualTo(String value) {
            addCriterion("legal_representative <=", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeLike(String value) {
            addCriterion("legal_representative like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotLike(String value) {
            addCriterion("legal_representative not like", value, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeIn(List<String> values) {
            addCriterion("legal_representative in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotIn(List<String> values) {
            addCriterion("legal_representative not in", values, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeBetween(String value1, String value2) {
            addCriterion("legal_representative between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNotBetween(String value1, String value2) {
            addCriterion("legal_representative not between", value1, value2, "legalRepresentative");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNull() {
            addCriterion("lianxiren is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNotNull() {
            addCriterion("lianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenEqualTo(String value) {
            addCriterion("lianxiren =", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotEqualTo(String value) {
            addCriterion("lianxiren <>", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThan(String value) {
            addCriterion("lianxiren >", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren >=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThan(String value) {
            addCriterion("lianxiren <", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThanOrEqualTo(String value) {
            addCriterion("lianxiren <=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLike(String value) {
            addCriterion("lianxiren like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotLike(String value) {
            addCriterion("lianxiren not like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenIn(List<String> values) {
            addCriterion("lianxiren in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotIn(List<String> values) {
            addCriterion("lianxiren not in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenBetween(String value1, String value2) {
            addCriterion("lianxiren between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotBetween(String value1, String value2) {
            addCriterion("lianxiren not between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIsNull() {
            addCriterion("lianxiren_tel is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIsNotNull() {
            addCriterion("lianxiren_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelEqualTo(String value) {
            addCriterion("lianxiren_tel =", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotEqualTo(String value) {
            addCriterion("lianxiren_tel <>", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelGreaterThan(String value) {
            addCriterion("lianxiren_tel >", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren_tel >=", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLessThan(String value) {
            addCriterion("lianxiren_tel <", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLessThanOrEqualTo(String value) {
            addCriterion("lianxiren_tel <=", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelLike(String value) {
            addCriterion("lianxiren_tel like", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotLike(String value) {
            addCriterion("lianxiren_tel not like", value, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelIn(List<String> values) {
            addCriterion("lianxiren_tel in", values, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotIn(List<String> values) {
            addCriterion("lianxiren_tel not in", values, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelBetween(String value1, String value2) {
            addCriterion("lianxiren_tel between", value1, value2, "lianxirenTel");
            return (Criteria) this;
        }

        public Criteria andLianxirenTelNotBetween(String value1, String value2) {
            addCriterion("lianxiren_tel not between", value1, value2, "lianxirenTel");
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