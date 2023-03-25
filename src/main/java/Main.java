import entities.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        var ctx = new ClassPathXmlApplicationContext("oh_why.xml");

        Student me = (Student) ctx.getBean("mihir");
        Student two = (Student) ctx.getBean("azi");
        Student three = (Student) ctx.getBean("yash");
        Student four = (Student) ctx.getBean("suresh");
        System.out.printf("1: %s%n2: %s%n3: %s%n4: %s", me, two, three, four);

    }
}
