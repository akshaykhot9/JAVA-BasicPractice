package logical;

public class S1 {
	public static String compress(String inputString) {
		String str="";
        int count=1;
        str+=inputString.charAt(0);
        int i=1;
        for(;i<inputString.length();i++){
        if(inputString.charAt(i)==inputString.charAt(i-1)){
          count++;
        } 
        else{
            if(count>1){
            str=str+count+inputString.charAt(i);
            count=1;}
            else{
                str=str+inputString.charAt(i);
            	count=1;
            }
        }
        }
		return str;
	}
}

