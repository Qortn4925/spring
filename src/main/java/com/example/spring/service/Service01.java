package com.example.spring.service;

import com.example.spring.mapper.Mapper09;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class Service01 {
    private Mapper09 mapper;

    public void transferMoney1(Integer money) {
//         전체 커밋 or 전체 롤백 시켜줌
        mapper.updateMoney(money);
        mapper.updateMoney2(money);

    }

    public void transferMoney2(Integer money) {
        mapper.updateMoney(money);
        int a = 0;
        int b = 5 / a;
        mapper.updateMoney2(money);
    }

    public void transferMoney3(Integer money) {
        mapper.updateMoney(money);
        try {
            Class.forName("");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        mapper.updateMoney2(money);
    }


}
