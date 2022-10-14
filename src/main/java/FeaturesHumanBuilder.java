public class FeaturesHumanBuilder extends FeaturesBuilder{

    /**
     *
     */
    @Override
    public void buildSkills() {
        TypesSkills[] skills = {TypesSkills.LUCK, TypesSkills.CHARISMA};
        features.skills(skills);
    }

    /**
     *
     */
    @Override
    public void buildPowers() {
        TypesPowers[] powers = {TypesPowers.NONE};
        features.powers(powers);
    }

    /**
     *
     */
    @Override
    public void buildPersonalities() {
        TypesPersonalities[] personalities = {TypesPersonalities.RELAXED, TypesPersonalities.EXTROVERTED};
        features.personalities(personalities);
    }

    /**
     *
     */
    @Override
    public void buildWeapons() {
        TypesWeapons[] weapons = {TypesWeapons.DAGGER, TypesWeapons.HAMMER};
        features.weapons(weapons);
    }

    /**
     *
     */
    @Override
    public void buildWeakness() {
        TypesWeaknesses[] weaknesses = {TypesWeaknesses.INSECTS, TypesWeaknesses.POISON};
        features.weakness(weaknesses);
    }
}
