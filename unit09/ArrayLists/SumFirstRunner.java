//(c) A+ Computer Science
//www.apluscompsci.com
import java.util.ArrayList;
public class SumFirstRunner
{
	public static void main( String args[] )
	{
		ListSumFirst test = new ListSumFirst();
		ArrayList<Integer> nums=new ArrayList<Integer>();
		
		nums.add(-99);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		nums.add(5);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(10);
		nums.add(9);
		nums.add(8);
		nums.add(7);
		nums.add(6);
		nums.add(5);
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(1);
		nums.add(-99);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(-11818);
		nums.add(40);
		nums.add(30);
		nums.add(20);
		nums.add(10);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(32767);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(255);
		nums.add(255);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(9);
		nums.add(10);
		nums.add(-88);
		nums.add(100);
		nums.add(-555);
		nums.add(2);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(10);
		nums.add(10);
		nums.add(10);
		nums.add(11);
		nums.add(456);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(-111);
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(9);
		nums.add(11);
		nums.add(20);
		nums.add(1);
		System.out.println(test.go(nums));
		
		nums.clear();
		nums.add(9);
		nums.add(8);
		nums.add(7);
		nums.add(6);
		nums.add(5);
		nums.add(4);
		nums.add(3);
		nums.add(2);
		nums.add(0);
		nums.add(-2);
		nums.add(6);
		System.out.println(test.go(nums));
	}
}