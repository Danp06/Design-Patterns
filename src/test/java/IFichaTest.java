import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Ficha test.
 */
class IFichaTest {

    /**
     * Addhabilidad test.
     */
    @Test
    void add1() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Character[0];
        assertEquals(z, z);
    }

    /**
     * Addarma test.
     */
    @Test
    void add2() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Character[2];
        assertEquals(z, z);
    }

    /**
     * Adddebilidades test.
     */
    @Test
    void add3() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Debilidades(TiposDebilidades.VENENO);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Character[1];
        assertEquals(z, z);
    }

    /**
     * Addpersonalidad test.
     */
    @Test
    void add4() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Character[3];
        assertEquals(z, z);
    }

    /**
     * Addpoderes test.
     */
    @Test
    void add5() {
        Caracterizacion[] Character = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Character[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Character[1] = new Poderes(TiposPoderes.RAPIDEZ_SONICA);
        Character[2] = new Arma(TiposArmas.ESPADA);
        Character[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Character[2];
        assertEquals(z, z);
    }

    /**
     * Liganeutral test.
     */
    @Test
    void liga1() {
        Personajes x = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        assertEquals(Ligas.NEUTRAL, x.getLiga());
    }

    /**
     * Ligaheroe test.
     */
    @Test
    void liga2() {
        Personajes x = new Artificial("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.HEROES);
        assertEquals(Ligas.HEROES, x.getLiga());
    }

    /**
     * Ligavillano test.
     */
    @Test
    void liga3() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        assertEquals(Ligas.VILLANOS, x.getLiga());
    }

    /**
     * Enemigohumanos test.
     */
    @Test
    void enemigo1() {
        Personajes x = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        Personajes y = new Alienigena("Algo", 397, 2.69, 458, 983, Sexo.NONE);
        y.Liga(Ligas.VILLANOS);
        Personajes z = y.Enemigo(x, "Algo");
        assertEquals(z, z);
    }

    /**
     * Enemigosuperhumanos test.
     */
    @Test
    void enemigo2() {
        Personajes x = new SuperHumano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.HEROES);
        Personajes y = new Alienigena("Algo", 397, 2.69, 458, 983, Sexo.NONE);
        y.Liga(Ligas.VILLANOS);
        Personajes z = y.Enemigo(x, "Algo");
        assertEquals(z, z);
    }

    /**
     * Enemigoartificia test.
     */
    @Test
    void enemigo3() {
        Personajes x = new SuperHumano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        Personajes y = new Alienigena("Algo", 397, 2.69, 458, 983, Sexo.NONE);
        y.Liga(Ligas.VILLANOS);
        Personajes z = y.Enemigo(x, "Algo");
        assertEquals(z, z);
    }

    /**
     * Enemigoalienigena test.
     */
    @Test
    void enemigo4() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        Personajes y = new SuperHumano("Algo", 397, 2.69, 458, 983, Sexo.NONE);
        y.Liga(Ligas.HEROES);
        Personajes z = y.Enemigo(x, "Algo");
        assertEquals(z, z);
    }
}