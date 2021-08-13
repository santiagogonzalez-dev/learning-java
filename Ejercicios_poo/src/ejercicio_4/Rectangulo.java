package ejercicio_4;

public class Rectangulo {
    private double base;
    private double altura;

    // vacio
    public Rectangulo() {
    }
    // Constructor por parámetros
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Setter for base
    public void setBase(double base) {
        this.base = base;
    }
    // Setter for altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Getter for base
    public double getBase(double base) {
        return base;
    }
    // Getter for altura
    public double getAltura(double altura) {
        return altura;
    }

}
/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para crear el
 * rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
 * método para calcular la superficie del rectángulo y un método para calcular el
 * perímetro del rectángulo. Por último, tendremos un método que dibujará el
 * rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
 * los métodos getters, setters y constructores correspondientes.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.			*/

// Tengo que mantener solo dos atributos, base y altura
// De ahí en más tengo que calcular desde mi clase servicio usando getters y setters
// como calcular la superficie y perímetro tal y como me dijeron Ana y Gabriel
//
// Metodo es void
