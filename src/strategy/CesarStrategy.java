package strategy;

public class CesarStrategy implements EncryptionStrategy {
    private int displace;

    @Override
    public void encrypt(String texto) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char charOriginal = texto.charAt(i);
            if (Character.isLetter(charOriginal)) {
                // encriptacion cesar
                char charEncriptado = (char) ((charOriginal - 'a' + displace) % 26 + 'a');
                textoEncriptado.append(charEncriptado);
            } else {
                textoEncriptado.append(charOriginal);
            }
        }
        System.out.println("Texto encriptado " + textoEncriptado.toString());
    }

    @Override
    public void decrypt(String texto) {
        StringBuilder textoDecriptado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char charEncriptado = texto.charAt(i);
            if (Character.isLetter(charEncriptado)) {
                char charDecriptado = (char) ((charEncriptado - 'a' - displace + 26) % 26 + 'a');
                textoDecriptado.append(charDecriptado);
            } else {
                textoDecriptado.append(charEncriptado);
            }
        }
        System.out.println("Texto decriptado " + textoDecriptado.toString());
    }

    @Override
    public void init(Object secretKey) {
        if (secretKey instanceof Integer ) {
            this.displace = (int) secretKey;
        } else {
            System.out.println("Tipo invalido para Cesar! La key debe ser integer");
        }
    }

}