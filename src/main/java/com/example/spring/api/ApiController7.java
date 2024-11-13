package com.example.spring.api;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/main7")
public class ApiController7 {
    @GetMapping("sub1")
    public String sub1(){
        return "sub1";
    }

    @GetMapping("sub3")
    public ResponseEntity sub3(){
        ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(200));
    return response;
    }

    @GetMapping("sub4")
    public ResponseEntity sub4(){
        ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(404));
        return response;
    }

    @GetMapping("sub6")
    public ResponseEntity sub6(){
        ResponseEntity response = ResponseEntity.ok().build();
        return response;
    }

    @GetMapping("sub9")
    public ResponseEntity sub9(){

        return  ResponseEntity.status(405).build();
    }
    @GetMapping("sub10")
    public ResponseEntity sub10(){

        return  ResponseEntity.status(202).build();
    }
    @GetMapping("sub11")
    public ResponseEntity sub11(){

        return  ResponseEntity.status(403).build();
    }

    @GetMapping("sub12")
    public ResponseEntity<Map<String,Object>> sub12(){

        ResponseEntity response = ResponseEntity.status(405).body(Map.of("name", "son", "age", 30));
        return response;
    }
}

