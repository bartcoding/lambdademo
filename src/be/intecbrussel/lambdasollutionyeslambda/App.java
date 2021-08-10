package be.intecbrussel.lambdasollutionyeslambda;


public class App {


    public static void main(String[] args) {

      Pushable pushable1 = () -> {
                                    System.out.println("ding dong!");
                                    System.out.println("you pushed me, ouch!");
                                    };
      Pushable pushable2 = () -> System.out.println("you pushed me, I push you!");
      Pushable pushable3 = () -> System.out.println("you pushed me! thank you, I needed that!");
      Pushable pushable4 = () -> System.out.println("you pushed me, I drink your milkshake.");

      pushable1.push();
      pushable2.push();
      pushable3.push();
      pushable4.push();

    }


}
