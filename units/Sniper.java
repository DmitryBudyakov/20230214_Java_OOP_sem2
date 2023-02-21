package units;

public class Sniper extends Man {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sniper(String name) {
        super(100, 3, 25, 30, 5);
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Снайпер %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я снайпер";
    }

    @Override
    public void step(int a) {
    }

}
