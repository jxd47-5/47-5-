package com.jxd.studentManage.model;

/**
 * @ClassName Performence
 * @Description TODO
 * @Author zhantao
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Performence {
    private int pid;
    private int score;
    private int markId;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }

    public Performence(int pid, int score, int markId) {
        this.pid = pid;
        this.score = score;
        this.markId = markId;
    }

    public Performence() {
    }
}
