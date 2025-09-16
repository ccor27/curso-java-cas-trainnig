

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolaMundo {
	
	private static final Logger log =   LoggerFactory.getLogger(HolaMundo.class);
	//private static final Logger log = LoggerFactory.

	public static void main(String[] args) {
		
		log.error("test curso error");
		log.warn("test curso warn");
		log.info("test curso info");
		log.debug("test curso debug");
		log.trace("test curso trace");
//		int num = 24;
//		System.out.println("1 - The number is: "+(num + 2));
//		System.out.println("2 -The number is: "+(num + 3) +" Github");
	}
}
