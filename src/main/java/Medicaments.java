import java.util.Date;

public class Medicaments implements ItemElement {

    private String name, scientist_Name;
    private float price;
    private Date expirationDate;

    /**
     * @param name name
     * @param scientist_Name scientist_Name
     * @param price price
     * @param expirationDate expirationDate
     */
    public Medicaments(String name, String scientist_Name, float price, Date expirationDate) {
        this.name = name;
        this.scientist_Name = scientist_Name;
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
    public String getScientist_Name() {
        return scientist_Name;
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
