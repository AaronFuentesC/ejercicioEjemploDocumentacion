/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package Personajes.Mago;

/**
 * Representa a un mago de tipo Clérigo.
 *
 * El clérigo dispone de un valor de fe que utiliza al realizar
 * sus conjuros.
 *
 * @author Aarón Fuentes Casanova
 */
public class Clerigo extends Mago {

    /**
     * Fe utilizada por el clérigo para realizar sus conjuros.
     */
    String fe;

    /**
     * Construye un nuevo clérigo.
     *
     * @param nombre nombre del personaje
     * @param salud cantidad inicial de salud
     * @param energia cantidad inicial de energía
     * @param alimentacion cantidad inicial de alimentación
     * @param mana cantidad inicial de maná
     * @param fe valor o nombre de la fe del clérigo
     */
    public Clerigo(
            String nombre,
            int salud,
            int energia,
            int alimentacion,
            int mana,
            String fe) {

        super(nombre, salud, energia, alimentacion, mana);
        this.fe = fe;
    }

    /**
     * Realiza un conjuro utilizando la fe del clérigo.
     *
     * @return mensaje indicando la fe utilizada en el conjuro
     */
    @Override
    public String hacerConjuro() {
        return "El clerigo ha hecho un conjuro con la fe " + fe;
    }
}