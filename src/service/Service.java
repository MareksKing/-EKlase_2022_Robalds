package service;

import java.util.ArrayList;
import java.util.Random;


import models.Child;
import models.Employee;
import models.SpeachTherapist;
import models.Teacher;
import models.TeachingLevel;
import models.Group;
import models.Nationality;


/**
 * This class is a service that can be used to create and manage a database
 */
public class Service {
    private static String[] sideDish = {"Makaroni", "Kartupeļi", "Rīsi", "Griķi", "Grūbas", "Zirņi",};
    private static String[] mainDish = {"Vistas fileja", "Steiks", "Vistas spārni", "Aknas stroganovs", "Maltā gaļa", "Zivs"};
    private static String[] drinks = {"Piens", "Sula", "Ūdens"};
    
    private static ArrayList<Employee> allEmployees = new ArrayList<>();
    private static ArrayList<Group> allGroups = new ArrayList<>();
    private static ArrayList<Teacher> allTeachers = new ArrayList<>();
    private static ArrayList<Child> allChilds = new ArrayList<>();
    private static ArrayList<SpeachTherapist> allSpeachTherapists = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        
        Teacher mareks = new Teacher("Mareks", "Robalds", "050600-22504", 2023, 4, 23, TeachingLevel.Youngchild);
        Teacher vilnis = new Teacher("Vilnis", "Lībeks", "310300-21345", 2024, 5, 2, TeachingLevel.Youngchild);
        Teacher roberts = new Teacher("Roberts", "Steinbergs", "230197-18773", 2022, 3, 23, TeachingLevel.Preschool);
        Teacher sofija = new Teacher("Sofija", "Lenberta", "170601-25054", 2023, 4, 6, TeachingLevel.Toddler);
        SpeachTherapist logopeds = new SpeachTherapist("Jana", "Robalde", "231200-22523" , 2022, 2, 25, "Articulation");
        SpeachTherapist logopeds2 = new SpeachTherapist("Daniels", "Fišers", "180199-16875", 2023, 3, 1, "Oral Motor Therapy");
        SpeachTherapist logopeds3 = new SpeachTherapist("Alise", "Zarkovka", "040389-15523", 2024, 1, 1, "VetalStim Therapy");
        
        allEmployees.add(mareks);
        allEmployees.add(vilnis);
        allEmployees.add(roberts);
        allEmployees.add(sofija);
        allEmployees.add(logopeds);
        allEmployees.add(logopeds2);
        allEmployees.add(logopeds3);

        allTeachers.add(mareks);
        allTeachers.add(vilnis);
        allTeachers.add(roberts);
        allTeachers.add(sofija);

        allSpeachTherapists.add(logopeds);
        allSpeachTherapists.add(logopeds2);
        allSpeachTherapists.add(logopeds3);
        
        //Pirma grupa
        Child janis = new Child("Janis", "Polikovs", "211199-19987", 2, Nationality.Lithuanian, "Rieksti");
        Child valentins = new Child("Valentins", "Salineks", "240299-22145", 3, Nationality.Latvian, "Zivs");
        Child kristiana = new Child("Kristiana", "Berzina", "180300-22243", 1, Nationality.Latvian, "Piens");
        Child samanta = new Child("Samanta", "Buka", "170701-12432", 4, Nationality.Estonian, "");
        Child marta = new Child("Marta", "Dombrovska", "220201-33123", 3, Nationality.Latvian, "Olas");
        Child markuss = new Child("Markuss", "Storovs", "021100-31221", 5, Nationality.Lithuanian, "");
        allChilds.add(janis);
        allChilds.add(valentins);
        allChilds.add(kristiana);
        allChilds.add(samanta);
        allChilds.add(marta);
        allChilds.add(markuss);

        //Otra grupa
        Child gatis = new Child("Gatis", "Kandis", "241202-19287", 6, Nationality.Latvian, "");
        Child elvis = new Child("Elvis", "Preslijs", "270501-25445", 6, Nationality.Latvian, "");
        Child laura = new Child("Laura", "Lagzdina", "150801-21243", 5, Nationality.Latvian, "");
        Child santa = new Child("Santa", "Tanka", "170202-12932", 4, Nationality.Latvian, "");
        Child jana = new Child("Jana", "Velta", "020400-13123", 6, Nationality.Latvian, "");
        Child pauls = new Child("Pauls", "Traks", "021203-31671", 5, Nationality.Latvian, "");
        allChilds.add(gatis);
        allChilds.add(elvis);
        allChilds.add(laura);
        allChilds.add(santa);
        allChilds.add(jana);
        allChilds.add(pauls);

