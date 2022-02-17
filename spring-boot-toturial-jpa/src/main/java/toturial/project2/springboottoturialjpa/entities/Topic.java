package toturial.project2.springboottoturialjpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Topic {

	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String descr;

	
	
	public Topic(int id, String name, String descr) {
		super();
		this.id = id;
		this.name = name;
		this.descr = descr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

}
