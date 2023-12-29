package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BankConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            BankRepository repository, AccountRepository repository2) {
        return args -> {
            Bank b1 = new Bank("c9", "b1", "380576898");
            Bank b2 = new Bank("c9", "b2", "860715564");
            Bank b5 = new Bank("c11", "b5", "876982491");
            Bank b6 = new Bank("c11", "b6", "884924483");
            Bank b3 = new Bank("c11", "b3", "346922651");
            Bank b4 = new Bank("c16", "b4", "777594836");

            Account a1 = new Account("a1",
                    b1,
                    "c9",
                    "11879143",
                    LocalDate.of(2018, 8, 17),
                    "p2",
                    2000);

            Account a2 = new Account("a2",
                    b1,
                    "c9",
                    "16250716",
                    LocalDate.of(2019, 2, 15),
                    "p4",
                    18000);

            Account a3 = new Account("a3",
                    b1,
                    "c9",
                    "11010833",
                    LocalDate.of(2019, 5, 4),
                    "p4",
                    12000);

            Account a4 = new Account("a4",
                    b1,
                    "c9",
                    "87862188",
                    LocalDate.of(2018, 9, 23),
                    "p6",
                    7000);

            Account a5 = new Account("a5",
                    b1,
                    "c9",
                    "52807177",
                    LocalDate.of(2017, 11, 23),
                    "p6",
                    3000);

            Account a6 = new Account("a6",
                    b1,
                    "c9",
                    "91320550",
                    LocalDate.of(2019, 1, 18),
                    "p8",
                    16000);

            Account a7 = new Account("a7",
                    b2,
                    "c9",
                    "58548990",
                    LocalDate.of(2018, 2, 3),
                    "p8",
                    6000);

            Account a8 = new Account("a8",
                    b2,
                    "c9",
                    "42398334",
                    LocalDate.of(2018, 6, 14),
                    "p9",
                    7000);

            Account a9 = new Account("a9",
                    b2,
                    "c9",
                    "04033300",
                    LocalDate.of(2018, 11, 2),
                    "p9",
                    11000);

            Account a10 = new Account("a10",
                    b3,
                    "c11",
                    "94471656",
                    LocalDate.of(2017, 5, 31),
                    "p8",
                    17000);

            Account a11 = new Account("a11",
                    b4,
                    "c11",
                    "55188435",
                    LocalDate.of(2018, 11, 8),
                    "p8",
                    19000);

            Account a12 = new Account("a12",
                    b4,
                    "c11",
                    "20905436",
                    LocalDate.of(2018, 8, 4),
                    "p4",
                    5000);

            Account a13 = new Account("a13",
                    b5,
                    "c11",
                    "18341521",
                    LocalDate.of(2018, 5, 28),
                    "p9",
                    5000);

            Account a14 = new Account("a14",
                    b6,
                    "c11",
                    "16509602",
                    LocalDate.of(2018, 9, 17),
                    "p12",
                    19000);

            Account a15 = new Account("a15",
                    b6,
                    "c11",
                    "14956274",
                    LocalDate.of(2017, 7, 28),
                    "p12",
                    8000);
            repository.saveAll(Arrays.asList(b1,b2, b3, b4, b5, b6));
            repository2.saveAll(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15));
        };
    }
}
