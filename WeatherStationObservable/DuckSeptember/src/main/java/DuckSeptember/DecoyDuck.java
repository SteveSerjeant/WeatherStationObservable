/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuckSeptember;

/**
 *
 * @author owner
 */
public class DecoyDuck extends Duck{
    
    public DecoyDuck(){
    quackBehaviour = new MuteQuack();
    flyBehaviour = new FlyNoWay();
    waddleBehaviour = new WaddleNoWay();
    }
    
    @Override
    public void display(){
        System.out.println("I'm a Decoy Duck!");
    }
    
}
