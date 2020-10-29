package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Course
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Course {
    @TableId
    private int courseId;
    private String courseName;
    private String status;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
