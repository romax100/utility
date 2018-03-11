package it.aimconsulting.utility.utli;


public class RequestBilancioCatastale {

	public static void main(String[] args) throws Exception {
		InvokeService invoke = new InvokeService();
		String codFis = args[0]; 
		String userName = args[1];
		String password = args[2];
		@SuppressWarnings("unused")
		String res = invoke.invokeBilancioCatastale(codFis, userName, password);
		
		//String response = invoke.getReport(43998+"",userName, password);
	}

}
