//package com.javatpoint.LoginAndRegistrationPage.AdminLogin;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http.authorizeRequests().requestMatchers("/admin/**").hasRole("ADMIN")
//                .requestMatchers("/user/**").hasRole("USER")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .successHandler(customSuccessHandler())
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationSuccessHandler customSuccessHandler() {
//        return new CustomAuthenticationSuccessHandler();
//    }
//}
//
