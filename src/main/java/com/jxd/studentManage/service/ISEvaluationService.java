package com.jxd.studentManage.service;

import java.util.List;
import java.util.Map;

public interface ISEvaluationService {
    List<Map<String,Object>> getSEvaluation (int studentid);
}
