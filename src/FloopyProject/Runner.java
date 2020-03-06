/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FloopyProject;

import com.pauliankline.floopyconnector.*;

/**
 *
 * @author paul.kline
 */
public class Runner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ESTIMATED TIME 336 HOURS

        Floopy floop = new Floopy(new ConcreteController());
        //replace ConcreteController with your controller.
        floop.begin(5); //5 being the number of heroes.
    }

}
