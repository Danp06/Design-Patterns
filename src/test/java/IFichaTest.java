import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Ficha test.
 */
public class IFichaTest {

    /**
     * Addhabilidad test.
     */
    @Test
    public void add1() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        y.setTiene(Character);
        assertEquals(y.getTiene(),Character);
    }

    /**
     * Addarma test.
     */
    @Test
    public void add2() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        y.setTiene(Character);
        assertEquals(y.getTiene(),Character);
    }

    /**
     * Adddebilidades test.
     */
    @Test
    public void add3() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Debilidades(TiposDebilidades.VENENO);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        y.setTiene(Character);
        assertEquals(y.getTiene(),Character);
    }

    /**
     * Addpersonalidad test.
     */
    @Test
    public void add4() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        y.setTiene(Character);
        assertEquals(y.getTiene(),Character);
    }

    /**
     * Addpoderes test.
     */
    @Test
    public void add5() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Poderes(TiposPoderes.RAPIDEZ_SONICA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        y.setTiene(Character);
        assertEquals(y.getTiene(),Character);
    }

    /**
     * Liganeutral test.
     */
    @Test
    public void liga1() {
        Personajes x = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        assertEquals(Ligas.NEUTRAL, x.getLiga());
    }

    /**
     * Ligaheroe test.
     */
    @Test
    public void liga2() {
        Personajes x = new Artificial("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.HEROES);
        assertEquals(Ligas.HEROES, x.getLiga());
    }

    /**
     * Ligavillano test.
     */
    @Test
    public void liga3() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        assertEquals(Ligas.VILLANOS, x.getLiga());
    }

    /**
     * Enemigohumanos test.
     */
    @Test
    public void enemigo1() {
        Personajes x = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        Personajes y = x.Enemigo(x, "Algo");
        Personajes z = y;
        assertEquals(z, y);
    }

    /**
     * Enemigosuperhumanos test.
     */
    @Test
    public void enemigo2() {
        Personajes x = new SuperHumano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.HEROES);
        Personajes y = x.Enemigo(x, "Algo");
        Personajes z = y;
        assertEquals(z, y);
    }

    /**
     * Enemigoartificia test.
     */
    @Test
    public void enemigo3() {
        Personajes x = new SuperHumano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        Personajes y = x.Enemigo(x, "Algo");
        Personajes z = y;
        assertEquals(z, y);
    }

    /**
     * Enemigoalienigena test.
     */
    @Test
    public void enemigo4() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        Personajes y = x.Enemigo(x, "Algo");
        Personajes z = y;
        assertEquals(z, y);
    }
}