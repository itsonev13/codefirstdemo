package hibernate.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sale extends BaseEntity {
	private Product product;
	private Customer customer;
	private StoreLocation storeLocation;
	private LocalDate date;

	public Sale() {
		super();
	}

	@ManyToOne(targetEntity = Product.class)
	@JoinColumn(name = "product_id", referencedColumnName = "id")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@ManyToOne(targetEntity = Customer.class)
	@JoinColumn(name = "customer_id", referencedColumnName = "id")
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@ManyToOne(targetEntity = StoreLocation.class)
	@JoinColumn(name = "store_location_id", referencedColumnName = "id")
	public StoreLocation getStoreLocation() {
		return storeLocation;
	}

	public void setStoreLocation(StoreLocation storeLocation) {
		this.storeLocation = storeLocation;
	}

	@Column
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
