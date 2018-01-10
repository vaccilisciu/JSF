package scai.formazione.prime;

import java.io.Serializable;
 
public class Document implements Serializable, Comparable<Document> {
 
    private String country;
    private String region; 
    private String province;
    private String city;
    private String cap;
    private String username;
    
    
 
    public Document(String country, String region, String province,
			String city, String cap, String username) {
		super();
		this.country = country;
		this.region = region;
		this.province = province;
		this.city = city;
		this.cap = cap;
		this.username = username;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
 
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cap == null) ? 0 : cap.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		if (cap == null) {
			if (other.cap != null)
				return false;
		} else if (!cap.equals(other.cap))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Document [country=" + country + ", region=" + region
				+ ", province=" + province + ", city=" + city + ", cap=" + cap
				+ ", username=" + username + "]";
	}



	public int compareTo(Document document) {
        return this.getCountry().compareTo(document.getCountry());
    }
}  
