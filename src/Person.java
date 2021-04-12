 abstract class Person implements CanMove,CanTouch,GoOut,Enter,Drink {

      private String name;
      private Double weight;
      private Double height;
      private Integer age;
      private String adress;

      public Person(String name, Double weight, Double height, Integer age, String adress) {
           this.name = name;
           this.weight = weight;
           this.height = height;
           this.age = age;
           this.adress = adress;

      }

      @Override
      public void CanMove() {

      }

      @Override
      public void CanTouch() {

      }

      @Override
      public void Drink() {

      }

      @Override
      public void Enter() {

      }

      @Override
      public void GoOut() {

      }

     @Override
     public  String toString() {
         return
                 "Его/Ее зовут" + name + ", вес " + weight +
                 ", рост" + height +
                 ", возраст " + age +
                 ", проживает на " + adress ;
     }
 }
