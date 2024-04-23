package patron_facade_2;


public class Computadora {
    private IMouse mouse;
    private ITeclado teclado;
    
    public Computadora(IMouse mouse, ITeclado teclado){
        this.mouse = mouse;
        this.teclado = teclado;
    }
    
    /**
     * Algoritmo de interes para aplicar la fachada.
     */
    public void encender(){
        mouse.conectar();
        teclado.conectar();
    }
}
