/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuckSeptember;

/**
 *
 * @author: Steve Serjeant
 * @Created: 2020 09 15
 */
public abstract class Duck {

    /**
     * @param args the command line arguments
     */
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;
    WaddleBehaviour waddleBehaviour;
    
    public Duck(){
    }
    public abstract void display();
    
    public void performFly(){
    
        flyBehaviour.fly();
    }
    
    public void performQuack(){
    
        quackBehaviour.quack();
    }
    
    public void performWaddle(){
        waddleBehaviour.waddle();
    }
    
    public void swim(){
    
        System.out.println("All ducks float, even decoys!");
    }
    
        public static void main(String[] args){
    
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
    mallard.display();
    mallard.swim();
    
    Duck model = new ModelDuck();
    model.display();
    model.performFly();
    model.setFlyBehaviour(new FlyRocketPowered());
    model.performFly();
    model.performQuack();
    
    Duck redhead = new RedHeadDuck();
    redhead.performFly();
    redhead.performQuack();
    redhead.setFlyBehaviour(new FlyRocketPowered());
    redhead.performFly();
    
    System.out.println(" ");
    Duck terri = new GoldenDuck();
    terri.display();
    terri.performWaddle();
    terri.performFly();
    
    System.out.println(" ");
    model.display();
    model.performWaddle();
    terri.SetWaddleBehaviour(new WaddleNoWay());
    terri.performWaddle();
    
    }
        
    public void setFlyBehaviour (FlyBehaviour fb){
        flyBehaviour = fb;
    }
    
    public void SetQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }
    
    public void SetWaddleBehaviour(WaddleBehaviour wb){
        waddleBehaviour = wb;
    }
    
    
    
}
