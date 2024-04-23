package patron_facade_2;


public class Teclado implements ITeclado{

    @Override
    public void conectar() {
        System.out.println("Conectar teclado via USB.");
    }
    
}
