package vo;

public class person {
	private String id;
	private String password;
	private String name;
	private char sex;
	private String birthdate;
	private int age;
	
	public person() {}
	
	public person(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public person(String id, String password, String name, char sex, String birthdate, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.sex = sex;
		this.birthdate = birthdate;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
