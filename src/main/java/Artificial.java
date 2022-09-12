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
        super.doSomething(x);
    }

    /**
     * @param a una caracteriztica
     */
    @Override
    public void Add(Caracterizacion[] a) {
        super.Add(a);
    }

    /**
     * @param a la liga que perteneze
     */
    @Override
    public void Liga(Ligas a) {
        super.Liga(a);
    }

    /**
     * @param x el personaje
     * @param y el nombre del enemigo
     * @return El enemigo de dicho personaje
     */
    @Override
    public Personajes Enemigo(Personajes x, String y) {
        return super.Enemigo(x, y);
    }
}
