package pl.camp.it.test;

public class Kucharz {
    public static void main(String[] args) {
        System.out.println(calculate(5,3, 3));
    }

    public static int calculate(int apples, int oranges, int coins) {
        for(int i = 0; i < coins; i++) {
            if(apples <= oranges) {
                apples++;
            } else {
                oranges++;
            }
        }

        System.out.println(apples);
        System.out.println(oranges);
        return Math.abs(apples - oranges);
    }
}
