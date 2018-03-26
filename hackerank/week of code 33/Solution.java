package ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	static void staircase(int n) {

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int element=in.nextInt();
			List<Integer> val=new ArrayList<>();
			for(int i1=0;i1<element;i1++){
				val.add(in.nextInt());
			}
			
			
			List<List<String>> list = Arrays.asList(
					  Arrays.asList("a"),
					  Arrays.asList("b"));
					System.out.println(list);
					list.stream().flatMap(Collection::stream);
			int index=element/2;
			int indexval;
			if(element%2!=0){
				indexval=val.get(index);
			}else{
				indexval=val.get(index)+val.get(index-1);
			}
			
			if(val.contains(0)){
				List<Integer> val1=new LinkedList<>();
				val.stream().forEach((p)->{
					if(p==0){
						val1.add(p);
						val1.add(indexval);
					}else{
						val1.add(p);
					}
				});
				int pindex = 0;
				int nindex = 0;
				boolean flag=false;
				for (Integer integer : val1) {
					if(integer<0){
						nindex=val1.indexOf(integer);
						flag=true;
						break;
					}
				}
				if(flag){
					val1.remove(nindex);}
				flag=false;
				boolean flag2=false;
				for (Integer integer : val) {
					if(integer>0){
						if(flag2){
						flag=true;
						pindex=val.indexOf(integer);
						break;
					}
						flag2=true;
						}
				}
				if(flag){
					val1.remove(pindex);}
				val1.forEach((p)->System.out.print(p+" "));
				
			}else{
				int pindex = 0;
				int nindex = 0;
				boolean flag=false;
				for (Integer integer : val) {
					if(integer<0){
						nindex=val.indexOf(integer);
						flag=true;
						break;
					}
				}
				if(flag){
					val.remove(nindex);}
				flag=false;
				boolean flag2=false;
				for (Integer integer : val) {
					if(integer>0){
						if(flag2){
						flag=true;
						pindex=val.indexOf(integer);
						break;
					}
						flag2=true;
						}
				}
				if(flag){
					val.remove(pindex);}
				val.forEach((p)->System.out.print(p+" "));	
				
			}
			System.out.print("\n");
		}
	}
}

