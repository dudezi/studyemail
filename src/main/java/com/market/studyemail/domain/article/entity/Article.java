package com.market.studyemail.domain.article.entity;

import com.market.studyemail.global.jpa.BaseEntity;
import com.market.studyemail.domain.member.entity.Member;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article extends BaseEntity {
    private String title;
    private String content;
    @ManyToOne
    private Member author;
}