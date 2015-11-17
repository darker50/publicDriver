package test.Test;

import java.util.*;


public class ListSort {
	public static void main(String[] args){
		final int SZ = 20;
		List a =  new ArrayList();
		for (int i = 0; i < SZ;	 i++) {
			a.add(new CompClass((int)(Math.random() *100)));
		Collectionl.print(a);
		Collections.sort(a);
		}
	}
}
