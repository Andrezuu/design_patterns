package strategy;

public interface EncryptionStrategy {
    void encrypt(String texto);
    void decrypt(String texto);
    void init(Object secretKey);
}