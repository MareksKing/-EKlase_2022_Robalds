package models;

import java.util.ArrayList;


public class Group {
    private ArrayList<Child> allChildrenInGroup = new ArrayList<>();
    private short groupStartYear = 2022;
    private String title;
    private Teacher teacher;
    

    /**
     * @return int return the groupStartYear
     */
    public short getGroupStartYear() {
        return groupStartYear;
    }

    /**
     * @param groupStartYear the groupStartYear to set
     */
    public void setGroupStartYear(short groupYear) {
        if(groupYear > groupStartYear){
            this.groupStartYear = groupYear;
        }
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        if(title!=null && title.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.title = title;
        }
        else {
            this.title = "notknown";
        }
    }

    /**
     * @return Teacher return the teacher
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(Teacher teacher) {
        if(teacher != null) {
            this.teacher = teacher;
        }else{
            this.teacher = new Teacher();
        }
    }

/**
 * Add a child to the group
 * 
 * @param child The child to add to the group.
 * @return The boolean value of whether or not the child was added to the group.
 */
    public boolean addToGroup(Child child){
        if(allChildrenInGroup.contains(child)){
            return false;
        } else {
            //allChildrenInGroup.add(child);
            this.allChildrenInGroup.add(child);
            return true;
        }
    }

/**
 * Remove a child from the group
 * 
 * @param child The child to be removed from the group.
 * @return The boolean value of whether or not the child was removed from the group.
 */
    public boolean removeFromGroup(Child child){
        if(allChildrenInGroup.contains(child)){
            allChildrenInGroup.remove(child);
            return true;
        } else {
            return false;
        }
    }

/**
 * * Set the list of all children in the group
 * 
 * @param allChildren The list of all children in the group.
 */
    public void setAllChildrenInGroup(ArrayList<Child> allChildren){
        for (Child child : allChildren) {
            allChildrenInGroup.add(child);
        }
    }

/**
 * Returns all the children in the group
 * 
 * @return An ArrayList of all the children in the group.
 */
    public ArrayList<Child> getAllChildrenInGroup(){
        ArrayList<Child> allChildren = new ArrayList<>();
        for (Child child : allChildrenInGroup) {    
            allChildren.add(child);
        }
        return allChildren;
    }

    public Group(short groupYear, String title, Teacher teacher) {
        setGroupStartYear(groupYear);
        setTitle(title);
        setTeacher(teacher);  
    }

    public Group(){

        setGroupStartYear((short)2022);
        setTitle("Kamenīte");
        setTeacher(new Teacher());
    }

    @Override
    public String toString() {
        return "Group [groupStartYear=" + groupStartYear + ", teacher=" + teacher + ", title=" + title + "]";
    }

    public void printGroup(){
        System.out.printf("------------------ %-5s -------------------%n", title);
        for (Child child : allChildrenInGroup) {
            System.out.printf("[Child: %-10s %-10s|  %-13s]%n", child.getVards(), child.getUzvards(), child.getPersonasKods());
        }
    }
    
}
