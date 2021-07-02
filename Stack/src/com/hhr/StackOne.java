package com.hhr;

/**
 * 
 *项目名称:Stack
 *类名称:Stack
 *类描述:栈
 *创建人:郝鸿儒
 *创建时间:2021年7月1日 上午10:15:13
 *版本: 1.0
 */
@SuppressWarnings("all")
public class StackOne<E> extends ArrayList<E>{//直接继承外部接口也可以调用父类方法，不合理
	
//	public int size() {
//		return size;
//	}
//	
//	public boolean isEmpty() {
//		return false;
//	}
//  继承ArrayList之后不用再实现
	
	public void push(E element) {
		add(element);
	}
	
	public E pop() {
		return remove(size - 1);
	}
	
	public E top() {
		return get(size - 1);
	}
	
	@Override
		public String toString() {
			return super.toString();
		}
}

