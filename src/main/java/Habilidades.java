/**
 * The type Habilidades.
 */
public class Habilidades extends Caracterizacion {

    /**
     * The Habilidad.
     */
    public TiposHabilidades habilidad;

    /**
     * Instantiates a new Habilidades.
     *
     * @param habilidad the habilidad
     */
    public Habilidades(TiposHabilidades habilidad) {
        this.habilidad = habilidad;
    }

    /**
     * Gets habilidad.
     *
     * @return the habilidad
     */
    public TiposHabilidades getHabilidad() {
        return habilidad;
    }

    /**
     * Sets habilidad.
     *
     * @param habilidad the habilidad
     */
    public void setHabilidad(TiposHabilidades habilidad) {
        this.habilidad = habilidad;
    }
}
