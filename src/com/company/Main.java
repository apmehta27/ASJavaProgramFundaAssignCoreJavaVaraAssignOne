package com.company;

public class Main {

    public static void main(String[] args) {
        /*
        Problem 1 : Write a program that declares 2 integer variables, assigns
        an integer to each, and adds them together. Assign the sum to a variable.
        Print out the result.
        Solution :

        int one = 10;
        int two = 20;
        int sum = one + two;
        System.out.println("The sum is: "+ sum);


        Problem 2: Write a program that declares 2 double variables, assigns a number to each,
        and adds them together. Assign the sum to a variable. Print out the result.

        soultion :
        double doubleFirstNumber = 200.0;
        double doubleSecondNumber = 400.0;
        double sum = doubleFirstNumber + doubleSecondNumber ;
        System.out.println("The double number sum is " + sum);

        Problem :3 Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together.
                Assign the sum to a variable. Print out the result. What variable type must the sum be?


        int intNumber = 400 ;
        double doubleNumber = 800.0 ;
        double sum = intNumber + doubleNumber ;
        System.out.println("the sum is :" + sum );
        // sum should be double type as it will give error.

        problem :4 Write a program that declares 2 integer variables, assigns an integer to each,
        and divides the larger number by the smaller number. Assign the result to a variable. Print
        out the result. Now change the larger number to a decimal.
        What happens? What corrections are needed?


//        int intVarOne = 400 ;
//        int intVarTwo = 100;
//        int result = intVarOne / intVarTwo ;

//        System.out.println("the result is: " + result );

        // change the intVarOne to decimal

        float intVarOne = 400.0f ;
        int intVarTwo = 100;
        float result = intVarOne / intVarTwo ;

        System.out.println("the result is: " + result );
        if we change the larger number to decimal, we also need to change the result variable to
        float too as it will give you error with int.

                Problem 5: Write a program that declares 2 double variables, assigns a number to each, and divides
        the larger by the smaller. Assign the result to a variable. Print out the result. Now, cast the
        result to an integer. Print out the result again.

        double doubleNumberOne = 5500 ;
        double doubleNumberTwo = 1100 ;
        double result = doubleNumberOne/doubleNumberTwo ;
        System.out.println("The result is : " + result );
        int resultCast = (int)(doubleNumberOne/doubleNumberTwo);
        System.out.println("The result is : " + resultCast );

        Problem : 6
        Write a program that declares 2 integer variables, x, and y, and assign 5 to x and 6 to y.
        Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign
        to q. Print q again.

//        int x= 5;
//        int y = 6;
//        float q = y/x ;
//        System.out.println("the q is : " + q);
        int x= 5;
        double y = 6;
        float q = (float) y/x ;
        System.out.println("the q is : " + q);

        Problem : 7 Write a program that declares a named constant and uses it in a calculation.
        Print the result.




        final int constant = 400 ;
        float result =  (constant * 1000) / 4;
        System.out.println("the result is: " + result );

        Problem : 8 Write a program where you create 3 variables that represent products at a cafe.
                The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
                Assign prices to each product. Create 2 more variables called subtotal and totalSale
        and complete an “order” for 3 items of the first product, 4 items of the second product,
                and 2 items of the third product. Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale
        amount. Be sure to format the results to 2 decimal places.
*/
        float coffee = 5.500f;
        float cappuccino = 6.505f;
        float espresso = 7.505f;
        final float SALES_TAX = 6.25f;
        float subTotal ;
        float totalSale ;
        subTotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);
        totalSale = subTotal + SALES_TAX ;
        System.out.println("The total sale is : " + totalSale);


        // write your code here
    }
}
