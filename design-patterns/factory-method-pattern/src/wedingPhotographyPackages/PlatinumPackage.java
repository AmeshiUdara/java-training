package wedingPhotographyPackages;

public class PlatinumPackage extends PhotoPackage{
	@Override
	protected void packageDetails(String details) {
		System.out.println("You can have" + details + " for this package");
		System.out.println("Thank You!");
	}
}
