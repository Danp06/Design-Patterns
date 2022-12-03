import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartVisitorRappiTest {

    Book book = new Book("El principito","ABC1123",125000);
    Book book2 = new Book("El principito","ABC1123",25000);
    FastFood fastFood = new FastFood("Mega Hot dog",35000);
    AlcoholicDrinks alcoholicDrinks = new AlcoholicDrinks("Costeñita",2000);
    AlcoholicDrinks alcoholicDrinks3 = new AlcoholicDrinks("Costeñita",500000);
    Medicaments medicaments = new Medicaments("Dolex","Acetaminofem",5000, new Date());

    @Test
    public void visit() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        book.getName();
        book.getIsbnNumber();
        float Result = book.accept(visitor);
        assertEquals(book.getPrice()*(1-0.1),Result);
    }

    @Test
    public void visit5() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        book2.getName();
        book2.getIsbnNumber();
        float Result = book2.accept(visitor);
        assertEquals(book2.getPrice(),Result);
    }

    @Test
    public void visit1() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        alcoholicDrinks.getName();
        float Result = alcoholicDrinks.accept(visitor);
        assertEquals(alcoholicDrinks.getPrice(),Result);
    }

    @Test
    public void visit12() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        alcoholicDrinks.getName();
        float Result = alcoholicDrinks3.accept(visitor);
        assertEquals(alcoholicDrinks3.getPrice()*(1-0.1),Result);
    }

    @Test
    public void visit2() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        medicaments.getName();
        medicaments.getExpirationDate();
        medicaments.getExpirationDate();
        float Result = medicaments.accept(visitor);
        assertEquals(medicaments.getPrice(),Result);
    }

    @Test
    public void visit3() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorRappi();
        float Result = fastFood.accept(visitor);
        fastFood.getName();
        assertEquals(fastFood.getPrice(),Result);
    }
}