public class RegistroEstudiantes {


    static class Estudiante {
        String nombres;
        String apellidos;
        double promedio;

        Estudiante(String nombres, String apellidos, double promedio) {
            this.nombres = nombres;
            this.apellidos = apellidos;
            this.promedio = promedio;
        }
    }

    public static void main(String[] args) {
        // Arreglo de 20 estudiantes
        Estudiante[] estudiantes = {
            new Estudiante("Luis", "Martínez", 89.5),
            new Estudiante("Ana", "Gómez", 75.2),
            new Estudiante("Carlos", "Ramírez", 91.3),
            new Estudiante("María", "López", 68.9),
            new Estudiante("Pedro", "García", 95.7),
            new Estudiante("Laura", "Fernández", 82.4),
            new Estudiante("José", "Ríos", 77.0),
            new Estudiante("Sofía", "Torres", 99.0),
            new Estudiante("Javier", "Castro", 84.5),
            new Estudiante("Diana", "Morales", 66.5),
            new Estudiante("Elena", "Sánchez", 79.6),
            new Estudiante("Miguel", "Navarro", 88.2),
            new Estudiante("Paula", "Herrera", 90.1),
            new Estudiante("Ricardo", "Aguilar", 81.0),
            new Estudiante("Carmen", "Cruz", 85.8),
            new Estudiante("Andrés", "Mendoza", 92.3),
            new Estudiante("Valeria", "Salinas", 76.5),
            new Estudiante("Jorge", "Ortega", 71.9),
            new Estudiante("Lucía", "Mejía", 80.3),
            new Estudiante("Kevin", "Delgado", 60.0)
        };


        Estudiante mayor = estudiantes[0];
        Estudiante menor = estudiantes[0];

        for (int i = 1; i < estudiantes.length; i++) {
            if (estudiantes[i].promedio > mayor.promedio) {
                mayor = estudiantes[i];
            }
            if (estudiantes[i].promedio < menor.promedio) {
                menor = estudiantes[i];
            }
        }


        System.out.println("Estudiante con el promedio más alto:");
        System.out.println(mayor.nombres + " " + mayor.apellidos + " - Promedio: " + mayor.promedio);

        System.out.println("\nEstudiante con el promedio más bajo:");
        System.out.println(menor.nombres + " " + menor.apellidos + " - Promedio: " + menor.promedio);
    }
}