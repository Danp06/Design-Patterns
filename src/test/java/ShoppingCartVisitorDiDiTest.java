import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartVisitorDiDiTest {

    FastFood fastFood = new FastFood("Mega Hot dog",35000);
    FastFood fastFood1 = new FastFood("Pizza",500000);
    AlcoholicDrinks alcoholicDrinks = new AlcoholicDrinks("Costeñita",2000);
    AlcoholicDrinks alcoholicDrinks3 = new AlcoholicDrinks("Costeñita",500000);
    Medicaments medicaments = new Medicaments("Dolex","Acetaminofem",5000, new Date());
    Book book = new Book("El principito","ABC1123",125000);

    @Test
    public void visit5() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = book.accept(visitor);
        assertEquals(0,Result);
    }

    @Test
    public void visit1() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = alcoholicDrinks.accept(visitor);
        assertEquals(alcoholicDrinks.getPrice(),Result);
    }

    @Test
    public void visit12() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = alcoholicDrinks3.accept(visitor);
        assertEquals(alcoholicDrinks3.getPrice()*(1-0.1),Result);
    }

    @Test
    public void visit2() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = medicaments.accept(visitor);
        assertEquals(0,Result);
    }

    @Test
    public void visit3() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = fastFood.accept(visitor);
        assertEquals(fastFood.getPrice(),Result);
    }

    @Test
    public void visit9() {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorDiDi();
        float Result = fastFood1.accept(visitor);
        assertEquals(fastFood1.getPrice()*(1 - 0.075),Result);
    }
}