package com.shriram.clinix.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_feedback")
public class Feedback {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "feedback_id")
	private long feedbackId;

	@Column(name = "patient_id")
	private long patientId;

	@Column(name = "report_id")
	private long reportId;

	@Column(name = "rating_que_1")
	private long rating1;

	@Column(name = "rating_que_2")
	private long rating2;

	@Column(name = "rating_que_3")
	private long rating3;

	@Column(name = "rating_que_4")
	private long rating4;

	@Column(name = "rating_que_5")
	private long rating5;

	@Column(name = "rating_que_6")
	private long rating6;

	@Column(name = "rating_que_7")
	private long rating7;

	@Column(name = "rating_que_8")
	private long rating8;

	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(long feedbackId, long patientId, long reportId, long rating1, long rating2, long rating3,
			long rating4, long rating5, long rating6, long rating7, long rating8) {
		super();
		this.feedbackId = feedbackId;
		this.patientId = patientId;
		this.reportId = reportId;
		this.rating1 = rating1;
		this.rating2 = rating2;
		this.rating3 = rating3;
		this.rating4 = rating4;
		this.rating5 = rating5;
		this.rating6 = rating6;
		this.rating7 = rating7;
		this.rating8 = rating8;
	}

	public long getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(long feedbackId) {
		this.feedbackId = feedbackId;
	}

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public long getRating1() {
		return rating1;
	}

	public void setRating1(long rating1) {
		this.rating1 = rating1;
	}

	public long getRating2() {
		return rating2;
	}

	public void setRating2(long rating2) {
		this.rating2 = rating2;
	}

	public long getRating3() {
		return rating3;
	}

	public void setRating3(long rating3) {
		this.rating3 = rating3;
	}

	public long getRating4() {
		return rating4;
	}

	public void setRating4(long rating4) {
		this.rating4 = rating4;
	}

	public long getRating5() {
		return rating5;
	}

	public void setRating5(long rating5) {
		this.rating5 = rating5;
	}

	public long getRating6() {
		return rating6;
	}

	public void setRating6(long rating6) {
		this.rating6 = rating6;
	}

	public long getRating7() {
		return rating7;
	}

	public void setRating7(long rating7) {
		this.rating7 = rating7;
	}

	public long getRating8() {
		return rating8;
	}

	public void setRating8(long rating8) {
		this.rating8 = rating8;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (feedbackId ^ (feedbackId >>> 32));
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
		result = prime * result + (int) (rating1 ^ (rating1 >>> 32));
		result = prime * result + (int) (rating2 ^ (rating2 >>> 32));
		result = prime * result + (int) (rating3 ^ (rating3 >>> 32));
		result = prime * result + (int) (rating4 ^ (rating4 >>> 32));
		result = prime * result + (int) (rating5 ^ (rating5 >>> 32));
		result = prime * result + (int) (rating6 ^ (rating6 >>> 32));
		result = prime * result + (int) (rating7 ^ (rating7 >>> 32));
		result = prime * result + (int) (rating8 ^ (rating8 >>> 32));
		result = prime * result + (int) (reportId ^ (reportId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		if (feedbackId != other.feedbackId)
			return false;
		if (patientId != other.patientId)
			return false;
		if (rating1 != other.rating1)
			return false;
		if (rating2 != other.rating2)
			return false;
		if (rating3 != other.rating3)
			return false;
		if (rating4 != other.rating4)
			return false;
		if (rating5 != other.rating5)
			return false;
		if (rating6 != other.rating6)
			return false;
		if (rating7 != other.rating7)
			return false;
		if (rating8 != other.rating8)
			return false;
		if (reportId != other.reportId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", patientId=" + patientId + ", reportId=" + reportId
				+ ", rating1=" + rating1 + ", rating2=" + rating2 + ", rating3=" + rating3 + ", rating4=" + rating4
				+ ", rating5=" + rating5 + ", rating6=" + rating6 + ", rating7=" + rating7 + ", rating8=" + rating8
				+ "]";
	}

}
