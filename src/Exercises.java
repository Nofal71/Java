

import java.util.Scanner;;

public class Exercises {
    public static void main (String[] args)

   { 
    
    System.out.println("Hello");
   
   
    int num1 = 12, num2 = 10;
    System.out.println(num1 + num2);
    
    System.out.println(num1/num2);


    System.out.println(-5+8*6);
    System.out.println((55+9) % 9);
    System.out.println( 20 + -3*5 / 8);
    System.out.println(5 + 15 / 3 * 2 - 8 % 3);



//     Write a Java program that takes two numbers as input and displays the product of two numbers.
    int firstnumber = 25 ;
    int secondnumber = 5;
    int product = firstnumber*secondnumber;
    System.out.println(product);


    // Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

    int sum = firstnumber+secondnumber;
    int subtract = firstnumber-secondnumber;
    int divide = firstnumber/secondnumber;
    System.out.println("sum = " + sum + "\n" + "subtract = "+subtract + "\n" + "product = "+ product+ "\n" +
     "divide = " + divide);

    //  7. Write a Java program that takes a number as input and prints its multiplication table up to 10.

    Scanner table = new Scanner(System.in);
    System.out.print("Enter Number = ");

    int Table = table.nextInt();
    for(int i = 0 ; i <=10; i++)
    {
        System.out.println(Table+" X "+i+" = "+Table*i);
    }


    /*  9. Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
*/
   
//    System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));


//    10. Write a Java program to compute a specified formula.
// Specified Formula :
// 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)


//    System.out.println( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));


// 11. Write a Java program to print the area and perimeter of a circle.
   
   Scanner radius = new Scanner(System.in);
   System.out.print("Radius = ");
   double input = radius.nextDouble();

   double pi = 3.14;
   double Parameter = pi * input * 2;
   double area = pi * input*input;
   System.out.println("Parameter of Circle is = "+Parameter);
   System.out.println("Area of Circle is = "+ area);
    
//    12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers

   
    Scanner Numb1 = new Scanner(System.in);
    Scanner Numb2 = new Scanner(System.in);
    Scanner Numb3 = new Scanner(System.in);
    System.out.println("Average of Three Numbers : ");
    System.out.print("Enter Number = ");
    int myNum1 = Numb1.nextInt();
    System.out.print("Enter Number = ");
    int myNum2 = Numb1.nextInt();
    System.out.print("Enter Number = ");
    int myNum3 = Numb1.nextInt();

    int Average = (myNum1+myNum2+myNum3)/3;
    System.out.println("Average = " + Average );

    // 13. Write a Java program to print the area and perimeter of a rectangle.

   Scanner length = new Scanner(System.in);
   System.out.print("Length = ");
   int l = length.nextInt();
   Scanner width = new Scanner(System.in);
   System.out.print("width = ");
   int w = width.nextInt();
   
   int AreaOfrectangle = l*w;
   int ParameterOfRectangle = 2*(l*w); 
 
   System.out.println("Parameter of Rectangle is = "+ ParameterOfRectangle);
   System.out.println("Area of Rectangle is = "+ AreaOfrectangle);



    //  8. Write a Java program to display the following pattern
    // System.out.println("    J     A\n    J    A\nJ   J   A\n  J    A");
    
}
}