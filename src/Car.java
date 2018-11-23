
public abstract class Car {
    public static final int NUMBER_OF_WHEELS = 4;
    private String colour;
    private  boolean isAutomate;
    private int powerOfEngine;
    public abstract void move();



    public final String getColour() {
        return this.colour;
    }

    public void setColour(String colour)throws InvalidCarParametersException {
        if(colour==null || colour.isEmpty()) {
            throw new InvalidCarParametersException("Colour can't be empty String"); // Либо Sout.out.println("..."); return;
        }
        this.colour = colour;
    }

    public boolean isAutomate() {
        return isAutomate;
    }

    public void setAutomate(boolean automate) {
        isAutomate = automate;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine)throws InvalidCarParametersException {
        if(powerOfEngine<0 || powerOfEngine>1000) {
            throw new InvalidCarParametersException("Pow must be from 0 to 1000");
        }
        this.powerOfEngine = powerOfEngine;
    }

    public Car(String colour, boolean isAutomate, int powerOfEngine)throws InvalidCarParametersException{
        if(colour==null || colour.isEmpty()) {
            throw new InvalidCarParametersException("Colour can't be empty String");
        }if(powerOfEngine<0 || powerOfEngine>1000){
            throw  new InvalidCarParametersException("Pow must be from 0 to 1000");
        }
        this.colour=colour;
        this.isAutomate=isAutomate;
        this.powerOfEngine=powerOfEngine;
    }







}
