/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Mago;

import Personajes.Humano;

/**
 * Clase abstracta que representa a un mago.
 *
 * Un mago es un tipo de {@link Humano} que dispone de una
 * cantidad de maná y puede realizar conjuros.
 *
 * @author Aarón Fuentes Casanova
 */
public abstract class Mago extends Humano {

    /**
     * Cantidad de maná disponible para el mago.
     */
    int mana;

    /**
     * Construye un nuevo mago.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     * @param mana cantidad inicial de maná
     */
    public Mago(
            String nombre,
            int salud,
            int energia,
            int alimentacion,
            int mana) {

        super(nombre, salud, energia, alimentacion);
        this.mana = mana;
    }

    /**
     * Realiza un ataque contra otro humano.
     *
     * El ataque muestra la fuerza y el maná disponible del mago.
     *
     * @param objetivo humano al que se dirige el ataque
     * @return mensaje indicando los datos del ataque y el objetivo
     */
    @Override
    public String atacar(Humano objetivo) {
        return String.format(
                "El mago %d ha atacado con %d Fuerza y mana %d",
                getId(),
                getFuerza(),
                mana
        ) + " al humano " + objetivo.getIdentificacion();
    }

    /**
     * Realiza un conjuro.
     *
     * Este método proporciona un comportamiento genérico que puede
     * ser sobrescrito por las clases especializadas de magos.
     *
     * @return mensaje indicando que se ha realizado un conjuro
     */
    public String hacerConjuro() {
        return "El hechicero ha hecho un conjuro";
    }
}