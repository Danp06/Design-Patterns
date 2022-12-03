import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ShoppingCartClient {

    private static Logger logger = Logger.getLogger(ShoppingCartClient.class.getName());
    public static void main(String[] args) {
        ItemElement[] itemsRappi = new ItemElement[]{
                new Book("El principito","ABC1123",125000),
                new FastFood("Mega Hot dog",35000),
                new AlcoholicDrinks("Costeñita",2000),
                new Medicaments("Dolex","Acetaminofem",5000, new Date())};

        ItemElement[] itemsDiDi = new ItemElement[]{
                new FastFood("Mega Hot dog",35000),
                new FastFood("Pizza Master",17000),
                new FastFood("Mega Salchipapa", 45000)};


        logger.log(Level.INFO,"CARRITO DE Rappi");
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        float total = calculatePrice(itemsRappi,visitor);
        logger.log(Level.INFO,"Total Cost = "+total);

        logger.log(Level.INFO,"\n\nCARRITO DE DiDi");
        visitor = new ShoppingCartVisitorDiDi();
        total = calculatePrice(itemsDiDi,visitor);
        logger.log(Level.INFO,"Total Cost = "+total);
    }

    private static float calculatePrice(ItemElement[] items,ShoppingCartVisitor visitor) {
        float sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