        //Treša grupa
        Child emils = new Child("Emils", "Abrams", "301102-13127", 1, Nationality.Estonian, "Rieksti");
        Child gustavs = new Child("Gustavs", "Bers", "100102-25555", 2, Nationality.Latvian, "Zivs");
        Child adrians = new Child("Adrians", "Biels", "150601-28743", 3, Nationality.Latvian, "Piens");
        Child ernests = new Child("Ernests", "Ozols", "190303-37432", 4, Nationality.Estonian, "");
        Child ralfs = new Child("Ralfs", "Kalns", "290802-10123", 5, Nationality.Latvian, "Olas");
        Child paula = new Child("Paula", "Liepa", "171201-31201", 6, Nationality.Estonian, "");
        allChilds.add(emils);
        allChilds.add(gustavs);
        allChilds.add(adrians);
        allChilds.add(ernests);
        allChilds.add(ralfs);
        allChilds.add(paula);

        //Ceturta grupa
        Child anna = new Child("Anna", "Cerina", "021103-15287", 2, Nationality.Lithuanian, "Rieksti");
        Child darta = new Child("Darta", "Abele", "250603-21745", 3, Nationality.Latvian, "Zivs");
        Child eliza = new Child("Eliza", "Berzina", "111202-28843", 3, Nationality.Lithuanian, "Piens");
        Child marija = new Child("Marija", "Kaspare", "150903-37432", 4, Nationality.Estonian, "");
        Child arturs = new Child("Arturs", "Ridus", "140104-22723", 3, Nationality.Estonian, "Olas");
        Child rihards = new Child("Rihards", "Uzbeks", "300703-11791", 4, Nationality.Lithuanian, "");
        allChilds.add(anna);
        allChilds.add(darta);
        allChilds.add(eliza);
        allChilds.add(marija);
        allChilds.add(arturs);
        allChilds.add(rihards);

        Group gudrisi = new Group((short) 2023, "Gudrīši", mareks);
        gudrisi.addToGroup(marta);
        gudrisi.addToGroup(markuss);
        gudrisi.addToGroup(janis);
        gudrisi.addToGroup(valentins);
        gudrisi.addToGroup(kristiana);
        gudrisi.addToGroup(samanta);

        Group forsie = new Group((short) 2023, "Foršie", vilnis);
        forsie.addToGroup(gatis);
        forsie.addToGroup(elvis);
        forsie.addToGroup(laura);
        forsie.addToGroup(santa);
        forsie.addToGroup(jana);
        forsie.addToGroup(pauls);

        Group jauninie = new Group((short) 2024, "Jauniņie", roberts);
        jauninie.addToGroup(emils);
        jauninie.addToGroup(gustavs);
        jauninie.addToGroup(adrians);
        jauninie.addToGroup(ernests);
        jauninie.addToGroup(ralfs);
        jauninie.addToGroup(paula);

        Group svaigie = new Group((short) 2025, "Svaigie", sofija);
        svaigie.addToGroup(anna);
        svaigie.addToGroup(darta);
        svaigie.addToGroup(eliza);
        svaigie.addToGroup(marija);
        svaigie.addToGroup(arturs);
        svaigie.addToGroup(rihards);

        allGroups.add(gudrisi);
        allGroups.add(forsie);
        allGroups.add(jauninie);
        allGroups.add(svaigie);

        addNewTeacher("Lauris", "Maigonis", "121280-18888", 2025, 10, 15, TeachingLevel.Youngchild); //Pievieno jaunu skolotāju
        addNewSpeachTherapist("Es", "Tu jau zini", "123456-78901", 2024, 2, 3, "Articulation"); //Pievieno jaunu logopēdu
        addNewChild("Sikais", "Perdelis", "140299-11111", 2, Nationality.Latvian, "Makaroni"); //Pievieno jaunu bērnu
        addNewGroup((short) 2025, "Smukumini", allTeachers.get(allTeachers.size()-1)); //Pievieno jaunu grupu

