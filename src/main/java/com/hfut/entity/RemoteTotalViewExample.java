package com.hfut.entity;

import java.util.ArrayList;
import java.util.List;

public class RemoteTotalViewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public RemoteTotalViewExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTeacherIsNull() {
            addCriterion("teacher is null");
            return (Criteria) this;
        }

        public Criteria andTeacherIsNotNull() {
            addCriterion("teacher is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherEqualTo(String value) {
            addCriterion("teacher =", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotEqualTo(String value) {
            addCriterion("teacher <>", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThan(String value) {
            addCriterion("teacher >", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherGreaterThanOrEqualTo(String value) {
            addCriterion("teacher >=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThan(String value) {
            addCriterion("teacher <", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLessThanOrEqualTo(String value) {
            addCriterion("teacher <=", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherLike(String value) {
            addCriterion("teacher like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotLike(String value) {
            addCriterion("teacher not like", value, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherIn(List<String> values) {
            addCriterion("teacher in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotIn(List<String> values) {
            addCriterion("teacher not in", values, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherBetween(String value1, String value2) {
            addCriterion("teacher between", value1, value2, "teacher");
            return (Criteria) this;
        }

        public Criteria andTeacherNotBetween(String value1, String value2) {
            addCriterion("teacher not between", value1, value2, "teacher");
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

        public Criteria andCollegeIsNull() {
            addCriterion("college is null");
            return (Criteria) this;
        }

        public Criteria andCollegeIsNotNull() {
            addCriterion("college is not null");
            return (Criteria) this;
        }

        public Criteria andCollegeEqualTo(String value) {
            addCriterion("college =", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotEqualTo(String value) {
            addCriterion("college <>", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThan(String value) {
            addCriterion("college >", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeGreaterThanOrEqualTo(String value) {
            addCriterion("college >=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThan(String value) {
            addCriterion("college <", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLessThanOrEqualTo(String value) {
            addCriterion("college <=", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeLike(String value) {
            addCriterion("college like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotLike(String value) {
            addCriterion("college not like", value, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeIn(List<String> values) {
            addCriterion("college in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotIn(List<String> values) {
            addCriterion("college not in", values, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeBetween(String value1, String value2) {
            addCriterion("college between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCollegeNotBetween(String value1, String value2) {
            addCriterion("college not between", value1, value2, "college");
            return (Criteria) this;
        }

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(Double value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(Double value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(Double value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(Double value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(Double value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(Double value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<Double> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<Double> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(Double value1, Double value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(Double value1, Double value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andDesignIsNull() {
            addCriterion("design is null");
            return (Criteria) this;
        }

        public Criteria andDesignIsNotNull() {
            addCriterion("design is not null");
            return (Criteria) this;
        }

        public Criteria andDesignEqualTo(Double value) {
            addCriterion("design =", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotEqualTo(Double value) {
            addCriterion("design <>", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThan(Double value) {
            addCriterion("design >", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignGreaterThanOrEqualTo(Double value) {
            addCriterion("design >=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThan(Double value) {
            addCriterion("design <", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignLessThanOrEqualTo(Double value) {
            addCriterion("design <=", value, "design");
            return (Criteria) this;
        }

        public Criteria andDesignIn(List<Double> values) {
            addCriterion("design in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotIn(List<Double> values) {
            addCriterion("design not in", values, "design");
            return (Criteria) this;
        }

        public Criteria andDesignBetween(Double value1, Double value2) {
            addCriterion("design between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andDesignNotBetween(Double value1, Double value2) {
            addCriterion("design not between", value1, value2, "design");
            return (Criteria) this;
        }

        public Criteria andExprimentIsNull() {
            addCriterion("expriment is null");
            return (Criteria) this;
        }

        public Criteria andExprimentIsNotNull() {
            addCriterion("expriment is not null");
            return (Criteria) this;
        }

        public Criteria andExprimentEqualTo(Double value) {
            addCriterion("expriment =", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentNotEqualTo(Double value) {
            addCriterion("expriment <>", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentGreaterThan(Double value) {
            addCriterion("expriment >", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentGreaterThanOrEqualTo(Double value) {
            addCriterion("expriment >=", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentLessThan(Double value) {
            addCriterion("expriment <", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentLessThanOrEqualTo(Double value) {
            addCriterion("expriment <=", value, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentIn(List<Double> values) {
            addCriterion("expriment in", values, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentNotIn(List<Double> values) {
            addCriterion("expriment not in", values, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentBetween(Double value1, Double value2) {
            addCriterion("expriment between", value1, value2, "expriment");
            return (Criteria) this;
        }

        public Criteria andExprimentNotBetween(Double value1, Double value2) {
            addCriterion("expriment not between", value1, value2, "expriment");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNull() {
            addCriterion("graduate is null");
            return (Criteria) this;
        }

        public Criteria andGraduateIsNotNull() {
            addCriterion("graduate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduateEqualTo(Double value) {
            addCriterion("graduate =", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotEqualTo(Double value) {
            addCriterion("graduate <>", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThan(Double value) {
            addCriterion("graduate >", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateGreaterThanOrEqualTo(Double value) {
            addCriterion("graduate >=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThan(Double value) {
            addCriterion("graduate <", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateLessThanOrEqualTo(Double value) {
            addCriterion("graduate <=", value, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateIn(List<Double> values) {
            addCriterion("graduate in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotIn(List<Double> values) {
            addCriterion("graduate not in", values, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateBetween(Double value1, Double value2) {
            addCriterion("graduate between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andGraduateNotBetween(Double value1, Double value2) {
            addCriterion("graduate not between", value1, value2, "graduate");
            return (Criteria) this;
        }

        public Criteria andNonLessonIsNull() {
            addCriterion("non_lesson is null");
            return (Criteria) this;
        }

        public Criteria andNonLessonIsNotNull() {
            addCriterion("non_lesson is not null");
            return (Criteria) this;
        }

        public Criteria andNonLessonEqualTo(Double value) {
            addCriterion("non_lesson =", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonNotEqualTo(Double value) {
            addCriterion("non_lesson <>", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonGreaterThan(Double value) {
            addCriterion("non_lesson >", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonGreaterThanOrEqualTo(Double value) {
            addCriterion("non_lesson >=", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonLessThan(Double value) {
            addCriterion("non_lesson <", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonLessThanOrEqualTo(Double value) {
            addCriterion("non_lesson <=", value, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonIn(List<Double> values) {
            addCriterion("non_lesson in", values, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonNotIn(List<Double> values) {
            addCriterion("non_lesson not in", values, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonBetween(Double value1, Double value2) {
            addCriterion("non_lesson between", value1, value2, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andNonLessonNotBetween(Double value1, Double value2) {
            addCriterion("non_lesson not between", value1, value2, "nonLesson");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
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