package models;

public class Person {
    private int vecums;
    private String vards;
    private String uzvards;

    

    /**
     * @return int return the vecums
     */
    public int getVecums() {
        return vecums;
    }

    /**
     * @param vecums the vecums to set
     */
    public void setVecums(int vecums) throws Exception {
        if(vecums>0){
            this.vecums = vecums;
        } else {
            Exception exc = new Exception("Nederīgs vecums");
            throw exc;
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
