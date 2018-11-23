

public class Mazda extends Car{
    public static final String COUNTERY="Japan";
    private boolean isPraviyRul=true;

    public Mazda(String colour, boolean isAutomate, int powerOfEngine, boolean isPraviyRul) throws InvalidCarParametersException {
        super(colour, isAutomate, powerOfEngine);
    }

    @Override
    public void move() {
        System.out.println("Mazda,isPraviyRul"+ isPraviyRul);
        System.out.println("Move");
    }

    public boolean isPraviyRul() {
        return isPraviyRul;
    }

    public void setPraviyRul(boolean praviyRul) {
        isPraviyRul = praviyRul;
    }
}
