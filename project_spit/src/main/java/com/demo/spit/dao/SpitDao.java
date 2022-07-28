package com.demo.spit.dao;

import com.demo.spit.pojo.Spit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpitDao extends MongoRepository<Spit,String> {

    public Page<Spit> findByParentid(String parentid, Pageable pageable);



}
