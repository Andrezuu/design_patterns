package mediator;

import java.util.Random;

public class MiMediator {
    Alarma alarma;
    Calendario calendario;
    Escritorio escritorio;
    JarraCafe jarraCafe;

    public MiMediator(Alarma alarma, Calendario calendario, Escritorio piscina, JarraCafe jarraCafe) {
        this.alarma = alarma;
        this.calendario = calendario;
        this.escritorio = piscina;
        this.jarraCafe = jarraCafe;
    }

    public void rutinaFinde() {
        alarma.ignorar();
        escritorio.ignorar();;
        jarraCafe.ignorar();
        System.out.println("Descansando!");
    }

    public void rutinaSemana() {
        alarma.apagar();
        jarraCafe.hacerCafe();
        escritorio.usar();
        calendario.esperarFinde();
    }

    public void rutinaExamen() {
        Random rnd = new Random();
        jarraCafe.hacerMuchoCafe(rnd.nextInt(2,7));
        escritorio.usar();
    }

    public int verCalendario() {
        return calendario.revisarCalendario();
    }

    public void usarEscritorio() {
        escritorio.usar();
    }

    public void ignorarCalendario() {
        calendario.ignorar();
    }

    public void prenderAlarma() {
        alarma.prender();
    }

    public void ignorarAlarma() {
        alarma.ignorarAlarmaConRiesgo();
    }



}
