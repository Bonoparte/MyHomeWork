package com.epam.SecondModuleTasks.SecondModuleSixthTask;

public class SecondModuleSixthTask {
    public static void main(String[] args) {
        NuclearSubmarine ourSubmarine = new NuclearSubmarine(5.5, 12.1);
        ourSubmarine.createNuclearSubmarineEngine();
        NuclearSubmarine.NuclearSubmarineEngine ourEngine = ourSubmarine.getEngine();
        ourEngine.xForwardMove(8.3);
        ourEngine.yBackwardMove(8.5);
        ourSubmarine.checkCoordinates();
    }
}
