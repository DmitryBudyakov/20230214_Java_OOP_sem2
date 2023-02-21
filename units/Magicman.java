// Колдун
package units;

public class Magicman extends Man {

    private String name;

    public Magicman(String name) {
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
        String output = String.format("Колдун %s: hp = %d, maxHp = %d, defence = %d, attack = %d, speed = %d",
                                        name, hp, maxHp, defence, attack, speed);
        return output;
    }

    @Override
    public String getInfo() {
        return "Я колдун";
    }

    @Override
    public void step(int a) {
        
    }    

}
