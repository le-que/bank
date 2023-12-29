package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AccountConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            AccountRepository repository) {
        return args -> {
            List<Account> accounts = Arrays.asList(
                    new Account("a1", "b1", "c9", "11879143", LocalDate.of(2018, 8, 17), "p2", 2000),
                    new Account("a2", "b1", "c9", "16250716", LocalDate.of(2019, 2, 15), "p4", 18000),
                    new Account("a3", "b1", "c9", "11010833", LocalDate.of(2019, 5, 4), "p4", 12000),
                    new Account("a4", "b1", "c9", "87862188", LocalDate.of(2018, 9, 23), "p6", 7000),
                    new Account("a5", "b1", "c9", "52807177", LocalDate.of(2017, 11, 23), "p6", 3000),
                    new Account("a6", "b1", "c9", "91320550", LocalDate.of(2019, 1, 18), "p8", 16000),
                    new Account("a7", "b2", "c9", "58548990", LocalDate.of(2018, 2, 3), "p8", 6000),
                    new Account("a8", "b2", "c9", "42398334", LocalDate.of(2018, 6, 14), "p9", 7000),
                    new Account("a9", "b2", "c9", "04033300", LocalDate.of(2018, 11, 2), "p9", 11000),
                    new Account("a10", "b1", "c11", "94471656", LocalDate.of(2017, 5, 31), "p8", 17000),
                    new Account("a11", "b1", "c11", "55188435", LocalDate.of(2018, 11, 8), "p8", 19000),
                    new Account("a12", "b1", "c11", "20905436", LocalDate.of(2018, 8, 4), "p4", 5000),
                    new Account("a13", "b2", "c11", "18341521", LocalDate.of(2018, 5, 28), "p9", 5000),
                    new Account("a14", "b2", "c11", "16509602", LocalDate.of(2018, 9, 17), "p12", 19000));
            repository.saveAll(accounts);
        };
    }
}
