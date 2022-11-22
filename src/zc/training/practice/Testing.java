package zc.training.practice;


public class Testing {
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		System.out.println(outer.display());
		OuterClass.InnerClass inner = outer.new InnerClass();
		System.out.println(inner.sum());
		OuterClass.StaticInnerClass c = new OuterClass.StaticInnerClass();
		int[] numbers = { 3, 4, 5, 23, 0, 12 };
		System.out.println(c.sumofarray(numbers));
		
		DetailsOfEmployee a = new DetailsOfEmployee();
		a.setDetails("raju", "123A3", 6309638199l, 22, 20000.00);
		DetailsOfEmployee b = new DetailsOfEmployee();
		b.setDetails("ramu", "123A4", 9848682349l, 25, 30000.00);
		System.out.println(a.employeeId);
		System.out.println(a.employeeName);
		System.out.println(a.employeePhno);
		System.out.println(a.employeeAge);
		System.out.println(a.employeeSalary);
		System.out.println(b.employeeId);
		System.out.println(b.employeeName);
		System.out.println(b.employeePhno);
		System.out.println(b.employeeAge);
		System.out.println(b.employeeSalary);

	}

}
