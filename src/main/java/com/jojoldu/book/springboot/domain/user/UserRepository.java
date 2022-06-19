package com.jojoldu.book.springboot.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// User의 CRUD를 책임짐
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); // 소셜 로그인으로 반환되는 값 중 email을 통해 중복 확인하기 위한 메서드
}
