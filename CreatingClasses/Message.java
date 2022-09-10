package CreatingClasses;

public class Message {
    static int instanceCount = 0;
	
	String myMessage;
	
	public Message(String myMessage){
		this.myMessage = myMessage;
		Message.instanceCount++;
	}
	
	public void printMessage(){
		System.out.println(myMessage);
	}
	
	public static void printInstanceCount(){
		System.out.println("There are " + Message.instanceCount + " instances of Message.");
	}
	
	public static void main(String[] args){
		Message messageOne = new Message("Hello");
		Message messageTwo = new Message("Bonjour");
		Message messageThree = new Message("Hola");

		messageOne.printMessage(); //prints Hello
		messageTwo.printMessage(); //prints Bonjour
		messageThree.printMessage(); //prints Hola

		Message.printInstanceCount(); //prints 3
	}
}
