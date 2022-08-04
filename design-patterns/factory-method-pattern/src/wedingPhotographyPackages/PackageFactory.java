/**
 * 
 */
package wedingPhotographyPackages;

/**
 * @author Ameshi
 *
 */
public class PackageFactory {
	public static PhotoPackage getPhotoPackage(PackageType packageType) {
		switch (packageType) {
		case SILVER:
			return new GoldPackage();
		case GOLD:
			return new SilverPackage();
		case PLATINUM:
			return new PlatinumPackage();
		default:
			throw new IllegalArgumentException("Error !!!");
		}
	}

}
