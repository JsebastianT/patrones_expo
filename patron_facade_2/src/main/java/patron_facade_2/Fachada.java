package patron_facade_2;


public class Fachada {
    private Computadora computadora;
     /**
      * Contructor, instancia los componentes necesarios y el objeto computadora.
      */
    public Fachada() {
        IMouse mouse = new Mouse();
        ITeclado teclado = new Teclado();
        
        this.computadora = new Computadora(mouse, teclado);
    }
    
    /**
     * Operación de interes para aplicar el patron de diseño Facade.
     */
    public void encender(){
        /** pueden ser operaciones mas complejas y costosas computacionalmente. **/
        this.computadora.encender();
    }
}
