package CreatingClasses;

public class MessageMain {
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
