import config.AppConfig;
import entities.Address;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student1 = (Student) context.getBean("suresh");
        Student student2 =  (Student) context.getBean("yash");
        Student student3 = (Student) context.getBean("mihir");
        Student student4 = (Student) context.getBean("azi");

        Address myAddress = (Address) context.getBean(Address.class);
        System.out.println(myAddress);


    }
}
