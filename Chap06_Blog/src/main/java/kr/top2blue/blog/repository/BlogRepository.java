package kr.top2blue.blog.repository;

import org.springframework.data.repository.CrudRepository;

import kr.top2blue.blog.domain.Article;

public interface BlogRepository extends CrudRepository<Article, Long>{

}
