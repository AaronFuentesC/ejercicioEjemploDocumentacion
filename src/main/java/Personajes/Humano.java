/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes;

/**
 * Clase abstracta que representa a un humano dentro del juego.
 *
 * Es la clase base de los diferentes tipos de personajes,
 * como guerreros y magos. Contiene las características comunes
 * de todos los personajes y proporciona métodos para realizar
 * acciones básicas.
 *
 * @author Aarón Fuentes Casanova
 */
public abstract class Humano {

    /**
     * Identificador utilizado para los personajes creados.
     */
    static int id;

    /**
     * Nombre del personaje.
     */
    String nombre;

    /**
     * Cantidad de salud del personaje.
     */
    int salud;

    /**
     * Cantidad de energía del personaje.
     */
    int energia;

    /**
     * Fuerza del personaje.
     */
    int fuerza;

    /**
     * Nivel de alimentación del personaje.
     */
    int alimentacion;

    /**
     * Valor máximo permitido para las características del personaje.
     */
    final int VALOR_MAXIMO = 100;

    /**
     * Valor mínimo permitido para las características del personaje.
     */
    final int VALOR_MINIMO = 1;

    /**
     * Construye un nuevo humano.
     *
     * Los valores de salud, energía y alimentación se validan
     * para mantenerlos dentro del rango permitido.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     */
    public Humano(
            String nombre,
            int salud,
            int energia,
            int alimentacion) {

        this.nombre = nombre;
        this.salud = validaRango(salud);
        this.energia = validaRango(energia);
        this.fuerza = 100;
        this.alimentacion = validaRango(alimentacion);
        id++;
    }

    /**
     * Comprueba que un valor se encuentre dentro del rango permitido.
     *
     * Si el valor es superior al máximo, se devuelve el máximo.
     * Si es inferior al mínimo, se devuelve el mínimo. En cualquier
     * otro caso se devuelve el valor original.
     *
     * @param valor valor que se desea comprobar
     * @return valor ajustado al rango permitido
     */
    protected int validaRango(int valor) {
        if (valor > VALOR_MAXIMO) {
            return VALOR_MAXIMO;
        } else if (valor < VALOR_MINIMO) {
            return VALOR_MINIMO;
        } else {
            return valor;
        }
    }

    /**
     * Hace que el personaje coma.
     *
     * La alimentación del personaje se establece en su valor máximo.
     *
     * @return mensaje indicando que el personaje ha comido
     */
    public String comer() {
        this.alimentacion = 100;
        return "El personaje ha comido. Su alimentación está al máximo";
    }

    /**
     * Hace que el personaje duerma.
     *
     * La energía del personaje se establece en su valor máximo.
     *
     * @return mensaje indicando que el personaje ha dormido
     */
    public String dormir() {
        this.energia = 100;
        return "El personaje ha dormido. Su energía está al máximo.";
    }

    /**
     * Realiza un ataque contra otro humano.
     *
     * Este método proporciona un comportamiento de ataque genérico
     * que puede ser sobrescrito por las clases hijas.
     *
     * @param objetivo humano al que se dirige el ataque
     * @return mensaje indicando que el personaje ha atacado
     */
    public String atacar(Humano objetivo) {
        return "El personaje ha atacado.";
    }

    /**
     * Cura al personaje.
     *
     * @return mensaje indicando que el personaje se ha curado
     */
    public String curar() {
        return "El personaje se ha curado.";
    }

    /**
     * Obtiene la fuerza actual del personaje.
     *
     * @return valor actual de fuerza
     */
    public int getFuerza() {
        return fuerza;
    }

    /**
     * Obtiene el identificador actual de los personajes.
     *
     * @return identificador
     */
    public static int getId() {
        return id;
    }

    /**
     * Obtiene la identificación completa del personaje.
     *
     * La identificación está formada por el nombre de la clase,
     * el identificador y el nombre del personaje.
     *
     * @return cadena con la identificación del personaje
     */
    public String getIdentificacion() {
        return this.getClass().getSimpleName()
                + " Id: " + this.id
                + " nombre: " + this.nombre;
    }
}