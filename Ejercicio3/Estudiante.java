package ejercicio3;

public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;
    private int creditos;

    public Estudiante(String nombre, int edad, double promedio, int creditos) {
        setNombre(nombre);
        setEdad(edad);
        setPromedio(promedio);
        setCreditos(creditos);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre invalido");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 15 && edad <= 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad invalida: " + edad);
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio invalido: " + promedio);
        }
    }

    public void setCreditos(int creditos) {
        if (creditos >= 0 && creditos <= 500) {
            this.creditos = creditos;
        } else {
            System.out.println("Creditos invalidos: " + creditos);
        }
    }

    public void agregarCreditos(int cantidad) {
        if (cantidad > 0 && creditos + cantidad <= 500) {
            creditos += cantidad;
        } else {
            System.out.println("No se pueden agregar esos creditos");
        }
    }

    public void modificarPromedio(double nuevoPromedio) {
        setPromedio(nuevoPromedio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Promedio: " + promedio+ " | Creditos: " + creditos;
    }
}
