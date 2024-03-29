import config.AppConfig;
import entities.Address;
import entities.Student;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Student student1 = (Student) context.getBean("suresh");
        // Student student2 =  (Student) context.getBean("yash");
        // Student student3 = (Student) context.getBean("mihir");
        // Student student4 = (Student) context.getBean("azi");

        // var student5 = new Student("sanket", 007);

        // dynamically adding beans of students in list bean
        List<Student> students = (List<Student>) context.getBean("studentsDB");

        // students.add(student1);
        // students.add(student2);

        // students.add(student5);

        // Address myAddress = (Address) context.getBean(Address.class);
        // System.out.println(myAddress);

        // System.out.println(students.get(2));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name:");
        String name = sc.nextLine();

        System.out.println("Enter student roll no:");
        int rollNo = Integer.parseInt(sc.nextLine());

        System.out.println("Enter pincode:");
        int pincode =Integer.parseInt(sc.nextLine());
      
        System.out.println("Enter address city:");
        String city = sc.nextLine();
      
        
       

        Student s = new Student(name, rollNo);
        var address = new Address();
        address.setCity(city);
        address.setPinCode(pincode);
        address.setStudent(s);

        students.add(s);


        System.out.println(students);

    }
}
