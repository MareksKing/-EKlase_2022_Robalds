import java.util.Date;

import models.Child;
import models.Employee;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Person mareks = new Employee();
        Person mamma = new Employee("Jana", "Robalde",43 , 2022, 2, 25);
        System.err.println(mareks.toString());
        System.out.println(mamma.toString());

        Person janis = new Child();
        System.out.println(janis.toString());
        //Get date to work!!!! palicis pie 3.2
    }
}
