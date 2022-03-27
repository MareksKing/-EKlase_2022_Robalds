
import models.Child;
import models.Employee;
import models.Person;
import models.Teacher;
import models.TeachingLevel;
import models.Group;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        Teacher mareks = new Teacher("Mareks", "Robalds", "050600-22504", 2023, 4, 23, TeachingLevel.Youngchild);
        Person mamma = new Employee("Jana", "Robalde", "231200-22523" , 2022, 2, 25);
        
        System.out.println(mamma.toString());

        
        Group gr1 = new Group((short) 2023, "Gudrīši", mareks);
        Child janis = new Child();
        gr1.addToGroup(janis);

        
        System.out.println(janis.toString());
        System.out.println(gr1.toString());
        System.out.println(mareks.toString());
        
    }
}
