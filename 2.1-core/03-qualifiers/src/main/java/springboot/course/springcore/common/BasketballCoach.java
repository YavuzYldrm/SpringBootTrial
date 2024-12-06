package springboot.course.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Lebron!";
    }
}
