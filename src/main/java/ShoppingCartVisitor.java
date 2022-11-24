public interface ShoppingCartVisitor {

    float visit(Book book);
    float visit(AlcoholicDrinks drinks);
    float visit(Medicaments medicaments);
    float visit(FastFood fastFood);
}
