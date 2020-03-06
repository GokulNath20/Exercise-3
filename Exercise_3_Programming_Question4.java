import java.util.Random;

public class Exercise_3_Programming_Question4 {
    public static void main(String[] args){
        Random rd = new Random();

        int num1=rd.nextInt(5);
        int num2=rd.nextInt(100);

        System.out.println("The largest number is "+ Math.max(num1,num2) );
        System.out.println("The lowest number is "+ Math.min(num1,num2) );

    }
}
