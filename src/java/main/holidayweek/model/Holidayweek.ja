package main.holidayweek.model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.util.Assert;

import main.occupancy.model.Occupancy;

@Entity
public class Holidayweek {
	
	public Holidayweek(){
		
	}
	
	@Id
	@Column(name="holidayWeek_id")
	private Long LongHolidayWeek_id;
	
	@Column(name="Year")
	private short shortYear;
	@Column(name="Week")
	private byte byteWeek;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "holidayweek_id")
	private Set<Occupancy> occupancies = new HashSet<Occupancy>();
	
	
	//setter & getter
	public void addOccupancy(Occupancy occupancy) {
		Assert.notNull(occupancy);
		this.occupancies.add(occupancy);
	}

 	public Set<Occupancy> getOccupancy() {
		return Collections.unmodifiableSet(occupancies);
	}
 	
	public int getShortYear(){
		return this.shortYear;
	}
	
	public void setShortYear(short shortYear){
		this.shortYear = shortYear;
	}
	
	public byte getByteWeek(){
		return this.byteWeek;
	}
	
	public void setByteWeek(byte byteWeek){
		this.byteWeek = byteWeek;
	}
}
