package com.example.spring.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main9")
public class ApiController9 {


    // 의존성 주입 받는 방법, 다시,
    final JwtEncoder jwtEncoder;

    @GetMapping("sub1")
    public String sub1() {
        JwtClaimsSet claims = JwtClaimsSet.builder().
        issuer("self")    // 누가만듬
                .subject("son")  // 누구꺼
                        .issuedAt(Instant.now()) //언제 생성
                                .expiresAt(Instant.now().plusSeconds(36000))  //언제까지
//                                        .claim("scope","adimin manager user")  //권한
                .build();

        // claims
        // 누가 만들었는지
        // 누구껀지
        // 언제 만들었고
        // 언제 까지인지

        return  jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue();
    }

}
