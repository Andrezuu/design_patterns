package state.marioState;

public class Main {
    public static void main(String[] args) {
        // write your code here
              System.out.println("Simulando el Juego de Mario Bross con State!!!");
        
              Mario mario = new Mario();
              System.out.println(mario);
        
              mario.gotMushroom();
              System.out.println(mario);
        
              mario.gotFireFlower();
              System.out.println(mario);
        
              mario.gotFeather();
              System.out.println(mario);
        
              mario.setCoins(4800);
              System.out.println(mario);
        
              mario.metMonster();
              System.out.println(mario);
        
              mario.metMonster();
              System.out.println(mario);
        
              mario.metMonster();
              System.out.println(mario);
          }
        
}
