/**
 * The interface Ficha.
 */
public interface IFicha {
    /**
     * Add.
     *
     * @param caracteristica the caracteristica
     */
    void Add(Caracterizacion[] caracteristica);

    /**
     * Liga.
     *
     * @param Liga the liga
     */
    void Liga(Ligas Liga);

    /**
     * Enemigo personajes.
     *
     * @param x the x
     * @param y the y
     * @return the personajes
     */
    Personajes Enemigo(Personajes x, String y);
}
