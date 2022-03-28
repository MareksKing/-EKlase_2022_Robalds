package service;

import java.util.ArrayList;
import java.util.Collections;

import javax.print.attribute.standard.MediaSize.NA;

import models.Child;
import models.Person;
import models.Employee;
import models.SpeachTherapist;
import models.Teacher;
import models.TeachingLevel;
import models.Group;
import models.Nationality;
import models.Person;

/**
 * This class is a service that can be used to create and manage a database
 */
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
        Child janis = new Child("Janis", "Polikovs", "211199-19987", 2, Nationality.Lithuanian, "Almond");
        Child valentins = new Child("Valentins", "Salineks", "240299-22145", 3, Nationality.Latvian, "");
        Child kristiana = new Child("Kristiana", "Berzina", "180300-22243", 1, Nationality.Latvian, "Lactose");
        Child samanta = new Child("Samanta", "Buka", "170701-12432", 4, Nationality.Estonian, "");
        gr1.addToGroup(janis);
        gr1.addToGroup(valentins);
        gr1.addToGroup(kristiana);
        gr1.addToGroup(samanta);
        

        // Group gr2 = new Group((short) 2024, "Skaistules", vilnis);
        // Child kristiana = new Child("Kristiāna", "Bērziņa", "180300-22243", 1, Nationality.Latvian, "Lactose");
        // Child samanta = new Child("Samanta", "Buka", "170701", 4, Nationality.Estonian, "");
        // gr2.addToGroup(kristiana);
        // gr2.addToGroup(samanta);

        allChilds.add(janis);
        allChilds.add(valentins);
        allChilds.add(kristiana);
        allChilds.add(samanta);

        allGroups.add(gr1);
        // allGroups.add(gr2);
        gr1.printGroup();

        // for (Child child : allChilds) {
        //     System.out.println(child);
        // }
        // for (Teacher teacher : allTeachers) {
        //     System.out.println(teacher);
        // }
        // removeTeacherByPK("050600-22504");
        // removeTeacherByID(301);

        // for (Employee teacher : allEmployees) {
        //     System.out.println(teacher);
        // }
        sortGroupBySurname(gr1);
        gr1.printGroup();

    }


/**
 * Add a new teacher to the list of all teachers
 * 
 * @param name The name of the teacher.
 * @param surname The surname of the teacher.
 * @param personal_code A unique code for each teacher.
 * @param year The year of the contract.
 * @param month the month of the contract
 * @param day The day of the month.
 * @param teachLVL TeachingLevel
 * @return The boolean value of the addNewTeacher method.
 */
    private static boolean addNewTeacher(String name, String surname, String personal_code, int year, int month, int day, TeachingLevel teachLVL){
        Teacher teacher = new Teacher(name, surname, personal_code, year, month, day, teachLVL);
        if(allTeachers.contains(teacher)){
            return false;
        }
        allTeachers.add(teacher);
        return true;
    }

/**
 * Add a new speach therapist to the list of all speach therapists.
 * 
 * @param name The name of the therapist.
 * @param surname The therapist's surname.
 * @param personal_code A unique identifier for the therapist.
 * @param year The year of the contract.
 * @param month the month of the contract
 * @param day The day of the month.
 * @param workingMethods String
 * @return The boolean value of the method.
 */
    private static boolean addNewSpeachTherapist(String name, String surname, String personal_code, int year, int month, int day, String workingMethods){
        SpeachTherapist therapist = new SpeachTherapist(name, surname, personal_code, year, month, day, workingMethods);
        if(allSpeachTherapists.contains(therapist)){
            return false;
        }
        allSpeachTherapists.add(therapist);
        return true;
    }

