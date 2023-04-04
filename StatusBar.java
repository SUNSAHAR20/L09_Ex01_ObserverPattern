import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.attach(this);
    }
    
    @Override
    public void update(Stock stock) {
        System.out.println("Price Changed for stock " + stock + " -  Updating StatusBar");
        show();
        System.out.println("\n");
    }

    public void show() {
        System.out.println("Status Bar");
        for (var stock : stocks)
            System.out.println(stock);
    }
}
