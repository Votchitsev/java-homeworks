class Account {
  private double balance = 0;

  public void deposit(double amount) {
    balance += amount;
  }

  public double getBalance() {
    return balance;
  }

  protected void withdraw(double amount) {
    balance -= amount;
  }
}

class PremiumAccaunt extends Account {
  void bonus() {
    deposit(getBalance() * 1.1);
  }
}

public class Main {
  public static void main(String[] args) {
    PremiumAccaunt userAccount = new PremiumAccaunt();
    userAccount.deposit(10);
    userAccount.withdraw(3);
    double userBalance = userAccount.getBalance();
    System.out.println(userBalance);
  }
}
