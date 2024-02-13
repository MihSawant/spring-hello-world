package config;

import entities.Address;
import entities.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "mihir")
    public Student mihirBean(){
        return new Student("Mihir", 48);
    }
    @Bean
    public Address mihirAddress(){
        Address mihirAddress = new Address();
        mihirAddress.setCity("Mumbai");
        mihirAddress.setPinCode(400067);
        mihirAddress.setStudent(mihirBean());
        return mihirAddress;
    }


    @Bean(name = "suresh")
    public Student sureshBean(){
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

    @Bean
    public List<Student> studentsDB(){
        return new ArrayList<>();
    }
}
