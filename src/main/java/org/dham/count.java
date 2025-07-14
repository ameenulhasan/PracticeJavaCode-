package org.dham;

public class count {

    public static void main(String[] args) {

        String stre ="AACTUUGGG";
        String output = compressString (stre);

        System.out.println(output);

    }
    public static String compressString(String stre) {
        String result="";
        int count=1;
        for (int i=1;i<stre.length();i++) {
            if (stre.charAt(i)==stre.charAt(i-1)) {
                count++;
            }
            else {
                result +=stre.charAt(i-1);
                if (count>1) {
                    result+=count;
                }
                count=1;
            }
        }
        result+=stre.charAt(stre.length()-1);
        if(count>1) {
            result+=count;
        }
        return result;
    }


}


