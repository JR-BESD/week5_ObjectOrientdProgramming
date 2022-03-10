package videos.interfaces;

public class Application {
	
	static Logger logger;

	public static void main(String[] args) {
		
		Logger logger = new FileLogger();
		
		logger.info("Hello");
		logger.warning("A warning");
		logger.error("Oops, this in an error!");
		logger.fatal("Fatal error");
		
		logger.close();

	}
	private static void setLogger(Logger l) {
		logger = l;
	}

}
