package com.jxd.studentManage.model;

/**
 * @ClassName Student
 * @Description TODO
 * @Author zhantao
 * @Date 2020/10/27
 * @Version 1.0
 */
public class Student {
    private int studentId;
    private String studentName;
    private String sex;
    private String nation;
    private String birthday;
    private String address;
    private String isMarried;
    private String tel;
    private String school;
    private String major;
    private String remark;
    private String photo;
    private int isDelete;
    private int classId;
    private int departmentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIsMarried() {
        return isMarried;
    }

    public void setIsMarried(String isMarried) {
        this.isMarried = isMarried;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public Student(int studentId, String studentName, String sex, String nation, String birthday, String address, String isMarried, String tel, String school, String major, String remark, String photo, int isDelete, int classId, int departmentId) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.nation = nation;
        this.birthday = birthday;
        this.address = address;
        this.isMarried = isMarried;
        this.tel = tel;
        this.school = school;
        this.major = major;
        this.remark = remark;
        this.photo = photo;
        this.isDelete = isDelete;
        this.classId = classId;
        this.departmentId = departmentId;
    }

    public Student() {
    }
}
