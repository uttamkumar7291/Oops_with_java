// Use this editor to write, compile and run your Java code online

class reverseNumber {
    static int [] reverse(int num) {
        int rem = 0, rev = 0, sum = 0;
        
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        
        int [] resArray = {rev, sum};
        
        return resArray;
    }
    
    public static void Reverse_Number(String[] args) {
        int num = 1234;
        int [] result = reverse(num);
        System.out.println("Reversed Number is: " + result[0]);
        System.out.println("Sum of Digits is: " +   result[1]);
    }
}

