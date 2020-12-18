package hibernate.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "store_location")
public class StoreLocation extends BaseEntity {
	private String locationName;
	private Set<Sale> sales;

	public StoreLocation() {

	}

	@Column(name = "location_name")
	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@OneToMany(targetEntity = Sale.class, mappedBy = "storeLocation")
	public Set<Sale> getSales() {
		return sales;
	}

	public void setSales(Set<Sale> sales) {
		this.sales = sales;
	}

}
