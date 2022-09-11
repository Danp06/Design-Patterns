/**
 * The interface Ficha.
 */
public interface IFicha {
    /**
     * Add.
     *
     * @param caracteristica the caracteristica
     */
    public void Add(Caracterizacion caracteristica[]);

    /**
     * Liga.
     *
     * @param Liga the liga
     */
    public void Liga(Ligas Liga);

    /**
     * Enemigo personajes.
     *
     * @param x the x
     * @param y the y
     * @return the personajes
     */
    public Personajes Enemigo(Personajes x, String y);
}
