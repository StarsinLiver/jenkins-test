package com.example.ip;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * packageName : com.example.ip
 * fileName : Config
 * author : san26
 * date : 2024-03-30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2024-03-30         san26          최초 생성
 */

@Configuration
public class Config implements WebMvcConfigurer {

 @Bean
 public FilterRegistrationBean<MyFilter> methodFilterRegistrationBean() {
  FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>();
  registrationBean.setFilter(new MyFilter());
  registrationBean.addUrlPatterns("/*");

  return registrationBean;
 }
}
