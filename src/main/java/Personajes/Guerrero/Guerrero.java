/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Guerrero;

import Personajes.Humano;

/**
 * Clase abstracta que representa a un guerrero.
 *
 * Un guerrero es un tipo de {@link Humano} que dispone de valores
 * de defensa y fuerza. Esta clase sirve como clase base para los
 * diferentes tipos de guerreros.
 *
 * @author Aarón Fuentes Casanova
 */
public abstract class Guerrero extends Humano {

    /**
     * Valor de defensa del guerrero.
     */
    int defensa;

    /**
     * Valor de fuerza del guerrero.
     */
    int fuerza;

    /**
     * Construye un nuevo guerrero.
     *
     * La defensa y la fuerza comienzan con un valor de 100.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     */
    public Guerrero(
            String nombre,
            int salud,
            int energia,
            int alimentacion) {

        super(nombre, salud, energia, alimentacion);
        defensa = 100;
        fuerza = 100;
    }

    /**
     * Bloquea un ataque recibido.
     *
     * @return mensaje indicando que el ataque ha sido bloqueado
     */
    public String bloquear() {
        return "El guerrero ha bloqueado el ataque";
    }

    /**
     * Aumenta la fuerza del guerrero.
     *
     * @param aumento cantidad que se añade a la fuerza actual
     * @return mensaje indicando el nuevo valor de fuerza
     */
    public String aumentoFuerza(int aumento) {
        fuerza += aumento;
        return "La fuerza ha aumentado a " + fuerza;
    }

    /**
     * Aumenta la defensa del guerrero.
     *
     * @param aumento cantidad que se añade a la defensa actual
     * @return mensaje indicando el nuevo valor de defensa
     */
    public String aumentoDefensa(int aumento) {
        defensa += aumento;
        return "La defensa ha aumentado a " + defensa;
    }
}