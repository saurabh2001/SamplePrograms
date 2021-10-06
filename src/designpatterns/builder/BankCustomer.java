package designpatterns.builder;

import java.time.Year;

public class BankCustomer {
    public static void main(String[] args) {

        // Ref: https://dzone.com/articles/design-patterns-the-builder-pattern
        BankAccount account = new BankAccount.Builder(123456)
                .withOwner("Saurabh")
                .atBranch("Pune")
                .withOpeningBalance(1000)
                .withInterestRate(10.2)
                .build();

        System.out.println(account.toString());
    }
}
