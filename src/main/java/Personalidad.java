/**
 * The type Personalidad.
 */
public class Personalidad extends Caracterizacion {

    /**
     * The Personalidad.
     */
    public TiposPersonalidades personalidad;

    /**
     * Instantiates a new Personalidad.
     *
     * @param personalidad the personalidad
     */
    public Personalidad(TiposPersonalidades personalidad) {
        this.personalidad = personalidad;
    }

    /**
     * Gets personalidad.
     *
     * @return the personalidad
     */
    public TiposPersonalidades getPersonalidad() {
        return personalidad;
    }

    /**
     * Sets personalidad.
     *
     * @param personalidad the personalidad
     */
    public void setPersonalidad(TiposPersonalidades personalidad) {
        this.personalidad = personalidad;
    }
}
