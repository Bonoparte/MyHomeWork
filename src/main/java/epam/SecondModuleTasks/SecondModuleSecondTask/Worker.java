package main.java.epam.SecondModuleTasks.SecondModuleSecondTask;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private List<Stationery> personalStuff;
    private double howMuchStuffCost;

    public Worker() {
        personalStuff = new ArrayList<>();
        howMuchStuffCost = 0;
    }

    public void getStuff(Stationery stationery){
        boolean add = personalStuff.add(stationery);
        howMuchStuffCost += stationery.getPrice();
    }

    public void removeStuff(Stationery stationery){
        if (personalStuff.contains(stationery)){
            boolean remove = personalStuff.remove(stationery);
            howMuchStuffCost -= stationery.getPrice();
        }
        else
            System.out.println("This worker doesn't has this stuff");
    }

    public void showAllStuff(){
        for (Stationery s: personalStuff) {
            System.out.println(s);
        }
    }

    public void showHowMuchCost(){
        System.out.println("This worker's stuff cost: " + howMuchStuffCost);
    }

}
