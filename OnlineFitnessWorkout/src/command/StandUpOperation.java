package command;

public class StandUpOperation implements ExerciseOperation {

    private final Exercise exercise = new Exercise();

    @Override
    public String execute() {
        return exercise.makeStandUp();
    }

}
