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
public class GoldenDuck extends Duck{
    
    public GoldenDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
        waddleBehaviour = new Waddle();
    }
    
    /**
     *
     */
    @Override
    public void display(){
        System.out.println("I am a Golden Duck!");
    }
    
}
