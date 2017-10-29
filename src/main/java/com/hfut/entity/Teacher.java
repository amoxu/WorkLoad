package com.hfut.entity;

public class Teacher {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.name
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.password
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.college
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private String college;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.type
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.teacher_id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher.role
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    private Integer role;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.id
     *
     * @return the value of teacher.id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.id
     *
     * @param id the value for teacher.id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.name
     *
     * @return the value of teacher.name
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.name
     *
     * @param name the value for teacher.name
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.password
     *
     * @return the value of teacher.password
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.password
     *
     * @param password the value for teacher.password
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.college
     *
     * @return the value of teacher.college
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public String getCollege() {
        return college;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.college
     *
     * @param college the value for teacher.college
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setCollege(String college) {
        this.college = college == null ? null : college.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.type
     *
     * @return the value of teacher.type
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.type
     *
     * @param type the value for teacher.type
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.teacher_id
     *
     * @return the value of teacher.teacher_id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.teacher_id
     *
     * @param teacherId the value for teacher.teacher_id
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher.role
     *
     * @return the value of teacher.role
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public Integer getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher.role
     *
     * @param role the value for teacher.role
     *
     * @mbggenerated Sat Oct 21 14:11:04 CST 2017
     */
    public void setRole(Integer role) {
        this.role = role;
    }
}