package strategy;

abstract class Duck {
   protected FlyBehaviour flyBehaviour;
    public Duck(FlyBehaviour flyBehaviour){
        this.flyBehaviour = flyBehaviour;
    }
    protected void performFly() {
        flyBehaviour.fly();
    };
}