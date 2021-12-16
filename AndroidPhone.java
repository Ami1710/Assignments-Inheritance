package week2;

/* Create 3 classes
- Mobile (methods: sendMsg, makeCall, saveContact), ANdroidPhone (takeVideo), SmartPhone(connectWhatsApp)
- AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
- Create MyPhone class for execution and call all the methods using object (create object for SmartPhone)*/

//PARENT CLASS
public class AndroidPhone extends MobileInheritance {

	
	public void takeVideo()
	{
		System.out.println("AndroidPhone - TakeVideo Method");
	}
	

}
