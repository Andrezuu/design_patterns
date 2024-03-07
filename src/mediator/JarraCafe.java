package mediator;

public class JarraCafe {

    private MiMediator mediator;

    public void ignorar() {
        System.out.println("Ignorando cafe...");
    }

    public void hacerCafe() {
        System.out.println("Haciendo cafe!");
    }

    public void hacerMuchoCafe(int n) {
        System.out.println("Haciendo " + n + " cafes...");
        mediator.ignorarCalendario();
        for (int i = 0; i < n; i++) {
            hacerCafe();
            mediator.usarEscritorio();
            
        }
    }

    public void setMediator(MiMediator mediator) {
        this.mediator = mediator;
    }

}
