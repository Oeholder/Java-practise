package com.method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 *项目名称:Arrays
 *类名称:ArraysMethod
 *类描述:Arrays类常见方法应用案例
 *Arrays里面包含了一系列静态方法，用于管理或操作数组(比如排序和搜索)。
 *1) toString返回数组的字符串形式
 *	 Arrays.toString(arr)
 *2) sort排序(自然排序和定制排序) Integer arr[]= {1, -1, 7, 0, 89};
 *3) binarySearch通过二分搜索法进行查找，要求必须排好序
 *	 int index = Arrays.binarySearch(arr,3);
 *4) copyOf 数组元素的复制
 *	 Integer[] newArr = Arrays.copyOf(arr, arr.length);
 *5) fill数组元素的填充
 *	 Integer[] num = new Integer[]{9.3,21};
 * 	 Arrays.fill(num, 99);
 *6) equals 比较两个数组元素内容是否完全一致
 *	 boolean equals = Arrays.equals(arr, arr2);
 *7) asList将一组值，转换成list
 *	 List<Integer> asList = Arrays.asList(2,3,4.5.6,1);
 *	 System.out.println("asList=" + asList);
 *创建人:郝鸿儒
 *创建时间:2021年6月14日 下午4:16:45
 *版本: 1.0
 */
public class ArraysMethod {

	public static void main(String[] args) {
		int arr[] = {1, 45, 2, 80, 3, 6};
		System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,3));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		//定制排序
		Integer [] newArr = {1, 45, 2, 80, 3, 6};
		Arrays.sort(newArr, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Integer i1 = (Integer) o1;
				Integer i2 = (Integer) o2;
				return i2 - i1;
				/*
				 * 源码分析：
				 * 1.Arrays.sort(newArr, new Comparator<Object>()
				 * 2.执行到 TimSort 类的 private static <T> void binarySort(T[] a, int lo, int hi, int start,
				 * 											Comparator<? super T> c) 
				 * 3.根据动态绑定机制，执行匿名内部类的compare()
				 * 
				 *                        
				 * binarySort方法底层，会通过匿名内部类 compare 方法来决定排序的顺序
			     *	   while (left < right) {
			                int mid = (left + right) >>> 1;		//mid = (left + right)/2
			                if (c.compare(pivot, a[mid]) < 0)  //c.compare(pivot, a[mid]) 重写之后传入Object o1, Object o2，返回值为 i2 - i1,
			                								   //小于零mid = o2.index,大于零mid + 1 = o1.index 
			                    right = mid;
			                else
			                    left = mid + 1;
			            }
				 */
			}
		});
		System.out.println(Arrays.toString(newArr));
		int[] arr1 = Arrays.copyOf(arr, arr.length);
		int index = Arrays.binarySearch(arr1, 80);
		System.out.println(index);
		
		Integer[] arr2 = Arrays.copyOf(newArr, newArr.length);
		System.out.println(arr2[1]);
		index = Arrays.binarySearch(arr2, 45);
		System.out.println(index);
		
	}

}
