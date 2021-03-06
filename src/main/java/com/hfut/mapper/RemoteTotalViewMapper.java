package com.hfut.mapper;

import com.hfut.entity.RemoteTotalView;
import com.hfut.entity.RemoteTotalViewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemoteTotalViewMapper {
    int countByExample(RemoteTotalViewExample example);

    int deleteByExample(RemoteTotalViewExample example);

    int insert(RemoteTotalView record);

    int insertSelective(RemoteTotalView record);

    List<RemoteTotalView> selectByExample(RemoteTotalViewExample example);

    int updateByExampleSelective(@Param("record") RemoteTotalView record, @Param("example") RemoteTotalViewExample example);

    int updateByExample(@Param("record") RemoteTotalView record, @Param("example") RemoteTotalViewExample example);
}