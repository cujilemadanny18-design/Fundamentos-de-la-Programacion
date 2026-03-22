/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareasemana14;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Tareasemana14 {


    // función con parámetros y retorno
    public static double calcularPromedio(double n1, double n2, double n3) {
        double promedio = (n1 + n2 + n3) / 3;
        return promedio;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nota1, nota2, nota3;

        System.out.println("Ingrese nota 1:");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese nota 2:");
        nota2 = sc.nextDouble();

        System.out.println("Ingrese nota 3:");
        nota3 = sc.nextDouble();

        double resultado = calcularPromedio(nota1, nota2, nota3);

        System.out.println("El promedio es: " + resultado);
    }
}
