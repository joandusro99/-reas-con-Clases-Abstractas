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
public class Cuadrado extends FiguraGeometrica {

    private float lado,area;
    float perimetro;

    @Override

    double CalcularArea() {
        area= lado*lado;
        return area;

    }

    @Override
    double CalcularPerimetro() {
        perimetro = lado*4;
        return perimetro;
    }

    void setlado(float entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
