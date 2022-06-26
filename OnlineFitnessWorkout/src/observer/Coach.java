package observer;

import java.util.ArrayList;
import java.util.List;

public class Coach {

    private List<OnlineViewer> onlineViewers = new ArrayList<>();

    public void addViewer(OnlineViewer onlineViewer) {
        //As it is in task description not more than 3 viewers
        if (onlineViewers.size() > 2) {
            String errorMessage = "Can't have more than 3 online viewers!";
            System.out.println(errorMessage);
            throw new RuntimeException(errorMessage);
        }
        System.out.println(onlineViewer.getName() + " has joined!");
        this.onlineViewers.add(onlineViewer);
    }

    public void removeViewer(OnlineViewer onlineViewer) {
        this.onlineViewers.remove(onlineViewer);
    }

    public void setExercise(String exercise) {
        System.out.println("Coach shows exercise: " + exercise);
        for (OnlineViewer onlineViewer : this.onlineViewers) {
            System.out.println("Online viewer with name: " + onlineViewer.getName() + " is doing exercise: " + exercise);
            onlineViewer.update(exercise);
        }
    }

}
