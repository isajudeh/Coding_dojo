package com.coding_dojo.travels.models;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="expense")
public class Expense {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @NotNull
	    @Size(min = 3, max = 200, message="name must be at least 3 characters.")
	    private String name;
	    
	    @NotNull
	    @Size(min = 3, max = 200, message="name must be at least 3 characters.")
	    private String vendor;
	    
	    @NotNull
	    @Min(value=100, message="Pages amount must be at least 100 page.")
	    private Integer amount;
	    
	    @NotNull
	    @Size(min = 5, max = 200, message="Description must be at least 5 characters.")
	    private String description;
////////////////////////////////////////////////////////////////////////////////////////////
	    @Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    @PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
////////////////////////////////////////////////////////////////////////////////////////////
		public Expense() {
		}
	    public Expense(String name,String vendor,Integer amount,String description) {
			this.name = name;
			this.vendor = vendor;
			this.amount = amount;
			this.description = description;
		}
////////////////////////////////////////////////////////////////////////////////////////////
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getVendor() {
			return vendor;
		}
		public void setVendor(String vendor) {
			this.vendor = vendor;
		}
		public Integer getAmount() {
			return amount;
		}
		public void setAmount(Integer amount) {
			this.amount = amount;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
////////////////////////////////////////////////////////////////////////////////////////////
}
