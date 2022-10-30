/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author HarshilaJagtap
 */
public class Patient {
    String patientUUID, patientId, patientName, patientPhone, patientAddress, patientPincode, hospitalUUID, patientHospitalID, patientHospitalName, patientDepartment, doctorUUID, doctorId, doctorName, password;
    ArrayList<Encounter> encountersArraylist = new ArrayList<>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }


    public String getHospitalUUID() {
        return hospitalUUID;
    }

    public void setHospitalUUID(String hospitalUUID) {
        this.hospitalUUID = hospitalUUID;
    }

    public String getDoctorUUID() {
        return doctorUUID;
    }

    public void setDoctorUUID(String doctorUUID) {
        this.doctorUUID = doctorUUID;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getPatientUUID() {
        return patientUUID;
    }

    public void setPatientUUID(String patientUUID) {
        this.patientUUID = patientUUID;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(String patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientAddress() {
        return patientAddress;
    }

    public void setPatientAddress(String patientAddress) {
        this.patientAddress = patientAddress;
    }

    public String getPatientPincode() {
        return patientPincode;
    }

    public void setPatientPincode(String patientPincode) {
        this.patientPincode = patientPincode;
    }

    public String getPatientHospitalID() {
        return patientHospitalID;
    }

    public void setPatientHospitalID(String patientHospitalID) {
        this.patientHospitalID = patientHospitalID;
    }

    public String getPatientHospitalName() {
        return patientHospitalName;
    }

    public void setPatientHospitalName(String patientHospitalName) {
        this.patientHospitalName = patientHospitalName;
    }

    public String getPatientDepartment() {
        return patientDepartment;
    }

    public void setPatientDepartment(String patientDepartment) {
        this.patientDepartment = patientDepartment;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getdoctorName() {
        return doctorName;
    }

    public void setdoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public ArrayList<Encounter> getEncountersArraylist() {
        return encountersArraylist;
    }

    public void setEncountersArraylist(ArrayList<Encounter> encountersArraylist) {
        this.encountersArraylist = encountersArraylist;
    }
}