        removeTeacherByPK("121280-18888"); //Noņem skolotāju pēc PK (Noņem skolotāju @ Line:150)
        removeTeacherByID(allTeachers.get(3).getEmployeeId()); // Noņem skolotāju pēc darbinieka ID (Noņem skolotāju @ Line:51)
        removeTherapistByPK("040389-15523"); // Noņem logopēdu pēc PK (Noņem logopēdu @ Line:38)
        removeTherapistByID(allSpeachTherapists.get(2).getEmployeeId()); //Noņem logopēdu pēc ID (Noņem logopēdu @ Line:151)
        removeChildByPK("140299-11111"); //Noņem bērnu pēc PK (Noņem bērnu @ Line 152)
        removeGroupByYearTitleAndYear(2025, "Smukumini", allTeachers.get(allTeachers.size()-1)); //Noņem grupu pēc tā gada, nosaukuma un skolotāja (Noņem grupu @ Line 153)
        addChildToGroup(allChilds.get(allChilds.size()-1), gudrisi); //Pievieno bērnu grupai (Pievieno bērnu @ Line 105)
        removeChildFromGroup(emils, jauninie); //Noņem bērnu no grupiņas
        changeGroup(anna, svaigie, jauninie); //Pārmaina bērna grupiņu
        // subscribeChildToSpeachLessonsByPK("300703-11791", logopeds); //Pievieno bērnu pie logopēda sesijas (nestrāda ATM)
        System.out.println("----------------------------------------------------------------");
        showAllTeachers(); //Izvada visus skolotājus
        System.out.println("----------------------------------------------------------------");
        showAllSpeachTherapist(); //Izvada visus logopēdus
        System.out.println("-----------------------------------------------------------");
        showAllChildrenInGroup(jauninie); //Izvada visus bērnus Jauniņo grupā
        System.out.println("-----------------------------------------------------------");
        showAllChildrenInSpeachLessonsByTherapistPK("231200-22523"); //Izvada visus bērnus pie logopēda sesijām
        System.out.println("-----------------------------------------------------------");
        showAllChildrenByGroupStartYear((short) 2023); //Izvada visus bērnus kuri ir grupās ar padoto sākuma gadu
        
        System.out.println();
        sortGroupBySurname(gudrisi); //Sakārto bērnus pēc uzvārdiem
        gudrisi.printGroup(); //Izvada grupu noformētu
        
        System.out.println();
        sortGroupBySurname(forsie); //Sakārto bērnus pēc uzvārdiem
        forsie.printGroup(); //Izvada grupu noformētu
        
        System.out.println();
        sortGroupBySurname(jauninie); //Sakārto bērnus pēc uzvārdiem
        jauninie.printGroup(); //Izvada grupu noformētu
        
        System.out.println();
        sortGroupBySurname(svaigie); //Sakārto bērnus pēc uzvārdiem
        svaigie.printGroup(); //Izvada grupu noformētu
        System.out.println("----------------------------------------------");

