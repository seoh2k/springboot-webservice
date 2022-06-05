package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> { // DB Layer 접근자, JpaRepository를 상속하면 기본적인 CRUD 메서드가 자동으로 생성
}
