
public class BMW extends Car {

      public static final String COUNTRY="Germany";
      private int numberOfSpoilers;

      public BMW(String colour, boolean isAutomate, int powerOfEngine, int numberOfSpoilers) throws InvalidCarParametersException {
          super(colour, isAutomate, powerOfEngine);
          if(numberOfSpoilers<0 || numberOfSpoilers>10) {
              throw new InvalidCarParametersException("NumberOfSpoilers be from 0 to 10");
          }
          this.numberOfSpoilers = numberOfSpoilers;
      }

      public int getNumberOfSpoilers() {
          return numberOfSpoilers;
      }

      public void setNumberOfSpoilers(int numberOfSpoilers){
          if(numberOfSpoilers<0 || numberOfSpoilers>10){
              System.out.println("NumberOfSpoilers be from 0 to 10");
              return;
          }
          this.numberOfSpoilers = numberOfSpoilers;
      }

      public BMW(String colour, boolean isAutomate, int powerOfEngine) throws InvalidCarParametersException {
          super(colour, isAutomate, powerOfEngine);
      }

      @Override
      public void move() {
          System.out.println("BMW moves");

      }


}
