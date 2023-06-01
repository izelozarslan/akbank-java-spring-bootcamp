package com.izelozarslan.homework2.entity;

import com.izelozarslan.homework2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "COMMENT")
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Comment",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name ="Comment",sequenceName = "COMMENT_ID_SEQ")
    private Long id;

    @Column(name = "COMMENT", length = 400, nullable = false)
    private String comment;

    @Column(name = "PRODUCT_ID", nullable = false )
    private Long productId;

    @Column(name = "USER_ID", nullable = false )
    private Long userId;
}
