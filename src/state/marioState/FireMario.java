package state.marioState;

public class FireMario implements MarioState{
    private Mario mario;

    public FireMario(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void gotMushroom() {
        System.out.println("Mario consiguio un honguito!!!");
        mario.setCoins(100);

    }

    @Override
    public void gotFireFlower() {
        System.out.println("Mario ya tiene Fireflower!!!");
        mario.setCoins(200);
    }

    @Override
    public void gotFeather() {
        System.out.println("Mario consiguio plumita!!!");
        mario.setState(new CapeMario(mario));

        mario.setCoins(300);
    }

    @Override
    public void metMonster() {
        System.out.println("Mario se encontro con un enemigo!!");
        mario.setState(new SmallMario(mario));
    }
}
