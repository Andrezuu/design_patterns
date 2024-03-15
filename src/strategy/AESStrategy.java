package strategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESStrategy implements EncryptionStrategy {
    private SecretKey secretKey;

    @Override
    public void encrypt(String texto) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] textoBytes = texto.getBytes();
            byte[] bytesEncriptados = cipher.doFinal(textoBytes);
            System.out.println("Texto encriptado" + new String(bytesEncriptados));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void decrypt(String texto) {
        try {
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] textoBytes = texto.getBytes();
            byte[] bytesDecriptados = cipher.doFinal(textoBytes);
            System.out.println("Texto decriptado" + new String(bytesDecriptados));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init(Object secretKey) {
        if (secretKey instanceof SecretKey) {
            this.secretKey = (SecretKey) secretKey;
        } else {
            System.out.println("Tipo incorrecto para AES! La key debe tipo SecretKey");
        }
    }

    public SecretKey generarAESKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            return keyGen.generateKey();
        } catch (Exception e) {
           e.printStackTrace();
           return null;
        }

    }

}