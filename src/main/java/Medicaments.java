import java.util.Date;

public class Medicaments implements ItemElement {

    private String name, scientistName;
    private float price;
    private Date expirationDate;

    /**
     * @param name name
     * @param scientistName scientistName
     * @param price price
     * @param expirationDate expirationDate
     */
    public Medicaments(String name, String scientistName, float price, Date expirationDate) {
        this.name = name;
        this.scientistName = scientistName;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return ScientistName
     */
    public String getScientistName() {
        return scientistName;
    }

    /**
     * @return price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @return expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
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
