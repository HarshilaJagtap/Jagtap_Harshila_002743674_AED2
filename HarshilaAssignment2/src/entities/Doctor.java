/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author hashila
 */
public class Doctor {
    String hospitalUUID, hospitalId, hospitalName, doctorUUID, doctorId, doctorName, doctorPhone, departmentName, password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoctorUUID() {
        return doctorUUID;
    }

    public String getHospitalUUID() {
        return hospitalUUID;
    }

    public void setHospitalUUID(String hospitalUUID) {
        this.hospitalUUID = hospitalUUID;
    }

    public void setDoctorUUID(String doctorUUID) {
        this.doctorUUID = doctorUUID;
    }
    ArrayList<Patient> assignedPatients = new ArrayList<>();

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }
    
    public void setDoctorName (DoctorDirectory doctordirectory, String doctorName) {
        this.doctorName = doctorName;  
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(String doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Patient> getAssignedPatients() {
        return assignedPatients;
    }

    public void setAssignedPatients(ArrayList<Patient> assignedPatients) {
        this.assignedPatients = assignedPatients;
    }
}
