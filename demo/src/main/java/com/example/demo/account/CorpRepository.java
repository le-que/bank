package com.example.demo.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CorpRepository extends JpaRepository<Corporation, String> {
    @Query("SELECT c FROM Corporation c WHERE c.corpId = ?1")
    Optional<Corporation> findByCorpId(String corpId);

}
