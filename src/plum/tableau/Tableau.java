package plum.tableau;

public class Tableau{
	private Tableau(){}
	public static void initInteger(int t[],int min,int max){
		for (int i=0;i<t.length;i++){
			t[i]=(int)(Math.random()*(max-min+1))+min;
		}
	}
	
	public static void initStringSansDoublon(String t[],String tVal[]){
		for (int i=0;i<t.length;i++){
			int j=(int)(Math.random()*tVal.length);
			t[i]=tVal[j]+i;
			//Arrays.toString(t);
		}
	}
		
	public static void initStringAvecDoublon(String t[],String tval[]){
		for (int i=0;i<t.length;i++){
			int j=(int)(Math.random()*tval.length);
			t[i]=tval[j];
		}
	}
	
	public final static String TNAME[]={
	"BARBOSA",
	"BARDON",
	"BARRY",
	"BELHAJI",
	"BONDIER",
	"BRENIERE",
	"CARMODY",
	"CASSANT",
	"CHASSAING",
	"CHAUSSAT",
	"CHENAUD",
	"CHEZALVIE",
	"CRAYGUES"};
}