package springboot.course.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Scope type determine whether same bean or not
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("Basketball Coach is here!");
    }

    @PostConstruct
    public void postConstructMethod() {
        System.out.println("Basketball Coach Post Construct");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println("Basketball Coach Pre Destroy");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Lebron!";
    }
}
