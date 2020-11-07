package com.jxd.studentManage.service.impl;

import com.jxd.studentManage.mapper.IMarkMapper;
import com.jxd.studentManage.model.Mark;
import com.jxd.studentManage.service.IMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MarkServiceImpl implements IMarkService {
    @Autowired
    IMarkMapper markMapper;

    @Override
    public List<Mark> getAllMark() {
        return markMapper.getAllMark();
    }

    @Override
    public boolean addMark(String markname, String status) {
        return markMapper.addMark(markname, status);
    }

    @Override
    public boolean editMark(int markid, String markname, String status) {
        return markMapper.editMark(markid, markname, status);
    }

    @Override
    public List<Mark> selectAllMark(String markname) {
        return markMapper.selectAllMark(markname);
    }

    @Override
    public List<Mark> getMarkName() {
        return markMapper.getMarkName();
    }
}
