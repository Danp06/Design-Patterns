/**
 * The type Poderes.
 */
public class Poderes extends Caracterizacion {

    /**
     * The Poder.
     */
    public TiposPoderes poder;

    /**
     * Instantiates a new Poderes.
     *
     * @param poder the poder
     */
    public Poderes(TiposPoderes poder) {
        this.poder = poder;
    }

    /**
     * Gets poder.
     *
     * @return the poder
     */
    public TiposPoderes getPoder() {
        return poder;
    }

    /**
     * Sets poder.
     *
     * @param poder the poder
     */
    public void setPoder(TiposPoderes poder) {
        this.poder = poder;
    }
}
