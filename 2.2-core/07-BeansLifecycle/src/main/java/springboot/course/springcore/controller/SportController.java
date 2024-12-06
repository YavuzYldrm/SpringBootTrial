package springboot.course.springcore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.course.springcore.common.Coach;

@RestController
public class SportController {

    //private field for dependency
    private Coach myCoach;

    @Autowired
    public SportController(@Qualifier("basketballCoach") Coach theCoach){
        System.out.println("In Controller = " + getClass().getSimpleName());
        myCoach = theCoach;
    }

//    This type of injection is not supported anymore - Field Injection
//    @Autowired
//    private Coach myCoach1;

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
