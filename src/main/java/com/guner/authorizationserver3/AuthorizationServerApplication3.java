package com.guner.authorizationserver3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://www.javaadvent.com/2022/12/a-new-spring-security-authorization-server.html

/**
 *
 * http://localhost:8000/oauth2/authorize?response_type=code&client_id=client1&scope=profile&redirect_uri=http://127.0.0.1:8080/authorized&code_challenge=QYPAZ5NU8yvtlQ9erXrUYR-T5AGCjCF47vN-KsaI2A8&code_challenge_method=S256
 * veya
 *
 * http://localhost:8000/oauth2/authorize?response_type=code&client_id=client1&scope=profile&redirect_uri=http://127.0.0.1:8080/authorized&code_challenge=ram_challenge&code_challenge_method=S256
 * http://localhost:8000/oauth2/authorize?response_type=code&client_id=client1&scope=email&redirect_uri=http://127.0.0.1:8080/authorized&code_challenge=ram_challenge&code_challenge_method=S256
 * http://localhost:8000/oauth2/authorize?response_type=code&client_id=client1&scope=email profile&redirect_uri=http://127.0.0.1:8080/authorized&code_challenge=ram_challenge&code_challenge_method=S256
 * bunlarda consent çıkar profile ve email için ( email profile diye iletilirse iki seçenek de çıkar
 *
 * response: http://127.0.0.1:8080/authorized?code=of6if274g6U--ixvcfb8RRWQ3LnDIyRulhRuBHI4QuZiSDp_s9DvJrb_ZdbM3jeznEk9OXUBfKXGVhi50-oxlAMJXElvBgMgYzIWFxlSpd9HQ5cglmR0HLsURblLZkqK
 *
 * scope openid'de consent ekranı gelmez.
 * http://localhost:8000/oauth2/authorize?response_type=code&client_id=client1&scope=openid&redirect_uri=http://127.0.0.1:8080/authorized&code_challenge=ram_challenge&code_challenge_method=S256
 */

@SpringBootApplication
public class AuthorizationServerApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServerApplication3.class, args);
	}

}
