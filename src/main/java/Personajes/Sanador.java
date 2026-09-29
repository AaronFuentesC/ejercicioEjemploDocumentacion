/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes;

/**
 * Interfaz que define las acciones que puede realizar un personaje
 * con capacidades de sanación.
 *
 * <p>Las clases que implementen esta interfaz deberán proporcionar
 * métodos para curar heridas y proporcionar energía a otros humanos.</p>
 *
 * @author Aarón Fuentes Casanova
 */
public interface Sanador {

        /**
         * Cura las heridas de un humano.
         *
         * @param id identificador del humano que recibe la curación
         * @return mensaje indicando el resultado de la curación
         */
        public String curarHeridas(int id);

        /**
         * Proporciona energía a un humano.
         *
         * @param id identificador del humano que recibe la energía
         * @return mensaje indicando el resultado de la acción
         */
        public String darEnergia(int id);
}