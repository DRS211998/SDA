package tema2;

import java.util.ArrayList;
import java.util.List;

public class tema21 {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		double[] temperaturi= {34.0, 35.5, 37.0, 37.5, 38.5, 36.5, 38, 39, 36};

		List<Double> list1 = new ArrayList<Double>();

		List<Double> list2 = new ArrayList<Double>();


		for(double x: temperaturi) {

			if(x<37.0) {

				list1.add(x);

			}

			else {

				list2.add(x);

		}

		}

		System.out.println("temperaturi mai mici de 37.0:\n");

		for(int i=0;i<list1.size();i++) 

				System.out.println("persoana" +" "+ list1.get(i));

		System.out.println("\ntemperaturi mai mari de 37.0:\n");

		for(int i=0;i<list2.size();i++)

			System.out.println("persoana"  +" "+ list2.get(i));

	}
}