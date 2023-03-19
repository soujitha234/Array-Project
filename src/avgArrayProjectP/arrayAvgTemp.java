package avgArrayProjectP;
import java.io.*;
import java.util.*;
class avg{
	Scanner sc = new Scanner(System.in);
	public void input()
	{
		System.out.println("How many day's temperature?");
		int days = sc.nextInt();
		int[] arr = new int[days];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter day" +(i+1)+"Temperature: ");
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		int c = 0;
		for(int i=0;i<days;i++)
		{
			sum += arr[i];
		}
		float avg = sum/days;
		System.out.println("Average is: "+avg);
		System.out.println("No of days greater than average is:");
		for(int i=0;i<days;i++)
		{
			if (arr[i]>avg)
			{
				c += 1;
			}
		}
		System.out.println(c);
	}
}
public class arrayAvgTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		avg a = new avg();
		a.input();
	}

}
