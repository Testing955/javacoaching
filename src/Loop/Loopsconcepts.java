package Loop;

import java.util.Scanner;

public class Loopsconcepts {

	public static void main(String[] args) 
	{
//printing 'n' rows 
/*Scanner in = new Scanner(System.in);
int n = in.nextInt();
for(int i =0;i<=n;i++)
{
System.out.print("# ");
}
System.out.println();
for(int i=1; i<=n; i++)
{
System.out.println("#");
}*/



//printing stars in increasing and decreasing order
/*		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the pyramid: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}*/
		
Scanner in = new Scanner(System.in);
System.out.println("Print number of stars: ");
int n = in.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}

for(int k=1; k<=2*i-1;k++)
{
System.out.print("*");
}
System.out.println();
	}
	}
}


