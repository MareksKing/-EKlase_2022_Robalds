package models;

import java.util.PriorityQueue;

public class SpeachTherapist extends Employee{
    private PriorityQueue<Child> AllChildrenAtSpeachLessons = new PriorityQueue<>();
    private String workingMethods;

    public void setAllChildrenAtSpeachLessons(PriorityQueue<Child> allChildren){
        AllChildrenAtSpeachLessons.addAll(allChildren);
    }

    public PriorityQueue<Child> getAllChildrenAtSpeachLessons(){
        return AllChildrenAtSpeachLessons;
    }

    public String getWorkingMethods(){
        return workingMethods;
    }

    public void setWorkingMethods(String workingMethods){
        if(workingMethods != null){
            this.workingMethods = workingMethods;
        } else {
            this.workingMethods = "notknown";
        }
        
    }

    public SpeachTherapist() {
        setWorkingMethods(workingMethods);
    }

    public SpeachTherapist(String vards, String uzvards, String personasKods, int year, int month, int day, String workingMethods) {
        super(vards, uzvards, personasKods, year, month, day);
        setWorkingMethods(workingMethods);
    }

    @Override
    public String toString() {
        return String.format("[STR: %-10s %-10s | %-20s]", super.getVards(), super.getUzvards(), workingMethods);
    }

    public void addChildByPriority(Child child){
        int priority = child.getPriorityForSpeachLessons();
        if(priority >=1 && priority <= 4){
            AllChildrenAtSpeachLessons.add(child);
        }
    }
    

    
}
