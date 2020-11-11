package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Class
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Class {
    @TableId("classid")
    private int classId;
    @TableField("classname")
    private String className;
    private int teacherId;

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

}
