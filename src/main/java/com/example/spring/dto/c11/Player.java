package com.example.spring.dto.c11;

import java.util.List;

public class Player {
    private String id;
    private String nickName;
    private  String email;
    private  String name;
    private List<String> team;
    private List<Integer> scores;

    public String getEmail() {
        return email;
    }

    public Player(String id, String nickName, String name, List<String> team, List<Integer> scores , String email) {
        this.id = id;
        this.nickName = nickName;
        this.name = name;
        this.team = team;
        this.scores = scores;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getName() {
        return name;
    }

    public List<String> getTeam() {
        return team;
    }

    public List<Integer> getScores() {
        return scores;
    }

}
