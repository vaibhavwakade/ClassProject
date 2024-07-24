package Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Manager {
	@Id
	int id;
	String name;
	int exp;
	double count;
	@OneToMany
	List<Employee> emp;

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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public double getCount() {
		return count;
	}

	public void setCount(double count) {
		this.count = count;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", exp=" + exp + ", count=" + count + ", emp=" + emp + "]";
	}

	public Manager(int id, String name, int exp, double count, List<Employee> emp) {
		super();
		this.id = id;
		this.name = name;
		this.exp = exp;
		this.count = count;
		this.emp = emp;
	}

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
