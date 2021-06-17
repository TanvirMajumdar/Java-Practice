package getterSetterDemo;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	/**
	 * @param employeeId
	 * @param employeeName
	 * @param employeeAge
	 */
	public Employee(int employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		
		if (employeeName.length()>0)
	        if(employeeName == null ||  employeeName.length() <= 0) {
	            throw new IllegalArgumentException();
	        }
	        this.employeeName = employeeName;
		
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	@Override
	public String toString() {
		return "GetterSetter [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge="
				+ employeeAge + "]";
	}
	
	


}
