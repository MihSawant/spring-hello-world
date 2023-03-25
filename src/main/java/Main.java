import config.AppConfig;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = (Student) context.getBean("rodJohnson");
        Student student2 =  (Student) context.getBean("yash");
        Student student3 = (Student) context.getBean("mihir");
        Student student4 = (Student) context.getBean("azi");
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);


    }
}
