/*
 * Circle class
 */


public class Circle extends Shape {

	private int ir;
	
	Circle() {}
	
	Circle (double x, double y, int ir) {
		super(x, y);
		setIr(ir);
	}

	public int getIr() {
		return ir;
	}

	public void setIr(int ir) {
		if(ir > 0) {
			this.ir = ir;
		} else {
			System.out.println("ir is out of range...");
		}
	}

	@Override
	public void show() {
		super.show();
		System.out.println("ir: " + getIr());
	}
}

