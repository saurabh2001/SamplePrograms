package designpatterns.builderDP;

public class BankAccount {
    private long accountNumber; // this is mandatory
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    private BankAccount(Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    public static class Builder {
        private long accountNumber; // this is mandatory, so will be in Builder constructor
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber){
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch){
            this.branch = branch;
            return  this;
        }

        public Builder withOpeningBalance(double balance){
            this.balance = balance;
            return  this;
        }

        public Builder withInterestRate(double interestRate){
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }
    }
}
