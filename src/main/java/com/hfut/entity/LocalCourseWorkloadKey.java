package com.hfut.entity;

public class LocalCourseWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_course.id
     *
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_course.teacher
     *
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    private String teacher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_course.lesson
     *
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    private String lesson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_course.years
     *
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    private Integer years;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_course.teach_class
     *
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    private Integer teachClass;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_course.id
     *
     * @return the value of local_course.id
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_course.id
     *
     * @param id the value for local_course.id
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_course.teacher
     *
     * @return the value of local_course.teacher
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_course.teacher
     *
     * @param teacher the value for local_course.teacher
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_course.lesson
     *
     * @return the value of local_course.lesson
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public String getLesson() {
        return lesson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_course.lesson
     *
     * @param lesson the value for local_course.lesson
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public void setLesson(String lesson) {
        this.lesson = lesson == null ? null : lesson.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_course.years
     *
     * @return the value of local_course.years
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public Integer getYears() {
        return years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_course.years
     *
     * @param years the value for local_course.years
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_course.teach_class
     *
     * @return the value of local_course.teach_class
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public Integer getTeachClass() {
        return teachClass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_course.teach_class
     *
     * @param teachClass the value for local_course.teach_class
     * @mbggenerated Fri Oct 27 13:31:00 CST 2017
     */
    public void setTeachClass(Integer teachClass) {
        this.teachClass = teachClass;
    }
}