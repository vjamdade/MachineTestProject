package com.faith.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="requests")
public class Requests {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long requestId;
	private String causeTravel;
	private String source;
	private String destination;
	private String mode;
	private String fromDate;
	private String toDate;
	private int days;
	private String priority;
	private String status;
	
	public Requests() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Requests(long requestId, String causeTravel, String source, String destination, String mode, String fromDate,
			String toDate, int days, String priority, String status) {
		super();
		this.requestId = requestId;
		this.causeTravel = causeTravel;
		this.source = source;
		this.destination = destination;
		this.mode = mode;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.days = days;
		this.priority = priority;
		this.status = status;
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getCauseTravel() {
		return causeTravel;
	}

	public void setCauseTravel(String causeTravel) {
		this.causeTravel = causeTravel;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
