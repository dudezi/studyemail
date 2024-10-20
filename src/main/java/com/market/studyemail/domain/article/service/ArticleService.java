package com.market.studyemail.domain.article.service;

import com.market.studyemail.domain.article.entity.Article;
import com.market.studyemail.domain.article.repository.ArticleRepository;
import com.market.studyemail.domain.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    public void create(String title, String content, Member member) {

//        Article article = new Article();
//        article.setTitle(title);
//        article.setContent(content);
        Article article = Article.builder()
                .title(title)
                .content(content)
                .author(member)
                .build();

        articleRepository.save(article);
    }

    public List<Article> getList() {
        return this.articleRepository.findAll();
    }
}