package be.intecbrussel.lambdasollutionnolambda;


public class App {


    public static void main(String[] args) {

      Pushable pushable1 = new Pushable() {
          @Override
          public void push() {

              System.out.println("ding dong!");
              System.out.println("you pushed me, ouch!");
          }
      };
      Pushable pushable2 = new Pushable() {
          @Override
          public void push() {
              System.out.println("you pushed me, I push you!");
          }
      };
      Pushable pushable3 = new Pushable() {
          @Override
          public void push() {
              System.out.println("you pushed me! thank you, I needed that!");
          }
      };
      Pushable pushable4 = new Pushable() {
          @Override
          public void push() {
              System.out.println("you pushed me, I drink your milkshake.");
          }
      };

      pushable1.push();
      pushable2.push();
      pushable3.push();
      pushable4.push();

    }


}
