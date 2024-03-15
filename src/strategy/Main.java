package strategy;

import javax.crypto.SecretKey;

public class Main {
    public static void main(String[] args) {
        StrategyContext contexto = new StrategyContext();
        String texto = "Texto de ejemplowo";

        // Generando key para AES
        AESStrategy AESStrategy = new AESStrategy();
        SecretKey AESKey = AESStrategy.generarAESKey();

        // Se manda la key a AESStrategy y se setea la strategy al contexto
        AESStrategy.init(AESKey);
        contexto.setStrategy(AESStrategy);

        // Ejempo de encriptacion y decriptacion con AES
        System.out.println("--------------------- \nEjemplo con AES");
        System.out.println("Texto original: " + texto);
        String textoEncriptado = contexto.encrypt(texto);
        contexto.decrypt(textoEncriptado);

        // Ejemplo de encriptacion y decriptacion con Cesar
        contexto.setStrategy(new CesarStrategy());
        contexto.init(9);
        System.out.println("--------------------- \nEjemplo con Cesar, con un displace de 9");
        System.out.println("Texto original: " + texto);
        textoEncriptado = contexto.encrypt(texto);
        contexto.decrypt(textoEncriptado);

    }

}