import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
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
    void addhabilidad() {
        Caracterizacion Caracte[] = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Caracte[0];
        assertEquals(z, z);
    }

    /**
     * Addarma test.
     */
    @Test
    void addarma() {
        Caracterizacion Caracte[] = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Caracte[2];
        assertEquals(z, z);
    }

    /**
     * Adddebilidades test.
     */
    @Test
    void adddebilidades() {
        Caracterizacion Caracte[] = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Debilidades(TiposDebilidades.VENENO);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Caracte[1];
        assertEquals(z, z);
    }

    /**
     * Addpersonalidad test.
     */
    @Test
    void addpersonalidad() {
        Caracterizacion Caracte[] = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Caracte[3];
        assertEquals(z, z);
    }

    /**
     * Addpoderes test.
     */
    @Test
    void addpoderes() {
        Caracterizacion Caracte[] = new Caracterizacion[4];
        Personajes y = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Poderes(TiposPoderes.RAPIDEZ_SONICA);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);
        Caracterizacion z = Caracte[2];
        assertEquals(z, z);
    }

    /**
     * Liganeutral test.
     */
    @Test
    void liganeutral() {
        Personajes x = new Humano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.NEUTRAL);
        assertEquals(Ligas.NEUTRAL, x.getLiga());
    }

    /**
     * Ligaheroe test.
     */
    @Test
    void ligaheroe() {
        Personajes x = new Artificial("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.HEROES);
        assertEquals(Ligas.HEROES, x.getLiga());
    }

    /**
     * Ligavillano test.
     */
    @Test
    void ligavillano() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        assertEquals(Ligas.VILLANOS, x.getLiga());
    }

    /**
     * Enemigohumanos test.
     */
    @Test
    void enemigohumanos() {
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
    void enemigosuperhumanos() {
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
    void enemigoartificia() {
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
    void enemigoalienigena() {
        Personajes x = new Alienigena("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        x.Liga(Ligas.VILLANOS);
        Personajes y = new SuperHumano("Algo", 397, 2.69, 458, 983, Sexo.NONE);
        y.Liga(Ligas.HEROES);
        Personajes z = y.Enemigo(x, "Algo");
        assertEquals(z, z);
    }
}