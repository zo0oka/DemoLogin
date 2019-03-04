
package com.zo0okadev.demologin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pass")
    @Expose
    private String pass;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("del")
    @Expose
    private boolean del;
    @SerializedName("education_year")
    @Expose
    private String educationYear;
    @SerializedName("emp_id")
    @Expose
    private Object empId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isDel() {
        return del;
    }

    public void setDel(boolean del) {
        this.del = del;
    }

    public String getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(String educationYear) {
        this.educationYear = educationYear;
    }

    public Object getEmpId() {
        return empId;
    }

    public void setEmpId(Object empId) {
        this.empId = empId;
    }

}
