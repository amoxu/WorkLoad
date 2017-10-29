package com.hfut.mapper;

import com.hfut.entity.LMatchWorkload;
import com.hfut.entity.LMatchWorkloadExample;
import com.hfut.entity.LMatchWorkloadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LMatchWorkloadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int countByExample(LMatchWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int deleteByExample(LMatchWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int deleteByPrimaryKey(LMatchWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int insert(LMatchWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int insertSelective(LMatchWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    List<LMatchWorkload> selectByExample(LMatchWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    LMatchWorkload selectByPrimaryKey(LMatchWorkloadKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int updateByExampleSelective(@Param("record") LMatchWorkload record, @Param("example") LMatchWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int updateByExample(@Param("record") LMatchWorkload record, @Param("example") LMatchWorkloadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int updateByPrimaryKeySelective(LMatchWorkload record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table local_match
     *
     * @mbggenerated Sat Oct 28 13:53:52 CST 2017
     */
    int updateByPrimaryKey(LMatchWorkload record);
}