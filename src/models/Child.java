package models;

import java.util.Random;

public class Child extends Person{
    private String alergies;
    private int priorityForSpeachLessons;
    private Nationality nationality;
    
    /**
     * @return String return the alergies
     */
    public String getAlergies() {
        return alergies;
    }
        
    /**
     * @param alergies the alergies to set
     */
    public void setAlergies(String alergija) {
        if(alergija!=""){
            this.alergies = alergija + "; ";
        } else {
            this.alergies = "Nav";
        }
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
        setAlergies("");
        setPriorityForSpeachLessons();
        setNationality(Nationality.Latvian);
    }

    public Child(String vards, String uzvards, String personasKods, int priorityForSpeachLessons, Nationality nationality, String alergijas) {
        super(vards, uzvards, personasKods);
        setAlergies(alergijas);
        setPriorityForSpeachLessons(priorityForSpeachLessons);
        setNationality(nationality);
    }

    @Override
    public String toString() {
        return "Child [ name=" +super.getVards() + ", surname= " +super.getUzvards() + ", nationality=" + nationality + ", priorityForSpeachLessons=" + priorityForSpeachLessons + ", alergies= " + getAlergies() + "]";
    }


    // @Override
    // public int compareTo(Child o) {
    //     if(super.getVards().charAt(0) < o.getVards().charAt(0)){return -1;}
    //     else if (super.getVards().charAt(0) > o.getVards().charAt(0)){return 1;}
    //     else{return 0;}
    // }

    

}
