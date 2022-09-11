/**
 * The type Arma.
 */
public class Arma extends Caracterizacion {

    /**
     * The Arma.
     */
    public TiposArmas arma;

    /**
     * Instantiates a new Arma.
     *
     * @param arma the arma
     */
    public Arma(TiposArmas arma) {
        this.arma = arma;
    }

    /**
     * Gets arma.
     *
     * @return the arma
     */
    public TiposArmas getArma() {
        return arma;
    }

    /**
     * Sets arma.
     *
     * @param arma the arma
     */
    public void setArma(TiposArmas arma) {
        this.arma = arma;
    }
}
