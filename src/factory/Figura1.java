/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author Idalia
 */
public class Figura1 implements Catalogo{

    private double dato1;
    private double dato2;
    private double dato3;
    private double dato4;

    public Figura1() {
    }

    public Figura1(double dato1, double dato2, double dato3, double dato4) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
        this.dato4 = dato4;
    }

    public double getDato1() {
        return dato1;
    }

    public void setDato1(double dato1) {
        this.dato1 = dato1;
    }

    public double getDato2() {
        return dato2;
    }

    public void setDato2(double dato2) {
        this.dato2 = dato2;
    }

    public double getDato3() {
        return dato3;
    }

    public void setDato3(double dato3) {
        this.dato3 = dato3;
    }

    public double getDato4() {
        return dato4;
    }

    public void setDato4(double dato4) {
        this.dato4 = dato4;
    }
            
    @Override
    public void agregar() {
        System.out.println("Resultado de la suma: "+ (dato1+dato2+dato3+dato4));
    }

    @Override
    public void restar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void multiplicar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dividir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
