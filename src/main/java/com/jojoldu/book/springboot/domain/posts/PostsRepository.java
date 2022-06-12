package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> { // DB Layer 접근자, JpaRepository를 상속하면 기본적인 CRUD 메서드가 자동으로 생성

    @Query("SELECT p FROM Posts p ORDER BY p.id DESC") // SpringDataJps에서 제공하지 않는 메소드는 쿼리로 작성해도 된다.
    List<Posts> findAllDesc();
}
