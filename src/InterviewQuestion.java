public class InterviewQuestion {
    public static void main(String[] args) {
        //Write the code that prints out first 10 digits of Fibonacci sequence numbers:
        // 0 1 1 2 3 5 8 13 21 34 55

        int a, b, fibo;
        a=0;
        b=1;
        for(int i=1; i<=11; i++){
            fibo=a;       //0 1 1
            a=b;           //1
            System.out.print(fibo +" ");
            b= fibo + a;     //1 2

        }

        
    }
}
