package main.occupancy.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Occupancy {
	
	public Occupancy(){
		
	}
	
	@Id
	@Column(name="occupancy_id")
	private Long LongOccupancy_id;
	
	// normal
	@Column(name="InternNormal")
	private int intOInternNormal;
	@Column(name="ExternNormal")
	private int intOExternNormal;
	
	// early
	@Column(name="InternEarly")
	private int intOInternEarly;
	@Column(name="ExternEarly")
	private int intOExternEarly;
	
	// late
	@Column(name="InternLate")
	private int intOInternLate;
	@Column(name="ExternLate")
	private int intOExternLate;
	
	// night
	@Column(name="InternNight")
	private int intOInternNight;
	@Column(name="ExternNight")
	private int intOExternNight;
	
	//setter & getter
	public int getIntOInternNormal(){
		return this.intOInternNormal;
	}
	
	public void setIntOInternNormal(int intOInternNormal){
		this.intOInternNormal = intOInternNormal;
	}
	
	public int getIntOExternNormal(){
		return this.intOExternNormal;
	}
	
	public void setIntOExternNormal(int intOExternNormal){
		this.intOExternNormal = intOExternNormal;
	}
	
	public int getIntOInternEarly(){
		return this.intOInternEarly;
	}
	
	public void setIntOInternEarly(int intOInternEarly){
		this.intOInternEarly = intOInternEarly;
	}
	
	public int getIntOExternEarly(){
		return this.intOExternEarly;
	}
	
	public void setIntOExternEarly(int intOExternEarly){
		this.intOExternEarly = intOExternEarly;
	}
	
	public int getIntOInternLate(){
		return this.intOInternLate;
	}
	
	public void setIntOInternLate(int intOInternLate){
		this.intOInternLate = intOInternLate;
	}
	
	public int getIntOExternLate(){
		return this.intOExternLate;
	}
	
	public void setIntOExternLate(int intOExternLate){
		this.intOExternLate = intOExternLate;
	}
	
	public int getIntOInternNight(){
		return this.intOInternNight;
	}
	
	public void setIntOInternNight(int intOInternNight){
		this.intOInternNight = intOInternNight;
	}
	
	public int getIntOExternNight(){
		return this.intOExternNight;
	}
	
	public void setIntOExternNight(int intOExternNight){
		this.intOExternNight = intOExternNight;
	}
}
