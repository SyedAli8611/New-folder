import java.util.Scanner;
class Pattern_1
{
public static void main (String args[])
{
int row, col,k;
Scanner sc = new Scanner(System.in);
System.out.print("Enter no of rows:");
int n = sc.nextInt();
for(row=1; row<=n; row++)
{
for(col=n; col>=row;col--)
{
System.out.print(" ");
}
for(k=1; k<=row; k++)
{
System.out.print(" *");
}
System.out.println();
}
}
}