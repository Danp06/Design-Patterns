public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public float visit(Book book) {
        float cost = 0;
        //apply 10% discount if book price is greater than 100000
        if (book.getPrice() > 100000) {
            cost = (float) (book.getPrice() * (1 - 0.1));
        } else cost = book.getPrice();
        System.out.println("Name: " + book.getName() + " / ISBN: " + book.getIsbnNumber() + " / cost: " + cost);
        return cost;
    }

    @Override
    public float visit(AlcoholicDrinks drinks) {
        float cost = 0;
        //apply 10% discount if book price is greater than 250000
        if (drinks.getPrice() > 250000) {
            cost = (float) (drinks.getPrice() * (1 - 0.1));
        } else cost = drinks.getPrice();
        System.out.println("Name: " + drinks.getName() + " / cost: " + cost);
        return cost;
    }

    @Override
    public float visit(Medicaments medicaments) {
        float cost = medicaments.getPrice();
        System.out.println("name: " + medicaments.getName() + " / scientist name: " + medicaments.getScientistName() +
                "\n\t expiration date " + medicaments.getExpirationDate() + " / cost: " + cost);
        return cost;
    }

    @Override
    public float visit(FastFood fastFood) {
        float cost = fastFood.getPrice();
        System.out.println("Name: " + fastFood.getName() + " / cost :" + cost);
        return cost;
    }

}
