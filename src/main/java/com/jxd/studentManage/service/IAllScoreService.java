package com.jxd.studentManage.service;

import com.jxd.studentManage.model.Class;

import java.util.List;
import java.util.Map;

public interface IAllScoreService {
    List<Class> getAllClass();
    List<Map<String,Object>> getStudentByClassId(int classId);
}
