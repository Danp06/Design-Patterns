import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartVisitorDiDi implements ShoppingCartVisitor {

    private static Logger logger = Logger.getLogger(ShoppingCartVisitorDiDi.class.getName());

    @Override
    public float visit(Medicaments medicaments) {
        return 0;
    }

    @Override
    public float visit(Book book) {
        return 0;
    }

    @Override
    public float visit(FastFood fastFood) {
        float cost = fastFood.getPrice();
        //apply 7.5% discount if price is greater than 75000
        if (fastFood.getPrice() > 75000) {cost = cost-discount(cost, 7.5f);}
        logger.log(Level.INFO,"\n\tName: " + fastFood.getName() + " - price: " + fastFood.getPrice()
                + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float visit(AlcoholicDrinks drinks) {
        float cost = drinks.getPrice();
        //apply 10% discount if price is greater than 250000
        if (drinks.getPrice() > 250000) {cost = cost-discount(cost,10);}
        logger.log(Level.INFO,"\n\tName: " + drinks.getName() + " - price: " + drinks.getPrice()
                + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float discount(float price, float discount_Percentage) {
        return (price*discount_Percentage)/100;
    }
}
