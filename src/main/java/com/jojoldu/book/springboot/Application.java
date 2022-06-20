package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// @EnableJpaAuditing // JPA Auditing 활성화 -> 테스트에 시큐리티 적용하기 위해서 삭제
@SpringBootApplication // 스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정, 항상 프로젝트의 최상단에 위치
public class Application { // 메인클래스
    public static void main(String[] args){
        SpringApplication.run(Application.class, args); // SpringApplication.run: 내장 WAS 실행
    }
}
