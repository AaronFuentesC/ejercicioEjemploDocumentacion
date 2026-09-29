/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * to change this license
 */
package com.mycompany.ejerciciomedieval;

import Personajes.Guerrero.Berserker;
import Personajes.Guerrero.Caballero;
import Personajes.Guerrero.Guerrero;
import Personajes.Mago.Clerigo;
import Personajes.Mago.Hechicero;
import Personajes.Mago.Mago;

/**
 * Clase principal de la aplicación EjercicioMedieval.
 *
 * Esta clase contiene el método {@code main}, que se utiliza para
 * crear diferentes personajes del juego medieval y probar sus
 * funcionalidades principales.
 *
 * Se crean personajes de tipo guerrero y mago, mostrando su
 * identificación y realizando diferentes ataques entre ellos.
 *
 * @author Aarón Fuentes Casanova
 */
public class EjercicioMedieval {

    /**
     * Método principal de ejecución de la aplicación.
     *
     * Crea varios personajes de diferentes clases y muestra por
     * pantalla sus identificaciones y los resultados de sus ataques.
     *
     * @param args argumentos recibidos desde la línea de comandos
     */
    public static void main(String[] args) {

        Guerrero gue1 = new Caballero(
                "Caballero1", 50, 50, 50, "Caballo1", 30
        );

        System.out.println(gue1.getIdentificacion());
        System.out.println("---------------------------");

        Guerrero ber1 = new Berserker(
                "Berserker1", 50, 50, 50, 3
        );

        System.out.println(ber1.getIdentificacion());
        System.out.println("---------------------------");

        Mago hec1 = new Hechicero(
                "Hechicero1", 50, 50, 50, 60, "Fuego"
        );

        System.out.println(hec1.getIdentificacion());
        System.out.println("---------------------------");

        Mago cle1 = new Clerigo(
                "Clérigo1", 50, 50, 50, 40, "ejemploFe"
        );

        System.out.println(cle1.getIdentificacion());
        System.out.println("---------------------------");

        System.out.println("Ataques");
        System.out.println(gue1.atacar(ber1));
        System.out.println(ber1.atacar(gue1));
        System.out.println(hec1.atacar(cle1));
        System.out.println(cle1.atacar(hec1));
    }
}