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

  card.loadMoney(15);
  System.out.println(card);

  card.loadMoney(10);
  System.out.println(card);

  card.loadMoney(200);
  System.out.println(card);

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







}
}