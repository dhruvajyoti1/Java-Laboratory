public class DataTypesDemo {
    public static void main(String[] args) {
        byte age = 25;
        short distance = 15000;
        int population = 1380000000;
        long worldPopulation = 7800000000L;
        float pi = 3.14f;
        double e = 2.718281828459;
        char initial = 'W';
        boolean isJavaFun = true;

        System.out.println("Age (byte): " + age);
        System.out.println("Distance (short): " + distance);
        System.out.println("Population (int): " + population);
        System.out.println("World Population (long): " + worldPopulation);
        
        System.out.println("PI (float): " + pi);
        System.out.println("Euler's number (double): " + e);
        System.out.println("Initial (char): " + initial);
        System.out.println("Is Java Fun? (boolean): " + isJavaFun);
    }
}