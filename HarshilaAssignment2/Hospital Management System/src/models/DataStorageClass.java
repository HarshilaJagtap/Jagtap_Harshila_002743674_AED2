/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Hospital;
import entities.Person;
import entities.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author HarshilaJagtap
 */
public class DataStorageClass {
public static ArrayList<Hospital> hospital_Screen_HospitalArrayList = new ArrayList<>();
public static ArrayList<Person> person_registration_ArrayList = new ArrayList<>();
public static ArrayList<User> userArrayList = new ArrayList<>();
public static String USERROLE = "";
public static String USERID = "";
public static String DOCTOR_HOSPITALID = "";

public static String generateUUID() {
return UUID.randomUUID().toString();
}

}
