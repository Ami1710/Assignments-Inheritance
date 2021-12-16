package week2;

/* Create 3 classes
- Mobile (methods: sendMsg, makeCall, saveContact), ANdroidPhone (takeVideo), SmartPhone(connectWhatsApp)
- AndroidPhone extends Mobile and SmartPhone extends AndroidPhone
- Create MyPhone class for execution and call all the methods using object (create object for SmartPhone)*/


public class MyPhone {

	public static void main(String[] args) {
		
		SmartPhone SP=new SmartPhone();
		SP.sendMsg();
		SP.makeCall();
		SP.saveContact();
		SP.takeVideo();
		SP.connectWhatsApp();
			

	}

}
