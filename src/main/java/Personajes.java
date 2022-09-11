import java.util.Arrays;

/**
 * The type Personajes.
 */
public abstract class Personajes implements Actions, IFicha {

    /**
     * The Name.
     */
    public String name;
    /**
     * The Edad.
     */
    public int edad;
    /**
     * The Estatura.
     */
    public double estatura,
    /**
     * The Peso.
     */
    peso,
    /**
     * The Energia.
     */
    energia;
    /**
     * The Sexo.
     */
    public Sexo sexo;
    /**
     * The Liga.
     */
    public Ligas liga;
    /**
     * The Tiene.
     */
    public Caracterizacion tiene[];

    /**
     * Instantiates a new Personajes.
     *
     * @param name     the name
     * @param edad     the edad
     * @param estatura the estatura
     * @param peso     the peso
     * @param energia  the energia
     * @param sexo     the sexo
     */
    public Personajes(String name, int edad, double estatura, double peso, double energia, Sexo sexo) {
        this.name = name;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.energia = energia;
        this.sexo = sexo;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets edad.
     *
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Sets edad.
     *
     * @param edad the edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Gets estatura.
     *
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * Sets estatura.
     *
     * @param estatura the estatura
     */
    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    /**
     * Gets peso.
     *
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Sets peso.
     *
     * @param peso the peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Gets energia.
     *
     * @return the energia
     */
    public double getEnergia() {
        return energia;
    }

    /**
     * Sets estatura.
     *
     * @param estatura the estatura
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * Sets peso.
     *
     * @param peso the peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Sets energia.
     *
     * @param energia the energia
     */
    public void setEnergia(double energia) {
        this.energia = energia;
    }

    /**
     * Gets liga.
     *
     * @return the liga
     */
    public Ligas getLiga() {
        return liga;
    }

    /**
     * Sets liga.
     *
     * @param liga the liga
     */
    public void setLiga(Ligas liga) {
        this.liga = liga;
    }

    /**
     * Sets energia.
     *
     * @param energia the energia
     */
    public void setEnergia(float energia) {
        this.energia = energia;
    }

    /**
     * Gets sexo.
     *
     * @return the sexo
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Sets sexo.
     *
     * @param sexo the sexo
     */
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    /**
     * Gets tiene.
     *
     * @return the tiene
     */
    public Caracterizacion[] getTiene() {
        return tiene;
    }

    /**
     * Sets tiene.
     *
     * @param tiene the tiene
     */
    public void setTiene(Caracterizacion tiene[]) {
        this.tiene = tiene;
    }

    @Override
    public String toString() {
        return "Personajes{" + "name='" + name + '\'' + ", edad=" + edad + ", estatura=" + estatura + ", peso="
                + peso + ", energia=" + energia + ", sexo=" + sexo + ", liga=" + liga + ", tiene="
                + Arrays.toString(tiene) + '}';
    }

    /**
     * Do something.
     *
     * @param x the personaje
     */
    @Override
    public void doSomething(Personajes x) {

    }
}
