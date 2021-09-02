package com.faith.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.model.Requests;

@Repository
public interface RequestRepository extends JpaRepository<Requests,Long>{

}
