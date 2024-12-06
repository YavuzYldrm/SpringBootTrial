package springboot.course.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Scope type determine whether same bean or not
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class BasketballCoach implements Coach {

    public BasketballCoach() {
        System.out.println("Basketball Coach is here!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Lebron!";
    }
}
