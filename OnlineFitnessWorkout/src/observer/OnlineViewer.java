package observer;

public class OnlineViewer implements Observer {

    private String name;
    private String exercise;

    public OnlineViewer(String name) {
        this.name = name;
    }


    @Override
    public void update(String exercise) {
        this.setExercise(exercise);
    }

    public String getName() {
        return name;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

}
