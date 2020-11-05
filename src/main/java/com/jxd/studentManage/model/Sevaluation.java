package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Sevaluation
 * @Description TODO
 * @Author zhantao
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Sevaluation {
    @TableId
    private int sid;
    private String evaluater;
    private String evaluation;
    private int score;
    private int studentId;
    private int classId;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getEvaluater() {
        return evaluater;
    }

    public void setEvaluater(String evaluater) {
        this.evaluater = evaluater;
    }

    public String getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }


}
