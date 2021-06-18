package com.info_and_method;

import java.util.Arrays;

/**
 * 
 *项目名称:System
 *类名称:SystemInfo
 *类描述:System类常见方法和案例
 *1) exit退出当前程序
 *2) arraycopy :复制数组元素，比较适合底层调用，
 *		一般使用Arrays.copyOf完成复制数组.
 *		int[] src={1,2,3};
 *		int[] dest = new int[3];
 *		System.arraycopy(src, 0, dest, 0, 3);
 *3) currentTimeMillens:返回当前时间距离1970-1-1的毫秒数
 *4) gc:运行垃圾回收机制 System.gc0;
 *创建人:郝鸿儒
 *创建时间:2021年6月16日 上午8:21:21
 *版本: 1.0
 */
public class SystemInfoAndMethod {

	public static void main(String[] args) {
		int[] src={1,2,3};
		int[] dest = new int[src.length];
		System.arraycopy(src, 1, dest, 0, 2);//将 src 中从 1 开始的数组元素，拷贝到 dest 从 0 开始的位置； 拷贝长度为2
		System.out.println(Arrays.toString(dest));
		
		System.out.println(System.currentTimeMillis());
	}

}
