package org.chicagopolice.pojo;

import java.util.Date;

public class Crimes {
	private long ID;
	private String Case_Number;
	private Date date;
	private String block;
	private int IUCR;
	private String Primary_Type;
	private String Description;
	private String Location_Description;
	private boolean Arrest;
	private boolean Domestic;
	private int Beat;
	private int District;
	private int Ward;
	private int Community_Area;
	private int FBI_Code;
	private long X_Coordinate;
	private long Y_Coordinate;
	private int Year;
	private String Updated_On;
	private String Latitude;
	private String Longitude;
	private String Location;
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getCase_Number() {
		return Case_Number;
	}
	public void setCase_Number(String case_Number) {
		Case_Number = case_Number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getBlock() {
		return block;
	}
	public void setBlock(String block) {
		this.block = block;
	}
	public int getIUCR() {
		return IUCR;
	}
	public void setIUCR(int iUCR) {
		IUCR = iUCR;
	}
	public String getPrimary_Type() {
		return Primary_Type;
	}
	public void setPrimary_Type(String primary_Type) {
		Primary_Type = primary_Type;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getLocation_Description() {
		return Location_Description;
	}
	public void setLocation_Description(String location_Description) {
		Location_Description = location_Description;
	}
	public boolean isArrest() {
		return Arrest;
	}
	public void setArrest(boolean arrest) {
		Arrest = arrest;
	}
	public boolean isDomestic() {
		return Domestic;
	}
	public void setDomestic(boolean domestic) {
		Domestic = domestic;
	}
	public int getBeat() {
		return Beat;
	}
	public void setBeat(int beat) {
		Beat = beat;
	}
	public int getDistrict() {
		return District;
	}
	public void setDistrict(int district) {
		District = district;
	}
	public int getWard() {
		return Ward;
	}
	public void setWard(int ward) {
		Ward = ward;
	}
	public int getCommunity_Area() {
		return Community_Area;
	}
	public void setCommunity_Area(int community_Area) {
		Community_Area = community_Area;
	}
	public int getFBI_Code() {
		return FBI_Code;
	}
	public void setFBI_Code(int fBI_Code) {
		FBI_Code = fBI_Code;
	}
	public long getX_Coordinate() {
		return X_Coordinate;
	}
	public void setX_Coordinate(long x_Coordinate) {
		X_Coordinate = x_Coordinate;
	}
	public long getY_Coordinate() {
		return Y_Coordinate;
	}
	public void setY_Coordinate(long y_Coordinate) {
		Y_Coordinate = y_Coordinate;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getUpdated_On() {
		return Updated_On;
	}
	public void setUpdated_On(String updated_On) {
		Updated_On = updated_On;
	}
	public String getLatitude() {
		return Latitude;
	}
	public void setLatitude(String latitude) {
		Latitude = latitude;
	}
	public String getLongitude() {
		return Longitude;
	}
	public void setLongitude(String longitude) {
		Longitude = longitude;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}

}
