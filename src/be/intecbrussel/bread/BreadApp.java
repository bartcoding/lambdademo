package be.intecbrussel.bread;

public class BreadApp {

    public static void main(String[] args) {

        BreadBaker baker1 = (GrainSack grainsack, WaterBarrel waterbarrel) -> new Bread("good bread");

        // 1000 grams of bread need 10 liters of water
        BreadBaker baker2 = (gsack, wbarrel) -> {
            Bread outputbread;
            if ((wbarrel.getLiters() * 100 == gsack.getWeight())) {
                outputbread = new Bread("good Bread");
            } else {
                outputbread = new Bread("bad bread");
            }
            return outputbread;
        };
        BreadBaker baker3 = (grainsack,waterbarrel) -> new Bread("bad bread");

        GrainSack grainSack = new GrainSack(1000);
        GrainSack grainSack2 = new GrainSack(5000);
        WaterBarrel waterBarrel = new WaterBarrel(10);

        Bread bread = baker2.bake(grainSack2, waterBarrel);

        System.out.println("breadType: " + bread.getBreadType());


    }


}
