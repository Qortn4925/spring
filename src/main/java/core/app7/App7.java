package core.app7;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App7 {
    public static void main(String[] args) {
        BeanFactory context = SpringApplication.run(App7.class, args);
        Bean1 B1 = context.getBean(Bean1.class);

        Bean2 B2 = context.getBean(Bean2.class);

        Bean2 o  =B1.getBean2();
//         싱글톤이라  하나으 ㅣ객체 참조  ㅇㅅㅇ
        System.out.println(B2==o);
        
    }
}
