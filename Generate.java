import java.util.Random;

 class Generate {
    
    public static void main(String[] args) {
        int[] randomNum = generateNum(1000000);
        int primeCount = countPrimes(randomNum);
        int nonPrimeCount = 1000000 - primeCount;
        
        System.out.println("Prime Numbers: " + primeCount);
        System.out.println("Non-Prime Numbers: " + nonPrimeCount);
    }
    
    
    public static int[] generateNum(int n) {
        int[] numbers = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = r.nextInt(9000000) + 1000000; 
        }
        return numbers;
    }
    
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    
    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }
}

