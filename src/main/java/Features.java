import java.util.Arrays;

public class Features{

    private TypesSkills[] skills;
    private TypesPowers[] powers;
    private TypesPersonalities[] personalities;
    private TypesWeapons[] weapons;
    private TypesWeaknesses[] weaknesses;

    public Features() {
    }

    public TypesSkills[] getSkills() {
        return skills;
    }

    public TypesPowers[] getPowers() {
        return powers;
    }

    public TypesPersonalities[] getPersonalities() {
        return personalities;
    }

    public TypesWeapons[] getWeapons() {
        return weapons;
    }

    public TypesWeaknesses[] getWeaknesses() {
        return weaknesses;
    }

    public Features skills(TypesSkills[] skills){
        this.skills = skills;
        return this;
    }

    public Features powers(TypesPowers[] powers){
        this.powers = powers;
        return this;
    }

    public Features personalities(TypesPersonalities[] personalities){
        this.personalities = personalities;
        return this;
    }

    public Features weapons(TypesWeapons[] weapons){
        this.weapons = weapons;
        return this;
    }

    public Features weakness(TypesWeaknesses[] weaknesses){
        this.weaknesses = weaknesses;
        return this;
    }

    @Override
    public String toString() {
        return "Features{" +
                "skills=" + Arrays.toString(skills) +
                ", powers=" + Arrays.toString(powers) +
                ", personalities=" + Arrays.toString(personalities) +
                ", weapons=" + Arrays.toString(weapons) +
                ", weaknesses=" + Arrays.toString(weaknesses) +
                '}';
    }
}
