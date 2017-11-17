package com.epam.SecondModuleTasks.SecondModuleSixthTask;

/**
 * Class NuclearSubmarine
 */
public class NuclearSubmarine {
    private double xCoordinate;
    private double yCoordinate;
    private NuclearSubmarineEngine engine;


    public NuclearSubmarineEngine getEngine() {
        return engine;
    }

    public double getxCoordinate() {
        return xCoordinate;

    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    /**
     * default constructor of this class
     */
    public NuclearSubmarine() {
        this.xCoordinate = 0;
        this.yCoordinate = 0;
    }

    /**
     * constructor of this class
     * @param xCoordinate set this x-coordinate for nuclear submarine object
     * @param yCoordinate set this y-coordinate for nuclear submarine object
     */
    public NuclearSubmarine(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /**
     * method creates object of nuclear submarine engine
     */
    public void createNuclearSubmarineEngine() {
        this.engine = new NuclearSubmarineEngine();
        System.out.println("Engine for nuclear submarine was created! Let's go!");
    }

    /**
     * method notifies coordinates of nuclear submarine object
     */
    public void checkCoordinates() {
        System.out.println("Now our submarine has coordinates: x = " + xCoordinate + " and y = "+yCoordinate);
    }

    /**
     * Class NuclearSubmarineEngine - subclass of NuclearSubmarine class
     */
    class NuclearSubmarineEngine {
        /**
         * method changes y-coordinate of nuclear submarine object
         * @param plusY - value that's will be added to previous value of y-coordinate
         */
        public void yForwardMove(double plusY) {
            yCoordinate += plusY;
            System.out.println("Now our submarine has coordinates: x = " + xCoordinate + " and y = "+yCoordinate);
        }
        /**
         * method changes y-coordinate of nuclear submarine object
         * @param minusY - value that's will be subtracted from previous value of y-coordinate
         */
        public void yBackwardMove(double minusY) {
            yCoordinate -= minusY;
            System.out.println("Now our submarine has coordinates: x = " + xCoordinate + " and y = "+yCoordinate);
        }
        /**
         * method changes y-coordinate of nuclear submarine object
         * @param plusX - value that's will be added to previous value of y-coordinate
         */
        public void xForwardMove(double plusX) {
            xCoordinate += plusX;
            System.out.println("Now our submarine has coordinates: x = " + xCoordinate + " and y = "+yCoordinate);
        }
        /**
         * method changes y-coordinate of nuclear submarine object
         * @param minusX - value that's will be subtracted from previous value of y-coordinate
         */
        public void xBackwardMove(double minusX) {
            xCoordinate -= minusX;
            System.out.println("Now our submarine has coordinates: x = " + xCoordinate + " and y = "+yCoordinate);
        }
    }
}
