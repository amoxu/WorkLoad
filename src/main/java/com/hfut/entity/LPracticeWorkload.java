package com.hfut.entity;

public class LPracticeWorkload extends LPracticeWorkloadKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.type
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.people
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private Integer people;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.class_number
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private Integer classNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.weeks
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private Integer weeks;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.place
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private String place;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.workload
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private Float workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column local_practice.note
     *
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.type
     *
     * @return the value of local_practice.type
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.type
     *
     * @param type the value for local_practice.type
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.people
     *
     * @return the value of local_practice.people
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public Integer getPeople() {
        return people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.people
     *
     * @param people the value for local_practice.people
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setPeople(Integer people) {
        this.people = people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.class_number
     *
     * @return the value of local_practice.class_number
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public Integer getClassNumber() {
        return classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.class_number
     *
     * @param classNumber the value for local_practice.class_number
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.weeks
     *
     * @return the value of local_practice.weeks
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public Integer getWeeks() {
        return weeks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.weeks
     *
     * @param weeks the value for local_practice.weeks
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setWeeks(Integer weeks) {
        this.weeks = weeks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.place
     *
     * @return the value of local_practice.place
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public String getPlace() {
        return place;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.place
     *
     * @param place the value for local_practice.place
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.workload
     *
     * @return the value of local_practice.workload
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public Float getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.workload
     *
     * @param workload the value for local_practice.workload
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setWorkload(Float workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column local_practice.note
     *
     * @return the value of local_practice.note
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column local_practice.note
     *
     * @param note the value for local_practice.note
     * @mbggenerated Sat Oct 28 20:32:23 CST 2017
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}