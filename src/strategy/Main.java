package strategy;

import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) {
        StrategyContext contexto = new StrategyContext();

        // Generando key para AES
        AESStrategy AESStrategy = new AESStrategy();
        SecretKey AESKey = AESStrategy.generarAESKey();

        // Se manda la key a AESStrategy y se setea la strategy al contexto
        AESStrategy.init(AESKey);
        contexto.setStrategy(AESStrategy);

        // Ejempo de encriptacion y decriptacion
        String texto = "Texto de ejemplowo";
        System.out.println("Texto original:" + texto);
        contexto.encrypt(texto);
        System.out.println("Texto secretowo???" + texto);
        contexto.decrypt(texto);
    }

}