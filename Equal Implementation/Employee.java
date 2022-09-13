
public class Employee {

	private String EmpId;
	private int EmpCode;
	private String Name;
	private String NIC;
	private String Address;
	
	public Employee(String empId, int empCode, String name,String nic,String address) {
		
		super();
		this.EmpId = empId;
		this.EmpCode = empCode;
		this.Name = name;
		this.NIC = nic;
		this.Address = address;
	}


	
	public String getEmpId() {
		return EmpId;
	}



	public void setEmpId(String empId) {
		EmpId = empId;
	}



	public int getEmpCode() {
		return EmpCode;
	}



	public void setEmpCode(int empCode) {
		EmpCode = empCode;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getNIC() {
		return Nic;
	}



	public void setNIC(String nic) {
		Nic = nic;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	@Override
	public boolean equals(Object obj)
	{
		Employee obj1=(Employee)obj;
		if (obj1.getEmpId()==this.EmpId)
			{
				return true;
			}
		else
		{
			if (obj1.getEmpCode()==this.EmpCode) 
				{
					return true;
				}
		else
		{	
			return false;
		}
		}
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + EmpId + ","
				+ "" + " empCode=" + EmpCode + ","
				+ "" + " name=" + Name + ","
				+ "" + " nic=" + NIC
				+ "," + " address=" + Address + "]";
	}
}
	
	

