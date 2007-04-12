package backend.client;

public class TestDriver {
	
	public static void main (String args[]) throws Exception {
		if (args == null) {
			return;
		}

		if (args.length == 3) {
			new SampleClient(args[0], args[1], args[2]);
		} else if (args.length == 2) {
			new SampleEJBClient(args[0], args[1]);
		}
	}	
}