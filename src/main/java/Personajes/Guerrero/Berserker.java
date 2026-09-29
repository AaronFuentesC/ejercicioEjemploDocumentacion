/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Guerrero;

import Personajes.Humano;

/**
 * Representa a un guerrero de tipo Berserker.
 *
 * El Berserker utiliza un valor de furia que multiplica su fuerza
 * para determinar la potencia de sus ataques.
 *
 * @author Aarón Fuentes Casanova
 */
public class Berserker extends Guerrero {

    /**
     * Multiplicador de fuerza utilizado por el Berserker al atacar.
     */
    int furia;

    /**
     * Construye un nuevo Berserker.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     * @param fuerza multiplicador de furia del Berserker
     */
    public Berserker(
            String nombre,
            int salud,
            int energia,
            int alimentacion,
            int fuerza) {

        super(nombre, salud, energia, alimentacion);
        this.furia = fuerza;
    }

    /**
     * Realiza un ataque contra otro humano.
     *
     * La fuerza del ataque se calcula multiplicando la fuerza
     * del guerrero por el valor de furia.
     *
     * @param objetivo humano al que se dirige el ataque
     * @return mensaje indicando la fuerza del ataque y el objetivo
     */
    @Override
    public String atacar(Humano objetivo) {
        return "El Berserker ataca con una fuerza de "
                + (fuerza * furia)
                + " al humano "
                + objetivo.getIdentificacion();
    }
}