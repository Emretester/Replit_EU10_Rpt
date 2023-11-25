package chapter2_Statements;

import java.util.Scanner;

public class FindMiddleNumber {

    public static void main(String[] args) {

        //WRITE YOUR CODE BELOW:

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = scan.nextInt();

        System.out.println("Enter second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter third number:");
        int num3 = scan.nextInt();

        int result;

        if (num1 < num2 && num2 < num3 || num1 > num2 && num2 > num3) {
            result = num2;
        } else if (num1 < num3 && num3 < num2 || num1 > num3 && num3 > num2) {
            result = num3;
        } else {
            result = num1;
        }
        System.out.println("middle number is: " + result);

    }
}

/*

### Using `if statements` and `Scanner` write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.

```
Hint:

1. Create an object of Scanner class.
2. Declare int 3 variables
3. Use Scanner to assign numbers from console into the variables
4. Use if statements to find the middle number
```

Main topics: if statements, primitive variables, operators, Scanner


**Example Flows:**

```
Enter first number:
14
Enter second number:
52
Enter third number:
25

middle number is: 25
```
```

Enter first number:
140
Enter second number:
34
Enter third number:
1
middle number is: 34
```
 */