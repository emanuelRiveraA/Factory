
package factory;


public class Figura2 implements Catalogo{

    private double dato1;
    private double dato2;
    private double dato3;
    private double dato4;

    public Figura2() {
    }

    public Figura2(double dato1, double dato2, double dato3, double dato4) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.dato3 = dato3;
        this.dato4 = dato4;
    }
    
    
    @Override
    public void agregar() {
        System.out.println("Figura2: "+ (dato1+dato2+dato3+dato4));
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
