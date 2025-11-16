import java.util.Scanner;

public class day1 {

    public static String greetUser(String name) {
        return "Hello " + name + "! Welcome to Java.";
    }
////////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME ");
        System.out.println("-------------------------------------");

//////////////////////////////////////////////////////////////////
        System.out.println("Enter your name: ");
        String userName = input.nextLine();
        System.out.println("Nice to meet you, " + userName);

        System.out.print("\nEnter any number (integer or decimal): ");
        String numInput = input.nextLine();

        double userNumber;

        try {
            userNumber = Double.parseDouble(numInput);
            System.out.println("Your number is stored as a double.");
        } catch (Exception e) {
            System.out.println("Invalid number. Setting to 0.");
            userNumber = 0;
        }

        System.out.println("You entered: " + userNumber);

        
//////////////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter another number: ");
        double num2 = input.nextDouble();

        System.out.println("\nADDITION: " + (userNumber + num2));
        System.out.println("SUBTRACTION: " + (userNumber - num2));
        System.out.println("MULTIPLICATION: " + (userNumber * num2));

        if (num2 != 0) {
            System.out.println("DIVISION: " + (userNumber / num2));
        } else {
            System.out.println("DIVISION: Cannot divide by zero.");
        }

        input.nextLine(); 

//////////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter a word: ");
        String userWord = input.nextLine();

        System.out.println("Uppercase: " + userWord.toUpperCase());
        System.out.println("Lowercase: " + userWord.toLowerCase());
        System.out.println("Length: " + userWord.length());

        if (userWord.length() >= 3) {
            System.out.println("First 3 letters: " + userWord.substring(0, 3));
        } else {
            System.out.println("Word too short for first 3 letters.");
        }

////////////////////////////////////////////////////////////////////////////////
        System.out.println("\nLet's build an array of 3 items.");

        System.out.print("Enter item 1: ");
        String item1 = input.nextLine();

        System.out.print("Enter item 2: ");
        String item2 = input.nextLine();

        System.out.print("Enter item 3: ");
        String item3 = input.nextLine();

        String[] myArray = { item1, item2, item3 };

        System.out.println("\nYour array:");
        System.out.println(myArray[0] + ", " + myArray[1] + ", " + myArray[2]);

        System.out.println("First item: " + myArray[0]);
        System.out.println("Last item: " + myArray[2]);

/////////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter your age: ");
        String ageInput = input.nextLine();

        try {
            int age = Integer.parseInt(ageInput);

            if (age < 18) {
                System.out.println("You are a minor.");
            } else if (age < 60) {
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a senior citizen.");
            }

        } catch (Exception e) {
            System.out.println("Invalid age.");
        }

///////////////////////////////////////////////////////////////////
        System.out.print("\nEnter a message: ");
        String msg = input.nextLine();

        System.out.println("Repeating your message 5 times:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ": " + msg);
        }

//////////////////////////////////////////////////////////////////////
        System.out.println("\nFUNCTION DEMO:");
        System.out.println(greetUser(userName));

/////////////////////////////////////////////////////////////////////
        System.out.print("\nEnter a number to square: ");
        String valueInput = input.nextLine();

        try {
            double value = Double.parseDouble(valueInput);
            System.out.println("Square is: " + (value * value));
        } catch (Exception e) {
            System.out.println("Error: That was not a valid number.");
        }

        System.out.println("PROGRAM FINISHED SUCCESSFULLY!");
    }
}


