import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Context ctx=new Context();
        Scanner scanner = new Scanner(System.in);
        Map<String,Strategy> strategyMap =new HashMap<>();
        strategyMap.put("st1",new StrategyImpl1());
        strategyMap.put("st2",new StrategyImpl2());
        strategyMap.put("st3",new StrategyImpl3());
        strategyMap.put("d",new DeafautStrategyImpl());
        while (true){
            System.out.println("Donner votre stratégy : ");
            //String strategyClassName=scanner.nextLine();
            String st=scanner.nextLine();
            Strategy strategy = strategyMap.get(st);
            // Strategy strategy =(Strategy) Class.forName(strategyClassName).getConstructor().newInstance();
        ctx.setStrategy(strategy);

        ctx.perform();
        }
    }

}
