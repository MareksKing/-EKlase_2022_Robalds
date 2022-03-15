package models;

public class Person {
    private int vecums;
    private String vards;
    private String uzvards;

    public Person(){
        setVards("Mareks");
        setUzvards("Robalds");
        setVecums(22);
    }

    public Person(String vards, String uzvards, int vecums){
        setVards(vards);
        setUzvards(uzvards);
        setVecums(vecums);
    }

    /**
     * @return int return the vecums
     */
    public int getVecums() {
        return vecums;
    }

    /**
     * @param vecums the vecums to set
     */
    public void setVecums(int vecums) {
        if(vecums>0){
            this.vecums = vecums;
        } else {
            this.vecums = 22;
        }
    }

    /**
     * @return String return the vards
     */
    public String getVards() {
        return vards;
    }

    /**
     * @param vards the vards to set
     */
    public void setVards(String vards) {
        if(vards!=null && vards.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+\\s?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.vards = vards;
        }
        else {
            this.vards = "notknown";
        }
    }

    /**
     * @return String return the uzvards
     */
    public String getUzvards() {
        return uzvards;
    }

    /**
     * @param uzvards the uzvards to set
     */
    public void setUzvards(String uzvards) {
        if(uzvards!=null && uzvards.matches("[A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+[-]?([A-ZĒŪĪĀŠĢĶĻŅČŽ]{1}[a-zēūīļķģšāžčņ]+)?")){
            this.uzvards = uzvards;
        }
        else {
            this.uzvards = "notknown";
        }
    }

}
