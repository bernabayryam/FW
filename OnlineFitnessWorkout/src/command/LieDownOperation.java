package command;

public class LieDownOperation implements ExerciseOperation {

    private final Exercise exercise = new Exercise();

    @Override
    public String execute() {
        return exercise.makeLieDown();
    }

}
