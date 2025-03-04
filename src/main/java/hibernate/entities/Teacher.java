package hibernate.entities;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends Person {
	private String email;
	private BigDecimal salaryPerHour;
	private Set<Course> courses;

	public Teacher() {
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "salary_per_hour")
	public BigDecimal getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(BigDecimal salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	@OneToMany(targetEntity = Course.class, mappedBy = "teacher")
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
