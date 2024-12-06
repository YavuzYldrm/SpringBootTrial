package springboot.course.springcore.common;

import org.springframework.stereotype.Component;


@Component
public class FootballCoach implements Coach {

    public FootballCoach() {
        System.out.println("Football Coach is here!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Messi!";
    }
}