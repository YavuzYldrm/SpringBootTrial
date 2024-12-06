package springboot.course.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportController {

    //private field for dependency
    private Coach myCoach;

    @Autowired
    public SportController(Coach theCoach){
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
