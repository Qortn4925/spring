package core.app5;


import core.app5.controller.Controller1;
import core.app5.controller.Controller2;
import core.app5.service.Service1;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App5 {
    public static void main(String[] args) {
        // Inversion Control  (IOC)
        // SPRING BEAN 객체 생성 , DI ,

        BeanFactory factory = SpringApplication.run(App5.class, args);

        Controller1 controller1 = factory.getBean(Controller1.class);
        Controller2 controller2 = factory.getBean(Controller2.class);
        Service1 service1 = factory.getBean(Service1.class);

        System.out.println("service1 = " + service1);
        System.out.println("controller2 = " + controller2);
        System.out.println("controller1 = " + controller1);


        System.out.println(controller1.getService1());
        System.out.println(controller2.getService1());

        controller1.sub1();
    }

}
