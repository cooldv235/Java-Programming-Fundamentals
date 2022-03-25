class Variables {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int secondNumber = 5;
        int thirdNumber = 6;
        int total = myFirstNumber + secondNumber + thirdNumber;
        // System.out.println("Birthday: " + myFirstNumber);
        // System.out.println("Result = " + total);

        int MAX = 2_147_483_647;
        int MIN = -2_147_483_647;

        // INTEGER MAXIMUM AND MINIMUM VALS
        int intMaxValue = Integer.MAX_VALUE;
        int intMinValue = Integer.MIN_VALUE;
        System.out.println("Integer Max Value= " + intMaxValue);
        System.out.println("Integer Min Value=" + intMinValue);

        // BUSTED MAX AND MIN VALUES FOR INTEGER
        // BUSTED MAX MEANS VALUE LARGER THAN THE MAXIMUM VALUE OF INTEGER WILL OVERFLOW
        System.out.println("Integer Busted Max value= " + (intMaxValue + 1));

        // BUSTED MIN MEANS VALUE LESS THAN THE MINIMUM VALUE OF INTEGER WILL UNDERFLOW
        System.out.println("Integer Bustes Min Value= " + (intMinValue - 1));
    }
}
