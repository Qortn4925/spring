package com.example.spring.api;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Collection;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/main9")
public class ApiController9 {

    @GetMapping("sub10")
    public String sub10(Authentication authentication) {
        String name= authentication.getName();// 사용 자 이름
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        System.out.println("name = " + name);
        System.out.println("authorities = " + authorities);

        return null;
    }

    @GetMapping("sub9")
    @PreAuthorize("hasAnyAuthority('SCOPE_admin','SCOPE_manager')")
    public String sub9() {

        return" 어드민만";
    }  @GetMapping("sub8")
    @PreAuthorize("hasAnyAuthority('SCOPE_manager')")
    public String sub8() {

        return" 어드민만";
    }

        @GetMapping("sub7")
        @PreAuthorize("hasAuthority('SCOPE_admin')")
        public String sub7() {
            
            return" 어드민만";
        }


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
        System.out.println(jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue());
        return  jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue();
    }

    @GetMapping("sub2")
    public String sub2() {

        return  "누구나 접근 가능 !";
    }


    @GetMapping("sub3")
    @PreAuthorize("isAuthenticated()")
    public  String sub3(){

        return "로그인 한 사람만";
    }


    @GetMapping("sub4")
    public String sub4() {

        JwtClaimsSet claims = JwtClaimsSet.builder().
                issuer("self")    // 누가만듬
                .subject("son")  // 누구꺼
                .issuedAt(Instant.now()) //언제 생성
                .expiresAt(Instant.now().plusSeconds(36000))  //언제까지
                                        .claim("scope","admin")  //권한
                .build();

        // claims
        // 누가 만들었는지
        // 누구껀지
        // 언제 만들었고
        // 언제 까지인지
        System.out.println(jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue());
        return  jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue();
    }
    @GetMapping("sub5")
    public String sub5() {

        JwtClaimsSet claims = JwtClaimsSet.builder().
                issuer("self")    // 누가만듬
                .subject("son")  // 누구꺼
                .issuedAt(Instant.now()) //언제 생성
                .expiresAt(Instant.now().plusSeconds(36000))  //언제까지
                .claim("scope","manager")  //권한
                .build();

        // claims
        // 누가 만들었는지
        // 누구껀지
        // 언제 만들었고
        // 언제 까지인지
        System.out.println(jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue());
        return  jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue();
    }
    @GetMapping("sub6")
    public String sub6() {

        JwtClaimsSet claims = JwtClaimsSet.builder().
                issuer("self")    // 누가만듬
                .subject("son")  // 누구꺼
                .issuedAt(Instant.now()) //언제 생성
                .expiresAt(Instant.now().plusSeconds(36000))  //언제까지
                .claim("scope","admin manager")  //권한
                .build();

        // claims
        // 누가 만들었는지
        // 누구껀지
        // 언제 만들었고
        // 언제 까지인지
        System.out.println(jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue());
        return  jwtEncoder
                .encode(JwtEncoderParameters.from(claims))
                .getTokenValue();
    }

}
