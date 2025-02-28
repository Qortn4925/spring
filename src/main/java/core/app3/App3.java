package core.app3;


import core.app3.service.Service1;
import core.app3.service.Service2;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App3 {
    public static void main(String[] args) {

         BeanFactory factory = SpringApplication.run(App3.class, args);
        Service1 b1 = factory.getBean(Service1.class);
         Service2 b2 = factory.getBean(Service2.class);
        System.out.println(b1);
        System.out.println(b2);

//        클래스명 > lowcamelcase으로도 가능
        Object b3 = factory.getBean("service1");
        System.out.println("b3 = " + b3);
        Object b4 = factory.getBean("service111");
        System.out.println("b4 = " + b4);
    }

}
