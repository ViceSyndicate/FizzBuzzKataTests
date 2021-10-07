public class Main {

    public static void numberCounter() {
        for (int i = 1; i <= 100; i++) {
            if (isDevisibleByThree(i) || containsThree(i)){
                System.out.print("Fizz");
                //continue; //continue; I can't use this to end current loop iteration because I would miss buzz in numbers like 35
            }
            if (isDevisibleByFive(i) || containsFive(i)){
                System.out.print("Buzz");
                //continue; I can't use this to end current loop iteration because I would miss buzz in numbers like 35
            }
            if (!isDevisibleByThree(i) && !isDevisibleByFive(i) && !containsThree(i) && !containsFive(i)) {
                System.out.print(i);
            }
            // Print new line for each iteration but not on every Fizz/Buzz Trigger
            System.out.println();
        }
    }

    public static int[] returnNumberAsIntArray(int number) {
        if (number < 0){
            return new int[0];
        }
        String numberAsString = String.valueOf(number); // Turn number in to a string
        int[] numbersToReturn = new int[numberAsString.length()]; // set numbersToReturn to length of string.
        for (int i = 0; i < numbersToReturn.length; i++){
            numbersToReturn[i] = Character.getNumericValue(numberAsString.charAt(i));
        }
        return numbersToReturn;
    }

    public static boolean containsThree(int number) {
        boolean containsThree = false;
        int[] numbersInArray = returnNumberAsIntArray(number);
        for (int i = 0; i < numbersInArray.length; i++){
            if (numbersInArray[i] == 3) containsThree = true;
        }
        return containsThree;
    }

    public static boolean containsFive(int number) {
        boolean containsFive = false;
        int[] numbersInArray = returnNumberAsIntArray(number);
        for (int i = 0; i < numbersInArray.length; i++){
            if (numbersInArray[i] == 5) containsFive = true;
        }
        return containsFive;
    }

    public static boolean isDevisibleByThree(int number) {
        boolean isDevisible = false;
                if(number % 3 == 0) isDevisible = true;
        return isDevisible;
    }

    public static boolean isDevisibleByFive(int number) {
        boolean isDevisible = false;
        if(number % 5 == 0) isDevisible = true;
        return isDevisible;
    }

    public static void main(String[] args) {
        numberCounter();
    }
}
