public class FeaturesSuperHumanBuilder extends FeaturesBuilder{

    /**
     *
     */
    @Override
    public void buildSkills() {
        TypesSkills[] skills = {TypesSkills.SPEED, TypesSkills.INTELLECT};
        features.skills(skills);
    }

    /**
     *
     */
    @Override
    public void buildPowers() {
        TypesPowers[] powers = {TypesPowers.FLIGHT, TypesPowers.ULTRA_RESISTANCE};
        features.powers(powers);
    }

    /**
     *
     */
    @Override
    public void buildPersonalities() {
        TypesPersonalities[] personalities = {TypesPersonalities.DOMINANT, TypesPersonalities.EXTROVERTED};
        features.personalities(personalities);
    }

    /**
     *
     */
    @Override
    public void buildWeapons() {
        TypesWeapons[] weapons = {TypesWeapons.SWORD, TypesWeapons.AXE};
        features.weapons(weapons);
    }

    /**
     *
     */
    @Override
    public void buildWeakness() {
        TypesWeaknesses[] weaknesses = {TypesWeaknesses.STEEL, TypesWeaknesses.POISON};
        features.weakness(weaknesses);
    }
}
