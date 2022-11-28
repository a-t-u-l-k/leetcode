public class EncryptWithCharCount
{
	public static void main(String[] args) {
		String orig = "WAAAYYFFFFFAIIIRR";
		String enc = "W1A3Y2F5A1I3R2";
		System.out.println(encrypt(orig));
		
	}
	
	public static String encrypt(String s) {
	    StringBuilder sb=new StringBuilder();
	    char[] ca = s.toCharArray();
	    for(int i=0;i<ca.length;i++) {
	        int count=0;
	        int j=i;
	        for(;j<ca.length;j++) {
	            if(ca[i]==ca[j]) {
	                count++; 
	            } else {
	                break;
	            }
	            i=j;
	        }
	        sb.append(ca[j-1]).append(count);
	    }
	    
	    return sb.toString();
	}
}
