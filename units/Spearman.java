// Копейщик
package units;

public class Spearman extends Man {

    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Spearman(String name) {
        super(100, 3, 25, 20, 5);
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Копейщик %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я копейщик";
    }

    @Override
    public void step(int a) {
    }

    
}
