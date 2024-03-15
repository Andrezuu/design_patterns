package state.marioState;

public class Mario {
    private int lifeCount;
    private int coins;

    MarioState state;

    public Mario() {
        this.lifeCount = 3;
        this.coins = 0;
        this.state = new SmallMario(this);
    }

    public void setState(MarioState newMarioState) {
        this.state = newMarioState;
    }

    public void gotMushroom() {
        state.gotMushroom();
    }

    public void gotFireFlower() {
        state.gotFireFlower();
    }

    public void gotFeather() {
        state.gotFeather();
    }

    public void metMonster() {
        state.metMonster();
    }

    public void setCoins(int coins) {
        System.out.println("Mario obtuvo " + coins + " monedas");
        this.coins += coins;

        if (this.coins >= 5000) {
            addLife();
            this.coins -= 5000;
        }
    }

    public void addLife() {
        System.out.println("Mario gano una nueva vida!!!");
        this.lifeCount += 1;
    }

    public void lostLife() {
        System.out.println("Mario perdió una vida!!!");
        this.lifeCount -= 1;

        if (this.lifeCount <= 0) {
            gameOver();
        }
    }

    public void gameOver() {
        this.lifeCount = 0;
        this.coins = 0;
        System.out.println("Game Over!!");
    }

    @Override
    public String toString() {
        return "Mario Bross:\n" +
                "------------------------------" +
                "\n Estado=" + state.toString() +
                "\n Numero de Vidas=" + lifeCount +
                "\n Monedas=" + coins;
    }

}