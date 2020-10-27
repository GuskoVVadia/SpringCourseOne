package Lessons.LessonOne.OptionTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("LessonOne.xml");
        appContext.getBean("frank", Instrumentalist.class).perform();

    }
}
