package quiz1;

public class Engine {
    private String brand;
    private double speed;
    public Engine(){
        
    }
    public void setBrand(String engineBrand){
        this.brand=engineBrand;
    }
    public String getBrand() {
        return brand;
    }
    public double getSpeed() {
        return speed;
    }
    public void increaseSpeed(){
        if (this.brand=="Honda") {
            int def=10;
            if (speed<95) {
                speed=speed+def;
            }
            else if (speed==95) {
                speed+=5;
            }
//            if (speed>100) {
//                speed=100;
//            }
        }
        else{
            speed+=15;
            if (speed>120) {
                speed=120;
            }
        }
    }
    public void reduceSpeed(){
        if (this.brand=="Honda") {
            speed-=5;
            if (speed<0) {
                speed=0;
            }
        }
        else{
            speed-=10;
            if (speed<0) {
                speed=0;
            }
        }
    }
    
}
