package springboot.course.springcore.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    public TennisCoach() {
        System.out.println("Tennis Coach is here!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Federer!";
    }
}
