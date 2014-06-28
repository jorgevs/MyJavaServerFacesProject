package com.jvs.jsf.beans.sample.validations;

public class ColonyEntity {

	private long colonyId;
	private String colonyName;
	private long colonyZip;

	public ColonyEntity(long colonyId, String colonyName, long colonyZip){
		this.colonyId = colonyId;
		this.colonyName = colonyName;
		this.colonyZip = colonyZip;
	}
	
	public long getColonyId() {
		return colonyId;
	}

	public void setColonyId(long colonyId) {
		this.colonyId = colonyId;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public long getColonyZip() {
		return colonyZip;
	}

	public void setColonyZip(long colonyZip) {
		this.colonyZip = colonyZip;
	}

}
