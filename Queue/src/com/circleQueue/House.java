package com.circleQueue;

/**
 * House的对象表示一个房屋信息
 */
public class House {
    //编号 房主  电话 地址 月租 状态(未出租/已出租)
    private int id;
    private int rent;
    private String state;
    private class Menu{
    	String name;
        String phone;
        String address;
        
        public Menu() {
		}
        
		public Menu(String name, String phone, String address) {
			super();
			this.name = name;
			this.phone = phone;
			this.address = address;
		}
		
		public String getName() {
	        return this.name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
    }
    
    Menu m;
    
    public House(int id, String name, String phone, String address, int rent, String state) {
        this.id = id;
        m = new Menu(name, phone, address); 
        this.rent = rent;
        this.state = state;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 为了方便的输出对象信息，我们实现toString方法
    @Override
    public String toString() {
        return  id +
                '\t'+ m.name +
                '\t' + m.phone +
                '\t' + m.address +
                '\t' + rent +
                '\t' + state ;
    }
}
