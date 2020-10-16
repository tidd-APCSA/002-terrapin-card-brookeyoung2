import javax.crypto.AEADBadTagException;

public class CardRunner {

public static void main(String args[]){


TerrapinCard card = new TerrapinCard(50);
System.out.println(card);

card.payEconomical();
System.out.println(card);

card.payGourmet();
card.payEconomical();
System.out.println(card);
 card.payGourmet();
  System.out.println(card);

  card.payGourmet();
  System.out.println(card);
  System.out.println();
  TerrapinCard add = new TerrapinCard(10);
  System.out.println(add);

  add.loadMoney(15);
  System.out.println(add);

  add.loadMoney(10);
  System.out.println(add);

  add.loadMoney(200);
  System.out.println(add);
  System.out.println();

  TerrapinCard lunch = new TerrapinCard(5);
  System.out.println(lunch);
  lunch.payGourmet();
  System.out.println(lunch);
  lunch.payGourmet();
  System.out.println(lunch);
  System.out.println();

  TerrapinCard card2 = new TerrapinCard (10);
  System.out.println("Billy: " + card2);
  card.loadMoney(-15);
  System.out.println("Billy: " + card2);

System.out.println();
TerrapinCard cardBilly= new TerrapinCard (20);
TerrapinCard cardBrian = new TerrapinCard (30);
cardBilly.payGourmet();
cardBrian.payEconomical();
System.out.println("Billy: The card has " + cardBilly.getBalance() + " dollars");
System.out.println("Brian: The card has " + cardBrian.getBalance() + " dollars");
cardBilly.loadMoney(20);
cardBrian.payGourmet();
System.out.println("Billy: The card has " + cardBilly.getBalance() + " dollars");
System.out.println("Brian: The card has " + cardBrian.getBalance() + " dollars");
cardBilly.payEconomical();
cardBilly.payEconomical();
cardBrian.loadMoney(50);
System.out.println("Billy: The card has " + cardBilly.getBalance() + " dollars");
System.out.println("Brian: The card has " + cardBrian.getBalance() + " dollars");

System.out.println(card.getBalance());



}
}