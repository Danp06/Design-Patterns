/**
 * The type Artificial.
 */
public class Artificial extends Personajes {

    public Artificial(String name, int edad, double estatura, double peso, double energia, Sexo sexo) {
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