/**
 * Add a new child to the list of all children
 * 
 * @param name The child's name.
 * @param surname The child's surname.
 * @param personal_code String
 * @param priorityForSL priority for speach lessons
 * @param nationality Nationality
 * @param alergijas Alergies
 * @return Boolean
 */
    private static boolean addNewChild(String name, String surname, String personal_code, int priorityForSL, Nationality nationality, String alergijas){
        Child child = new Child(name, surname, personal_code, priorityForSL, nationality, alergijas);
        if(allChilds.contains(child)){
            return false;
        }
        allChilds.add(child);
        return true;
    }

/**
 * Add a new group to the list of all groups
 * 
 * @param year the year of the group (e.g. 2019)
 * @param title the title of the group (e.g. "Math")
 * @param teacher The teacher who will be teaching the group.
 * @return The boolean value of whether the group was added or not.
 */
    private static boolean addNewGroup(short year, String title, Teacher teacher){
        Group group = new Group(year, title, teacher);
        if(allGroups.contains(group)){
            return false;
        }
        allGroups.add(group);
        return true;
    }

/**
 * Remove a teacher from the list of all teachers
 * 
 * @param personas_kods The unique identifier of the teacher.
 * @return Nothing.
 */
    private static boolean removeTeacherByPK(String personas_kods){
        for (Teacher teach : allTeachers) {
            if(teach.getPersonasKods() == personas_kods){
                allTeachers.remove(teach);
                return true;
            }
        }
        return false;
    }

/**
 * Remove a teacher from the list of all teachers
 * 
 * @param ID The ID of the teacher to be removed.
 * @return Nothing.
 */
    private static boolean removeTeacherByID(int ID){
        for (Teacher teach : allTeachers) {
            if(teach.getEmployeeId() == ID){
                allTeachers.remove(teach);
                return true;
            }
        }
        return false;
    }

 /**
  * It removes a therapist from the list of all therapists.
  * 
  * @param personas_kods The therapist's unique identifier.
  * @return Nothing.
  */
    private static boolean removeTherapistByPK(String personas_kods){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getPersonasKods() == personas_kods){
                allSpeachTherapists.remove(therapist);
                return true;
            }
        }
        return false;
    }

/**
 * Remove a speach therapist from the list of all speach therapists
 * 
 * @param ID The ID of the therapist to be removed.
 * @return Nothing.
 */
    private static boolean removeTherapistByID(int ID){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getEmployeeId() == ID){
                allSpeachTherapists.remove(therapist);
                return true;
            }
        }
        return false;
    }

/**
 * Remove a child from the list of all children
 * 
 * @param personas_kods The child's personas_kods.
 * @return Nothing.
 */
    private static boolean removeChildByPK(String personas_kods){
        for (Child child : allChilds) {
            if(child.getPersonasKods() == personas_kods){
                allChilds.remove(child);
                return true;
            }
        }
        return false;
    }

/**
 * Remove a group from the list of all groups
 * 
 * @param gads The group start year.
 * @param title the title of the group
 * @param teacher The teacher that is being removed.
 * @return Nothing.
 */
    private static boolean removeGroupByYearTitleAndYear(int gads, String title, Teacher teacher){
        for (Group group : allGroups) {
            if(group.getGroupStartYear() == gads && group.getTitle() == title && group.getTeacher() == teacher){
                allGroups.remove(group);
                return true;
            }
        }
        return false;
    }

/**
 * Add a child to a group if the child is not already in the group
 * 
 * @param child The child to add to the group.
 * @param group The group to add the child to.
 * @return The boolean value of whether or not the child was added to the group.
 */
    private static boolean addChildToGroup(Child child, Group group){
        ArrayList<Child> childrenInGroup = new ArrayList<>();
        childrenInGroup = group.getAllChildrenInGroup();
        if(childrenInGroup.contains(child) == false){
            group.addToGroup(child);
            return true;
        }
        return false;
    }

