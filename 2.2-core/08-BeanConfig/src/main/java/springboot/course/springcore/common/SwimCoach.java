package springboot.course.springcore.common;

public class SwimCoach implements Coach{


    public SwimCoach() {
        System.out.println("Swim Coach is here!");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice for becoming Michael Phelps!";
    }
}
