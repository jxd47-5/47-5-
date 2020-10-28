package com.jxd.studentManage.model;

/**
 * @ClassName Manager
 * @Description TODO
 * @Author Xujiashuai
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Manager {
    private int managerId;
    private String managerName;
    private int departmentId;

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Manager(int managerId, String managerName, int departmentId) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.departmentId = departmentId;
    }

    public Manager() {
    }
}
