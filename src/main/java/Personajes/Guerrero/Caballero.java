/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Guerrero;

import Personajes.Humano;
import Personajes.Sanador;

/**
 * Representa a un guerrero de tipo Caballero.
 *
 * El caballero dispone de una montura que aporta fuerza adicional
 * a sus ataques y además implementa la interfaz {@link Sanador},
 * por lo que puede curar heridas y proporcionar energía.
 *
 * @author Aarón Fuentes Casanova
 */
public class Caballero extends Guerrero implements Sanador {

    /**
     * Nombre de la montura del caballero.
     */
    String montura;

    /**
     * Fuerza adicional proporcionada por la montura.
     */
    int fuerzaMontura;

    /**
     * Construye un nuevo caballero.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     * @param montura nombre de la montura
     * @param fuerzaMontura fuerza adicional proporcionada por la montura
     */
    public Caballero(
            String nombre,
            int salud,
            int energia,
            int alimentacion,
            String montura,
            int fuerzaMontura) {

        super(nombre, salud, energia, alimentacion);
        this.montura = montura;
        this.fuerzaMontura = fuerzaMontura;
    }

    /**
     * Realiza un ataque contra otro humano.
     *
     * La fuerza del ataque es la suma de la fuerza del caballero
     * y la fuerza adicional proporcionada por su montura.
     *
     * @param objetivo humano al que se dirige el ataque
     * @return mensaje indicando la fuerza del ataque y el objetivo
     */
    @Override
    public String atacar(Humano objetivo) {
        return "El caballero ataca con una fuerza de "
                + (this.fuerza + this.fuerzaMontura)
                + " al humano "
                + objetivo.getIdentificacion();
    }

    /**
     * Cura las heridas de un humano.
     *
     * @param id identificador del humano que recibe la curación
     * @return mensaje indicando que el humano ha sido sanado
     */
    @Override
    public String curarHeridas(int id) {
        return "El caballero ha sanado las heridas del Humano " + id;
    }

    /**
     * Proporciona energía a un humano.
     *
     * @param id identificador del humano que recibe la energía
     * @return mensaje indicando que el humano ha recibido energía
     */
    @Override
    public String darEnergia(int id) {
        return "El caballero ha dado energía al humano " + id;
    }
}