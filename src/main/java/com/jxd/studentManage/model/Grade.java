package com.jxd.studentManage.model;

/**
 * @ClassName Grade
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Grade {
    private int gradeId;
    private int grade;
    private int courseId;
    private int studentId;

    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Grade(int gradeId, int grade, int courseId, int studentId) {
        this.gradeId = gradeId;
        this.grade = grade;
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public Grade() {
    }
}
