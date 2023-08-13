package com.i1314i.ourproject.po.javabean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class JuMinShengHuoXiaoFeiPinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JuMinShengHuoXiaoFeiPinExample() {
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

        public Criteria andJuMinShengHuoIdIsNull() {
            addCriterion("ju_min_sheng_huo_id is null");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdIsNotNull() {
            addCriterion("ju_min_sheng_huo_id is not null");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdEqualTo(Integer value) {
            addCriterion("ju_min_sheng_huo_id =", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdNotEqualTo(Integer value) {
            addCriterion("ju_min_sheng_huo_id <>", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdGreaterThan(Integer value) {
            addCriterion("ju_min_sheng_huo_id >", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ju_min_sheng_huo_id >=", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdLessThan(Integer value) {
            addCriterion("ju_min_sheng_huo_id <", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdLessThanOrEqualTo(Integer value) {
            addCriterion("ju_min_sheng_huo_id <=", value, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdIn(List<Integer> values) {
            addCriterion("ju_min_sheng_huo_id in", values, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdNotIn(List<Integer> values) {
            addCriterion("ju_min_sheng_huo_id not in", values, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdBetween(Integer value1, Integer value2) {
            addCriterion("ju_min_sheng_huo_id between", value1, value2, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andJuMinShengHuoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ju_min_sheng_huo_id not between", value1, value2, "juMinShengHuoId");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIsNull() {
            addCriterion("shangpin_mingcheng is null");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIsNotNull() {
            addCriterion("shangpin_mingcheng is not null");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengEqualTo(String value) {
            addCriterion("shangpin_mingcheng =", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotEqualTo(String value) {
            addCriterion("shangpin_mingcheng <>", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengGreaterThan(String value) {
            addCriterion("shangpin_mingcheng >", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengGreaterThanOrEqualTo(String value) {
            addCriterion("shangpin_mingcheng >=", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLessThan(String value) {
            addCriterion("shangpin_mingcheng <", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLessThanOrEqualTo(String value) {
            addCriterion("shangpin_mingcheng <=", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengLike(String value) {
            addCriterion("shangpin_mingcheng like", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotLike(String value) {
            addCriterion("shangpin_mingcheng not like", value, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengIn(List<String> values) {
            addCriterion("shangpin_mingcheng in", values, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotIn(List<String> values) {
            addCriterion("shangpin_mingcheng not in", values, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengBetween(String value1, String value2) {
            addCriterion("shangpin_mingcheng between", value1, value2, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andShangpinMingchengNotBetween(String value1, String value2) {
            addCriterion("shangpin_mingcheng not between", value1, value2, "shangpinMingcheng");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNull() {
            addCriterion("leibie is null");
            return (Criteria) this;
        }

        public Criteria andLeibieIsNotNull() {
            addCriterion("leibie is not null");
            return (Criteria) this;
        }

        public Criteria andLeibieEqualTo(String value) {
            addCriterion("leibie =", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotEqualTo(String value) {
            addCriterion("leibie <>", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThan(String value) {
            addCriterion("leibie >", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieGreaterThanOrEqualTo(String value) {
            addCriterion("leibie >=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThan(String value) {
            addCriterion("leibie <", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLessThanOrEqualTo(String value) {
            addCriterion("leibie <=", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieLike(String value) {
            addCriterion("leibie like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotLike(String value) {
            addCriterion("leibie not like", value, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieIn(List<String> values) {
            addCriterion("leibie in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotIn(List<String> values) {
            addCriterion("leibie not in", values, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieBetween(String value1, String value2) {
            addCriterion("leibie between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andLeibieNotBetween(String value1, String value2) {
            addCriterion("leibie not between", value1, value2, "leibie");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIsNull() {
            addCriterion("gui_ge_deng_ji is null");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIsNotNull() {
            addCriterion("gui_ge_deng_ji is not null");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiEqualTo(String value) {
            addCriterion("gui_ge_deng_ji =", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotEqualTo(String value) {
            addCriterion("gui_ge_deng_ji <>", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiGreaterThan(String value) {
            addCriterion("gui_ge_deng_ji >", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiGreaterThanOrEqualTo(String value) {
            addCriterion("gui_ge_deng_ji >=", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLessThan(String value) {
            addCriterion("gui_ge_deng_ji <", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLessThanOrEqualTo(String value) {
            addCriterion("gui_ge_deng_ji <=", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiLike(String value) {
            addCriterion("gui_ge_deng_ji like", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotLike(String value) {
            addCriterion("gui_ge_deng_ji not like", value, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiIn(List<String> values) {
            addCriterion("gui_ge_deng_ji in", values, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotIn(List<String> values) {
            addCriterion("gui_ge_deng_ji not in", values, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiBetween(String value1, String value2) {
            addCriterion("gui_ge_deng_ji between", value1, value2, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andGuiGeDengJiNotBetween(String value1, String value2) {
            addCriterion("gui_ge_deng_ji not between", value1, value2, "guiGeDengJi");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIsNull() {
            addCriterion("ji_liang_dan_wei is null");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIsNotNull() {
            addCriterion("ji_liang_dan_wei is not null");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiEqualTo(String value) {
            addCriterion("ji_liang_dan_wei =", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotEqualTo(String value) {
            addCriterion("ji_liang_dan_wei <>", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiGreaterThan(String value) {
            addCriterion("ji_liang_dan_wei >", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("ji_liang_dan_wei >=", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLessThan(String value) {
            addCriterion("ji_liang_dan_wei <", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLessThanOrEqualTo(String value) {
            addCriterion("ji_liang_dan_wei <=", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiLike(String value) {
            addCriterion("ji_liang_dan_wei like", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotLike(String value) {
            addCriterion("ji_liang_dan_wei not like", value, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiIn(List<String> values) {
            addCriterion("ji_liang_dan_wei in", values, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotIn(List<String> values) {
            addCriterion("ji_liang_dan_wei not in", values, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiBetween(String value1, String value2) {
            addCriterion("ji_liang_dan_wei between", value1, value2, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andJiLiangDanWeiNotBetween(String value1, String value2) {
            addCriterion("ji_liang_dan_wei not between", value1, value2, "jiLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeIsNull() {
            addCriterion("ling_shou_chao_shi_jia_ge is null");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeIsNotNull() {
            addCriterion("ling_shou_chao_shi_jia_ge is not null");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeEqualTo(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge =", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeNotEqualTo(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge <>", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeGreaterThan(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge >", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeGreaterThanOrEqualTo(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge >=", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeLessThan(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge <", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeLessThanOrEqualTo(Double value) {
            addCriterion("ling_shou_chao_shi_jia_ge <=", value, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeIn(List<Double> values) {
            addCriterion("ling_shou_chao_shi_jia_ge in", values, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeNotIn(List<Double> values) {
            addCriterion("ling_shou_chao_shi_jia_ge not in", values, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeBetween(Double value1, Double value2) {
            addCriterion("ling_shou_chao_shi_jia_ge between", value1, value2, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouChaoShiJiaGeNotBetween(Double value1, Double value2) {
            addCriterion("ling_shou_chao_shi_jia_ge not between", value1, value2, "lingShouChaoShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeIsNull() {
            addCriterion("ling_shou_ji_shi_jia_ge is null");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeIsNotNull() {
            addCriterion("ling_shou_ji_shi_jia_ge is not null");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeEqualTo(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge =", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeNotEqualTo(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge <>", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeGreaterThan(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge >", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeGreaterThanOrEqualTo(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge >=", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeLessThan(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge <", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeLessThanOrEqualTo(Double value) {
            addCriterion("ling_shou_ji_shi_jia_ge <=", value, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeIn(List<Double> values) {
            addCriterion("ling_shou_ji_shi_jia_ge in", values, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeNotIn(List<Double> values) {
            addCriterion("ling_shou_ji_shi_jia_ge not in", values, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeBetween(Double value1, Double value2) {
            addCriterion("ling_shou_ji_shi_jia_ge between", value1, value2, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andLingShouJiShiJiaGeNotBetween(Double value1, Double value2) {
            addCriterion("ling_shou_ji_shi_jia_ge not between", value1, value2, "lingShouJiShiJiaGe");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangIsNull() {
            addCriterion("cai_jia_shi_chang is null");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangIsNotNull() {
            addCriterion("cai_jia_shi_chang is not null");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangEqualTo(String value) {
            addCriterion("cai_jia_shi_chang =", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangNotEqualTo(String value) {
            addCriterion("cai_jia_shi_chang <>", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangGreaterThan(String value) {
            addCriterion("cai_jia_shi_chang >", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangGreaterThanOrEqualTo(String value) {
            addCriterion("cai_jia_shi_chang >=", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangLessThan(String value) {
            addCriterion("cai_jia_shi_chang <", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangLessThanOrEqualTo(String value) {
            addCriterion("cai_jia_shi_chang <=", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangLike(String value) {
            addCriterion("cai_jia_shi_chang like", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangNotLike(String value) {
            addCriterion("cai_jia_shi_chang not like", value, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangIn(List<String> values) {
            addCriterion("cai_jia_shi_chang in", values, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangNotIn(List<String> values) {
            addCriterion("cai_jia_shi_chang not in", values, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangBetween(String value1, String value2) {
            addCriterion("cai_jia_shi_chang between", value1, value2, "caiJiaShiChang");
            return (Criteria) this;
        }

        public Criteria andCaiJiaShiChangNotBetween(String value1, String value2) {
            addCriterion("cai_jia_shi_chang not between", value1, value2, "caiJiaShiChang");
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

        public Criteria andZhiBiaoJieShiIsNull() {
            addCriterion("zhi_biao_jie_shi is null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiIsNotNull() {
            addCriterion("zhi_biao_jie_shi is not null");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi =", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi <>", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiGreaterThan(String value) {
            addCriterion("zhi_biao_jie_shi >", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi >=", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLessThan(String value) {
            addCriterion("zhi_biao_jie_shi <", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLessThanOrEqualTo(String value) {
            addCriterion("zhi_biao_jie_shi <=", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiLike(String value) {
            addCriterion("zhi_biao_jie_shi like", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotLike(String value) {
            addCriterion("zhi_biao_jie_shi not like", value, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiIn(List<String> values) {
            addCriterion("zhi_biao_jie_shi in", values, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotIn(List<String> values) {
            addCriterion("zhi_biao_jie_shi not in", values, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiBetween(String value1, String value2) {
            addCriterion("zhi_biao_jie_shi between", value1, value2, "zhiBiaoJieShi");
            return (Criteria) this;
        }

        public Criteria andZhiBiaoJieShiNotBetween(String value1, String value2) {
            addCriterion("zhi_biao_jie_shi not between", value1, value2, "zhiBiaoJieShi");
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