package chapter2_Statements;

import java.util.Scanner;

public class Calender {

    public static void main(String[] args) {

        // DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number:");
        int monthNum = scan.nextInt();

        //WRITE YOUR CODE BELOW:
        String result;

        switch (monthNum) {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
            default:
                result = "Invalid month number";
        }

        System.out.println(result);
    }
}

/*

### Use a `switch statement` to display the month name when given an `int` `monthNum`. If an invalid `monthNum` is given print `Invalid month number`

Main topics: switch statements, primitive variables

** Example Flows:**
```
Ex:
  Enter month number:
  5
  May
```
```
Ex:
  Enter month number:
  1
  January
```
```
Ex:
  Enter month number:
  20
  Invalid month number
```

 */