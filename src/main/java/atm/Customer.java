package atm;

import org.springframework.stereotype.Component;

/**
 * A bank customer with a checking and a savings account.
 */
public class Customer {

   private int id;
   private String name;
   private int pin;
   private BankAccount account;

   /**
    * Constructs a customer with a given number and PIN.
    * @param id the customer number
    * @param name the customer name
    * @param pin the personal identification number
    */
   public Customer(int id, String name, int pin) {
      this(id, name, pin, 0);
   }


   public Customer(int id, String name, int pin, double balance) {
      this.id = id;
      this.name = name;
      this.pin = pin;
      this.account = new BankAccount(id, name, balance);
   }

   /**
    * Tests if this customer matches a customer number
    * and PIN.
    * @param inputPin a personal identification number
    * @return true if the customer number and PIN match
    */
   public boolean checkPin(int inputPin) {
      return pin == inputPin;
   }

   public String getName() {
      return name;
   }

   public int getId() {
      return id;
   }

   /**
    * Gets the account of this customer.
    * @return the account
    */
   public BankAccount getAccount() {
      return account;
   }
}
