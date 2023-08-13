package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.List;

public class BasicaFarmlandExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicaFarmlandExample() {
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

        public Criteria andNongtianIdIsNull() {
            addCriterion("nongtian_id is null");
            return (Criteria) this;
        }

        public Criteria andNongtianIdIsNotNull() {
            addCriterion("nongtian_id is not null");
            return (Criteria) this;
        }

        public Criteria andNongtianIdEqualTo(String value) {
            addCriterion("nongtian_id =", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdNotEqualTo(String value) {
            addCriterion("nongtian_id <>", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdGreaterThan(String value) {
            addCriterion("nongtian_id >", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdGreaterThanOrEqualTo(String value) {
            addCriterion("nongtian_id >=", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdLessThan(String value) {
            addCriterion("nongtian_id <", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdLessThanOrEqualTo(String value) {
            addCriterion("nongtian_id <=", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdLike(String value) {
            addCriterion("nongtian_id like", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdNotLike(String value) {
            addCriterion("nongtian_id not like", value, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdIn(List<String> values) {
            addCriterion("nongtian_id in", values, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdNotIn(List<String> values) {
            addCriterion("nongtian_id not in", values, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdBetween(String value1, String value2) {
            addCriterion("nongtian_id between", value1, value2, "nongtianId");
            return (Criteria) this;
        }

        public Criteria andNongtianIdNotBetween(String value1, String value2) {
            addCriterion("nongtian_id not between", value1, value2, "nongtianId");
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(Double value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Double value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Double value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Double value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Double value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Double> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Double> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Double value1, Double value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Double value1, Double value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiIsNull() {
            addCriterion("quanshu_danwei is null");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiIsNotNull() {
            addCriterion("quanshu_danwei is not null");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiEqualTo(String value) {
            addCriterion("quanshu_danwei =", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiNotEqualTo(String value) {
            addCriterion("quanshu_danwei <>", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiGreaterThan(String value) {
            addCriterion("quanshu_danwei >", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("quanshu_danwei >=", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiLessThan(String value) {
            addCriterion("quanshu_danwei <", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiLessThanOrEqualTo(String value) {
            addCriterion("quanshu_danwei <=", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiLike(String value) {
            addCriterion("quanshu_danwei like", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiNotLike(String value) {
            addCriterion("quanshu_danwei not like", value, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiIn(List<String> values) {
            addCriterion("quanshu_danwei in", values, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiNotIn(List<String> values) {
            addCriterion("quanshu_danwei not in", values, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiBetween(String value1, String value2) {
            addCriterion("quanshu_danwei between", value1, value2, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuDanweiNotBetween(String value1, String value2) {
            addCriterion("quanshu_danwei not between", value1, value2, "quanshuDanwei");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiIsNull() {
            addCriterion("quanshu_xingzhi is null");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiIsNotNull() {
            addCriterion("quanshu_xingzhi is not null");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiEqualTo(String value) {
            addCriterion("quanshu_xingzhi =", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiNotEqualTo(String value) {
            addCriterion("quanshu_xingzhi <>", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiGreaterThan(String value) {
            addCriterion("quanshu_xingzhi >", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("quanshu_xingzhi >=", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiLessThan(String value) {
            addCriterion("quanshu_xingzhi <", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiLessThanOrEqualTo(String value) {
            addCriterion("quanshu_xingzhi <=", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiLike(String value) {
            addCriterion("quanshu_xingzhi like", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiNotLike(String value) {
            addCriterion("quanshu_xingzhi not like", value, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiIn(List<String> values) {
            addCriterion("quanshu_xingzhi in", values, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiNotIn(List<String> values) {
            addCriterion("quanshu_xingzhi not in", values, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiBetween(String value1, String value2) {
            addCriterion("quanshu_xingzhi between", value1, value2, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andQuanshuXingzhiNotBetween(String value1, String value2) {
            addCriterion("quanshu_xingzhi not between", value1, value2, "quanshuXingzhi");
            return (Criteria) this;
        }

        public Criteria andZulinrenIsNull() {
            addCriterion("zulinren is null");
            return (Criteria) this;
        }

        public Criteria andZulinrenIsNotNull() {
            addCriterion("zulinren is not null");
            return (Criteria) this;
        }

        public Criteria andZulinrenEqualTo(String value) {
            addCriterion("zulinren =", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenNotEqualTo(String value) {
            addCriterion("zulinren <>", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenGreaterThan(String value) {
            addCriterion("zulinren >", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenGreaterThanOrEqualTo(String value) {
            addCriterion("zulinren >=", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenLessThan(String value) {
            addCriterion("zulinren <", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenLessThanOrEqualTo(String value) {
            addCriterion("zulinren <=", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenLike(String value) {
            addCriterion("zulinren like", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenNotLike(String value) {
            addCriterion("zulinren not like", value, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenIn(List<String> values) {
            addCriterion("zulinren in", values, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenNotIn(List<String> values) {
            addCriterion("zulinren not in", values, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenBetween(String value1, String value2) {
            addCriterion("zulinren between", value1, value2, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZulinrenNotBetween(String value1, String value2) {
            addCriterion("zulinren not between", value1, value2, "zulinren");
            return (Criteria) this;
        }

        public Criteria andZhengshuIsNull() {
            addCriterion("zhengshu is null");
            return (Criteria) this;
        }

        public Criteria andZhengshuIsNotNull() {
            addCriterion("zhengshu is not null");
            return (Criteria) this;
        }

        public Criteria andZhengshuEqualTo(String value) {
            addCriterion("zhengshu =", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuNotEqualTo(String value) {
            addCriterion("zhengshu <>", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuGreaterThan(String value) {
            addCriterion("zhengshu >", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuGreaterThanOrEqualTo(String value) {
            addCriterion("zhengshu >=", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuLessThan(String value) {
            addCriterion("zhengshu <", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuLessThanOrEqualTo(String value) {
            addCriterion("zhengshu <=", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuLike(String value) {
            addCriterion("zhengshu like", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuNotLike(String value) {
            addCriterion("zhengshu not like", value, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuIn(List<String> values) {
            addCriterion("zhengshu in", values, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuNotIn(List<String> values) {
            addCriterion("zhengshu not in", values, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuBetween(String value1, String value2) {
            addCriterion("zhengshu between", value1, value2, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andZhengshuNotBetween(String value1, String value2) {
            addCriterion("zhengshu not between", value1, value2, "zhengshu");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangIsNull() {
            addCriterion("liuzhuanqingkuang is null");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangIsNotNull() {
            addCriterion("liuzhuanqingkuang is not null");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangEqualTo(String value) {
            addCriterion("liuzhuanqingkuang =", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangNotEqualTo(String value) {
            addCriterion("liuzhuanqingkuang <>", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangGreaterThan(String value) {
            addCriterion("liuzhuanqingkuang >", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangGreaterThanOrEqualTo(String value) {
            addCriterion("liuzhuanqingkuang >=", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangLessThan(String value) {
            addCriterion("liuzhuanqingkuang <", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangLessThanOrEqualTo(String value) {
            addCriterion("liuzhuanqingkuang <=", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangLike(String value) {
            addCriterion("liuzhuanqingkuang like", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangNotLike(String value) {
            addCriterion("liuzhuanqingkuang not like", value, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangIn(List<String> values) {
            addCriterion("liuzhuanqingkuang in", values, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangNotIn(List<String> values) {
            addCriterion("liuzhuanqingkuang not in", values, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangBetween(String value1, String value2) {
            addCriterion("liuzhuanqingkuang between", value1, value2, "liuzhuanqingkuang");
            return (Criteria) this;
        }

        public Criteria andLiuzhuanqingkuangNotBetween(String value1, String value2) {
            addCriterion("liuzhuanqingkuang not between", value1, value2, "liuzhuanqingkuang");
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