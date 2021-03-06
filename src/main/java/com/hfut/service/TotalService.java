package com.hfut.service;

import com.hfut.entity.Total;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface TotalService {

    Integer LOCAL = 1;
    Integer REMOTE = 2;

    List getRemoteTotal(Integer years);


    List getLocalTotal(Integer years);

    List getTotalByName(Integer years, String teacher, String college, Integer local);


    String download(HttpServletRequest request, Integer years, String teacher,String college, Integer local) throws Exception;

    Double getTotalByNameYear(String teacher, Integer year);

    List<Total> getTotalByYear(Integer year);
}
