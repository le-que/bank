package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class BankConfig {
    @Bean
    CommandLineRunner commandLineRunner2(
            BankRepository repository) {
        return args -> {
            List<Bank> banks = Arrays.asList(
                    new Bank("c9", "b1", "380576898"),
                    new Bank("c9", "b2", "860715564"),
                    new Bank("c11", "b5", "876982491"),
                    new Bank("c11", "b6", "884924483"),
                    new Bank("c11", "b3", "346922651"),
                    new Bank("c16", "b4", "777594836")
            );
            repository.saveAll(banks);
        };
    }
}
