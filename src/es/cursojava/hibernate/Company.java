package es.cursojava.hibernate;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="TB_COMPANY")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 30)
	private String name;
	private String typeOfCompany; //tipo sociedad;
	private String cif;
	@Column(name = "ACTIVITY")
	private String activityType;
	private Date dateOfEstablishment;
}
