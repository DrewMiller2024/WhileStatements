
public class WhileStatements
{
    int c = 1;
    int d = -8;

    public void run() {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + " but is less than 15");
            i++;
        }

        int k = 10;
        while (k > 5) {
            System.out.println("k is " + k + " but is greater than 5");
            k--;
        }

        int a = 5;
        int b = 12;
        while (a < 10 & b <= 20) {
            System.out.println("a is " + a + " but is less than 10," + "b is " + b + " but is less than or equal to 20");
            b++;
            a++;
        }
    }

    public static void main(String[] args)
    {        
        WhileStatements hw = new WhileStatements();
        hw.run();
    }
}
