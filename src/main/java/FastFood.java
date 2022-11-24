public class FastFood implements ItemElement {

    private String name;
    private float price;

    /**
     * @param name name
     * @param price price
     */
    public FastFood(String name, float price) {
        this.name = name;
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
     * @param visitor visitor
     * @return this
     */
    @Override
    public float accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}
