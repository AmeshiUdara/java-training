/**
 * 
 */
package wedingPhotographyPackages;

import java.util.Scanner;

/**
 * @author Ameshi
 *
 */
public abstract class PhotoPackage {
	
	protected abstract void packageDetails(String details);
	
	public void displayPackage(String details){
		packageDetails(details);	
		
	}

}
