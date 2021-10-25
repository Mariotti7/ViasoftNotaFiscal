package com.example.apinfe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apinfe.model.NFE;

@Repository
public interface RepositoryNFE extends JpaRepository<NFE, Long>{

}
