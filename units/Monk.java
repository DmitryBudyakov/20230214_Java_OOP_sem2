// Монах
package units;

public class Monk extends Man {

    private String name;

    public Monk(String name) {
        super(100, 3, 30, 30, 10);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Монах %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я монах";
    }

    @Override
    public void step(int a) {
    }

}
