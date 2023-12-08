package chapter2_Statements;

import java.util.Scanner;

public class ComputerBuilder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = scan.next();

        System.out.println("Select CPU type:");
        String CPUType = scan.next();

        System.out.println("Select RAM size:");
        short RAMSize = scan.nextShort();

        System.out.println("Select storage type:");
        String storageType = scan.next();

        System.out.println("Select storage size:");
        short storageSize = scan.nextShort();

        System.out.println("Select screen resolution:");
        String screenResolution = scan.next();

        double finalPrice = 0;

        switch (screenSize) {
            case "13.3":
                finalPrice += 200;
                break;
            case "15.0":
                finalPrice += 300;
                break;
            case "17.3":
                finalPrice += 400;
                break;
            default:
                System.out.println("Invalid screen size");
        }

        switch (CPUType) {
            case "i3":
                finalPrice += 150;
                break;
            case "i5":
                finalPrice += 250;
                break;
            case "i7":
                finalPrice += 350;
                break;
            default:
                System.out.println("Invalid CPU type");
        }

        if (RAMSize % 4 != 0) {
            System.out.println("Invalid RAM size:");
        } else {
            finalPrice += RAMSize / 4 * 50;
        }

        if (storageSize % 500 != 0) {
            System.out.println("Invalid storage size");
        } else {
            if (storageType.equals("HDD")) {
                finalPrice += storageSize / 500 * 50;
            } else if (storageType.equals("SSD")) {
                finalPrice += storageSize / 500 * 100;
            } else {
                System.out.println("Invalid storage type");
            }
        }

        switch (screenResolution) {
            case "FULLHD":
                finalPrice += 100;
                break;
            case "4K":
                finalPrice += 200;
                break;
            default:
                System.out.println("Invalid screen resolution");
        }

        System.out.println("Final price is: $" + finalPrice);

    }
}

/*

### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
```
 */