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
public class Hospital {
    String hospitalUUID, hospitalID, hospitalName, hospitalAddress, hospitalCity, hospitalPincode, hospitalCommunity, adminusername, adminpassword;
    ArrayList<Doctor> workingdoctorsArrayList = new ArrayList<>();
    ArrayList<Patient> enrolledPatientsArrayList = new ArrayList<>();
    

    public String getAdminusername() {
        return adminusername;
    }

    public void setAdminusername(String adminusername) {
        this.adminusername = adminusername;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    public ArrayList<Doctor> getWorkingdoctorsArrayList() {
        return workingdoctorsArrayList;
    }

    public void setWorkingdoctorsArrayList(ArrayList<Doctor> workingdoctorsArrayList) {
        this.workingdoctorsArrayList = workingdoctorsArrayList;
    }

    public ArrayList<Patient> getEnrolledPatientsArrayList() {
        return enrolledPatientsArrayList;
    }

    public void setEnrolledPatientsArrayList(ArrayList<Patient> enrolledPatientsArrayList) {
        this.enrolledPatientsArrayList = enrolledPatientsArrayList;
    }
    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalUUID() {
        return hospitalUUID;
    }

    public void setHospitalUUID(String hospitalUUID) {
        this.hospitalUUID = hospitalUUID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    public void setHospitalName(HospitalDirectory hospitalDirectory, String hospitalName) {
        this.hospitalName = hospitalName;
    }
    public String getHospitalAddress() {
        return hospitalAddress;
    }

    public void setHospitalAddress(String hospitalAddress) {
        this.hospitalAddress = hospitalAddress;
    }

    public String getHospitalCity() {
        return hospitalCity;
    }

    public void setHospitalCity(String hospitalCity) {
        this.hospitalCity = hospitalCity;
    }
    
    public void setHospitalCity(City city, String cityName) {
        this.hospitalCity = hospitalCity;
    }
    
    public String getHospitalPincode() {
        return hospitalPincode;
    }

    public void setHospitalPincode(String hospitalPincode) {
        this.hospitalPincode = hospitalPincode;
    }

    public String getHospitalCommunity() {
        return hospitalCommunity;
    }
    public void setHospitalCommunity(Community hospitalcommunity, String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }
    public void setHospitalCommunity(String hospitalCommunity) {
        this.hospitalCommunity = hospitalCommunity;
    }
    
}
