package models;

public class Teacher extends Employee {
    private TeachingLevel teachLVL;


    /**
     * @return TeachingLevel return the teachLVL
     */
    public TeachingLevel getTeachLVL() {
        return teachLVL;
    }

    /**
     * @param teachLVL the teachLVL to set
     */
    public void setTeachLVL(TeachingLevel teachLVL) {
        if(teachLVL != null){
            this.teachLVL = teachLVL;
        } else {
            this.teachLVL = TeachingLevel.Toddler;
        }
        
    }

    public Teacher() {
        super();
        setTeachLVL(TeachingLevel.Preschool);
    }

    public Teacher(String vards, String uzvards, String personasKods, int year, int month, int day, TeachingLevel teachLVL) {
        super(vards, uzvards, personasKods, year, month, day);
        setTeachLVL(teachLVL);
    }

    @Override
    public String toString() {
        return "Teacher [" + "name= " + super.getVards() + ", surname= " + super.getUzvards() + ",personas kods= " + super.getPersonasKods() + ", teachLVL=" + teachLVL + "]";
    }

    

    

}
