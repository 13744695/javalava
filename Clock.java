/*Write a Java method that takes in the current time in hours and minutes and outputs the angle
 *in degrees between the hour and minute hands on a watch displaying the current time (e.g. at
 *midnight the angle is 0 degrees).   */
public class Clock{
	public static void main(String []args){
	int hour = 4;
	int min = 15;
	int hourinmins = hour*5;
	System.out.println("hourinmins is 5 * hours and is: " +hourinmins);


	int diff = hourinmins-min;
	System.out.println("The difference in minutes between the hour and minute hands is: "+diff);

	if (diff<0){
		diff=hourinmins-diff;
		System.out.println("positive of diff is "+diff);
				}
	if (diff>30){
		hourinmins = hourinmins-30;
	System.out.println("adjusted hoursinmin is: "+hourinmins);
				}
	int angle = 3*diff;
	System.out.println("angle is: " +angle +" degrees");
	}
}