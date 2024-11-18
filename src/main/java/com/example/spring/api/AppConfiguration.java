package com.example.spring.api;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

@Configuration
public class AppConfiguration {

    @Value("classpath:secret/app.pub")
    RSAPublicKey publicKey;
    @Value("classpath:secret/app.key")
    RSAPrivateKey privateKey;


    @Bean
    JwtDecoder jwtDecoder() {
        return NimbusJwtDecoder.withPublicKey(publicKey).build();
    }

    // config   어노 안에
    // bean 어노테이션을 붙은 , 어떤 메소드에서 리턴하면 > javabeans로  만들어서 , 의존성 관리 해줌
    @Bean
    JwtEncoder jwtEncoder() {
        JWK jwk = new RSAKey.
                Builder(publicKey).
                privateKey(privateKey).
                build();

        JWKSource<SecurityContext> jwks = new ImmutableJWKSet<>(new JWKSet(jwk));

      return  new NimbusJwtEncoder(jwks);

    }


}
