package wedingPhotographyPackages;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		PhotoPackage SILVER = PackageFactory.getPhotoPackage(PackageType.SILVER);
		SILVER.displayPackage(" Wedding + Home Coming Album with 100 photos");

		PhotoPackage GOLD = PackageFactory.getPhotoPackage(PackageType.GOLD);
		GOLD.displayPackage(" Wedding + Home Coming both Video and Album with 100 photos");

		PhotoPackage PLATINUM = PackageFactory.getPhotoPackage(PackageType.PLATINUM);
		PLATINUM.displayPackage(" Wedding + Home Coming + Pershoot both Video and Album with 500 photos");
	}
}
