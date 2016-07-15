package vo;

public class healthdata {
	private String id;
	public float weight;
	public float height;
	public int bmi;
	public int pressure;
	public int bloodsugar;
	public int ldl_cholesterol;
	public int hdl_cholesterol;
	public int neutral_cholesterol;
	public int bloodsugar_check;
	
	public healthdata() {}
	
	public healthdata(String id, float weight, float height, int bmi, int pressure, int bloodsugar, int ldl_chelesterol, int hdl_chelesterol, int neutral_chelesterol, int bloodsugar_check) {
		this.id = id;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.pressure = pressure;
		this.bloodsugar = bloodsugar;
		this.ldl_cholesterol = ldl_chelesterol;
		this.hdl_cholesterol = hdl_chelesterol;
		this.neutral_cholesterol = neutral_chelesterol;
		this.bloodsugar_check = bloodsugar_check; 
	}	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getBmi() {
		return bmi;
	}

	public void setBmi(int bmi) {
		this.bmi = bmi;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getBloodsugar() {
		return bloodsugar;
	}

	public void setBloodsugar(int bloodsugar) {
		this.bloodsugar = bloodsugar;
	}

	public int getLdl_cholesterol() {
		return ldl_cholesterol;
	}

	public void setLdl_cholesterol(int ldl_cholesterol) {
		this.ldl_cholesterol = ldl_cholesterol;
	}

	public int getHdl_cholesterol() {
		return hdl_cholesterol;
	}

	public void setHdl_cholesterol(int hdl_cholesterol) {
		this.hdl_cholesterol = hdl_cholesterol;
	}

	public int getNeutral_cholesterol() {
		return neutral_cholesterol;
	}

	public void setNeutral_cholesterol(int neutral_cholesterol) {
		this.neutral_cholesterol = neutral_cholesterol;
	}

	public int getBloodsugar_check() {
		return bloodsugar_check;
	}

	public void setBloodsugar_check(int bloodsugar_check) {
		this.bloodsugar_check = bloodsugar_check;
	}
	
}
