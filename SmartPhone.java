package week2;

/* Create 3 classes
- Mobile (methods: sendMsg, makeCall, saveContact), ANdroidPhone (takeVideo), SmartPhone(connectWhatsApp)
- AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
- Create MyPhone class for execution and call all the methods using object (create object for SmartPhone)*/

// CHILD CLASS
public class SmartPhone extends AndroidPhone {

	public void connectWhatsApp()
	{
		System.out.println("SmartPhone - Connect WhatsApp Method");
	}
}
