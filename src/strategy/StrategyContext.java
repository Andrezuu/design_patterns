package strategy;

public class StrategyContext implements EncryptionStrategy {
    private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void encrypt(String texto) {
        strategy.encrypt(texto);
    }

    @Override
    public void decrypt(String texto) {
        strategy.decrypt(texto);
    }

    @Override
    public void init(Object secretKey) {
        strategy.init(secretKey);
    }

}