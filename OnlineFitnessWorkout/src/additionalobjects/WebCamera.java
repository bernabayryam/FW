package additionalobjects;

public class WebCamera {

    private boolean isRecording;

    public boolean isRecording() {
        return isRecording;
    }

    public void startRecording(boolean recording) {
        System.out.println("Camera start recording. Everyone can join the online stream.");
        isRecording = recording;
    }

    public void stopRecording() {
        System.out.println("Camera stop recording. Finished workout.");
        isRecording = false;
    }

}
