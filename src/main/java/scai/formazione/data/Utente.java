package scai.formazione.data;

/**
 * 
 * @author Rosario
 *
 */
public class Utente {

	private String name;
	private String country;
	private String region;
	private String province;
	private String city;
	private String cap;
	
	/**
	 * @param name
	 * @param country
	 * @param region
	 * @param province
	 * @param city
	 * @param cap
	 */
	public Utente(String name, String country, String region, String province, String city, String cap) {
		super();
		this.name = name;
		this.country = country;
		this.region = region;
		this.province = province;
		this.city = city;
		this.cap = cap;
	}

	/**
	 * 
	 */
	public Utente() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
	}
}
