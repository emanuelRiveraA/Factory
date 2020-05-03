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
public abstract class ClaseAbstracta {
    
    protected double d1;
    protected double d2;

    public ClaseAbstracta() {
    }

    public ClaseAbstracta(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }
    
    public abstract void calcular();
}
