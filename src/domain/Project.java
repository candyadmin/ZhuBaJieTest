package domain;

import java.util.Date;

public class Project {
	private int ID;
	private String ProjectName;
	private int ClassID;
	private int Area;
	private Double IsLocal;
	private Date ExpectWorkTime;
	private String Location;
	private int ProjectRate;
	private Double IsHost;
	private String Summary;
	private int SpecialtyIDs;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public int getClassID() {
		return ClassID;
	}
	public void setClassID(int classID) {
		ClassID = classID;
	}
	public int getArea() {
		return Area;
	}
	public void setArea(int area) {
		Area = area;
	}
	public Double getIsLocal() {
		return IsLocal;
	}
	public void setIsLocal(Double isLocal) {
		IsLocal = isLocal;
	}
	public Date getExpectWorkTime() {
		return ExpectWorkTime;
	}
	public void setExpectWorkTime(Date expectWorkTime) {
		ExpectWorkTime = expectWorkTime;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public int getProjectRate() {
		return ProjectRate;
	}
	public void setProjectRate(int projectRate) {
		ProjectRate = projectRate;
	}
	public Double getIsHost() {
		return IsHost;
	}
	public void setIsHost(Double isHost) {
		IsHost = isHost;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public int getSpecialtyIDs() {
		return SpecialtyIDs;
	}
	public void setSpecialtyIDs(int specialtyIDs) {
		SpecialtyIDs = specialtyIDs;
	}
	public String getOtherRequire() {
		return OtherRequire;
	}
	public void setOtherRequire(String otherRequire) {
		OtherRequire = otherRequire;
	}
	public String getPubDate() {
		return PubDate;
	}
	public void setPubDate(String pubDate) {
		PubDate = pubDate;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	private String OtherRequire;
	private String PubDate;
	private int Status;

}
