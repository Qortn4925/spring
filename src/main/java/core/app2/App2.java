package core.app2;

import core.app2.controller.Controller1;
import core.app2.controller.Controller2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App2 {
    public static void main(String[] args) {
        // spring bean들을 생성 >스프링이 만들어준 클래스 인스턴스 
        //메인 메소드에 @spring 뭐시기 붙어잇으면 , 현재 패키지와 , 하위 패키지를 모두 탐색
        // @Component 가 붙은 클래스로 객체(Spring bena)을 생성함.
        // dependency injection 의존성 주입? 엮는다 (auto wired)

        ApplicationContext context = SpringApplication.run(App2.class, args);
        Controller1 b1 = context.getBean(Controller1.class);
        Controller1 b2 = context.getBean(Controller1.class);
        // singleton 타입이라  두 객체가 같은걸 참조
        System.out.println(b2.hashCode());
        System.out.println(b1.hashCode());

        Controller2 controller2 = context.getBean(Controller2.class);
        System.out.println("controller2 = " + controller2);

    }

}



