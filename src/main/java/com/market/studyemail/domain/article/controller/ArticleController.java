package com.market.studyemail.domain.article.controller;

import com.market.studyemail.domain.article.entity.Article;
import com.market.studyemail.domain.article.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class ArticleController {
    private final ArticleService articleService;

    @GetMapping("/article/list")
    public String list(Model model) {
        List<Article> articleList =  this.articleService.getList();
        model.addAttribute("articleList", articleList);

        return "article_list";
    }
}