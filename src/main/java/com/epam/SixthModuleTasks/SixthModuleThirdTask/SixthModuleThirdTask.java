package com.epam.SixthModuleTasks.SixthModuleThirdTask;

import java.util.ArrayList;
import java.util.List;

public class SixthModuleThirdTask {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();                  //no coments
//        Doctor doctor2 = new MedicalStaff();          MedicalStaff is not object of Doctor class
        Doctor doctor3 = new HeadDoctor();              // HeadDoctor is object of Doctor class
        Object object1 = new HeadDoctor();              // Every object is object of Object class
//        HeadDoctor doctor5 = new Object();            Object can't be object of any class except Object class
//        Doctor doctor6 = new Nurse();                 // Nurse is not object of Doctor class
//        Nurse nurse = new Doctor();                   // The same with Doctor - Nurse
        Object object2 = new Nurse();
        List<Doctor> list1= new ArrayList<Doctor>();    // you can only initialize new ArrayList with the same Class Objects
        list1.add(new HeadDoctor());                    // but you can add into list objects which extends parent-class
//        List<MedicalStaff> list2 = new ArrayList<Doctor>();
//        List<Doctor> list3 = new ArrayList<MedicalStaff>();
//        List<Object> list4 = new ArrayList<Doctor>();
        List<Object> list5 = new ArrayList<Object>();   // you can add into this list objects of all classes,
                                                        // because all of them extends Object
    }
}
class MedicalStaff{}
class Doctor extends MedicalStaff{}
class Nurse extends MedicalStaff{}
class HeadDoctor extends Doctor{}
