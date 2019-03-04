
package com.zo0okadev.demologin.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("birth_date")
    @Expose
    private String birthDate;
    @SerializedName("age_at_october_day")
    @Expose
    private String ageAtOctoberDay;
    @SerializedName("age_at_october_month")
    @Expose
    private String ageAtOctoberMonth;
    @SerializedName("age_at_october_year")
    @Expose
    private String ageAtOctoberYear;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("stage")
    @Expose
    private String stage;
    @SerializedName("division")
    @Expose
    private String division;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("religion")
    @Expose
    private String religion;
    @SerializedName("father_job")
    @Expose
    private String fatherJob;
    @SerializedName("mother_job")
    @Expose
    private String motherJob;
    @SerializedName("father_mobile")
    @Expose
    private String fatherMobile;
    @SerializedName("mother_mobile")
    @Expose
    private String motherMobile;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("flage")
    @Expose
    private boolean flage;
    @SerializedName("addDate")
    @Expose
    private String addDate;
    @SerializedName("AR_Lang")
    @Expose
    private String aRLang;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("mother_name")
    @Expose
    private String motherName;
    @SerializedName("class_id")
    @Expose
    private int classId;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("second_name")
    @Expose
    private String secondName;
    @SerializedName("third_name")
    @Expose
    private String thirdName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("stage_id")
    @Expose
    private int stageId;
    @SerializedName("division_id")
    @Expose
    private int divisionId;
    @SerializedName("ssi")
    @Expose
    private String ssi;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("user_id")
    @Expose
    private int userId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("school")
    @Expose
    private String school;
    @SerializedName("ssi_student")
    @Expose
    private String ssiStudent;
    @SerializedName("education_year")
    @Expose
    private String educationYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAgeAtOctoberDay() {
        return ageAtOctoberDay;
    }

    public void setAgeAtOctoberDay(String ageAtOctoberDay) {
        this.ageAtOctoberDay = ageAtOctoberDay;
    }

    public String getAgeAtOctoberMonth() {
        return ageAtOctoberMonth;
    }

    public void setAgeAtOctoberMonth(String ageAtOctoberMonth) {
        this.ageAtOctoberMonth = ageAtOctoberMonth;
    }

    public String getAgeAtOctoberYear() {
        return ageAtOctoberYear;
    }

    public void setAgeAtOctoberYear(String ageAtOctoberYear) {
        this.ageAtOctoberYear = ageAtOctoberYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getFatherJob() {
        return fatherJob;
    }

    public void setFatherJob(String fatherJob) {
        this.fatherJob = fatherJob;
    }

    public String getMotherJob() {
        return motherJob;
    }

    public void setMotherJob(String motherJob) {
        this.motherJob = motherJob;
    }

    public String getFatherMobile() {
        return fatherMobile;
    }

    public void setFatherMobile(String fatherMobile) {
        this.fatherMobile = fatherMobile;
    }

    public String getMotherMobile() {
        return motherMobile;
    }

    public void setMotherMobile(String motherMobile) {
        this.motherMobile = motherMobile;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isFlage() {
        return flage;
    }

    public void setFlage(boolean flage) {
        this.flage = flage;
    }

    public String getAddDate() {
        return addDate;
    }

    public void setAddDate(String addDate) {
        this.addDate = addDate;
    }

    public String getARLang() {
        return aRLang;
    }

    public void setARLang(String aRLang) {
        this.aRLang = aRLang;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStageId() {
        return stageId;
    }

    public void setStageId(int stageId) {
        this.stageId = stageId;
    }

    public int getDivisionId() {
        return divisionId;
    }

    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    public String getSsi() {
        return ssi;
    }

    public void setSsi(String ssi) {
        this.ssi = ssi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSsiStudent() {
        return ssiStudent;
    }

    public void setSsiStudent(String ssiStudent) {
        this.ssiStudent = ssiStudent;
    }

    public String getEducationYear() {
        return educationYear;
    }

    public void setEducationYear(String educationYear) {
        this.educationYear = educationYear;
    }

}
