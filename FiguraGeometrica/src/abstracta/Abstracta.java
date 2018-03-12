/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner miEscaner = new Scanner(System.in);
        float entrada;

        Triangulo miTriangulo = new Triangulo();
        Cuadrado miCuadrado = new Cuadrado();
        Rectangulo miRectangulo = new Rectangulo();

        System.out.println("ingrese el valor del lado de su Cuadrado");
        entrada = miEscaner.nextFloat();
        miTriangulo.setLado(entrada);
        System.out.println(miCuadrado.CalcularArea());
        System.out.println(miCuadrado.CalcularPerimetro());

        System.out.println("ingrese el valor del lado1 de su Rectangulo");
        entrada = miEscaner.nextFloat();
        miTriangulo.setBase(entrada);
        System.out.println("ingrese el valor del lado2 de su Rectangulo");
        entrada = miEscaner.nextFloat();
        miTriangulo.setBase(entrada);
         System.out.println(miRectangulo.CalcularArea());
        System.out.println(miRectangulo.CalcularPerimetro());
        
        System.out.println("ingrese el valor de la base de su triangulo");
        entrada = miEscaner.nextFloat();
        miTriangulo.setBase(entrada);
         System.out.println(miTriangulo.CalcularArea());
        System.out.println(miTriangulo.CalcularPerimetro());
        

    }

}
