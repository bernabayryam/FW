package singleton;

import additionalobjects.WebCamera;
import command.ExerciseOperation;

public class FitnessInstructor {

    private static FitnessInstructor fitnessInstructor = null;
    private static final WebCamera webCamera = new WebCamera();

    private FitnessInstructor(WebCamera webCamera) {
        webCamera.startRecording(true);
    }


    public static FitnessInstructor getInstance() {
        if (fitnessInstructor == null) {
            System.out.println("Fitness instructor is ready for exercises!");
            fitnessInstructor = new FitnessInstructor(webCamera);
        }
        return fitnessInstructor;
    }

    public String tellExercise(ExerciseOperation exerciseOperation) {
        String exercise = exerciseOperation.execute();
        System.out.println("Fitness instructor tells to coach to do exercise: " + exercise);
        return exercise;
    }

    public void finishTheWorkout() {
        webCamera.stopRecording();
    }

}
