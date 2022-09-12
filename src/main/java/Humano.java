/**
 * The type Humano.
 */
public class Humano extends Personajes {

    /**
     * Instantiates a new Humano.
     *
     * @param name     the name
     * @param edad     the edad
     * @param estatura the estatura
     * @param peso     the peso
     * @param energia  the energia
     * @param sexo     the sexo
     */
    public Humano(String name, int edad, double estatura, double peso, double energia, Sexo sexo) {
        super(name, edad, estatura, peso, energia, sexo);
    }
}
