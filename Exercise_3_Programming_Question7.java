import java.util.*;

public class Exercise_3_Programming_Question7{
    public static void main(String[] args){

    String text1 = "School of Computing";
    String text2 = "College of Arts and Sciences";
    String text3 = "UUM SINTOK";

    int length1 = text1.length();
    int length2 = text2.length();
    int length3 = text3.length();

    String merge = text2.substring(0,20).concat(text1.substring(10));
    System.out.println("length of "+text1+" is "+length1);
    System.out.println("length of "+text2+" is "+length2);
    System.out.println("length of "+text3+" is "+length3+"\n");
    System.out.print(merge);
    }
}
