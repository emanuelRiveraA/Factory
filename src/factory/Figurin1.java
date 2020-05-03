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
public class Figurin1 extends ClaseAbstracta{

    @Override
    public void calcular() {
        double d = d1+d2;//las variables estan protegiadas y se pueden heredar
        System.out.println("Calculando ... " + (d1+d2));
    }
    
}
