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
public class Triangulo extends FiguraGeometrica {

    private float area, perimetro;
    float base, altura;

    @Override
    double CalcularArea() {
        area = base*altura/2;
        return area;

    }

    @Override
    double CalcularPerimetro() {
        perimetro = base*3;
        return perimetro;
        

    }

    void setBase(float entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setLado(float entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
