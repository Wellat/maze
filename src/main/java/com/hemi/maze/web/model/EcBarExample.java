package com.hemi.maze.web.model;

import java.util.ArrayList;
import java.util.List;

public class EcBarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EcBarExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andYearsIsNull() {
            addCriterion("years is null");
            return (Criteria) this;
        }

        public Criteria andYearsIsNotNull() {
            addCriterion("years is not null");
            return (Criteria) this;
        }

        public Criteria andYearsEqualTo(Integer value) {
            addCriterion("years =", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotEqualTo(Integer value) {
            addCriterion("years <>", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThan(Integer value) {
            addCriterion("years >", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("years >=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThan(Integer value) {
            addCriterion("years <", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsLessThanOrEqualTo(Integer value) {
            addCriterion("years <=", value, "years");
            return (Criteria) this;
        }

        public Criteria andYearsIn(List<Integer> values) {
            addCriterion("years in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotIn(List<Integer> values) {
            addCriterion("years not in", values, "years");
            return (Criteria) this;
        }

        public Criteria andYearsBetween(Integer value1, Integer value2) {
            addCriterion("years between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("years not between", value1, value2, "years");
            return (Criteria) this;
        }

        public Criteria andMonthesIsNull() {
            addCriterion("monthes is null");
            return (Criteria) this;
        }

        public Criteria andMonthesIsNotNull() {
            addCriterion("monthes is not null");
            return (Criteria) this;
        }

        public Criteria andMonthesEqualTo(Integer value) {
            addCriterion("monthes =", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesNotEqualTo(Integer value) {
            addCriterion("monthes <>", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesGreaterThan(Integer value) {
            addCriterion("monthes >", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthes >=", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesLessThan(Integer value) {
            addCriterion("monthes <", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesLessThanOrEqualTo(Integer value) {
            addCriterion("monthes <=", value, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesIn(List<Integer> values) {
            addCriterion("monthes in", values, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesNotIn(List<Integer> values) {
            addCriterion("monthes not in", values, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesBetween(Integer value1, Integer value2) {
            addCriterion("monthes between", value1, value2, "monthes");
            return (Criteria) this;
        }

        public Criteria andMonthesNotBetween(Integer value1, Integer value2) {
            addCriterion("monthes not between", value1, value2, "monthes");
            return (Criteria) this;
        }

        public Criteria andEvaporationIsNull() {
            addCriterion("evaporation is null");
            return (Criteria) this;
        }

        public Criteria andEvaporationIsNotNull() {
            addCriterion("evaporation is not null");
            return (Criteria) this;
        }

        public Criteria andEvaporationEqualTo(Float value) {
            addCriterion("evaporation =", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationNotEqualTo(Float value) {
            addCriterion("evaporation <>", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationGreaterThan(Float value) {
            addCriterion("evaporation >", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationGreaterThanOrEqualTo(Float value) {
            addCriterion("evaporation >=", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationLessThan(Float value) {
            addCriterion("evaporation <", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationLessThanOrEqualTo(Float value) {
            addCriterion("evaporation <=", value, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationIn(List<Float> values) {
            addCriterion("evaporation in", values, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationNotIn(List<Float> values) {
            addCriterion("evaporation not in", values, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationBetween(Float value1, Float value2) {
            addCriterion("evaporation between", value1, value2, "evaporation");
            return (Criteria) this;
        }

        public Criteria andEvaporationNotBetween(Float value1, Float value2) {
            addCriterion("evaporation not between", value1, value2, "evaporation");
            return (Criteria) this;
        }

        public Criteria andRainfallIsNull() {
            addCriterion("rainfall is null");
            return (Criteria) this;
        }

        public Criteria andRainfallIsNotNull() {
            addCriterion("rainfall is not null");
            return (Criteria) this;
        }

        public Criteria andRainfallEqualTo(Float value) {
            addCriterion("rainfall =", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotEqualTo(Float value) {
            addCriterion("rainfall <>", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThan(Float value) {
            addCriterion("rainfall >", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallGreaterThanOrEqualTo(Float value) {
            addCriterion("rainfall >=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThan(Float value) {
            addCriterion("rainfall <", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallLessThanOrEqualTo(Float value) {
            addCriterion("rainfall <=", value, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallIn(List<Float> values) {
            addCriterion("rainfall in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotIn(List<Float> values) {
            addCriterion("rainfall not in", values, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallBetween(Float value1, Float value2) {
            addCriterion("rainfall between", value1, value2, "rainfall");
            return (Criteria) this;
        }

        public Criteria andRainfallNotBetween(Float value1, Float value2) {
            addCriterion("rainfall not between", value1, value2, "rainfall");
            return (Criteria) this;
        }

        public Criteria andAvgtempIsNull() {
            addCriterion("avgtemp is null");
            return (Criteria) this;
        }

        public Criteria andAvgtempIsNotNull() {
            addCriterion("avgtemp is not null");
            return (Criteria) this;
        }

        public Criteria andAvgtempEqualTo(Float value) {
            addCriterion("avgtemp =", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempNotEqualTo(Float value) {
            addCriterion("avgtemp <>", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempGreaterThan(Float value) {
            addCriterion("avgtemp >", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempGreaterThanOrEqualTo(Float value) {
            addCriterion("avgtemp >=", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempLessThan(Float value) {
            addCriterion("avgtemp <", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempLessThanOrEqualTo(Float value) {
            addCriterion("avgtemp <=", value, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempIn(List<Float> values) {
            addCriterion("avgtemp in", values, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempNotIn(List<Float> values) {
            addCriterion("avgtemp not in", values, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempBetween(Float value1, Float value2) {
            addCriterion("avgtemp between", value1, value2, "avgtemp");
            return (Criteria) this;
        }

        public Criteria andAvgtempNotBetween(Float value1, Float value2) {
            addCriterion("avgtemp not between", value1, value2, "avgtemp");
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