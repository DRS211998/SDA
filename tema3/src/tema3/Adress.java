package tema3;

public class Adress {
	String street;

	String city;

	int number;

	public String getStreet() {

		return street;

	}


	public String getCity() {

		return city;

	}

	public int getNumber() {

		return number;

	}

	public Adress(String City, String Street, int Nr)

	{

		city=City;

		street=Street;

		number=Nr;
	}

	public String getCompleteAdress()

	{

		return city+street+number;

	}
}
