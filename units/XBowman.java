// Арбалетчик
package units;

public class XBowman extends Man {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XBowman(String name) {
        super(100, 3, 25, 25, 5);
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Арбалетчик %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик";
    }

    @Override
    public void step(int a) {
    }


    
}
