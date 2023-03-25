package config;

import entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "mihir")
    public Student mihirBean(){
        return new Student("Mihir", 48);
    }


    @Bean(name = "rodJohnson")
    public Student sureshBean(){
        System.out.println("Creator of Spring :)");
        return new Student("Suresh", 7);
    }

    @Bean(name = "azi")
    public Student aziBean(){
        return new Student("Azirel", 30);
    }

    @Bean(name = "yash")
    public Student yashBean(){
        return new Student("Yash", 10);
    }
}
