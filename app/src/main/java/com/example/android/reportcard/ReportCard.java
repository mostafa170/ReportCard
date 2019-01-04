package com.example.android.reportcard;

/**
 * Created by mostafa on 11/07/2017.
 */

public class ReportCard {
    private int employeeID;
    private String employeeName;
    private String employeePhone;
    private int employeeAge;
    private String employeeSection;

    public ReportCard(int employeeID, String employeeName, String employeePhone, int employeeAge, String employeeSection) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.employeePhone = employeePhone;
        this.employeeSection = employeeSection;
        this.employeeAge = employeeAge;
    }
    public int getemployeeID() {
        return employeeID;
    }

    public void setSemployeeID(int id) {
        employeeID = id;
    }

    public String getemployeeName() {
        return employeeName;
    }

    public void setemployeeName(String name) {
        employeeName = name;
    }

    public String geemployeePhone() {
        return employeePhone;
    }

    public void setemployeePhone(String phone) {
        this.employeePhone = phone;
    }

    public int getemployeeAge() {
        return employeeAge;
    }

    public void setemployeeAge(int age) {
        this.employeeAge = age;
    }

    public String getemployeeSection() {
        return employeeSection;
    }

    public void setemployeeSection(String Section) {
        this.employeeSection = Section;
    }
    @Override
    public String toString() {
        return "information employee :-" + '\n' +
                "employeeID : " + employeeID + '\n' +
                ", employeeName : '" + employeeName + '\n' +
                ", employeePhone : '" + employeePhone + '\n' +
                ", employeeAge : " + employeeAge + '\n' +
                ", employeeSection : '" + employeeSection + '\n'
                ;
    }
}
