/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Mago;

import Personajes.Sanador;

/**
 * Representa a un mago de tipo Hechicero.
 *
 * El hechicero utiliza un elemento para realizar sus conjuros
 * y además implementa la interfaz {@link Sanador}, por lo que puede
 * curar heridas y proporcionar energía.
 *
 * @author Aarón Fuentes Casanova
 */
public class Hechicero extends Mago implements Sanador {

    /**
     * Elemento utilizado por el hechicero para realizar sus conjuros.
     */
    String elemento;

    /**
     * Construye un nuevo hechicero.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     * @param mana cantidad inicial de maná
     * @param elemento elemento utilizado para los conjuros
     */
    public Hechicero(
            String nombre,
            int salud,
            int energia,
            int alimentacion,
            int mana,
            String elemento) {

        super(nombre, salud, energia, alimentacion, mana);
        this.elemento = elemento;
    }

    /**
     * Realiza un conjuro utilizando el elemento del hechicero.
     *
     * @return mensaje indicando el elemento utilizado en el conjuro
     */
    @Override
    public String hacerConjuro() {
        return "El hechicero ha hecho un conjunro con el elemento "
                + elemento;
    }

    /**
     * Aumenta la fuerza de un humano.
     *
     * @param id identificador del humano cuya fuerza se aumenta
     * @param cantidad cantidad de fuerza que se añade
     * @return mensaje indicando el aumento de fuerza
     */
    public String darFuerza(int id, int cantidad) {
        return "La fuerza del Humano " + id
                + "Ha sido aumentada en" + cantidad;
    }

    /**
     * Aumenta la defensa de un guerrero.
     *
     * @param id identificador del guerrero cuya defensa se aumenta
     * @param cantidad cantidad de defensa que se añade
     * @return mensaje indicando el aumento de defensa
     */
    public String darDefensa(int id, int cantidad) {
        return "La defensa del guerrero " + id
                + "Ha sido aumentada en " + cantidad;
    }

    /**
     * Cura las heridas de un humano.
     *
     * @param id identificador del humano que recibe la curación
     * @return mensaje indicando que el humano ha sido curado
     */
    @Override
    public String curarHeridas(int id) {
        return "El hechicero ha curado las heridas del Humano " + id;
    }

    /**
     * Proporciona energía a un humano.
     *
     * @param id identificador del humano que recibe la energía
     * @return mensaje indicando que el humano ha recibido energía
     */
    @Override
    public String darEnergia(int id) {
        return "El hechicero ha dado energía al humano" + id;
    }
}