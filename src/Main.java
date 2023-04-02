import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        Task1 task1 = new Task1();
        int result = 0;
        result = task1.Divide(15, 5);
        System.out.println("Rezultat je: " + result);

        // 1.aa
        // Napravite petlju koja ukoliko ima predefiniran neki broj u
        // varijabli  "total"  koja je deklarisana prije while-a i koji je razlicit od nula
        //While petlja ce traziti da unosite za svaki loop pozitivan broj.
        //Ukoliko unesete negativan broj while petlja zavrsava.
        System.out.println("\n");
        System.out.println("Task 1.aa");
        int total = 10;
        Scanner reader = new Scanner(System.in);
        int enteredNumber = 1;
        while (enteredNumber >= 0) {
            System.out.println("Unesite pozitivan broj? ");
            enteredNumber = reader.nextInt();
        }

        // 1.aaa
        //Napravite petlju koja ce za svaki ukljucujuci i za pocetni broj
        // traziti da unosite za svaki loop pozitivan broj.
        //Ukoliko unesete negativan broj while petlja zavrsava.
        System.out.println("\n");
        System.out.println("Task 1.aaa");
        int enteredNumber2;
        do {
            System.out.println("Unesite neki broj ? ");
            enteredNumber2 = reader.nextInt();
        } while (enteredNumber2 >= 0);

        //1.b
        //Napravite petlju koja prima brojeve no ukoliko se posalje broj -1000 izadje
        // iz petlje
        //U konzoli neka se ispise "Please enter any integer" prije vaseg unosa broja.
        //nakon sto unesete -1000 napisite poruku da je exit broj -1000 detektovan.
        System.out.println("\n");
        System.out.println("Task 1.b");
        enteredNumber = 0;

        do {
            System.out.println("Please enter any integer ? ");
            enteredNumber = reader.nextInt();
        }
        while (enteredNumber != -1000);

        if (enteredNumber == -1000) {
            System.out.println("exit number has been detected !");
        }

        // 1.c
        //Modifikujte petlju da sabira prethodno upisan broj i novi broj i zatim ispise total
        //ukoliko nikakav broj nije deklarisan kao pocetni pocinje od broja 0 :
        //ie. Please enter integer:
        //    4
        //    Total of 0 and 4 is 4.
        System.out.println("\n");
        System.out.println("Task 1.c");
        int currentNumber = 0;
        int total_2 = 0;
        do {
            if (currentNumber == -1000) {
                System.out.println("exit number has been detected !");
            } else {
                System.out.println("Please enter integer");
                currentNumber = reader.nextInt();
                System.out.println("Total of " + total_2 + " and " + currentNumber + " is: ");
                System.out.println(total_2 += currentNumber);
            }
        } while (currentNumber != -1000);

        //1.d
        //Modifikujte petlju da trazi znak za artimeticku operaciju prije broja.
        //ie. Which operation would you like to use: *,/,+,-?
        //    +
        //    Please enter integer:
        //    5
        //    Total of 0 and 5 is 5;
        System.out.println("\n");
        System.out.println("Task 1.d");
        int resultOfOperation = 0;
        enteredNumber = 0;
        String operator = "";
        while (enteredNumber != -1000) {
            System.out.println("Which operation would you like to use: +, -, *, /");
            operator = reader.next();
            System.out.println("Please enter integer: ");
            enteredNumber = reader.nextInt();
            System.out.println("Total of " + resultOfOperation + " and " + enteredNumber + " is: ");
            switch (operator) {
                case "+":
                    resultOfOperation += enteredNumber;
                    System.out.println(resultOfOperation);
                    break;
                case "-":
                    resultOfOperation -= enteredNumber;
                    System.out.println(resultOfOperation);
                    break;
                case "*":
                    resultOfOperation *= enteredNumber;
                    System.out.println(resultOfOperation);
                    break;
                case "/":
                    resultOfOperation /= enteredNumber;
                    System.out.println(resultOfOperation);
                    break;
            }
        }
        //1.e
        //Modifikujte petlju da radi artimeticke operacije i daje ispis shodno operaciji.
        //ie.
        //Which operation would you like to use: *,/,+,-?
        //    -
        //    Please enter integer:
        //    5
        //    Difference of 0 and -5 is -5
        System.out.println("\n");
        System.out.println("Task 1.e");

        resultOfOperation = 0;
        enteredNumber = 0;
        while (enteredNumber != -1000) {
            System.out.println("Which operation would you like to use: +, -, *, /");
            operator = reader.next();
            System.out.println("Please enter integer: ");
            enteredNumber = reader.nextInt();

            switch (operator) {
                case "+":
                    resultOfOperation += enteredNumber;
                    System.out.println("The sum of 0 and " + enteredNumber + " is: " + resultOfOperation);
                    break;
                case "-":
                    resultOfOperation -= enteredNumber;
                    System.out.println("Difference of 0 and " + enteredNumber + " is: " + resultOfOperation);
                    break;
                case "*":
                    resultOfOperation *= enteredNumber;
                    System.out.println("The product of 0 and " + enteredNumber + " is: " + resultOfOperation);
                    break;
                case "/":
                    resultOfOperation /= enteredNumber;
                    System.out.println("The quotient of 0 and " + enteredNumber + " is: " + resultOfOperation);
                    break;
            }
        }
        //1.f Modifikujte petlju da mozete artimeticke operacije da radite
        //    u nedogled sve dok ne upisete "=" i zatim enter
        //   kada ce se ispisati samo total
        //   ie
        //    Which operation would you like to use: *,/,+,-,=?
        //    +
        //    Please enter integer:
        //    5
        //    Which operation would you like to use: *,/,+,-,=?
        //    -
        //    Please enter integer:
        //    3
        //    Which operation would you like to use: *,/,+,-,=?
        //    *
        //    please enter integer
        //    5
        //    Which operation would you like to use: *,/,+,-,=?
        //    =
        //    Calculator Result is 10;
        System.out.println("\n");
        System.out.println("Task 1.f");
        resultOfOperation = 0;
        enteredNumber = 0;
        operator = "";

        while (!operator.equals("=")) {
            System.out.println("Which operation would you like to use: *,/,+,-,=");
            operator = reader.next();

            if (operator.equals("="))
                break;

            System.out.println("Please enter integer: ");
            enteredNumber = reader.nextInt();

            switch (operator) {
                case "+":
                    resultOfOperation += enteredNumber;
                    break;
                case "-":
                    resultOfOperation -= enteredNumber;
                    break;
                case "*":
                    resultOfOperation *= enteredNumber;
                    break;
                case "/":
                    resultOfOperation /= enteredNumber;
                    break;
            }
        }
        System.out.println("Calculator result is: " + resultOfOperation);

        //2. Napravite petlju u koju unosite brojeve. Kada petlja detektuje broj -10,
        // ispise vam se niz brojeva koje ste unjeli.
        //
        // Zatim ce vam se na ekranu pojaviti pitanje da li zelite da prosirite array sa opcijama y/n.
        //Ukoliko upisete y, ponovno unosite brojeve koji cete dodavati na niz
        // kada ponovno unesete -10 ispisu vam se svi brojevi koje ste unjeli.

        System.out.println("\n");
        System.out.println("Task 2");
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        int numberOfArray = 0;
        while (numberOfArray != -10) {
            System.out.println("Enter the number of array: ");
            numberOfArray = reader.nextInt();
            if (numberOfArray != -10)
                listOfNumbers.add(numberOfArray);
        }

        System.out.println("Numbers of array are: ");
        System.out.println(listOfNumbers);

        System.out.println("Would you like to add more numbers into array ? Y / N");
        String addMoreItems = reader.next();
        if (addMoreItems.equals("Y")) {
            numberOfArray = 0;
            while (numberOfArray != -10) {
                System.out.println("Add new number to existing array: ");
                numberOfArray = reader.nextInt();
                if (numberOfArray != -10)
                    listOfNumbers.add(numberOfArray);
            }

            System.out.println("Numbers of array are: ");
            System.out.println(listOfNumbers);
        }
        //3. Napravide funkciju koja provjereava da li je nesto palindrom,
        //Napravite Funkciju koja iz niza izbacuje brojeve koji mi specifikujemo,
        //Napravite funkciju koja provjerava da li je broj djeljiv sa brojem x.
        //Kada se pokrene aplikacija Pojavi vam se meni
        //
        //-Is string a palindrom
        //-Filter an Array
        //-Number is divisible by X.
        //Ukoliko izaberete  broj 2
        //Morate unjeti prvo brojeve za niz i zatim broj koji zelite izbaciti iz niza…
        System.out.println("\n");
        System.out.println("Task 3");
        System.out.println("Chose an option - fill in the optipon No. 1, 2 or 3? ");
        System.out.println("\n");
        System.out.println(" - Is string a palindrom - opcija 1");
        System.out.println(" - Number is divisible by X - opcija 2 ");
        System.out.println(" - Filter an Array - opcija 3 ");
        int option = reader.nextInt();
        Task3 task3 = new Task3();

        switch (option) {
            case 1:
                //Is string a palindrom
                System.out.println("Fill in the word you want to check if it is a palindrom ? ");
                String word = reader.next();
                boolean isPalindrom = task3.IsPalindrom(word);
                if (isPalindrom == true) {
                    System.out.println("The word is palindrome!");
                } else
                    System.out.println("The word is not a palindrome!");

                break;
            case 2:
                //-Number is divisible by X.
                System.out.println("Enter wanted number ?");
                int number = reader.nextInt();
                System.out.println("Enter number to divide ?");
                int numToDivide = reader.nextInt();
                boolean isDivByNumber = task3.IsDivisibleByNumber(number, numToDivide);
                if (isDivByNumber) {
                    System.out.println("The " + number + " is divisible by  " + numToDivide);
                } else {
                    System.out.println("The" + number + " is not divisible by" + numToDivide);
                }
                break;
            case 3:
                //Filter an Array
                System.out.println("What is the array length you want to fill in? ");
                int lengthOfArrayA = reader.nextInt();
                int[] inputArray = new int[lengthOfArrayA];
                for (int i = 0; i < lengthOfArrayA; i++) {
                    System.out.println("Enter an element of array ?");
                    int elementOfArrayA = reader.nextInt();
                    inputArray[i] = elementOfArrayA;
                }
                System.out.println("Which number would you like to remove from existing array list ? ");
                int elementOfArrayToRemove = reader.nextInt();
                int[] outputArray = new int[lengthOfArrayA - 1];
                for (int i = 0, j = 0; i < lengthOfArrayA; i++) {
                    if (inputArray[i] != elementOfArrayToRemove) {
                        outputArray[j] = inputArray[i];
                        j++;
                    }
                }

                System.out.println("Elements of final array are: ");
                for (int i = 0; i < outputArray.length; i++) {
                    System.out.println(outputArray[i]);
                }

                break;
            default:
                break;
        }
    }
}