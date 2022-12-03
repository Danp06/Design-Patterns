import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartVisitorRappi implements ShoppingCartVisitor {

    private static Logger logger = Logger.getLogger(ShoppingCartVisitorRappi.class.getName());
    @Override
    public float visit(Book book) {
        float cost = 0;
        //apply 10% discount if price is greater than 100000
        if (book.getPrice() > 100000) {
            cost = (float) (book.getPrice() * (1 - 0.1));
        } else cost = book.getPrice();
        logger.log(Level.INFO,"Name: " + book.getName() + " - ISBN: " + book.getIsbnNumber() + " - cost: " + cost);
        return cost;
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
        float cost = medicaments.getPrice();
        logger.log(Level.INFO,"name: " + medicaments.getName() + " - scientist name: " + medicaments.getScientistName() +
                "\n\t  expiration date " + medicaments.getExpirationDate() + " - cost: " + cost);
        return cost;
    }

    @Override
    public float visit(FastFood fastFood) {
        float cost = fastFood.getPrice();
        logger.log(Level.INFO,"Name: " + fastFood.getName() + " - cost :" + cost);
        return cost;
    }
}
