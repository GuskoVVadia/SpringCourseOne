package Lessons.LessonOne.OptionOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("BlackWhiteCameraRoll")
public class BlackWhiteCameraRoll implements CameraRoll{
    @Override
    public void processing() {
        System.out.println("-1 Чёрно-белый кадр.");
    }
}
