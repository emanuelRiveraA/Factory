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
public class Figurin2 extends ClaseAbstracta{

    @Override
    public void calcular() {
        //System.out.println("Super calculo: "+(getD1()+getD2())); otra forma
        System.out.println("Super calculo: "+(super.getD1()+super.getD2()));
                
    }
    
    public void calcular(double d3){
        System.out.println("R="+ (d1+d2+d3));//metodo sobresrito
    }
    
    
}
