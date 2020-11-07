package com.jxd.studentManage.service;

import com.jxd.studentManage.model.Mark;

import java.util.List;

public interface IMarkService {
    List<Mark> getAllMark();

    boolean addMark(String markname, String status);

    boolean editMark(int markid, String markname, String status);

    List<Mark> selectAllMark(String markname);

    List<Mark> getMarkName();
}
