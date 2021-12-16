package week2;

/*Create 3 classes
- Mobile (methods: sendMsg, makeCall, saveContact), ANdroidPhone (takeVideo), SmartPhone(connectWhatsApp)
- AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
- Create MyPhone class for execution and call all the methods using object (create object for SmartPhone)
*/

//GRAND PARENT CLASS
public class MobileInheritance {

	public void sendMsg()
	{
		System.out.println("MobileInheritance - SendMsg Method");
	}
	
	protected void makeCall()
	{
		System.out.println("MobileInheritance - MakeCall Method");
	}
	
	public void saveContact()
	{
		System.out.println("MobileInheritance - SaveContact Method");	
	}
}
