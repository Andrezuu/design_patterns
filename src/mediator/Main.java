package mediator;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de los componentes y del mediador
        Alarma alarma = new Alarma(); 
        Calendario calendario = new Calendario(); 
        Escritorio escritorio = new Escritorio(); 
        JarraCafe jarraCafe = new JarraCafe(); 
        // Puedes pasar el mediador después de la creación

        MiMediator mediator = new MiMediator(alarma, calendario, escritorio, jarraCafe);

        // Asignar el mediador a cada componente después de crearlo
        alarma.setMediator(mediator);
        calendario.setMediator(mediator);
        escritorio.setMediator(mediator);
        jarraCafe.setMediator(mediator);

        // Simular eventos que activan las rutinas
        System.out.println("------ Rutina Fin de Semana ------");
        mediator.rutinaFinde();

        System.out.println("\n------ Rutina Semana ------");
        mediator.rutinaSemana();

        System.out.println("\n------ Rutina Examen ------");
        mediator.rutinaExamen();

        System.out.println("\n------ Rutina Random :o ------");
        mediator.ignorarAlarma();
    }
}
