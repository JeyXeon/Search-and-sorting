public class random {

    public static double getRandomInteger(double min, double max){
        return (int)(Math.random()*((max-min)+1))+min;
    }
}
