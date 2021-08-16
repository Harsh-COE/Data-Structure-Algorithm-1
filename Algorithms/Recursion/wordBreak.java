import java.io.*;
import java.util.*;

public class wordBreak {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashSet<String> dict = new HashSet<>();
		for(int i = 0  ; i  < n; i++){
			dict.add(scn.next());
		}
		String sentence = scn.next();
		wordBreak(sentence,"", dict);
	}

	public static void wordBreak(String str, String ans, HashSet<String> dict){
		if(str.length()==0){
			System.out.println( ans);
			return;
		}
		for(int i=0;i<str.length();i++){
			String sb = str.substring(0,i+1);
			String tp=str.substring(i+1);
			if(dict.contains(sb)){
				wordBreak(tp,ans+sb+" ",dict);
			}
		}
	}
		
}