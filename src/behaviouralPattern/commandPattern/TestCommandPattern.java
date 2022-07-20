package behaviouralPattern.commandPattern;

public class TestCommandPattern {


	public static void main(String[] args) {
		Order buyOrder =  new BuyStocks(new Stock());
		Order sellOrder =  new SoldStock(new Stock());

		Broker broker = new Broker();
		broker.takeOrder(buyOrder);
		broker.takeOrder(sellOrder);
		broker.placeOrders();
	}
}
