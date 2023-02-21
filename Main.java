import java.util.ArrayList;
import java.util.Random;

import units.Countryman;
import units.Magicman;
import units.Man;
import units.Monk;
import units.Names;
import units.Robber;
import units.Sniper;
import units.Spearman;
import units.XBowman;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Man> team = new ArrayList<>();
        int N = 10;

        for (int i = 0; i < N; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team.add(new Countryman(getName()));
                    break;
                case 1:
                    team.add(new Magicman(getName()));
                    break;
                case 2:
                    team.add(new Monk(getName()));
                    break;
                case 3:
                    team.add(new Robber(getName()));
                    break;
                case 4:
                    team.add(new Sniper(getName()));
                    break;
                case 5:
                    team.add(new Spearman(getName()));
                    break;
                case 6:
                    team.add(new XBowman(getName()));
                    break;
            }
        }

        int i = 0;
        for (Man man : team) {
            System.out.printf("#%d: %s\n", i + 1, man.getInfo());
            i++;
        }

    }

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

}