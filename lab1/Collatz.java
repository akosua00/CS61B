/** Class that prints the Collatz sequence starting from a given number.
 *  @author YOUR NAME HERE
 */
public class Collatz {
    public static int nextNumber(int n) {
        int nextnum = 0;
        if (n%2 == 0){
            nextnum = n/2;
        }
        else{
            nextnum = 3*n+1;
        }
        return nextnum;
    }

    public static void main(String[] args){
        int num = 5;
        int nextnum1 = 0;
        System.out.print(num + " ");
        while(num!=1) {
            nextnum1 = nextNumber(num);
            System.out.print(nextNumber(num)+ " ");
            num = nextnum1;
        }
    }
}
