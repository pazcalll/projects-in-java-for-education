
package quiz1;

public class Motorcycle {
    private Engine engine;
    private String motorcycleBrand;
    public Motorcycle(String brandMotorcycle, String brandEngine){
        this.motorcycleBrand = brandMotorcycle;
        this.engine = new Engine();
        engine.setBrand(brandEngine);
    }
    public void setMotorcycleBrand(String motorcycleBrand) {
        this.motorcycleBrand = motorcycleBrand;
    }
    public String getMotorcycleBrand() {
        return motorcycleBrand;
    }
    public String getEngineBrand() {
        return engine.getBrand();
    }
    public void increaseMotorcycleSpeed(){
        engine.increaseSpeed();
        System.out.println(engine.getSpeed()+" Km/jam");
    }
    public void reduceMotorcycleSpeed(){
        engine.reduceSpeed();
        System.out.println(engine.getSpeed()+" Km/jam");
    }
}
