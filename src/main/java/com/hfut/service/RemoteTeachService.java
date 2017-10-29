package com.hfut.service;

import com.hfut.entity.RemoteTeachWorkload;

import java.util.List;

public interface RemoteTeachService {

    List<RemoteTeachWorkload> insertLoadByList(List<RemoteTeachWorkload> workloads) throws Exception;

    boolean insertLoad(RemoteTeachWorkload workload) throws Exception;

    List<RemoteTeachWorkload> findAllLoad(int offset, int limit) throws Exception;

    List<RemoteTeachWorkload> findLoadByTeacher(String teacher) throws Exception;

    List<RemoteTeachWorkload> findLoadByTeacher(int teacher) throws Exception;

    List<RemoteTeachWorkload> findLoadByYear(int years, int offset, int limit) throws Exception;

    List<RemoteTeachWorkload> findLoadByCollege(String college, int offset, int limit) throws Exception;

    List<RemoteTeachWorkload> updateLoadByList(List<RemoteTeachWorkload> workloads) throws Exception;

    boolean updateLoad(RemoteTeachWorkload workload) throws Exception;

    boolean removeLoad(int id) throws Exception;

    int getCount() throws Exception;

}
