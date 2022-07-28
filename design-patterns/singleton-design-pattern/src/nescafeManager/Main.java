/**
 * 
 */
package nescafeManager;

/**
 * @author Ameshi
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NescafeManager nescafeManager1 = NescafeManager.getNescafeManager();
		//System.out.println(nescafeManager);
		
		Nescafe nescafeMachine= nescafeManager1.getNescafe();
		//System.out.println(nescafeMachine);
		
		nescafeMachine.startMachine("Good Morning, ");
		nescafeMachine.discount(50);
		

	}

}