/**
 * Remove a child from a group
 * 
 * @param child The child to be removed from the group.
 * @param group The group that the child will be removed from.
 * @return Nothing is being returned.
 */
    private static boolean removeChildFromGroup(Child child, Group group){
        ArrayList<Child> childrenInGroup = new ArrayList<>();
        childrenInGroup = group.getAllChildrenInGroup();
        if(childrenInGroup.contains(child) == true){
            group.removeFromGroup(child);
            return true;
        }
        return false;
    }

/**
 * Change the group of a child from one group to another
 * 
 * @param child the child to be moved
 * @param noGrupa the group that the child is currently in
 * @param uzGrupa the group that the child will be added to
 * @return Nothing.
 */
    private static boolean ChangeGroup(Child child, Group noGrupa, Group uzGrupa){
        ArrayList<Child> fromChildrenInGroup = new ArrayList<>();
        ArrayList<Child> toChildrenInGroup = new ArrayList<>();
        fromChildrenInGroup = noGrupa.getAllChildrenInGroup();
        toChildrenInGroup = uzGrupa.getAllChildrenInGroup();
        if(fromChildrenInGroup.contains(child) == true){
            noGrupa.removeFromGroup(child);
            if(toChildrenInGroup.contains(child) == false){
                uzGrupa.addToGroup(child);
                return true;
            }
        }
        return false;
    }

/**
 * * For each child in the list of all children, check if the child's personas_kods matches the
 * personas_kods of the therapist. 
 *     * If it does, add the child to the therapist's list of children. 
 *     * Return true if the child was added to the therapist's list of children. 
 *     * Return false if the child was not added to the therapist's list of children.
 * 
 * @param personas_kods The child's personas_kods
 * @param therapist The SpeachTherapist object that we're adding the child to.
 * @return Nothing.
 */
    private static boolean subscribeChildToSpeachLessonsByPK(String personas_kods, SpeachTherapist therapist){
        for (Child child : allChilds) {
            if(child.getPersonasKods() == personas_kods){
                therapist.addChildByPriority(child);
                return true;
            }
        }
        return false;
    }

/**
 * Prints out all the teachers in the allTeachers array
 */
    private static void showAllTeachers(){
        for (Teacher teacher : allTeachers) {
            System.out.println(teacher);
        }
    }

/**
 * Prints out all the speach therapists in the system
 */
    private static void showAllSpeachTherapist(){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            System.out.println(therapist);
        }
    }

/**
 * Prints all the children of a group
 * 
 * @param group The group to show the children of.
 */
    private static void showAllChildrenInGroup(Group group){
        group.getAllChildrenInGroup();
    }

    private static void showAllChildrenInSpeachLessonsByTherapistPK(String personas_kods){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getPersonasKods() == personas_kods){
                therapist.getAllChildrenAtSpeachLessons();
            }
        }
    }

/**
 * Show all children in a group that starts in a certain year
 * 
 * @param gads Group Start Year
 */
    private static void showAllChildrenByGroupStartYear(short gads){
        for (Group group : allGroups) {
            if(group.getGroupStartYear() == gads){
                group.getAllChildrenInGroup();
            }
        }
    }

    private static void sortGroupBySurname(Group group){
        ArrayList<Child> allChildrenSorted = new ArrayList<>();
        allChildrenSorted = group.getAllChildrenInGroup();

        for (int i = 0; i < allChildrenSorted.size(); i++) {
            for (int j = 1; j < allChildrenSorted.size(); j++) {
                String pUzv = allChildrenSorted.get(i).getUzvards();
                String oUzv = allChildrenSorted.get(j).getUzvards();
                //System.out.println(pUzv + " - " + oUzv + " = " + pUzv.compareTo(oUzv));
                if(pUzv.compareTo(oUzv) != 0){
                    Child temp = allChildrenSorted.get(j);
                    allChildrenSorted.set(j, allChildrenSorted.get(i));
                    allChildrenSorted.set(i, temp);
                    group.removeFromGroup(allChildrenSorted.get(i));
                }
            }
        }
        
        group.setAllChildrenInGroup(allChildrenSorted);
        
    }



}
