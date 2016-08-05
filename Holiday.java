package main.holiday.model;

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

import main.holidayweek.model.Holidayweek;

@Entity
public class Holiday {
	
	public Holiday(){
		
	}
	
	@Id
	@Column(name="holiday_id")
	private Long LongHoliday_id;
	
	@Column(name="Title")
	private String strTitle;
	
	@Column(name="HolidayReason")
	private byte byteHolidayReason;
	//0=Sommer
	//1=Winter
	
	@Column(name="Enabled")
	private boolean bolEnabled;
	
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "holiday_id")
	private Set<Holidayweek> holidayweeks = new HashSet<Holidayweek>();
	
	
	//setter & getter
	public void addHolidayweek(Holidayweek holidayweek) {
		Assert.notNull(holidayweek);
		this.holidayweeks.add(holidayweek);
	}

 	public Set<Holidayweek> getHolidayweek() {
		return Collections.unmodifiableSet(holidayweeks);
	}
	
	public String getStrTitle(){
		return this.strTitle;
	}
	
	public void setStrTitle(String strTitle){
		this.strTitle = strTitle;
	}
	
	public byte getByteHolidayReason(){
		return this.byteHolidayReason;
	}
	
	public void setByteHolidayReason(byte byteHolidayReason){
		this.byteHolidayReason = byteHolidayReason;
	}
	
	public boolean getBolEnabled(){
		return this.bolEnabled;
	}
	
	public void setBolEnabled(boolean bolEnabled){
		this.bolEnabled = bolEnabled;
	}
}