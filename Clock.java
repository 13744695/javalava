/*Write a Java method that takes in the current time in hours and
minutes and outputs the angle in degrees between the hour and
minute hands on a watch displaying the current time (e.g. at
midnight the angle is 0 degrees).
*/
public class Clock
{
	public static void main(String []args)
{


int hour =12;
int min = 15;

int diff = hour-min;
System.out.println(diff);

if (diff<0)
diff=-diff;
System.out.println("positive of diff is "+diff);

int angle = 3*diff;
System.out.println("angle " +angle);

}
}