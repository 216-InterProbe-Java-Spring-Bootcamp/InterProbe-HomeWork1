package com.salihdamar.interprobe.interprobebootcamphw1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRODUCT")
@Getter
@Setter
public class Product {

    @Id
    @SequenceGenerator(name = "product_generator", sequenceName = "PRODUCT_ID_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "product_generator")
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", length = 50)
    private String name;

    @Column(name = "PRICE", precision = 10, scale = 3)
    private BigDecimal price;

    @Column(name = "EXPIRATOIN_DATE", nullable = true) //default olarak zaten true
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

}
