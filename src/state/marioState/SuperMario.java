package state.marioState;

public class SuperMario implements MarioState {
    private Mario mario;

    public SuperMario(Mario mario) {
        this.mario = mario;
    }

    @Override
    public void gotMushroom() {
        System.out.println("Mario ya tomaste honguito!!!");
        mario.setCoins(100);
    }

    @Override
    public void gotFireFlower() {
        System.out.println("Mario consiguio un Fireflower!!!");
        mario.setState(new FireMario(mario));

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
