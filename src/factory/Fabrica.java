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
public class Fabrica {
 
    //metodo de clase ->>>que no se necesita instanciar un objeto porque es estatico
    //metodo de clase que devuelva un objeto de la clase/interface catalogo
     public static Catalogo fabricarObjeto(int opc, double d1, double d2, double d3, double d4){
         
        switch(opc){
            
            case 0:
               return new Figura1(d1,d2,d3,d4);
            case 1:
                return new Figura2(d1,d2,d3,d4);                
        }
        return null;
    }
}
