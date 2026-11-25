public class Main {
    public class PrimeNumbers {
    public static void main(String[] args) {
        for (int number = 0; number <= 500; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

}
