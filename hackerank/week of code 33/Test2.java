package ex1;

public class Test2 {

	public static void main(String[] args) {
		Point p=new Point(10, 10);
		Point q=new Point(20, 20);
		System.out.println(p+"----"+q);
		//(10,10 +"---"20,20)
		swap(p,q);
		System.out.println(p+"----"+q);
		//10,10--20,20
		
		
	}

	private static void swap(Point p, Point q) {
		Point temp;
		temp=p;
		p=q;
		q=temp;
		p.x=100;
		p.y=100;
		
	}

}
