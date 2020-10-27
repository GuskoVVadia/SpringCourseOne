package Lessons.LessonOne.OptionOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new AnnotationConfigApplicationContext(OptionOneConfig.class);
        Camera camera = appContext.getBean("camera", Camera.class);
        camera.goPhoto();

    }
}