        System.out.println("Pusdienās būs: " +generateLunch()); //Ģenerē pusdienas ievērojot bērnu alerģijas    

        
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
 * @param year The year of the group.
 * @param title the title of the group (e.g. "Math")
 * @param teacher The teacher who created the group.
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
 * Add a child to a group
 * 
 * @param child The child to be added to the group.
 * @param group The group to add the child to.
 * @return The boolean value of whether the child was added to the group or not.
 */
    private static boolean addChildToGroup(Child child, Group group){
        ArrayList<Child> childrenInGroup = new ArrayList<>();
        childrenInGroup = group.getAllChildrenInGroup();
        for (Group grupa : allGroups) {
            for (Child ch : grupa.getAllChildrenInGroup()) {
                if(ch == child) {grupa.removeFromGroup(child);}
            }
        }
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
    private static boolean changeGroup(Child child, Group noGrupa, Group uzGrupa){
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
        if(allGroups.contains(group) == false) return;
        for (Child child : group.getAllChildrenInGroup()) {
            System.out.println(child);
        }
    }

/**
 * Show all children in speach lessons by therapist PK
 * 
 * @param personas_kods The therapist's personas_kods
 */
    private static void showAllChildrenInSpeachLessonsByTherapistPK(String personas_kods){
        for (SpeachTherapist therapist : allSpeachTherapists) {
            if(therapist.getPersonasKods() == personas_kods){
                System.out.println(therapist.getAllChildrenAtSpeachLessons());            
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
                for (Child child : group.getAllChildrenInGroup()) {
                    System.out.println(child);
                }
            }
        }
    }

/**
 * Sorts the children in the group by surname
 * 
 * @param group the group that you want to sort
 */
    private static void sortGroupBySurname(Group group){
        
        if(allGroups.contains(group)){
            Child pChild, oChild;
            for (int i = 0; i < group.getAllChildrenInGroup().size(); i++) {
                for (int j = 1; j < group.getAllChildrenInGroup().size(); j++) {
                    pChild = group.getAllChildrenInGroup().get(i);
                    oChild = group.getAllChildrenInGroup().get(j);
                    if(pChild.getUzvards().compareTo(oChild.getUzvards()) > 0){
                        //System.out.println("Salidzina " + pChild.getUzvards() + " & " + oChild.getUzvards());
                        Child temp = oChild;
                        group.getAllChildrenInGroup().set(j, pChild);
                        group.getAllChildrenInGroup().set(i, temp);
                    }
                }
            }
        }
    
    }


/**
 * Generate a lunch for the children based on their alergies
 * 
 * @return Lunch
 */
    private static String generateLunch(){
        String lunch = "";
        ArrayList<String> alergies = new ArrayList<>();
        
        for (Child child : allChilds) {
            alergies.add(child.getAlergies());
        }

        Random rand = new Random();
        int sideList = sideDish.length;
        int sideList_random = rand.nextInt(sideList);
        lunch += getSideDish(alergies, sideList_random) + " ar ";

        int mainList = mainDish.length;
        int mainList_random = rand.nextInt(mainList);
        lunch += getMainDish(alergies, mainList_random) + " un ";

        int drinkList = drinks.length;
        int drinkList_random = rand.nextInt(drinkList);
        lunch += getDrink(alergies, drinkList_random);


        return lunch;
    }

/**
 * Get a random side dish that doesn't contain any of the alergies in the given list.
 * 
 * @param alergies an ArrayList of Strings that contains the alergies of all children.
 * @param rand The random number that is generated from the random number generator.
 * @return The side dish that is not in the list of alergies.
 */
    private static String getSideDish(ArrayList<String> alergies, int rand){
        String sideDish = Service.sideDish[rand];
        for (String aler : alergies) {
            if(sideDish.equals(aler)){
                //System.out.println("Bērnam aleģija - SIDE");
                if(Service.sideDish.length - 1 == rand){
                    sideDish = Service.sideDish[0];
                } else{
                    sideDish = Service.sideDish[rand+1];
                }
            }
        }
        return sideDish;
    }

/**
 * Get a random main dish that doesn't contain any of the alergies in the given list.
 * 
 * @param alergies an ArrayList of Strings that contains the alergies of all children.
 * @param rand The random number that is generated from the random number generator.
 * @return The main dish that is not in the list of alergies.
 */
    private static String getMainDish(ArrayList<String> alergies, int rand){
        String mainDish = Service.mainDish[rand];
        for (String aler : alergies) {
            if(mainDish.equals(aler)){
                //System.out.println("Bērnam aleģija - MAIN");
                if(Service.mainDish.length - 1 == rand){
                    mainDish = Service.mainDish[0];
                } else{
                    mainDish = Service.mainDish[rand+1];
                }
                
            }
        }
        return mainDish;
    }

/**
 * Get a random drink that doesn't contain any of the alergies in the given list.
 * 
 * @param alergies an ArrayList of Strings that contains the alergies of all children.
 * @param rand The random number that is generated from the random number generator.
 * @return The drink that is not in the list of alergies.
 */
    private static String getDrink(ArrayList<String> alergies, int rand){
        String drink = Service.drinks[rand];
        for (String aler : alergies) {
            if(drink.equals(aler)){
                //System.out.println("Bērnam aleģija - DRINKS");
                if(Service.drinks.length - 1 == rand){
                    drink = Service.drinks[0];
                } else{
                    drink = Service.drinks[rand+1];
                }
            }
        }
        return drink;
    }

}
