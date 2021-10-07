public class Main {

    public static boolean numberCounter() {
        boolean wasOneHundredLinesPrinted = false;

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
        wasOneHundredLinesPrinted = true;
        return wasOneHundredLinesPrinted;
    }

    public static boolean containsThree(int number){
        boolean containsThree = false;

        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++){
            int numberToCheck = Character.getNumericValue(numberAsString.charAt(i));
            if (numberToCheck == 3){
                containsThree = true;
            }
        }
        return containsThree;
    }

    public static boolean containsFive(int number){
        boolean containsFive = false;

        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++){
            int numberToCheck = Character.getNumericValue(numberAsString.charAt(i));
            if (numberToCheck == 5){
                containsFive = true;
            }
        }
        return containsFive;
    }

    public static boolean isDevisibleByThree(int number)
    {
        boolean isDevisible = false;
                if(number % 3 == 0) {
                    isDevisible = true;
                }
        return isDevisible;
    }

    public static boolean isDevisibleByFive(int number)
    {
        boolean isDevisible = false;
        if(number % 5 == 0) {
            isDevisible = true;
        }
        return isDevisible;
    }

    public static void main(String[] args) {
        numberCounter();
    }
}
