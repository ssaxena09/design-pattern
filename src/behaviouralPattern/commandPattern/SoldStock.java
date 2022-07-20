package behaviouralPattern.commandPattern;

public class SoldStock implements Order {
	Stock stocks;

	public SoldStock(Stock stock) {
		this.stocks = stock;
	}

	@Override
	public void execute() {
		stocks.sell();
	}
}
