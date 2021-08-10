package be.intecbrussel.bread;

@FunctionalInterface
public interface BreadBaker {

    Bread bake(GrainSack grainSack, WaterBarrel waterBarrel);

}
