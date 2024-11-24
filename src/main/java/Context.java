public class Context {
    private Strategy strategy=new DeafautStrategyImpl();

    public  void perform(){
        System.out.println("#############début de l'opération###########");
        System.out.println("************Initialisation**************");
        strategy.apply();
        System.out.println("==============Netoyage===========");
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
