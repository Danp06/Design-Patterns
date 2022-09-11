/**
 * The type Super humano.
 */
public class SuperHumano extends Personajes {

    /**
     * Instantiates a new Super humano.
     *
     * @param name     the name
     * @param edad     the edad
     * @param estatura the estatura
     * @param peso     the peso
     * @param energia  the energia
     * @param sexo     the sexo
     */
    public SuperHumano(String name, int edad, double estatura, double peso, double energia, Sexo sexo) {
        super(name, edad, estatura, peso, energia, sexo);
    }

    /**
     * Do something.
     *
     * @param x the personaje
     */
    @Override
    public void doSomething(Personajes x) {

    }

    /**
     * @param a
     */
    @Override
    public void Add(Caracterizacion a[]) {
        tiene = a;
    }

    /**
     * @param a
     */
    @Override
    public void Liga(Ligas a) {
        liga = a;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    @Override
    public Personajes Enemigo(Personajes x, String y) {
        Personajes z = null;

        if (x.liga == Ligas.HEROES || x.liga == Ligas.NEUTRAL) {
            z = new Alienigena(y, 397, 2.69, 458, 983, Sexo.NONE);
            z.liga = Ligas.VILLANOS;
        }else{
            z = new SuperHumano(y, 35, 1.85, 95, 750, Sexo.MASCULINO);
            z.liga = Ligas.HEROES;
        }
        return z;
    }
}
