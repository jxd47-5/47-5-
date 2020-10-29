package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Duty
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Duty {
    @TableId
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


}
