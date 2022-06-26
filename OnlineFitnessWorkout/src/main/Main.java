package main;

import command.LieDownOperation;
import command.StandUpOperation;
import observer.Coach;
import observer.OnlineViewer;
import singleton.FitnessInstructor;

public class Main {
    public static void main(String[] args) {

        FitnessInstructor fitnessInstructor = FitnessInstructor.getInstance(); //singleton
        String lieDownExercise = fitnessInstructor.tellExercise(new LieDownOperation()); // command


        Coach coach = new Coach(); //observer
        coach.addViewer(new OnlineViewer("Petar"));
        coach.addViewer(new OnlineViewer("Ivan"));
        coach.addViewer(new OnlineViewer("George"));
        coach.setExercise(lieDownExercise);

        System.out.println();
        System.out.println("Next exercise!");
        String standUpExercise = fitnessInstructor.tellExercise(new StandUpOperation());
        coach.setExercise(standUpExercise);

        fitnessInstructor.finishTheWorkout();
    }
}