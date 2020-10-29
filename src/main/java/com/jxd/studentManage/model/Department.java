package com.jxd.studentManage.model;

import com.baomidou.mybatisplus.annotation.TableId;

/**
 * @ClassName Department
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Department {
    @TableId
    private int departmengid;
    private String departmentName;
    private String status;

    public int getDepartmengid() {
        return departmengid;
    }

    public void setDepartmengid(int departmengid) {
        this.departmengid = departmengid;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
