package com.hfut.entity;

public class LNetWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.id
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.teacher
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String teacher;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.years
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private Integer years;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_net.lesson
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    private String lesson;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.id
     *
     * @return the value of local_net.id
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.id
     *
     * @param id the value for local_net.id
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.teacher
     *
     * @return the value of local_net.teacher
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.teacher
     *
     * @param teacher the value for local_net.teacher
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.years
     *
     * @return the value of local_net.years
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public Integer getYears() {
        return years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.years
     *
     * @param years the value for local_net.years
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setYears(Integer years) {
        this.years = years;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_net.lesson
     *
     * @return the value of local_net.lesson
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public String getLesson() {
        return lesson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_net.lesson
     *
     * @param lesson the value for local_net.lesson
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    public void setLesson(String lesson) {
        this.lesson = lesson == null ? null : lesson.trim();
    }
}