package springbootjooleproject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="technichal_detail")
public class TechnichalDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="details")
	private String details;
	
	public TechnichalDetail() {
		
	}

	public TechnichalDetail(String details) {
		super();
		this.details = details;
	}
	
}
