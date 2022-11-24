public class Book implements ItemElement {

    private String name, isbnNumber;
    private float price;

    /**
     * @param name name
     * @param isbnNumber isbnNumber
     * @param price price
     */
    public Book(String name, String isbnNumber, float price) {
        this.name = name;
        this.isbnNumber = isbnNumber;
        this.price = price;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @return isbn
     */
    public String getIsbnNumber() {
        return isbnNumber;
    }

    /**
     * @param visitor visitor
     * @return this
     */
    @Override
    public float accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
