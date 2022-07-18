import java.util.*;

class Program {
  public static String caesarCypherEncryptor(String str, int key) {
    // Write your code here.
    String alphabetStr ="abcdefghijklmnopqrstuvwxyz";
    char[] newStr=new char[str.length()];
    for(int i=0; i< str.length();i++){
       int iDx=alphabetStr.indexOf(str.charAt(i));
        newStr[i]=alphabetStr.charAt((iDx+key)%26);
      
      }
    String s2=new String(newStr);
    return s2;
  }
}
