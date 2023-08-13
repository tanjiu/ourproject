package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LvHuaMiaoMuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LvHuaMiaoMuExample() {
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

        public Criteria andMiaoMuIdIsNull() {
            addCriterion("miao_mu_id is null");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdIsNotNull() {
            addCriterion("miao_mu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdEqualTo(Integer value) {
            addCriterion("miao_mu_id =", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdNotEqualTo(Integer value) {
            addCriterion("miao_mu_id <>", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdGreaterThan(Integer value) {
            addCriterion("miao_mu_id >", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("miao_mu_id >=", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdLessThan(Integer value) {
            addCriterion("miao_mu_id <", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdLessThanOrEqualTo(Integer value) {
            addCriterion("miao_mu_id <=", value, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdIn(List<Integer> values) {
            addCriterion("miao_mu_id in", values, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdNotIn(List<Integer> values) {
            addCriterion("miao_mu_id not in", values, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdBetween(Integer value1, Integer value2) {
            addCriterion("miao_mu_id between", value1, value2, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMiaoMuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("miao_mu_id not between", value1, value2, "miaoMuId");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNull() {
            addCriterion("mingcheng is null");
            return (Criteria) this;
        }

        public Criteria andMingchengIsNotNull() {
            addCriterion("mingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andMingchengEqualTo(String value) {
            addCriterion("mingcheng =", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotEqualTo(String value) {
            addCriterion("mingcheng <>", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThan(String value) {
            addCriterion("mingcheng >", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("mingcheng >=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThan(String value) {
            addCriterion("mingcheng <", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLessThanOrEqualTo(String value) {
            addCriterion("mingcheng <=", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengLike(String value) {
            addCriterion("mingcheng like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotLike(String value) {
            addCriterion("mingcheng not like", value, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengIn(List<String> values) {
            addCriterion("mingcheng in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotIn(List<String> values) {
            addCriterion("mingcheng not in", values, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengBetween(String value1, String value2) {
            addCriterion("mingcheng between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andMingchengNotBetween(String value1, String value2) {
            addCriterion("mingcheng not between", value1, value2, "mingcheng");
            return (Criteria) this;
        }

        public Criteria andGuiGeIsNull() {
            addCriterion("gui_ge is null");
            return (Criteria) this;
        }

        public Criteria andGuiGeIsNotNull() {
            addCriterion("gui_ge is not null");
            return (Criteria) this;
        }

        public Criteria andGuiGeEqualTo(String value) {
            addCriterion("gui_ge =", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeNotEqualTo(String value) {
            addCriterion("gui_ge <>", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeGreaterThan(String value) {
            addCriterion("gui_ge >", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeGreaterThanOrEqualTo(String value) {
            addCriterion("gui_ge >=", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeLessThan(String value) {
            addCriterion("gui_ge <", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeLessThanOrEqualTo(String value) {
            addCriterion("gui_ge <=", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeLike(String value) {
            addCriterion("gui_ge like", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeNotLike(String value) {
            addCriterion("gui_ge not like", value, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeIn(List<String> values) {
            addCriterion("gui_ge in", values, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeNotIn(List<String> values) {
            addCriterion("gui_ge not in", values, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeBetween(String value1, String value2) {
            addCriterion("gui_ge between", value1, value2, "guiGe");
            return (Criteria) this;
        }

        public Criteria andGuiGeNotBetween(String value1, String value2) {
            addCriterion("gui_ge not between", value1, value2, "guiGe");
            return (Criteria) this;
        }

        public Criteria andDanJiaIsNull() {
            addCriterion("dan_jia is null");
            return (Criteria) this;
        }

        public Criteria andDanJiaIsNotNull() {
            addCriterion("dan_jia is not null");
            return (Criteria) this;
        }

        public Criteria andDanJiaEqualTo(Double value) {
            addCriterion("dan_jia =", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotEqualTo(Double value) {
            addCriterion("dan_jia <>", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaGreaterThan(Double value) {
            addCriterion("dan_jia >", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaGreaterThanOrEqualTo(Double value) {
            addCriterion("dan_jia >=", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaLessThan(Double value) {
            addCriterion("dan_jia <", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaLessThanOrEqualTo(Double value) {
            addCriterion("dan_jia <=", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaIn(List<Double> values) {
            addCriterion("dan_jia in", values, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotIn(List<Double> values) {
            addCriterion("dan_jia not in", values, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaBetween(Double value1, Double value2) {
            addCriterion("dan_jia between", value1, value2, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotBetween(Double value1, Double value2) {
            addCriterion("dan_jia not between", value1, value2, "danJia");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIsNull() {
            addCriterion("zhi_biao_fang is null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIsNotNull() {
            addCriterion("zhi_biao_fang is not null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangEqualTo(String value) {
            addCriterion("zhi_biao_fang =", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangNotEqualTo(String value) {
            addCriterion("zhi_biao_fang <>", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangGreaterThan(String value) {
            addCriterion("zhi_biao_fang >", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_biao_fang >=", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangLessThan(String value) {
            addCriterion("zhi_biao_fang <", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangLessThanOrEqualTo(String value) {
            addCriterion("zhi_biao_fang <=", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangLike(String value) {
            addCriterion("zhi_biao_fang like", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangNotLike(String value) {
            addCriterion("zhi_biao_fang not like", value, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangIn(List<String> values) {
            addCriterion("zhi_biao_fang in", values, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangNotIn(List<String> values) {
            addCriterion("zhi_biao_fang not in", values, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangBetween(String value1, String value2) {
            addCriterion("zhi_biao_fang between", value1, value2, "zhiBiaoFang");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoFangNotBetween(String value1, String value2) {
            addCriterion("zhi_biao_fang not between", value1, value2, "zhiBiaoFang");
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