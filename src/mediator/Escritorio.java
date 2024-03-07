package mediator;

public class Escritorio {

    private MiMediator mediator;

    public void usar() {
        System.out.println("Usando el escritorio");
    }

    public void ignorar() {
        System.out.println("Ignorando escritorio :D");
        mediator.prenderAlarma();
    }

    public void setMediator(MiMediator mediator) {
        this.mediator = mediator;
    }

}
