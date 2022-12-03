import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartVisitorDiDi implements ShoppingCartVisitor {

    private static Logger logger = Logger.getLogger(ShoppingCartVisitorDiDi.class.getName());
    @Override
    public float visit(Book book) {
        return 0;
    }

    @Override
    public float visit(AlcoholicDrinks drinks) {
        float cost = 0;
        //apply 10% discount if price is greater than 250000
        if (drinks.getPrice() > 250000) {
            cost = (float) (drinks.getPrice() * (1 - 0.1));
        } else cost = drinks.getPrice();
        logger.log(Level.INFO,"Name: " + drinks.getName() + " - cost: " + cost);
        return cost;
    }

    @Override
    public float visit(Medicaments medicaments) {
        return 0;
    }

    @Override
    public float visit(FastFood fastFood) {
        float cost = fastFood.getPrice();
        //apply 10% discount if price is greater than 100000
        if (fastFood.getPrice() > 75000) {
            cost = (float) (fastFood.getPrice() * (1 - 0.075));
        } else cost = fastFood.getPrice();
        logger.log(Level.INFO,"Name: " + fastFood.getName() + " - cost :" + cost);
        return cost;
    }

}
