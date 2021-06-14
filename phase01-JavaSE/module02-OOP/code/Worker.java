/*
 * Worker 类，继承自 Person 类
 */


public class Worker extends Person {

	private int salary;	

	public Worker() {
		System.out.println("Worker's non-args constructor");
	}

	public Worker(String name, int age, int salary) {
		//super();
		super(name, age);
		System.out.println("Worker's with-args constructor");
		//setName(name);
		//setAge(age);
		setSalary(salary);
	}

	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		if (salary >= 2200) {
			this.salary = salary;
		} else {
			System.out.println("salary is out of range...");
		}
	}

	public void work() {
		System.out.println("working...");
	}

	@Override
	public void show() {
		super.show();
		System.out.println("salary = " + getSalary());
	}

}
