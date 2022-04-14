package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] numbers = new int [3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.println(numbers[i]);
            else
                System.out.print(numbers[i] + ", ");



        }





        double [] fractional = {1.57, 7.654, 9.986};
        for (int f = 0; f < fractional.length; f++) {
            if (f == fractional.length - 1)
                System.out.println(fractional[f]);
            else
                System.out.print(fractional[f] + ", ");
        }




        int [] myLine = {5, 6, 7, 8};
        for (int m = 0; m < myLine.length; m++) {
            if (m == myLine.length - 1)
                System.out.println(myLine[m]);
            else
                System.out.print(myLine[m] + ", ");

        }


        for (int i1 = numbers.length - 1; i1 >= 0; i1--) {
            if (i1 == 0)
                System.out.println(numbers[i1]);
            else
                System.out.print(numbers[i1] + ", ");
        }




        for (int f1 = fractional.length - 1; f1 >= 0; f1--) {
            if (f1 == 0)
                System.out.println(fractional[f1]);
            else
                System.out.print(fractional[f1] + ", ");

        }


        for (int m1 = myLine.length - 1; m1 >= 0; m1--) {
            if (m1 == 0)
                System.out.println(myLine[m1]);
            else
                System.out.print(myLine[m1] + ", ");

        }




        for (int i2 = 0; i2 < numbers.length; i2++) {
            if (numbers[i2] % 2 != 0)
                numbers[i2] = numbers[i2] + 1;
            System.out.print(numbers[i2] + ", ");



        }




























    }
}
