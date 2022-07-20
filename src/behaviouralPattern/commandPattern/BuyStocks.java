package behaviouralPattern.commandPattern;

public class BuyStocks implements Order {
	Stock stocks;

	public BuyStocks(Stock stock) {
		this.stocks = stock;
	}

	@Override
	public void execute() {
		stocks.buy();
	}
}