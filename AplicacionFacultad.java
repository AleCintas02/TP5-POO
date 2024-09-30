public class AplicacionFacultad {
    public static void main() {
        // Crear cargos
        Cargo cargo1 = new Cargo("JTP-Programación OO", 800.0, 2014, 10);  // Cargo simple
        Cargo cargo2 = new SemiExclusivo("Titular-TFA", 1400.0, 2012, 10, 5);  // SemiExclusivo con 10 hs docencia y 5 hs investigación
        Cargo cargo3 = new Exclusivo("JTP-Analisis de Sistemas", 800.0, 2004, 10, 5, 5);  // Exclusivo con 10 docencia, 5 investigación, 5 extensión
        Cargo cargo4 = new Cargo("JTP-Inteligencia Artificial", 900.0, 2016, 10);  // Cargo simple
        Cargo cargo5 = new SemiExclusivo("Titular-Física", 1500.0, 2010, 15, 4);  // SemiExclusivo con 15 hs docencia y 4 hs investigación
        Cargo cargo6 = new Exclusivo("JTP-Matemática Discreta", 850.0, 2007, 12, 6, 4);  // Exclusivo con 12 docencia, 6 investigación, 4 extensión
        Cargo cargo7 = new Cargo("Auxiliar Programación", 700.0, 2018, 8);  // Cargo simple
        Cargo cargo8 = new Exclusivo("Titular-Filosofía", 1000.0, 2000, 10, 5, 3);  // Exclusivo con investigación y extensión
        Cargo cargo9 = new SemiExclusivo("JTP-Economía", 1300.0, 2015, 12, 3);  // SemiExclusivo con 12 hs docencia y 3 hs investigación

        // Crear profesores
        Profesor profesor1 = new Profesor(28596132, "Juan", "Perez", 1996, "Lic. en Sistemas de Información", cargo1);
        profesor1.agregarCargo(cargo2);
        profesor1.agregarCargo(cargo3);

        Profesor profesor2 = new Profesor(30586987, "María", "Gómez", 2005, "Lic. en Matemática", cargo4);
        profesor2.agregarCargo(cargo5);

        Profesor profesor3 = new Profesor(28965412, "Carlos", "Rodríguez", 1999, "Lic. en Física", cargo6);

        Profesor profesor4 = new Profesor(32458796, "Ana", "Fernández", 2012, "Lic. en Filosofía", cargo8);

        Profesor profesor5 = new Profesor(31234567, "Luis", "Martínez", 2010, "Lic. en Economía", cargo9);
        profesor5.agregarCargo(cargo7);

        // Crear facultad
        Facultad facultad1 = new Facultad("FaCENA", profesor1);
        facultad1.agregarProfesor(profesor2);
        facultad1.agregarProfesor(profesor3);
        facultad1.agregarProfesor(profesor4);
        facultad1.agregarProfesor(profesor5);

        // Mostrar la nómina de profesores y sus cargos
        facultad1.nominaProfesores();
        facultad1.listarProfesorCargos();
    }
}
