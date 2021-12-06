package MyBlog.demo.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="excursions")
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="province")
	private String province ;
	
	@Column(name="country")
	private String country;
	
	@Column(name="place_visited")
	private String  placeVisited;
	
	@Column(name="place_image")
	private String placeImage;
	
	@Column(name="descriptions")
	private String descriptions;
	
	public Trip() {
		
	}

	public Trip(int id, String province, String country, String placeVisited, String placeImage, String descriptions) {
		super();
		this.id = id;
		this.province = province;
		this.country = country;
		this.placeVisited = placeVisited;
		this.placeImage = placeImage;
		this.descriptions = descriptions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlaceVisited() {
		return placeVisited;
	}

	public void setPlaceVisited(String placeVisited) {
		this.placeVisited = placeVisited;
	}

	public String getPlaceImage() {
		return placeImage;
	}

	public void setPlaceImage(String placeImage) {
		this.placeImage = placeImage;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	

}
