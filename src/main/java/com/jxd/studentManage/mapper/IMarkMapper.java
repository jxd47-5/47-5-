package com.jxd.studentManage.mapper;

import com.jxd.studentManage.model.Course;
import com.jxd.studentManage.model.Mark;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IMarkMapper {
    List<Mark> getAllMark();

    boolean addMark(@Param("markname") String markname, @Param("status") String status);

    boolean editMark(@Param("markid") int markid, @Param("markname") String markname, @Param("status") String status);

    List<Mark> selectAllMark(@Param("markname") String markname);

    List<Mark> getMarkName();
}
