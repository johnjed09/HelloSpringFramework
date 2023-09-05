package helloSpring;

import org.joda.time.LocalTime;

public class HelloSpring {
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter("Zekel");
		System.out.println(greeter.sayWhatsUp());
	}
}