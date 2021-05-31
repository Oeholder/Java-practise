package com.star.poly_polyparameter;

/**
 * 
 *项目名称:Poly
 *类名称:PolyParameter
 *类描述:多态参数
 *
 *方法 定义的参数类型 为父类类型， 实参类型 为子类类型，见com.star.poly Master.feed 和 Poly01
 *
 *创建人:郝鸿儒
 *创建时间:2021年5月26日 下午8:42:39
 * @version
 */
public class PolyParameter {

	public static void main(String[] args) {
		PolyParameter poly = new PolyParameter();
		
		Employee e = new Worker("王进喜", 5000);
		poly.showEmpAnnal(e);
		poly.testWork(e);
		
		e = new Manager("赵二喜", 3000, 20000);
		poly.showEmpAnnal(e);
		poly.testWork(e);
		
		
	}
	
	public void showEmpAnnal(Employee e) {
		System.out.println("年薪：" + e.getAnnual());
	}
	
	public void testWork(Employee e) {
		if(e instanceof Worker) {
			((Worker) e).work();
		}else if(e instanceof Manager){
			((Manager) e).manage();
		}
	}
	
}
