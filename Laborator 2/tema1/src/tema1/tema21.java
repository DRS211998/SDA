package tema1;

public class tema21 {

//	!!!!!       Dupa ce ati terminat de sris codul formatati fisierul cu Ctrl+shift+f

	public static void main(String[] args) {

	
		System.out.println("If else:");

		System.out.println(getMaxSpeedLimitByIfElse("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElse("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));



		System.out.println("\nIf else 2:");

		System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));



		System.out.println("\nSwitch:");

		System.out.println(getMaxSpeedLimitByIfElseComplex("Drum Express"));

		System.out.println(getMaxSpeedLimitByIfElseComplex("Oras"));

		System.out.println(getMaxSpeedLimitByIfElse("Zona rezidentiala"));

		System.out.println(getMaxSpeedLimitByIfElse("Autostrada"));

		System.out.println(getMaxSpeedLimitByIfElse("Parametru Necunoscut"));

	}

	public static int getMaxSpeedLimitByIfElse(String roadType) {

		if (roadType == "Drum Express") {

			System.out.print(roadType +" ");

			return 100;

		} else if (roadType == "Oras") {

			System.out.print(roadType + " ");

			return 50;

		} else if (roadType == "Zona rezidentiala") {

			System.out.print(roadType + " ");

			return 30;

		} else if (roadType == "Autostrada") {

			System.out.print(roadType + " ");

			return 130;

		} else

			System.out.print(roadType + " ");

		return 0;

	}

	public static int getMaxSpeedLimitByIfElseComplex(String roadType) {

		if (roadType == "Drum Express") {

			System.out.print(roadType + " ");

			return 100;

		} else {

			if (roadType == "Oras") {

				System.out.print(roadType + " ");

				return 50;

			} else {

				if (roadType == "Zona rezidentiala") {

					System.out.print(roadType + " ");

					return 30;

				} else {

					if (roadType == "Autostrada") {

						System.out.print(roadType + " ");

						return 130;

					}

				}

			}

		}

		return 0;

	}

	public static int getMaxSpeedLimitBySwitch(String roadType) {

		switch (roadType) {

		case "Drum Express": {

			System.out.print(roadType + " ");

			return 100;

		}

		case "Oras": {

			System.out.print(roadType + " ");

			return 50;
		}

		case "Zona rezidentiala": {

			System.out.print(roadType + " ");

			return 30;

		}

		case "Autostrada": {

			System.out.print(roadType + " ");

			return 130;
		}

		}

		return 0;

	}
}