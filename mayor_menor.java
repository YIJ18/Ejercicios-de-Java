import java.util.Scanner;

public class mayor_menor 
{
    public static void main(String[] args) 
    {
        int x = 0, y = 4, z = 8;

        if (x > y && x > z) 
            System.out.println(x);
        else if(y > x && y > z)
            System.out.println(y);
        else
            System.out.println(z);
    }
}
