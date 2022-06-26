package com.salihdamar.interprobe.interprobebootcamphw1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User extends JpaRepository<User,Long>{
    User findUserByName(String username);

}
