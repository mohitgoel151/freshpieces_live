package org.boot.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

//@Configuration
//@EnableWebMvcSecurity
//@EnableAutoConfiguration(exclude = {
//        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class})
//        //org.springframework.boot.actuate.autoconfigure.ManagementSecurityAutoConfiguration.class})
//public class WebSecurityConfig123 extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().antMatchers(HttpMethod.OPTIONS, "/**")
//                .permitAll().antMatchers(HttpMethod.GET, "/**").permitAll()
//                .antMatchers(HttpMethod.POST, "/**").permitAll()
//
//                .anyRequest().authenticated().and().httpBasic();
//    }
//
//}

 public class WebSecurityConfig123 {

 }