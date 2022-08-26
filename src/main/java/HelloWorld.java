import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;


public class HelloWorld {
	private static final Logger logger = LogManager.getLogger("HelloWorld");

	public static void main(String[] args) {
		Marker marker = MarkerManager.getMarker("dsy");
		logger.info(marker , "Hello, World!");
		logger.info( "test222!");
	}
}