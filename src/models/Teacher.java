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

    public Teacher(TeachingLevel teachLVL) {
        super();
        this.teachLVL = teachLVL;
    }

    public Teacher(String vards, String uzvards, int vecums, int year, int month, int day, TeachingLevel teachLVL) {
        super(vards, uzvards, vecums, year, month, day);
        this.teachLVL = teachLVL;
    }

    

}
