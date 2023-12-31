package com.example.demo.repository;

import com.example.demo.account.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {

    @Query("SELECT a FROM Account a WHERE a.accountNum = ?1")
    Optional<Account> findByAccountNum(String accountNum);
}
