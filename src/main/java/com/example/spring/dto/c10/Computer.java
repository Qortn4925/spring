package com.example.spring.dto.c10;

public class Computer {
    private int id;
    private String name;
    private String type;
    private  boolean expired;

        public void setModel(String type) {
            this.type = type;
        }

        public  String getModel(){
            return type;
        }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 필드가 booleand 타입이면 get 메소드는 is로 시작
    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }
}
