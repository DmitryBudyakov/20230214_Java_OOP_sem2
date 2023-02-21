// Разбойник
package units;
public class Robber extends Man {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robber(String name) {
        super(100, 3, 20, 15, 5);
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Разбойник %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я разбойник";
    }

    @Override
    public void step(int a) {
    }

    
}
