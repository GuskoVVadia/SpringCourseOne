package Lessons.LessonOne.OptionOne;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Lessons.LessonOne.OptionOne")
public class OptionOneConfig {

    @Bean(name = "CameraColorRoll")
    public ColorCameraRoll cameraColorRoll(){
        return new ColorCameraRoll();
    }

    @Bean(name = "BlackWhiteCameraRoll")
    public BlackWhiteCameraRoll BlackWhiteCameraRoll(){
        return new BlackWhiteCameraRoll();
    }

    @Bean(name = "camera")

    public Camera camera(@Qualifier("CameraColorRoll") CameraRoll cameraRoll){
        Camera camera = new Camera();
        camera.setCameraRoll(cameraRoll);
        return camera;
    }

}
