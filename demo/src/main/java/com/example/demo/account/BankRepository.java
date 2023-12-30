package com.example.demo.account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, String> {
    @Query("SELECT b FROM Bank b WHERE b.bankId = ?1")
    Optional<Bank> findByBankId(String bankId);
}
