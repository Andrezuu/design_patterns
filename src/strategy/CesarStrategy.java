package strategy;

public class CesarStrategy implements EncryptionStrategy {
    private int displace;

    @Override
    public String encrypt(String texto) {
        StringBuilder textoEncriptado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char charOriginal = texto.charAt(i);
            if (Character.isLetter(charOriginal)) {
                // encriptacion cesar
                char base = Character.isLowerCase(charOriginal) ? 'a' : 'A';
                char charEncriptado = (char) (((charOriginal - base + displace) % 26) + base);
                textoEncriptado.append(charEncriptado);
            } else {
                textoEncriptado.append(charOriginal);
            }
        }
        System.out.println("Texto encriptado " + textoEncriptado.toString());
        return textoEncriptado.toString();
    }

    @Override
    public String decrypt(String texto) {
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
        return textoDecriptado.toString();
    }

    @Override
    public void init(Object secretKey) {
        if (secretKey instanceof Integer) {
            this.displace = (int) secretKey;
        } else {
            System.out.println("Tipo invalido para Cesar! La key debe ser integer");
        }
    }

}