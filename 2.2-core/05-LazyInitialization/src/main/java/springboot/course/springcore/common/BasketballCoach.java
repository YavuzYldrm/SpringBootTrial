package springboot.course.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
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
