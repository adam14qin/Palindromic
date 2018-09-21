
public class longestPalindromic {
    public static void main(String []args){
        //String s="babad";
    	String s="cccc";
        int center=0;
        int span=0;
        int i=0;
        int len=s.length();
        int spanMax=0;
        String result="";
        int left=0;
        int right=1;
        while(i<len-1){
            if (i-1>=0 && s.charAt(i-1)==s.charAt(i+1)){span=3; int lb=i-1,rb=i+1;
                                                  while (lb-1>=0 && rb+1<=len-1 && s.charAt(lb-1)==s.charAt(rb+1)){span+=2;lb--;rb++;}
                                                   if (span>spanMax) {spanMax=span; left=lb; right=rb;}
                                                   i++;}
            else if (s.charAt(i)==s.charAt(i+1)){span=2; int lb=i,rb=i+1;
									            while (lb-1>=0 && rb+1<=len-1 && s.charAt(lb-1)==s.charAt(rb+1)){span+=2;lb--;rb++;}               
									             if (span>spanMax) {spanMax=span; left=lb; right=rb;}
									             i++;}
            else i++;
        }
        if (span!=0) {for (int j=left;j<=right;j++) {result+=s.charAt(j);}}
        System.out.println(result);
    }
}
