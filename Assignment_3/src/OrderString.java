import org.apache.log4j.Logger;

public class OrderString {
	static Logger logger = Logger.getLogger(OrderString.class);
	
	public static String orderString(String str) {
		String finalString = "";
		logger.info("Inside orderString Method");
		String[] x = str.split(" ");
        String[] y = new String[10];
        y[2] = "a";
        for(int i=0;i<x.length;i++)
        {    for(int j=0;j<x[i].length();j++){
           
                if(x[i].charAt(j)=='1'){
                    y[1]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='2'){
                    y[2]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='3'){
                    y[3]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='4'){
                    y[4]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='5'){
                    y[5]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='6'){
                    y[6]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='7'){
                    y[7]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='8'){
                    y[8]=x[i];
                    break;
                }
                if(x[i].charAt(j)=='9'){
                    y[9]=x[i];
                    break;
                }
               
            }
           
        }
        for(int i=0;i<y.length;i++){
            if(y[i]!=null) {
            	finalString = y[i] + " ";
            System.out.print(finalString);
            }           
        }
        logger.info("Return " + finalString);
		return finalString;
		
	}
}
