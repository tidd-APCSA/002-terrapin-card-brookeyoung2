public class TerrapinCard{

private double balance;

public TerrapinCard(double theBalance) {
balance = theBalance;
}

public  String toString() {
  return("The card has " + balance + " dollars.");
}

public double getBalance(){
  return balance;
}

public void payEconomical() {
balance = balance - 2.50;
}

public void payGourmet() {
balance = balance - 4.00;
}
public void loadMoney(double amount) {
  if (amount > 0){
    balance = balance + amount;
  }
  if (balance > 150){
    balance = 150;
}
}


}
