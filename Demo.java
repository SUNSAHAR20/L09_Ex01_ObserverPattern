public class Demo {
    public static void main(String[] args) {

        StockListView sListView = new StockListView();
        StatusBar sBar = new StatusBar();

        Stock stock1 = new Stock("AAPL", 100.0f);
        Stock stock2 = new Stock("GOOG", 200.0f);
        Stock stock3 = new Stock("GOOG", 500.0f);

        sBar.addStock(stock1);
        sBar.addStock(stock2);

        sListView.addStock(stock1);
        sListView.addStock(stock2);
        sListView.addStock(stock3);

        stock2.setPrice(293.0f); // Both StockListView and Status Bar Updates here

        stock3.setPrice(347.0f); //Only Stock List View Updates here
    }
}