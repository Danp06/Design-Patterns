/**
 * The type Character
 */
public class Character{

    private String name;
    private int age;
    private double height, weight;
    private Sex sex;
    private Leagues league;
    private Features has;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public Sex getSex() {
        return sex;
    }

    public Leagues getLeague() {
        return league;
    }

    public Character() {
    }

    public Character name(String name) {
        this.name = name;
        return this;
    }

    public Character age(int age) {
        this.age = age;
        return this;
    }

    public Character height(double height) {
        this.height = height;
        return this;
    }

    public Character weight(double weight) {
        this.weight = weight;
        return this;
    }

    public Character sex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public Character leagues(Leagues league) {
        this.league = league;
        return this;
    }

    public Character feature(Features has) {
        this.has = has;
        return this;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sex=" + sex +
                ", league=" + league +
                ", has=" + has +
                '}';
    }
}
