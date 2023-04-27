package et5;

public class Coche {
    //atributos
    String nombre; String color; String marca;

    //constructores
    public Coche(){}

    public Coche(String nombre, String color, String marca) {
        this.nombre = nombre;
        this.color = color;
        this.marca = marca;
    }

    //metodo
    //metodo ToString


    @Override
    public String toString() {
        return "Coche{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
