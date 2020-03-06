package FloopyProject;

import com.pauliankline.floopyconnector.*;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author allyn
 */
public class ConcreteController extends GameController {

    @Override
    public ArrayList<BaseHero> createHeroes(GameBoard gb, int i) {
        ArrayList<BaseHero> heroes = new ArrayList();
        int rx;
        int ry;
        //random from 1-2 for each type of hero
        
        for (int x = 0; x <= i; x++) {
            rx = (int) (Math.random() * 9 +1);
            ry = (int) (Math.random() * 9 + 1);
            Point point = new Point(rx, ry);
            BaseHero hero = new Healers(gb, point);
            heroes.add(hero);
        }
//        heroes.add(new ConcreteHero(gb,new Point(1,1)));
//        heroes.add(new ConcreteHero(gb,new Point(1,2)));
        return heroes;
    }

    @Override
    public GameBoard mkGameBoard() {
        GameBoard Arena = new GameBoard(10, 10);
        int numItems = (int)Math.random()*11;
        for(int x = 0; x<numItems;x++){
            Item item = new Item("Potion");
        } 
        return Arena;
    }

}
