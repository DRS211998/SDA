package tema3;

public class Customer {

	String LastName;

	String FirstName;

	int age;

	private Adress adress;

	private PaymentMethod paymentMethod;

	public String getLastName() {

		return LastName;

	}



	public String getFirstName() {

		return FirstName;

	}


	public int getAge() {

		return age;

	}

	public Adress getAdress() {

		return adress;

	}

	public PaymentMethod getPaymentMethod() {

		return paymentMethod;

	}



	public Customer(String ln, String fn, int age)

	{

		LastName=ln;

		FirstName=fn;

		this.age=age;

		

	}

	public Customer(Adress adr, PaymentMethod paymentmethod1)

	{

		adress=adr;

		paymentMethod=paymentmethod1;

	}

	public String getCompleteName()

	{

		return FirstName+LastName+" "+age;

	}



	



}