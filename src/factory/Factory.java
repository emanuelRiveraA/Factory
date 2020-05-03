
package factory;

public class Factory {

   //factory es ocultar el polimorfismo
    public static void main(String[] args) {
       
        /*Catalogo c0 = new Figura1(1, 2, 3, 4);//es lo mismo que el factory pero mas compliocado aqui se ve el polimofismo a simple vista
        c0.agregar();
        
        //Pa' fabricar los objetos
        Catalogo c1 = Fabrica.fabricarObjeto(1, 1, 2, 3, 4);
        c1.agregar();*/
        
    
        ClaseAbstracta c0 = Fabriquin.crearObjeto(1);
        c0.setD1(23);
        c0.setD2(21);
        
        c0.calcular();
        
        ClaseAbstracta c1 = Fabriquin.crearObjeto(2);
        
        c1.setD1(2);
        c1.setD2(34);
        
        c1.calcular();            
        
    }
    
}
