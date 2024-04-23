package patron_facade_2;

public class Mouse implements IMouse {

    @Override
    public void conectar() {
        System.out.println("Conecta el mouse via USB!");
    }
    
}
