// Крестьянин
package units;

public class Countryman extends Man {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Countryman(String name) {
        super(100, 30, 20, 10, 5);
        this.name = name;
        // System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String output = String.format("Крестьянин %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я крестьянин";
    }

    @Override
    public void step(int a) {
        
    }

    

    


}
