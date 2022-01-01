package week5student;
public class Student  implements Comparable<Student>
{
	private String firstName, lastName, phone;

    public Student(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                '}' + "\n";
    }

    @Override
    public boolean equals (Object other) {
		return (lastName.equals(((Student)other).getLastName()) &&
				firstName.equals(((Student)other).getFirstName()));
	}

	@Override
	public int compareTo (Student other) {
	    return this.lastName.compareTo(other.lastName);
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName () {
		return firstName;
	}
	public String getLastName () {
		return lastName;
	}
}
