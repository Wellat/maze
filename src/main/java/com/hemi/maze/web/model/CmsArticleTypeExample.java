package com.hemi.maze.web.model;

import java.util.ArrayList;
import java.util.List;

public class CmsArticleTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmsArticleTypeExample() {
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

        public Criteria andTyidIsNull() {
            addCriterion("tyid is null");
            return (Criteria) this;
        }

        public Criteria andTyidIsNotNull() {
            addCriterion("tyid is not null");
            return (Criteria) this;
        }

        public Criteria andTyidEqualTo(Integer value) {
            addCriterion("tyid =", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidNotEqualTo(Integer value) {
            addCriterion("tyid <>", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidGreaterThan(Integer value) {
            addCriterion("tyid >", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tyid >=", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidLessThan(Integer value) {
            addCriterion("tyid <", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidLessThanOrEqualTo(Integer value) {
            addCriterion("tyid <=", value, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidIn(List<Integer> values) {
            addCriterion("tyid in", values, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidNotIn(List<Integer> values) {
            addCriterion("tyid not in", values, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidBetween(Integer value1, Integer value2) {
            addCriterion("tyid between", value1, value2, "tyid");
            return (Criteria) this;
        }

        public Criteria andTyidNotBetween(Integer value1, Integer value2) {
            addCriterion("tyid not between", value1, value2, "tyid");
            return (Criteria) this;
        }

        public Criteria andTynameIsNull() {
            addCriterion("tyname is null");
            return (Criteria) this;
        }

        public Criteria andTynameIsNotNull() {
            addCriterion("tyname is not null");
            return (Criteria) this;
        }

        public Criteria andTynameEqualTo(String value) {
            addCriterion("tyname =", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameNotEqualTo(String value) {
            addCriterion("tyname <>", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameGreaterThan(String value) {
            addCriterion("tyname >", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameGreaterThanOrEqualTo(String value) {
            addCriterion("tyname >=", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameLessThan(String value) {
            addCriterion("tyname <", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameLessThanOrEqualTo(String value) {
            addCriterion("tyname <=", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameLike(String value) {
            addCriterion("tyname like", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameNotLike(String value) {
            addCriterion("tyname not like", value, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameIn(List<String> values) {
            addCriterion("tyname in", values, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameNotIn(List<String> values) {
            addCriterion("tyname not in", values, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameBetween(String value1, String value2) {
            addCriterion("tyname between", value1, value2, "tyname");
            return (Criteria) this;
        }

        public Criteria andTynameNotBetween(String value1, String value2) {
            addCriterion("tyname not between", value1, value2, "tyname");
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