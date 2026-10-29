package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Estudiante e1 = new Estudiante(
                "Carlos", 20, 8.5, 120
        );

        System.out.println("Datos iniciales:");
        System.out.println(e1);

        System.out.println("\nModificando datos:");

        e1.setEdad(21);
        e1.modificarPromedio(9.0);
        e1.agregarCreditos(30);

        System.out.println(e1);

        System.out.println("\n\t\tProbando validaciones:");
        
        System.out.println("\nPruebas nombre ('')");
        e1.setNombre("");
        
        System.out.println("\nPruebas edad (-5 y 200)");
        e1.setEdad(-5);
        e1.setEdad(200);
        
        System.out.println("\nPruebas promedio (15 y -6)");
        e1.setPromedio(15);
        e1.setPromedio(-6);
        
        System.out.println("\nPruebas creditos (-20 y 1000)");
        e1.setCreditos(-20);
        e1.setCreditos(1000);
        
        System.out.println("\nPruebas agregar creditos (600 y -2000)");
        e1.agregarCreditos(600);
        e1.agregarCreditos(-2000);

        System.out.println("\nDatos finales:");
        System.out.println(e1);
    }
    
}
