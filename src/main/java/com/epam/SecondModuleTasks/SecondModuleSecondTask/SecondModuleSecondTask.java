package com.epam.SecondModuleTasks.SecondModuleSecondTask;

public class SecondModuleSecondTask {
    public static void main(String[] args) {
        Worker firstWorker = new Worker();
        Stationery pen = new Stationery("Pen", 16.30);
        Stationery eraser = new Stationery("Eraser", 9.50);
        Stationery pencil = new Stationery("Pencil", 22.40);
        firstWorker.getStuff(pen);
        firstWorker.getStuff(pen);
        firstWorker.getStuff(eraser);
        firstWorker.removeStuff(pencil);
        firstWorker.showAllStuff();
        firstWorker.showHowMuchCost();
    }
}
