public class FeaturesArtificialBuilder extends FeaturesBuilder{

    /**
     *
     */
    @Override
    public void buildSkills() {
        TypesSkills[] skills = {TypesSkills.INTELLECT};
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
        TypesPersonalities[] personalities = {TypesPersonalities.NONE};
        features.personalities(personalities);
    }

    /**
     *
     */
    @Override
    public void buildWeapons() {
        TypesWeapons[] weapons = {TypesWeapons.PISTOL};
        features.weapons(weapons);
    }

    /**
     *
     */
    @Override
    public void buildWeakness() {
        TypesWeaknesses[] weaknesses = {TypesWeaknesses.WATER, TypesWeaknesses.LIGHTNING};
        features.weakness(weaknesses);
    }
}
