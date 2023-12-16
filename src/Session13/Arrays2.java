package Session13;

import java.util.Arrays;

public class Arrays2
{
    public static void main(String[] args) {

        // dataType[] arrayName=new dataType[countOfValuesYouWantToStoreInThisArray];
           int[] numbers = new int[5];
           numbers[2]=55;
           numbers[0]=100;
           numbers[1]=5000;
           numbers[3]=1;
           numbers[4]=78;
           System.out.println(Arrays.toString(numbers));

           String[] studentName = new String[10];
           studentName[0]="Jason";
           studentName[1]="Roger";

           String[] menu = {"HOME", "GIFT CERTIFICATES", "BRANDS", "BLOGS", "CONTACT US"};

           for(String m : menu)
           {
               //click m
           }

    }
}
