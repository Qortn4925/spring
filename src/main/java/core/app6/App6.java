package core.app6;

import core.app6.controller.Controller1;
import core.app6.controller.Controller2;
import core.app6.service.Service;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App6 {
    public static void main(String[] args) {
        BeanFactory factory = SpringApplication.run(App6.class, args);
        Controller1 c1 = factory.getBean(Controller1.class);
        Controller2 c2 = factory.getBean(Controller2.class);
        Service s1 = factory.getBean(Service.class);

        c1.sub1();
        c2.sub1();
    }
}
