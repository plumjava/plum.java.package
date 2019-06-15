package plum.exception;
public class DadaException{
   public static void fatal(String message){
	   try {
		   throw new DadaExceptionExtend(message); 
		} catch (DadaExceptionExtend e) {
			e.printStackTrace();System.exit(-1);} 
   }
   //private static void fatalException (String message) 
   //throws DadaExceptionExtend{
	//	throw new DadaExceptionExtend(message); }
}
@SuppressWarnings("serial")
class DadaExceptionExtend extends Exception{
	DadaExceptionExtend(final String message){super(message);}
}