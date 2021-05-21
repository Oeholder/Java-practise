
public class Max {
	
	public int max(int x,int y) {
		if(x > y) return x;
		return y;
	}
	public double max(double x,double y) {
		if(x > y) return x;
		return y;
	}
	public double max(double x,double y,double z) {
		if(x >= y) {
			if(y > z) return x;
			if(z > x) return z;
		}
		else if(x < y) {
			if(y > z) return y;
			if(z > y) return z;
		}
		return 0;
	}
}
