import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double a, b, c = 0.0;

        System.out.print("First number \n");
        a = in.nextDouble();
        System.out.print("Second number \n");
        b = in.nextDouble();
        System.out.print("Choose what do you want  " +
                "\n1.Addition" +
                "\n2.Subtraction" +
                "\n3.Multiplication" +
                "\n4.Division" +
                "\n5.Power" +
                "\n#Please enter the number of operation \n");
        double oneofthem = in.nextDouble();
        double addition = 1;
        double subtraction = 2;
        double multiplication = 3;
        double division = 4 ;
        double power = 5;
        if (oneofthem == addition) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);  }
        else if (oneofthem == subtraction)  {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);	}
        else if (oneofthem == multiplication)	{
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);	}
        else if (oneofthem == division)   {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);	}
        else if (oneofthem == power)	{
            System.out.println("Enhance A or B?" +
                    "\n1.A" +
                    "\n2.B");
            double raise = in.nextDouble();
            double first = 1;
            double second = 2;
            if (raise == first) {
                System.out.println(Math.pow(a, 2)); }
            else if (raise == second); {
                System.out.println(Math.pow(b, 2)); }

        }
    }
}