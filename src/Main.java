import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[4];
        for (int i = 0; i < cars.length; i++) {
            if (i % 2 == 0) {
                cars[i] = createCar("BMW");
            } else {
                cars[i] = createCar("Mazda");
            }


        }
        for (Car car : cars) {
            car.move();
            if (car  instanceOfBMW){
                BMW bmw = (BMW) car;
                System.out.println(bmw.getNumberOfSpoilers());
            }
            if (car instanceOfMazda){
                Mazda mazda = (Mazda) car;
                System.out.println(mazda.getIsPraviyRul());
            }
        }
    }



    public static Car createCar(String className ){
        if("BMW".equals(className)){
            return createBMW();
        }else if("Mazda".equals(className)){
            return createMazda();
        }return null;
    }
    public static BMW createBMW(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("BMW create starled");
            System.out.println("Enter colour");
            String colour = sc.next();
            System.out.println(" enter isAutomat");
            boolean isAutomat = sc.nextBoolean();
            System.out.println("enter power");
            int power = sc.nextInt();
            System.out.println("enter numbersOfSpoilers");
            int spoilers = sc.nextInt();
            return new BMW(colour, isAutomat, power, spoilers);
        }catch (InvalidCarParametersException e){
            System.out.println("invalidCarParametersExeption"+e.getMessage());
            return createBMW();
        }

    }
    public static Mazda createMazda(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mazda create starled");
            System.out.println("Enter colour");
            String colour = sc.next();
            System.out.println(" enter isAutomat");
            boolean isAutomat = sc.nextBoolean();
            System.out.println("enter power");
            int power = sc.nextInt();
            System.out.println("enter isPraviyRul");
            boolean isPraviyRul=sc.nextBoolean();
            return new Mazda(colour, isAutomat, power,isPraviyRul);
        }catch (InvalidCarParametersException e){
            System.out.println("invalidCarParametersExeption"+e.getMessage());
            return createMazda();
        }

    }
}
