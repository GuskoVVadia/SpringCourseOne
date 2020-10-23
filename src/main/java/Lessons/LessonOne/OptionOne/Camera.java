package Lessons.LessonOne.OptionOne;

import org.springframework.stereotype.Component;

@Component("Camera")
public class Camera {

    private CameraRoll cameraRoll;

    public Camera() {
    }

    public CameraRoll getCameraRoll() {
        return this.cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    public void goPhoto(){
        System.out.println("Щёлк");
        this.cameraRoll.processing();
    }
}
