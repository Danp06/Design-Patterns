/**
 * The type Caracterizacion.
 */
public abstract class Caracterizacion implements IFicha {

    /**
     * @param caracteristica Es la caracteristica que se va añadir
     */
    @Override
    public void Add(Caracterizacion[] caracteristica) {

    }

    /**
     * @param Liga Es la liga que se va añadir
     */
    @Override
    public void Liga(Ligas Liga) {

    }

    /**
     * @param x el personaje
     * @param y el nombre del enemigo
     * @return El enemigo de dicho personaje
     */
    @Override
    public Personajes Enemigo(Personajes x, String y) {
        return null;
    }
}
