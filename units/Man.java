// Обобщенный абстрактный класс
package units;


public abstract class Man implements GameInterface {
    @Override
    public String getInfo() {
        return "";
    }


    @Override
    public void step(int a) {
        
    }

    protected int hp, maxHp, defence, attack, speed;
    
    public Man(int hp, int maxHp, int defence, int attack, int speed) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.defence = defence;
        this.attack = attack;
        this.speed = speed;
    }


    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }


    void Attack(){
        System.out.println("Иду на Вы");
    }

    public int getHp() {
        return hp;
    }

    public int getDefence() {
        return defence;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }



}