package com.salihdamar.interprobe.interprobebootcamphw1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT_COMMENT")
@Getter
@Setter
public class ProductComment {

    @SequenceGenerator(name = "product_comment_generator", sequenceName = "PRODUCT_COMMENT_ID_SEQ", allocationSize = 1)
    @Id
    @GeneratedValue(generator = "product_comment_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "COMMENT", length = 500)
    private String comment;

    @Column(name = "COMMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date commentDate;

    @Column(name = "PRODUCT_ID")
    private Long productId;

    @Column(name = "USER_ID")
    private Long userId;


}
