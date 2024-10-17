package core.app10;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App10 {
    public static void main(String[] args) {
        BeanFactory factory = SpringApplication.run(App10.class, args);
        Com1 com1 = factory.getBean(Com1.class);
        Com2 com2 = factory.getBean(Com2.class);

        Object o = com1.getCom2();

        System.out.println(o);
        System.out.println(o==com2);

    }

}
