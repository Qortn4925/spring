package core.app6.controller;

import core.app6.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller1 {
    Service service;

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }

    public  void sub1(){
        service.serviece();
    }
}
