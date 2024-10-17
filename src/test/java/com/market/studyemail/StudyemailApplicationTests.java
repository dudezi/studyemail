package com.market.studyemail;

import com.market.studyemail.domain.article.service.ArticleService;
import com.market.studyemail.domain.member.entity.Member;
import com.market.studyemail.domain.member.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudyemailApplicationTests {

	@Autowired
	ArticleService articleService;

	@Autowired
	MemberService memberService;
	@Test
	void join() {
		Member member = memberService.join("test", "1234", "tester", "test@test.com");
	}
	@Test
	void contextLoads() {
		Member member = memberService.join("test", "1234", "tester", "test@test.com");
		for (int i = 0; i <= 30; i++) {
			articleService.create("제목" + i, "내용" + i, member);
		}
	}
}
