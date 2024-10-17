package core.app8;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App8 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App8.class, args);
        Component1 b1 = context.getBean(Component1.class);
        Componenet2 b2 = context.getBean(Componenet2.class);

        Componenet2 o = b1.getComponenet2();

        System.out.println(b2==o);

    }
}
