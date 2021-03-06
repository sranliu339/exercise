package com.sran.exercise.job.method.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lesson18 {
    public static void main(String[] args) {
        // 整数の受け取り
        int num = calcInt(createIntArray(args[0]), createIntArray(args[1]), createIntArray(args[2]));
        // 整数を表示
        System.out.println("" + num);
    }



	// カンマ付き文字列をint型配列に変換するメソッド
    public static Integer[] createIntArray(String str) {
        String[] strs = str.split(",");
        Integer[] ints = new Integer[strs.length];
        for (int i = 0; i < strs.length; i++) ints[i] = Integer.parseInt(strs[i]);
        return ints;
    }

    // ここにメソッドを記述してください
	private static int calcInt(Integer[] ints1, Integer[] ints2, Integer[] ints3) {
		
		List<Integer> list = new LinkedList<Integer>();
		int sum = 0;
		for (int i=0; i<ints1.length; i++) {
			for (int j=0; j<ints2.length; j++) {
				for (int k=0; k<ints3.length; k++) {
					
					sum = ints1[i] * ints2[j] * ints3[k];
					list.add(sum);
				}
			}
		}
		Collections.sort(list);
		
		return list.get(list.size()-1);
	}
}
