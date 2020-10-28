package com.jxd.studentManage.model;

/**
 * @ClassName Duty
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Duty {
    private int dutyId;
    private String dutyName;
    private int departmentId;

    public int getDutyId() {
        return dutyId;
    }

    public void setDutyId(int dutyId) {
        this.dutyId = dutyId;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Duty(int dutyId, String dutyName, int departmentId) {
        this.dutyId = dutyId;
        this.dutyName = dutyName;
        this.departmentId = departmentId;
    }

    public Duty() {
    }
}
