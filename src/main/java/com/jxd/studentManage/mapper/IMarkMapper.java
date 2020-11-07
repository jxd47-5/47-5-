package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Course;
import com.jxd.studentManage.model.Mark;

import java.util.List;

public interface IMarkMapper {
    List<Mark> getAllMark();

    boolean addMark(String markname, String status);

    boolean editMark(int markid, String markname, String status);

    List<Mark> selectAllMark(String markname);

    List<Mark> getMarkName();
}
