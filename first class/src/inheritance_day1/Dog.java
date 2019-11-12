package inheritance_day1;


public class Employee {

	private String name;

	private String id;

	private static double hours;

	private double hourlySalary;

	

	public String getName() {

		return name;

	}

	public String getId() {

		return id;

	}

	public static double getHours() {

		return hours;

	}

	public double getHourlySalary() {

		return hourlySalary;

	}

	public void setName(String name) {

		this.name = name;

	}

	public void setId(String id) {

		this.id = id;

	}

	public static void setHours(double hours) {

		Employee.hours = hours;

	}

	public void setHourlySalary(double hourlySalary) {

		this.hourlySalary = hourlySalary;

	}

	

	

	public double yearlySalary(double hourlySalary) {

		return hourlySalary * 40 * 52;

	}

	





	

}


