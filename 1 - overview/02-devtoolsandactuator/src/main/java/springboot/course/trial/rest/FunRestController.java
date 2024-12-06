package springboot.course.trial.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController  {

    @GetMapping("/")
    public String sayHello() {
         return "Hello!";
     }

     @GetMapping("workout")
    public String getDailyWorkout() {
        return "Push Up!";
     }
}