package com.hfut.mapper;

import com.hfut.entity.RemoteGraduateWorkload;
import com.hfut.entity.RemoteGraduateWorkloadExample;
import com.hfut.entity.RemoteGraduateWorkloadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoteGraduateWorkloadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int countByExample(RemoteGraduateWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int deleteByExample(RemoteGraduateWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int deleteByPrimaryKey(RemoteGraduateWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int insert(RemoteGraduateWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int insertSelective(RemoteGraduateWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    List<RemoteGraduateWorkload> selectByExample(RemoteGraduateWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    RemoteGraduateWorkload selectByPrimaryKey(RemoteGraduateWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") RemoteGraduateWorkload record, @Param("example") RemoteGraduateWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int updateByExample(@Param("record") RemoteGraduateWorkload record, @Param("example") RemoteGraduateWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int updateByPrimaryKeySelective(RemoteGraduateWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table remote_graduate
     *
     * @mbggenerated Thu Oct 26 20:03:52 CST 2017
     */
    int updateByPrimaryKey(RemoteGraduateWorkload record);
}