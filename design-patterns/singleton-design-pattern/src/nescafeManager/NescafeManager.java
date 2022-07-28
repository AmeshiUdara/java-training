package nescafeManager;

public class NescafeManager {
	private static volatile NescafeManager nescafeManager; // = new NescafeManager();
	private static volatile Nescafe nescafe;

	private NescafeManager() {
		if (nescafeManager != null) {
			throw new RuntimeException("Please use getNescafeManager method");
		}

	}

	// Double checking singleton
	// Call synchronized() to be thread safe
	// Don't put the synchronized on the method level. It cases for low Performance speed 
	public static NescafeManager getNescafeManager() {

		if (nescafeManager == null) {
			synchronized (NescafeManager.class) {
				if (nescafeManager == null) {
					nescafeManager = new NescafeManager();
				}
			}
		}
		return nescafeManager;
	}
	
	public static Nescafe getNescafe() {
		if (nescafe == null) {
			synchronized (Nescafe.class) {
				if (nescafe == null) {
					nescafe = new Nescafe();  
				}			
			}
		}
		return nescafe;
	}
}
