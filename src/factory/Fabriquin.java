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
public class Fabriquin {
    
    public static ClaseAbstracta crearObjeto(int opc){
        
        switch(opc){
            
            case 1:
                return new Figurin1();
            case 2:
                return new Figurin2();
            default:
                System.out.println("Ups!, opción no encontrada :(");
            
        }
        
        return null;
    }
}
