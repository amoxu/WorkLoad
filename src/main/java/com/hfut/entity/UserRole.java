package com.hfut.entity;

public class UserRole {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.level_id
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    private Integer levelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_role.name
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.level_id
     *
     * @return the value of user_role.level_id
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    public Integer getLevelId() {
        return levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.level_id
     *
     * @param levelId the value for user_role.level_id
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_role.name
     *
     * @return the value of user_role.name
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_role.name
     *
     * @param name the value for user_role.name
     *
     * @mbggenerated Thu Oct 26 09:44:31 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}