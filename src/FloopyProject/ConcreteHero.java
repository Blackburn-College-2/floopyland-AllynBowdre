package FloopyProject;

import com.pauliankline.floopyconnector.*;
import java.awt.Point;

/**
 *
 * @author allyn
 */
public class ConcreteHero extends BaseHero {
    ConcreteHero pf;

    /**
     *
     * @param g game board
     * @param p point
     */
    public ConcreteHero(GameBoard g, Point p) {

        super(g, p);
        super.color = "Pink";
        g.getGameSquare(p).addHero(this);

    }

    /**
     *
     * @param mhp
     */
    public void setMaxHp(int mhp) {
        mhp = maxHp;
        hp = maxHp;

    }

    /**
     * set amount that max damage they can do
     *
     * @param md max damage
     */
    public void setMaxDamage(int md) {
        maxDamage = md;
    }

    /**
     * lose however much health the person you are fighting takes from you
     * @param attacker - person fighting
     */
    public void getHit(ConcreteHero attacker) {
        //System.out.println(pf.maxHp + "   " + pf.name);
        this.hp -=  attacker.maxDamage;
    }

    /**
     *
     * @return if some is around to know if you should fight
     */
    @Override
    public boolean isInBattle() {
//        this.enemy();
        return isSomeoneAround();
    }

    //all the checks check if someone is around
    public boolean checkUp() {
        double lx = location.getX(), ly = location.getY();

        return ly > gameboard.getHeight() - 1;
    }

    public void moveUp() {
        Point ol = location;
        if (this.checkUp() == false) {
            gameboard.getGameSquare(location).removeHero(this);
            location.setLocation(ol.getX(), ol.getY() + 1);
            gameboard.getGameSquare(location).addHero(this);
        } else {
            this.move();
        }
    }

    public boolean checkLeft() {
        double lx = location.getX(), ly = location.getY();
        return lx < 1;
    }

    public void moveLeft() {
        Point ol = location;
        if (this.checkLeft() == false) {
            gameboard.getGameSquare(location).removeHero(this);
            location.setLocation(ol.getX() - 1, ol.getY());
            gameboard.getGameSquare(location).addHero(this);
        } else {
            this.move();
        }
    }

    public boolean checkRight() {
        double lx = location.getX(), ly = location.getY();
        
        return lx > gameboard.getWidth() - 1;
    }

    public void moveRight() {
        Point ol = location;
        if (this.checkRight() == false) {
            gameboard.getGameSquare(location).removeHero(this);
            location.setLocation(ol.getX() + 1, ol.getY());
            gameboard.getGameSquare(location).addHero(this);
        } else {
            this.move();
        }
    }

    public boolean checkDown() {
        double lx = location.getX(), ly = location.getY();
        
        return ly > 1;
    }

    public void moveDown() {
        Point ol = location;
        if (this.checkDown() == false) {
            gameboard.getGameSquare(location).removeHero(this);
            location.setLocation(ol.getX(), ol.getY() - 1);
            gameboard.getGameSquare(location).addHero(this);
        } else {
            this.move();
        }
    }

    public int move() {
        int rm = (int) (Math.random() * 4) + 1;

        if (rm == 1) {
            this.moveUp();
        } else if (rm == 2 && location.getY() > 0) {
            this.moveDown();
        } else if (rm == 3) {
            this.moveLeft();
        } else if (rm == 4) {
            this.moveRight();
        }

        return rm;

    }

    /**
     *
     * @return the name of the person you are fighting
     */
    @Override
    public String enemy() {
        if(isSomeoneAround()){
           // return pf.name;
        }
        return "not fighting";
    }

    /**
     *
     * @return whether someone is in a game square in any of the 8 spots.
     */
    public boolean isSomeoneAround() {

        if (gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY())).heroesArePresent() && location.getX() < gameboard.getWidth() - 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY())).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY())).heroesArePresent() && location.getX() > 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY())).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX(), (int) location.getY() + 1)).heroesArePresent() && location.getY() < gameboard.getHeight() - 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX(), (int) location.getY() + 1)).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX(), (int) location.getY() - 1)).heroesArePresent() && location.getY() > 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX(), (int) location.getY() - 1)).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY() + 1)).heroesArePresent() && location.getX() > 1 && location.getY() < gameboard.getHeight() - 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY() + 1)).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY() - 1)).heroesArePresent() && location.getX() > 1 && location.getY() > 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() - 1, (int) location.getY() - 1)).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY() + 1)).heroesArePresent() && location.getX() < gameboard.getWidth() - 1 && location.getY() < gameboard.getHeight() - 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY() + 1)).getHeroesPresent().get(0);
            return true;
        } else if (gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY() - 1)).heroesArePresent() && location.getX() < gameboard.getWidth() - 1 && location.getY() > 1) {
            pf = (ConcreteHero) gameboard.getGameSquare(new Point((int) location.getX() + 1, (int) location.getY() - 1)).getHeroesPresent().get(0);
            return true;
        } else {
            return false;
        }

    }

    /**
     * makes them fight person they are fighting (pf)
     */
//    public void battle() {
//        //ConcreteHero winner;
//        while (this.hp > 0 && pf.hp > 0) {
//            pf.getHit(this);
//            if (pf.isDead()) {
//                this.kills++;
//                break;
//
//            } 
//          
//            this.getHit(pf);
//            if (this.isDead()) {
//                pf.kills++;
//                break;
//            }
//        }
//    }
    /**
     *
     * @param l each action each second
     */
    @Override
    public void gameTickAction(long l) {
        if (this.isDead()) {
            this.die();
            pf.kills++;
        } else if (isInBattle()) {
            this.getHit(pf);
            if (pf.isDead()) {
                pf.die();
                this.kills++;
            }
            pf.getHit(this);

        } else {
            this.move();
        }
        //check if item is there and pick it up
    }

    /**
     * remove character from board
     */
    @Override
    protected void die() {
        gameboard.getGameSquare(location).removeHero(this);
        //drop items
    }

    /**
     *
     * @return whether or not the characters health is
     */
    @Override
    public boolean isDead() {
        return hp == 0;

    }

}
