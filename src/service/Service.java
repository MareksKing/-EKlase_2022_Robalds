package service;

import java.util.ArrayList;

import javax.swing.text.DefaultStyledDocument.ElementSpec;

import models.Child;
import models.Employee;
import models.Person;
import models.SpeachTherapist;
import models.Teacher;
import models.TeachingLevel;
import models.Group;
import models.Nationality;

public class Service {
    private static ArrayList<Employee> allEmployees = new ArrayList<>();
    private static ArrayList<Group> allGroups = new ArrayList<>();
    private static ArrayList<Teacher> allTeachers = new ArrayList<>();
    private static ArrayList<Child> allChilds = new ArrayList<>();
    private static ArrayList<SpeachTherapist> allSpeachTherapists = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Teacher mareks = new Teacher("Mareks", "Robalds", "050600-22504", 2023, 4, 23, TeachingLevel.Youngchild);
        Teacher vilnis = new Teacher("Vilnis", "Lībeks", "310300-21345", 2024, 5, 2, TeachingLevel.Youngchild);
        SpeachTherapist logopeds = new SpeachTherapist("Jana", "Robalde", "231200-22523" , 2022, 2, 25, "Articulation");
        SpeachTherapist logopeds2 = new SpeachTherapist("Daniels", "Fišers", "180199-16875", 2023, 3, 1, "Oral Motor Therapy");
        allEmployees.add(mareks);
        allEmployees.add(vilnis);
        allEmployees.add(logopeds);
        allEmployees.add(logopeds2);

        allTeachers.add(mareks);
        allTeachers.add(vilnis);

        allSpeachTherapists.add(logopeds);
        allSpeachTherapists.add(logopeds2);
        
        Group gr1 = new Group((short) 2023, "Gudrīši", mareks);
        Child janis = new Child("Jānis", "Poļikovs", "211199-19987", 2, Nationality.Lithuanian, "Almond");
        Child valentins = new Child("Valentins", "Salineks", "240299-22145", 3, Nationality.Latvian, "");
        gr1.addToGroup(janis);
        gr1.addToGroup(valentins);

        Group gr2 = new Group((short) 2024, "Skaistules", vilnis);
        Child kristiana = new Child("Kristiāna", "Bērziņa", "180300-22243", 1, Nationality.Latvian, "Lactose");
        Child samanta = new Child("Samanta", "Buka", "170701", 4, Nationality.Estonian, "");
        gr2.addToGroup(kristiana);
        gr2.addToGroup(samanta);

        allChilds.add(janis);
        allChilds.add(valentins);
        allChilds.add(kristiana);
        allChilds.add(samanta);

        allGroups.add(gr1);
        allGroups.add(gr2);


        for (Child child : allChilds) {
            System.out.println(child);
        }
        for (Teacher teacher : allTeachers) {
            System.out.println(teacher);
        }
        // removeTeacherByPK("050600-22504");
        // removeTeacherByID(301);

        for (Teacher teacher : allTeachers) {
            System.out.println(teacher);
        }

        
 
    }

    private static boolean removeTeacherByPK(String personas_kods){
        for (Teacher teach : allTeachers) {
            if(teach.getPersonasKods() == personas_kods){
                allTeachers.remove(teach);
                return true;
            }
        }
        return false;
    }

    private static boolean removeTeacherByID(int ID){
        for (Teacher teach : allTeachers) {
            if(teach.getEmployeeId() == ID){
                allTeachers.remove(teach);
                return true;
            }
        }
        return false;
    }

    private static boolean removeTherapistByPK(String personas_kods){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getPersonasKods() == personas_kods){
                allSpeachTherapists.remove(therapist);
                return true;
            }
        }
        return false;
    }

    private static boolean removeTherapistByID(int ID){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getEmployeeId() == ID){
                allSpeachTherapists.remove(therapist);
                return true;
            }
        }
        return false;
    }

    private static boolean removeChildByPK(String personas_kods){
        for (Child child : allChilds) {
            if(child.getPersonasKods() == personas_kods){
                allChilds.remove(child);
                return true;
            }
        }
        return false;
    }

    private static boolean removeGroupByYear(int gads){
        for (Group group : allGroups) {
            if(group.getGroupStartYear() == gads){
                allGroups.remove(group);
                return true;
            }
        }
        return false;
    }

    private static boolean removeGroupByTitle(String title){
        for (Group group : allGroups) {
            if(group.getTitle() == title){
                allGroups.remove(group);
                return true;
            }
        }
        return false;
    }

    private static boolean removeGroupByTeacher(Teacher teacher){
        for (Group group : allGroups) {
            if(group.getTeacher() == teacher){
                allGroups.remove(group);
                return true;
            }
        }
        return false;
    }
}
