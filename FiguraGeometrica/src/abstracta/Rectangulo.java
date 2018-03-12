/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta;

/**
 *
 * @author Estudiantes
 */
public class Rectangulo extends FiguraGeometrica {

    private float lado1, lado2;
    float area, perimetro;

    @Override
    double CalcularArea() {
        area = lado1 * lado2;
        return area;

    }

    @Override
    double CalcularPerimetro() {
        perimetro = 2*lado1 + 2*lado2;
        return perimetro;
    }

}
