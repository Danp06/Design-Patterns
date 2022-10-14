/**
 * The interface Ficha.
 */
public interface IFicha {
    /**
     * Add.
     *
     * @param x the features
     * @return the features
     */
    Features Add(Features x);

    /**
     * Liga.
     *
     * @param x the liga
     * @return the league
     */
     Leagues League(Leagues x);

    /**
     * Enemigo personajes.
     *
     * @param x the x
     * @return the personajes
     */
    CharacterBuilder Enemy(CharacterBuilder x);
}
