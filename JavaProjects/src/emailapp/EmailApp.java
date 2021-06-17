package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email e1=new Email("John","Smith");
		e1.setAlternateEmail("jay.paul@flux.com");
		System.out.println("Alternate email is : "+e1.getAlternativeEmail());

	}

}
