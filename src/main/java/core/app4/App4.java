package core.app4;


import org.springframework.boot.autoconfigure.SpringBootApplication;


public class App4 {
//    스프링 없이 만들때 객체의 생성과 , 연결을 스스로 만들어줘야함



    public static void main(String[] args) {
        Controller1 controller1 = new Controller1();
        Controller2 controller2 = new Controller2();
        Service1 service1 = new Service1();
        controller1.setS(service1);
        controller2.setS(service1);

    }
}

class Controller1 {
    Service1 s;

    public void setS(Service1 s) {
        this.s = s;
    }

    public void method1() {
        System.out.println("요청파라미터 분석/가공");
        s.crud();
    }
}

class Controller2 {
    Service1 s;

    public void setS(Service1 s) {
        this.s = s;
    }

    public void method1() {
        System.out.println("요청 분석");
        s.crud();
    }
}

class Service1 {
    public void crud() {
        System.out.println("CRUD");
    }
}