package com.salihdamar.interprobe.interprobebootcamphw1.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product extends CrudRepository<Product, Long> {

}
