package mediator;

import java.util.Random;

public class Calendario {

    private MiMediator mediator;

    public int revisarCalendario() {
        Random rnd = new Random();
        int dia = rnd.nextInt(1, 28);
        
        if (dia % 7 == 0 || dia % 6 == 0) {
            mediator.rutinaFinde();
            return 1;
        } else if (dia >= 12 || dia <= 20) {
            mediator.rutinaExamen();
            return 2;
        } else {
            mediator.rutinaSemana();
            return 3;
        }

        
    }

    public void esperarFinde() {
        System.out.println("Esperando el finde :(");
    }

    public void ignorar() {
        System.out.println("Ignorando el calendario...");
    }
    public void setMediator(MiMediator mediator) {
        this.mediator = mediator;
    }


}
