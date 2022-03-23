

import models.Child;
import models.Employee;
import models.Person;
import models.Teacher;
import models.TeachingLevel;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Person mareks = new Teacher("Mareks", "Robalds", "050600-22504", 2023, 4, 23, TeachingLevel.Youngchild);
        Person mamma = new Employee("Jana", "Robalde", "231200-22523" , 2022, 2, 25);
        
        System.out.println(mamma.toString());

        

        Person janis = new Child();
        System.out.println(janis.toString());

        System.out.println(mareks.toString());
        
    }
}
