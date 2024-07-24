package Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Employee {
	@Id
	int id;
	String name;
	Date doj;
	@ManyToOne
	Manager mg;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Manager getMg() {
		return mg;
	}
	public void setMg(Manager mg) {
		this.mg = mg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", mg=" + mg + "]";
	}
	public Employee(int id, String name, Date doj, Manager mg) {
		super();
		this.id = id;
		this.name = name;
		this.doj = doj;
		this.mg = mg;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

}
