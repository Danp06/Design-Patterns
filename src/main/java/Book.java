public class Book implements ItemElement {

    private String name, isbn_Number;
    private float price;

    /**
     * @param name name
     * @param isbnNumber isbn_Number
     * @param price price
     */
    public Book(String name, String isbnNumber, float price) {
        this.name = name;
        this.isbn_Number = isbnNumber;
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
    public String getIsbn_Number() {
        return isbn_Number;
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
