package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Jobevaluation
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Jobevaluation {
    @TableId
    private int jid;
    private String evaluater;
    private String evaluation;
    private int score;
    private String departmentName;
    private int depatrtmentId;
    private String dutyName;
    private int dutyId;

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
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

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getDepatrtmentId() {
        return depatrtmentId;
    }

    public void setDepatrtmentId(int depatrtmentId) {
        this.depatrtmentId = depatrtmentId;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }


}
