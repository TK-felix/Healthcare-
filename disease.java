package vo;

public class disease {
	String disease_code;
	String disease_name;
	String disease_info_file;
	int disease_bloodsugar_value;
	int disease_pressure_value;
	int disease_cholesterol_value;
	
	public disease () {}
	
	public disease (String disease_code, String disease_name, String disease_file_info,
			int disease_bloodsugar_value, int disease_pressure_value, int disease_cholesterol_value) 
	{
		this.disease_code = disease_code;
		this.disease_name = disease_name;
		this.disease_info_file = disease_file_info;
		this.disease_bloodsugar_value = disease_bloodsugar_value;
		this.disease_pressure_value = disease_pressure_value;
		this.disease_cholesterol_value = disease_cholesterol_value;
	}
	
	public String getDisease_code() {
		return disease_code;
	}

	public void setDisease_code(String disease_code) {
		this.disease_code = disease_code;
	}

	public String getDisease_name() {
		return disease_name;
	}

	public void setDisease_name(String disease_name) {
		this.disease_name = disease_name;
	}

	public String getDisease_info_file() {
		return disease_info_file;
	}

	public void setDisease_info_file(String disease_info_file) {
		this.disease_info_file = disease_info_file;
	}

	public int getDisease_bloodsugar_value() {
		return disease_bloodsugar_value;
	}

	public void setDisease_bloodsugar_value(int disease_bloodsugar_value) {
		this.disease_bloodsugar_value = disease_bloodsugar_value;
	}

	public int getDisease_pressure_value() {
		return disease_pressure_value;
	}

	public void setDisease_pressure_value(int disease_pressure_value) {
		this.disease_pressure_value = disease_pressure_value;
	}

	public int getDisease_cholesterol_value() {
		return disease_cholesterol_value;
	}

	public void setDisease_cholesterol_value(int disease_cholesterol_value) {
		this.disease_cholesterol_value = disease_cholesterol_value;
	}
}
