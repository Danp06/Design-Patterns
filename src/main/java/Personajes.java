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
    public Ligas lig;
    /**
     * The Tiene.
     */
    public Caracterizacion[] tiene;

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

    public String getName() {
        return name;
    }

    /**
     * Gets liga.
     *
     * @return the liga
     */
    public Ligas getLiga() {
        return lig;
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
    public void setTiene(Caracterizacion[] tiene) {
        this.tiene = tiene;
    }

    /**
     * Do something.
     *
     * @param x the personaje
     */
    @Override
    public void doSomething(Personajes x) {
        // En esta clase se realiza alguna accion
    }

    /**
     * @param a una caracteriztica
     */
    @Override
    public void Add(Caracterizacion[] a) {
        tiene = a;
    }

    /**
     * @param a la liga que perteneze
     */
    @Override
    public void Liga(Ligas a) {
        lig = a;
    }

    /**
     * @param x el personaje
     * @param y el nombre del enemigo
     * @return El enemigo de dicho personaje
     */
    @Override
    public Personajes Enemigo(Personajes x, String y) {
        Personajes z = null;

        if (x.lig == Ligas.HEROES || x.lig == Ligas.NEUTRAL) {
            z = new Alienigena(y, 397, 2.69, 458, 983, Sexo.NONE);
            z.lig = Ligas.VILLANOS;
        }else{
            z = new SuperHumano(y, 35, 1.85, 95, 750, Sexo.MASCULINO);
            z.lig = Ligas.HEROES;
        }
        return z;
    }
}
