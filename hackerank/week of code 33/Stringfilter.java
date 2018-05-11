package ex1;

import java.util.ArrayList;
import java.util.List;

public class Stringfilter {

	public static void main(String[] args) {
		stringsplit("abc%$^&fGHg$%^%^RT");

	}

	private static void stringsplit(String string) {
		//String[] c = string.split("");
		List<String> val=new ArrayList<String>();
		int fst=Integer.MIN_VALUE;
		boolean flag=true;
		int end=Integer.MIN_VALUE;
		for (int i = 0; i < string.length(); i++) {
			if(Character.isLetterOrDigit(string.charAt(i))){
				if(flag){
					fst=i;
				}
				flag=false;
				end=i;
			}else if (!flag){
				end=i;
				val.add(string.substring(fst,end));
				 fst=Integer.MIN_VALUE;
				 flag=true;
				 end=Integer.MIN_VALUE;
			}
			
		}
		val.add(string.substring(fst,end+1));
		val.forEach(p-> System.out.println(p));
		
	}

}
