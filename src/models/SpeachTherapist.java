package models;

import java.util.PriorityQueue;

public class SpeachTherapist extends Employee{
    private String workingMethods;

    // public void setAllChildrenAtSpeachLessons(PriorityQueue<Child> allChildren){

    // }

    // public PriorityQueue<Child> getAllChildrenAtSpeachLessons(){
    //     PriorityQueue<Child> childrenAtSpeachLessons = new PriorityQueue<>();

    // }

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
        return "SpeachTherapist [workingMethods=" + workingMethods + "]";
    }

    // public int addChildByPriority(Child child){

    // }
    

    
}
