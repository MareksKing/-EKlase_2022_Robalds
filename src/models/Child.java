package models;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Child extends Person {
    private static ArrayList<String> alergies = new ArrayList<>();
    private int priorityForSpeachLessons;
    private Nationality nationality;

    /**
     * @return String return the alergies
     */
    public String getAlergies() {
        String alergija = "";
        for (String alergies : alergies) {
            alergija += alergies + "; ";
        }
        return alergija;
        
    }

    /**
     * @param alergies the alergies to set
     */
    public void setAlergies() {
        boolean done = false;
        System.out.println("Kādas alerģijas ir bērnam? Ja nav ievadiet: Nav");
        do {
            Scanner alergijas = new Scanner(System.in);
            String aler = alergijas.nextLine();
            if(aler.contains("Nav") || aler.contains("nav")){
                done = true;
                alergijas.close();
            } else {
                alergies.add(aler);
            }

        } while (done==false);

    }

    /**
     * @return int return the priorityForSpeachLessons
     */
    public int getPriorityForSpeachLessons() {
        return priorityForSpeachLessons;
    }

    /**
     * @param priorityForSpeachLessons the priorityForSpeachLessons to set
     */
    public void setPriorityForSpeachLessons(int priorityForSpeachLessons) {
        if(priorityForSpeachLessons >= 1 && priorityForSpeachLessons <= 6){
            this.priorityForSpeachLessons = priorityForSpeachLessons;
        }
    }

    public void setPriorityForSpeachLessons() {
        Random sk = new Random();
        int rand = sk.nextInt(6) + 1;
        this.priorityForSpeachLessons = rand;

    }

    /**
     * @return Nationality return the nationality
     */
    public Nationality getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(Nationality nationality) {
        if(nationality!= null){
            this.nationality = nationality;
        } else {
            this.nationality = Nationality.Latvian;
        }
    }

    public Child() {
        super();
        setAlergies();
        setPriorityForSpeachLessons();
        setNationality(Nationality.Latvian);
    }

    public Child(String vards, String uzvards, int vecums, int priorityForSpeachLessons, Nationality nationality) {
        super(vards, uzvards, vecums);
        setAlergies();
        this.priorityForSpeachLessons = priorityForSpeachLessons;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Child [nationality=" + nationality + ", priorityForSpeachLessons=" + priorityForSpeachLessons + ", alergies= " + getAlergies() + "]";
    }

    

}
