import java.util.Date;

public class ShoppingCartClient {

    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{
                new Book("El principito","ABC1123",125000),
                new FastFood("Mega Hot dog",35000),
                new AlcoholicDrinks("Costeñita",2000),
                new Medicaments("Dolex","Acetaminofem",5000, new Date())};

        float total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static float calculatePrice(ItemElement[] items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        float sum=0;
        for(ItemElement item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
