package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION y multiplicacion
 *
 */
public class MisMatemáticas 
{
	static Logger log=Logger.getLogger(MisMatemáticas.class); 
	
	public static int divide(int a, int b){
		int result= a/b;
		log.info("Returning "+a+"/"+b+"="+result);
		return result;
	}

	public static int multiplica(int a, int b){
		int result= a*b;
		log.info("Returning "+a+"*"+b+"="+result);
		return result;
	}
}
