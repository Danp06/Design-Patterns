import java.util.Scanner;

/**
 * The type Main.
 */
public class main {

    /**
     * The Entrada para ingresar datos por consola
     */
    static Scanner entrada = new Scanner(System.in);
    /**
     * The Array Caracte para ingrasar las caracteristicas de un personaje.
     */
    static Caracterizacion[] Caracte = new Caracterizacion[4];

    public static void main(String[] args) {

        /**
         * Declaracion de las variable a usar
         */
        String name;
        Personajes a = null, b = null, c= null, d=null;
        Sexo x;
        Caracterizacion Caracte[] = new Caracterizacion[5];

        /**
         * Creacion de un Humano
         */
        a = new SuperHumano("Daniel", 20, 1.75, 70, 650, Sexo.MASCULINO);
        Caracte[0] = new Habilidades(TiposHabilidades.FUERZA_VOLUNTAD);
        Caracte[1] = new Habilidades(TiposHabilidades.RESISTENCIA);
        Caracte[2] = new Arma(TiposArmas.ESPADA);
        Caracte[3] = new Personalidad(TiposPersonalidades.RELAJADO);

        a.Add(Caracte);
        Caracte = new Caracterizacion[Caracte.length];
        a.Liga(Ligas.NEUTRAL);

        System.out.println(a.toString());

        /**
         * Creacion del Enemigo del Humano que es un Alien
         */

        System.out.println("Ingresa el nombre del enemigo de "+ a.getName());
        name = entrada.nextLine();
        b = a.Enemigo(a,name);

        Caracte[0] = new Poderes(TiposPoderes.LEVITACION);
        Caracte[1] = new Poderes(TiposPoderes.TELEQUINESIS);
        Caracte[2] = new Poderes(TiposPoderes.VISION_PERFECTA);
        Caracte[3] = new Debilidades(TiposDebilidades.OZONO);
        Caracte[4] = new Personalidad(TiposPersonalidades.DOMINANTE);

        b.Add(Caracte);
        Caracte = new Caracterizacion[Caracte.length];
        System.out.println(b.toString());

        /**
         * Creacion del Enemigo del Alien que es el Super Humano
         */

        System.out.println("Ingresa el nombre del enemigo de "+ b.getName());
        name = entrada.nextLine();
        d = a.Enemigo(b,name);

        Caracte[0] = new Arma(TiposArmas.NONE);
        Caracte[1] = new Poderes(TiposPoderes.VISION_PERFECTA);
        Caracte[2] = new Habilidades(TiposHabilidades.INTELECTO);
        Caracte[3] = new Debilidades(TiposDebilidades.VENENO);
        Caracte[4] = new Personalidad(TiposPersonalidades.SEGURO);

        d.Add(Caracte);
        Caracte = new Caracterizacion[Caracte.length];
        System.out.println(d.toString());


    }
}
