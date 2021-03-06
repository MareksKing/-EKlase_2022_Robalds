package models;

public class Person {
    private String personasKods;
    private String vards;
    private String uzvards;

    public Person(){
        setVards("Test");
        setUzvards("Person");
    }

    public Person(String vards, String uzvards, String personasKods){
        setVards(vards);
        setUzvards(uzvards);
        setPersonasKods(personasKods);
    }

    /**
     * @return int return the vecums
     */
    public String getPersonasKods() {
        return personasKods;
    }

    public void setPersonasKods(String personasKods) {
        if(personasKods!=null && personasKods.matches("\\d{6}-\\d{5}"))
            {this.personasKods = personasKods;
        } else{
            this.personasKods = "notknown";
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
