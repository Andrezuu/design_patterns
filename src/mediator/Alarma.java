package mediator;

public class Alarma {

    private MiMediator mediator;

    public void apagar() {
        System.out.println("Apagando alarma");
    }

    public void prender() {
        System.out.println("Prendiendo alarma...");
    }

    public void ignorar() {
        System.out.println("Ignorando alarma...");
    }

    public void ignorarAlarmaConRiesgo() {
        System.out.println("Espere que esto funcione...");
        int rutinaUsada = mediator.verCalendario();

        if (rutinaUsada == 1) {
            System.out.println("Con suerte :D");
        } else {
            System.out.println("Mal rato D:");
        }
    }

    public void setMediator(MiMediator mediator) {
        this.mediator = mediator;
    }

}
