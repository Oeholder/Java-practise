package com.interface_poly;

/**
 * 
 *项目名称:Interface
 *类名称:InterfancePoly
 *类描述:接口的多态
 *创建人:郝鸿儒
 *创建时间:2021年6月5日 上午9:22:41
 * @version
 */
public class InterfancePoly {
	public static void main(String[] args) {
		//接口的多态体现
		//接口类型的变量 if01 可以指向实现了IF接口的对象
		IF if01 = new Monster();
		if01 = new Car();
		
		//接口类型数组
		IF[] if02 = new IF[3];
		if02[0] = new Monster();
		if02[1] = new Car();
		
		IH ih = new Car();
		ih = new Block();
	}
}

interface IH{};
interface IF extends IH{};
class Monster implements IF{};
class Car implements IF{};
class Block implements IH{};