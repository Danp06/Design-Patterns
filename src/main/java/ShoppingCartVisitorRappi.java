import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartVisitorRappi implements ShoppingCartVisitor {

    private static Logger logger = Logger.getLogger(ShoppingCartVisitorRappi.class.getName());
    @Override
    public float visit(Book book) {
        float cost = book.getPrice();
        //apply 10% discount if price is greater than 100000
        if (book.getPrice() > 100000){cost = cost-discount(cost, 10);}
        logger.log(Level.INFO,"\n\tName: " + book.getName() + " - ISBN: " + book.getIsbn_Number()
                + " - price: " + book.getPrice() + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float visit(AlcoholicDrinks drinks) {
        float cost = drinks.getPrice();
        //apply 10% discount if price is greater than 250000
        if (drinks.getPrice() > 250000){cost = cost-discount(cost, 10);}
        logger.log(Level.INFO,"\n\tName: " + drinks.getName() + " - price: " + drinks.getPrice()
                + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float visit(Medicaments medicaments) {
        float cost = medicaments.getPrice();
        logger.log(Level.INFO,"\n\tname: " + medicaments.getName() + " - scientist name: " + medicaments.getScientist_Name() +
                " expiration date " + medicaments.getExpirationDate() + " - price: " + medicaments.getPrice() + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float visit(FastFood fastFood) {
        float cost = fastFood.getPrice();
        logger.log(Level.INFO,"\n\tName: " + fastFood.getName() + " - price: " + fastFood.getPrice()
                + " - Final Price: " + cost);
        return cost;
    }

    @Override
    public float discount(float price, float discount_Percentage) {
        return (price*discount_Percentage)/100;
    }
}
