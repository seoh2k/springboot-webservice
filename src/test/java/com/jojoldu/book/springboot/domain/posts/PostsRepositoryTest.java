package com.jojoldu.book.springboot.domain.posts;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest // H2 데이터베이스를 자동으로 실행
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After // Junit에서 단위테스트가 끝날 때마다 수행되는 메서드를 지정, 배포 전 전체 테스트를 수행할 때 테스트간 데이터 침범을 막기위해 사용
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void 게시글저장_불러오기(){
        // given
        String title = "테스트 게시글";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder() // postsRepository.save: 테이블 posts에 insert/update 쿼리를 실행
                .title(title)
                .content(content)
                .author("jojoldu@gmail.com")
                .build());

        // when
        List<Posts> postsList = postsRepository.findAll(); // postsRepository.findAll: 테이블 posts에 있는 모든 데이터를 조회해오는 메서드

        // then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitile()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
    }

}
