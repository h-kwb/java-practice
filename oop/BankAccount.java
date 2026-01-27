class BankAccount {
  private int balance;

  // 残高照会
  public int getBalance() {
    return this.balance;
  }

  // 元金Set
  public void setBalance(int balance) {
    this.balance = balance;
  }

  // 入金処理
  public void desposit(int amount) {
    this.balance += amount;
    System.out.println(amount + "円入金");
  }

  // 出金処理
  public void withdraw(int amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      System.out.println(amount + "円出金");
    } else {
      System.out.println("残高不足の為、出金不可");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    BankAccount ba = new BankAccount();
    // 元金Set
    ba.setBalance(100000);
    System.out.println("残高：" + ba.getBalance());
    
    // 入金処理
    ba.desposit(10000);
    System.out.println("残高：" + ba.getBalance());
    
    // 不正な出金処理
    ba.withdraw(10000000);
    System.out.println("残高：" + ba.getBalance());
    
    // 出金
    ba.withdraw(15000);
    System.out.println("残高：" + ba.getBalance());
  }
}
