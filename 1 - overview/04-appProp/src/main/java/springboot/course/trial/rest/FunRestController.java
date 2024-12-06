package springboot.course.trial.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController  {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/getTeamName")
    public String getTeamName() {return teamName;}

    @GetMapping("/")
    public String sayHello() {
         return "Hello!";
     }

     @GetMapping("workout")
    public String getDailyWorkout() {
        return "Push Up!";
     }
}
