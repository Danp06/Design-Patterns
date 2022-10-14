public class FeaturesAlienBuilder extends FeaturesBuilder{

    /**
     *
     */
    @Override
    public void buildSkills() {
        TypesSkills[] skills = {TypesSkills.PERCEPTION, TypesSkills.VITALITY};
        features.skills(skills);
    }

    /**
     *
     */
    @Override
    public void buildPowers() {
        TypesPowers[] powers = {TypesPowers.FLIGHT, TypesPowers.TELEKINESIS};
        features.powers(powers);
    }

    /**
     *
     */
    @Override
    public void buildPersonalities() {
        TypesPersonalities[] personalities = {TypesPersonalities.RESERVED, TypesPersonalities.INTROVERTED};
        features.personalities(personalities);
    }

    /**
     *
     */
    @Override
    public void buildWeapons() {
        TypesWeapons[] weapons = {TypesWeapons.PISTOL, TypesWeapons.RIFLE};
        features.weapons(weapons);
    }

    /**
     *
     */
    @Override
    public void buildWeakness() {
        TypesWeaknesses[] weaknesses = {TypesWeaknesses.OZONE, TypesWeaknesses.PLANTS, TypesWeaknesses.FIRE};
        features.weakness(weaknesses);
    }
}
