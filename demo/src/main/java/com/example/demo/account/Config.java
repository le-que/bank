package com.example.demo.account;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(
            BankRepository bRepository,
            AccountRepository aRepository,
            CorpRepository cRep,
            CustomerRepository cusRep) {
        return args -> {
            Corporation c1 = new Corporation("c1", "Berkshire Hathaway", 708);
            Corporation c9 = new Corporation("c9", "Bank of America", 2325);
            Corporation c11 = new Corporation("c11", "Wells Fargo", 1895);
            Corporation c16 = new Corporation("c16", "Citigroup", 1917);
            Corporation c17 = new Corporation ("c17", "MetLife", 686);
            Bank b1 = new Bank(c9, "b1", "380576898");
            Bank b2 = new Bank(c9, "b2", "860715564");
            Bank b5 = new Bank(c11, "b5", "876982491");
            Bank b6 = new Bank(c11, "b6", "884924483");
            Bank b3 = new Bank(c17, "b3", "346922651");
            Bank b4 = new Bank(c16, "b4", "777594836");

            Account a1 = new Account("a1",
                    b1,
                    "11879143",
                    LocalDate.of(2018, 8, 17),
                    "p2",
                    2000);

            Account a2 = new Account("a2",
                    b1,
                    "16250716",
                    LocalDate.of(2019, 2, 15),
                    "p4",
                    18000);

            Account a3 = new Account("a3",
                    b1,
                    "11010833",
                    LocalDate.of(2019, 5, 4),
                    "p4",
                    12000);

            Account a4 = new Account("a4",
                    b1,
                    "87862188",
                    LocalDate.of(2018, 9, 23),
                    "p6",
                    7000);

            Account a5 = new Account("a5",
                    b1,
                    "52807177",
                    LocalDate.of(2017, 11, 23),
                    "p6",
                    3000);

            Account a6 = new Account("a6",
                    b1,
                    "91320550",
                    LocalDate.of(2019, 1, 18),
                    "p8",
                    16000);

            Account a7 = new Account("a7",
                    b2,
                    "58548990",
                    LocalDate.of(2018, 2, 3),
                    "p8",
                    6000);

            Account a8 = new Account("a8",
                    b2,
                    "42398334",
                    LocalDate.of(2018, 6, 14),
                    "p9",
                    7000);

            Account a9 = new Account("a9",
                    b2,
                    "04033300",
                    LocalDate.of(2018, 11, 2),
                    "p9",
                    11000);

            Account a10 = new Account("a10",
                    b3,
                    "94471656",
                    LocalDate.of(2017, 5, 31),
                    "p8",
                    17000);

            Account a11 = new Account("a11",
                    b4,
                    "55188435",
                    LocalDate.of(2018, 11, 8),
                    "p8",
                    19000);

            Account a12 = new Account("a12",
                    b4,
                    "20905436",
                    LocalDate.of(2018, 8, 4),
                    "p4",
                    5000);

            Account a13 = new Account("a13",
                    b5,
                    "18341521",
                    LocalDate.of(2018, 5, 28),
                    "p9",
                    5000);

            Account a14 = new Account("a14",
                    b6,
                    "16509602",
                    LocalDate.of(2018, 9, 17),
                    "p12",
                    19000);

            Account a15 = new Account("a15",
                    b6,
                    "14956274",
                    LocalDate.of(2017, 7, 28),
                    "p12",
                    8000);



//            Person p3 = new Person("p3",
//                    "345-06-4703",
//                    "Noah",
//                    "Williams",
//                    LocalDate.of(1992, 3, 16));
//
//            Person p4 = new Person("p4",
//                    "456-10-5814",
//                    "Emma",
//                    "Williams",
//                    LocalDate.of(1989, 12, 29));
//
//            Person p5 = new Person("p5",
//                    "567-15-6925",
//                    "Oliver",
//                    "Garcia",
//                    LocalDate.of(1993, 5, 9));
//
//            Person p6 = new Person("p6",
//                    "678-21-7036",
//                    "Ava",
//                    "Garcia",
//                    LocalDate.of(1991, 10, 23));
//
//            Person p7 = new Person("p7",
//                    "789-28-8147",
//                    "Elijah",
//                    "Wilson",
//                    LocalDate.of(2000, 10, 28));
//
//            Person p8 = new Person("p8",
//                    "890-36-9258",
//                    "Charlotte",
//                    "Martinez",
//                    LocalDate.of(1995, 6, 27));
//
//            Person p9 = new Person("p9",
//                    "901-45-0369",
//                    "William",
//                    "Anderson",
//                    LocalDate.of(1998, 2, 20));
//
//            Person p10 = new Person("p10",
//                    "012-55-1470",
//                    "Sophia",
//                    "Taylor",
//                    LocalDate.of(2000, 2, 12));
//
//            Person p11 = new Person("p11",
//                    "135-66-2604",
//                    "James",
//                    "Garcia",
//                    LocalDate.of(1984, 5, 25));
//
//            Person p12 = new Person("p12",
//                    "246-78-3715",
//                    "Amelia",
//                    "Moore",
//                    LocalDate.of(2001, 11, 22));

            Customer cus1 = new Customer("p1",
                    "234-03-3692",
                    "Olivia",
                    "Johnson",
                    LocalDate.of(1991, 5, 13),
                    "(400) 627-4404",
                    LocalDate.of(2012, 9, 18),
                    790);
            Customer cus2 = new Customer("p2",
                    "123-01-2581",
                    "Liam",
                    "Smith",
                    LocalDate.of(1991, 5, 13),
                    "(400) 627-4404",
                    LocalDate.of(2012, 9, 18),
                    790);

//            Customer cus4 = new Customer("p4",
//                    "(300) 304-3161",
//                    LocalDate.of(2013, 4, 21),
//                    535);
//
//            Customer cus6 = new Customer("p6",
//                    "(514) 941-7326",
//                    LocalDate.of(2015, 7, 27),
//                    625);
//
//            Customer cus8 = new Customer("p8",
//                    "(440) 918-0153",
//                    LocalDate.of(2012, 10, 16),
//                    630);
//
//            Customer cus9 = new Customer("p9",
//                    "(426) 585-0612",
//                    LocalDate.of(2013, 5, 9),
//                    585);
//
//            Customer cus10 = new Customer("p10",
//                    "(229) 203-9179",
//                    LocalDate.of(2017, 12, 27),
//                    525);
//
//            Customer cus12 = new Customer("p12",
//                    "(529) 820-3731",
//                    LocalDate.of(2011, 11, 23),
//                    705);

            cRep.saveAll(Arrays.asList(c1, c9, c11, c16, c17));
            bRepository.saveAll(Arrays.asList(b1,b2, b3, b4, b5, b6));
            aRepository.saveAll(Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15));
            cusRep.saveAll(Arrays.asList(cus1, cus2));
        };
    }
}
