package com.shriram.clinix.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medical_test_history")
public class MedicalTest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "report_id")
	private long reportId;
	
	@Column(name = "appointment_id")
	private String appointmentId;

	@Column(name = "test_result_date")
	private Date testResultDate;

	@Column(name = "diag_name_1")
	private String diagName1;

	@Column(name = "diag_name_2")
	private String diagName2;

	@Column(name = "diag_name_3")
	private String diagName3;
	
	@Column(name = "diag_name_4")
	private String diagName4;
	
	@Column(name = "diag_name_5")
	private String diagName5;
	
	@Column(name = "diag_name_6")
	private String diagName6;
	
	@Column(name = "diag_actual_value_1")
	private String diagActualValue1;
	
	@Column(name = "diag_actual_value_2")
	private String diagActualValue2;
	
	@Column(name = "diag_actual_value_3")
	private String diagActualValue3;
	
	@Column(name = "diag_actual_value_4")
	private String diagActualValue4;
	
	@Column(name = "diag_actual_value_5")
	private String diagActualValue5;
	
	@Column(name = "diag_actual_value_6")
	private String diagActualValue6;

	@Column(name = "diag_normal_range_1")
	private String diagNormalRange1;
	
	@Column(name = "diag_normal_range_2")
	private String diagNormalRange2;
	
	@Column(name = "diag_normal_range_3")
	private String diagNormalRange3;
	
	@Column(name = "diag_normal_range_4")
	private String diagNormalRange4;
	
	@Column(name = "diag_normal_range_5")
	private String diagNormalRange5;
	
	@Column(name = "diag_normal_range_6")
	private String diagNormalRange6;
	
	@Column(name = "doctor_comments")
	private String doctorComments;
	
	@Column(name = "other_info")
	private String otherInfo;
	
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "doctor_id",referencedColumnName="doctor_id")
	private Doctor doctor;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "patient_id",referencedColumnName="patient_id")
	private Patient patient;
	
	@ManyToOne(cascade= CascadeType.ALL)
	@JoinColumn(name = "agent_id",referencedColumnName="agent_id")
	private Agent agent;
	
	public MedicalTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MedicalTest(long reportId, String appointmentId, Date testResultDate, String diagName1, String diagName2,
			String diagName3, String diagName4, String diagName5, String diagName6, String diagActualValue1,
			String diagActualValue2, String diagActualValue3, String diagActualValue4, String diagActualValue5,
			String diagActualValue6, String diagNormalRange1, String diagNormalRange2, String diagNormalRange3,
			String diagNormalRange4, String diagNormalRange5, String diagNormalRange6, String doctorComments,
			String otherInfo, Doctor doctor, Patient patient, Agent agent) {
		super();
		this.reportId = reportId;
		this.appointmentId = appointmentId;
		this.testResultDate = testResultDate;
		this.diagName1 = diagName1;
		this.diagName2 = diagName2;
		this.diagName3 = diagName3;
		this.diagName4 = diagName4;
		this.diagName5 = diagName5;
		this.diagName6 = diagName6;
		this.diagActualValue1 = diagActualValue1;
		this.diagActualValue2 = diagActualValue2;
		this.diagActualValue3 = diagActualValue3;
		this.diagActualValue4 = diagActualValue4;
		this.diagActualValue5 = diagActualValue5;
		this.diagActualValue6 = diagActualValue6;
		this.diagNormalRange1 = diagNormalRange1;
		this.diagNormalRange2 = diagNormalRange2;
		this.diagNormalRange3 = diagNormalRange3;
		this.diagNormalRange4 = diagNormalRange4;
		this.diagNormalRange5 = diagNormalRange5;
		this.diagNormalRange6 = diagNormalRange6;
		this.doctorComments = doctorComments;
		this.otherInfo = otherInfo;
		this.doctor = doctor;
		this.patient = patient;
		this.agent = agent;
	}

	public long getReportId() {
		return reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public Date getTestResultDate() {
		return testResultDate;
	}

	public void setTestResultDate(Date testResultDate) {
		this.testResultDate = testResultDate;
	}

	public String getDiagName1() {
		return diagName1;
	}

	public void setDiagName1(String diagName1) {
		this.diagName1 = diagName1;
	}

	public String getDiagName2() {
		return diagName2;
	}

	public void setDiagName2(String diagName2) {
		this.diagName2 = diagName2;
	}

	public String getDiagName3() {
		return diagName3;
	}

	public void setDiagName3(String diagName3) {
		this.diagName3 = diagName3;
	}

	public String getDiagName4() {
		return diagName4;
	}

	public void setDiagName4(String diagName4) {
		this.diagName4 = diagName4;
	}

	public String getDiagName5() {
		return diagName5;
	}

	public void setDiagName5(String diagName5) {
		this.diagName5 = diagName5;
	}

	public String getDiagName6() {
		return diagName6;
	}

	public void setDiagName6(String diagName6) {
		this.diagName6 = diagName6;
	}

	public String getDiagActualValue1() {
		return diagActualValue1;
	}

	public void setDiagActualValue1(String diagActualValue1) {
		this.diagActualValue1 = diagActualValue1;
	}

	public String getDiagActualValue2() {
		return diagActualValue2;
	}

	public void setDiagActualValue2(String diagActualValue2) {
		this.diagActualValue2 = diagActualValue2;
	}

	public String getDiagActualValue3() {
		return diagActualValue3;
	}

	public void setDiagActualValue3(String diagActualValue3) {
		this.diagActualValue3 = diagActualValue3;
	}

	public String getDiagActualValue4() {
		return diagActualValue4;
	}

	public void setDiagActualValue4(String diagActualValue4) {
		this.diagActualValue4 = diagActualValue4;
	}

	public String getDiagActualValue5() {
		return diagActualValue5;
	}

	public void setDiagActualValue5(String diagActualValue5) {
		this.diagActualValue5 = diagActualValue5;
	}

	public String getDiagActualValue6() {
		return diagActualValue6;
	}

	public void setDiagActualValue6(String diagActualValue6) {
		this.diagActualValue6 = diagActualValue6;
	}

	public String getDiagNormalRange1() {
		return diagNormalRange1;
	}

	public void setDiagNormalRange1(String diagNormalRange1) {
		this.diagNormalRange1 = diagNormalRange1;
	}

	public String getDiagNormalRange2() {
		return diagNormalRange2;
	}

	public void setDiagNormalRange2(String diagNormalRange2) {
		this.diagNormalRange2 = diagNormalRange2;
	}

	public String getDiagNormalRange3() {
		return diagNormalRange3;
	}

	public void setDiagNormalRange3(String diagNormalRange3) {
		this.diagNormalRange3 = diagNormalRange3;
	}

	public String getDiagNormalRange4() {
		return diagNormalRange4;
	}

	public void setDiagNormalRange4(String diagNormalRange4) {
		this.diagNormalRange4 = diagNormalRange4;
	}

	public String getDiagNormalRange5() {
		return diagNormalRange5;
	}

	public void setDiagNormalRange5(String diagNormalRange5) {
		this.diagNormalRange5 = diagNormalRange5;
	}

	public String getDiagNormalRange6() {
		return diagNormalRange6;
	}

	public void setDiagNormalRange6(String diagNormalRange6) {
		this.diagNormalRange6 = diagNormalRange6;
	}

	public String getDoctorComments() {
		return doctorComments;
	}

	public void setDoctorComments(String doctorComments) {
		this.doctorComments = doctorComments;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(String otherInfo) {
		this.otherInfo = otherInfo;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Agent getAgent() {
		return agent;
	}

	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
		result = prime * result + ((appointmentId == null) ? 0 : appointmentId.hashCode());
		result = prime * result + ((diagActualValue1 == null) ? 0 : diagActualValue1.hashCode());
		result = prime * result + ((diagActualValue2 == null) ? 0 : diagActualValue2.hashCode());
		result = prime * result + ((diagActualValue3 == null) ? 0 : diagActualValue3.hashCode());
		result = prime * result + ((diagActualValue4 == null) ? 0 : diagActualValue4.hashCode());
		result = prime * result + ((diagActualValue5 == null) ? 0 : diagActualValue5.hashCode());
		result = prime * result + ((diagActualValue6 == null) ? 0 : diagActualValue6.hashCode());
		result = prime * result + ((diagName1 == null) ? 0 : diagName1.hashCode());
		result = prime * result + ((diagName2 == null) ? 0 : diagName2.hashCode());
		result = prime * result + ((diagName3 == null) ? 0 : diagName3.hashCode());
		result = prime * result + ((diagName4 == null) ? 0 : diagName4.hashCode());
		result = prime * result + ((diagName5 == null) ? 0 : diagName5.hashCode());
		result = prime * result + ((diagName6 == null) ? 0 : diagName6.hashCode());
		result = prime * result + ((diagNormalRange1 == null) ? 0 : diagNormalRange1.hashCode());
		result = prime * result + ((diagNormalRange2 == null) ? 0 : diagNormalRange2.hashCode());
		result = prime * result + ((diagNormalRange3 == null) ? 0 : diagNormalRange3.hashCode());
		result = prime * result + ((diagNormalRange4 == null) ? 0 : diagNormalRange4.hashCode());
		result = prime * result + ((diagNormalRange5 == null) ? 0 : diagNormalRange5.hashCode());
		result = prime * result + ((diagNormalRange6 == null) ? 0 : diagNormalRange6.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + ((doctorComments == null) ? 0 : doctorComments.hashCode());
		result = prime * result + ((otherInfo == null) ? 0 : otherInfo.hashCode());
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + (int) (reportId ^ (reportId >>> 32));
		result = prime * result + ((testResultDate == null) ? 0 : testResultDate.hashCode());
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
		MedicalTest other = (MedicalTest) obj;
		if (agent == null) {
			if (other.agent != null)
				return false;
		} else if (!agent.equals(other.agent))
			return false;
		if (appointmentId == null) {
			if (other.appointmentId != null)
				return false;
		} else if (!appointmentId.equals(other.appointmentId))
			return false;
		if (diagActualValue1 == null) {
			if (other.diagActualValue1 != null)
				return false;
		} else if (!diagActualValue1.equals(other.diagActualValue1))
			return false;
		if (diagActualValue2 == null) {
			if (other.diagActualValue2 != null)
				return false;
		} else if (!diagActualValue2.equals(other.diagActualValue2))
			return false;
		if (diagActualValue3 == null) {
			if (other.diagActualValue3 != null)
				return false;
		} else if (!diagActualValue3.equals(other.diagActualValue3))
			return false;
		if (diagActualValue4 == null) {
			if (other.diagActualValue4 != null)
				return false;
		} else if (!diagActualValue4.equals(other.diagActualValue4))
			return false;
		if (diagActualValue5 == null) {
			if (other.diagActualValue5 != null)
				return false;
		} else if (!diagActualValue5.equals(other.diagActualValue5))
			return false;
		if (diagActualValue6 == null) {
			if (other.diagActualValue6 != null)
				return false;
		} else if (!diagActualValue6.equals(other.diagActualValue6))
			return false;
		if (diagName1 == null) {
			if (other.diagName1 != null)
				return false;
		} else if (!diagName1.equals(other.diagName1))
			return false;
		if (diagName2 == null) {
			if (other.diagName2 != null)
				return false;
		} else if (!diagName2.equals(other.diagName2))
			return false;
		if (diagName3 == null) {
			if (other.diagName3 != null)
				return false;
		} else if (!diagName3.equals(other.diagName3))
			return false;
		if (diagName4 == null) {
			if (other.diagName4 != null)
				return false;
		} else if (!diagName4.equals(other.diagName4))
			return false;
		if (diagName5 == null) {
			if (other.diagName5 != null)
				return false;
		} else if (!diagName5.equals(other.diagName5))
			return false;
		if (diagName6 == null) {
			if (other.diagName6 != null)
				return false;
		} else if (!diagName6.equals(other.diagName6))
			return false;
		if (diagNormalRange1 == null) {
			if (other.diagNormalRange1 != null)
				return false;
		} else if (!diagNormalRange1.equals(other.diagNormalRange1))
			return false;
		if (diagNormalRange2 == null) {
			if (other.diagNormalRange2 != null)
				return false;
		} else if (!diagNormalRange2.equals(other.diagNormalRange2))
			return false;
		if (diagNormalRange3 == null) {
			if (other.diagNormalRange3 != null)
				return false;
		} else if (!diagNormalRange3.equals(other.diagNormalRange3))
			return false;
		if (diagNormalRange4 == null) {
			if (other.diagNormalRange4 != null)
				return false;
		} else if (!diagNormalRange4.equals(other.diagNormalRange4))
			return false;
		if (diagNormalRange5 == null) {
			if (other.diagNormalRange5 != null)
				return false;
		} else if (!diagNormalRange5.equals(other.diagNormalRange5))
			return false;
		if (diagNormalRange6 == null) {
			if (other.diagNormalRange6 != null)
				return false;
		} else if (!diagNormalRange6.equals(other.diagNormalRange6))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (doctorComments == null) {
			if (other.doctorComments != null)
				return false;
		} else if (!doctorComments.equals(other.doctorComments))
			return false;
		if (otherInfo == null) {
			if (other.otherInfo != null)
				return false;
		} else if (!otherInfo.equals(other.otherInfo))
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (reportId != other.reportId)
			return false;
		if (testResultDate == null) {
			if (other.testResultDate != null)
				return false;
		} else if (!testResultDate.equals(other.testResultDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MedicalTest [reportId=" + reportId + ", appointmentId=" + appointmentId + ", testResultDate="
				+ testResultDate + ", diagName1=" + diagName1 + ", diagName2=" + diagName2 + ", diagName3=" + diagName3
				+ ", diagName4=" + diagName4 + ", diagName5=" + diagName5 + ", diagName6=" + diagName6
				+ ", diagActualValue1=" + diagActualValue1 + ", diagActualValue2=" + diagActualValue2
				+ ", diagActualValue3=" + diagActualValue3 + ", diagActualValue4=" + diagActualValue4
				+ ", diagActualValue5=" + diagActualValue5 + ", diagActualValue6=" + diagActualValue6
				+ ", diagNormalRange1=" + diagNormalRange1 + ", diagNormalRange2=" + diagNormalRange2
				+ ", diagNormalRange3=" + diagNormalRange3 + ", diagNormalRange4=" + diagNormalRange4
				+ ", diagNormalRange5=" + diagNormalRange5 + ", diagNormalRange6=" + diagNormalRange6
				+ ", doctorComments=" + doctorComments + ", otherInfo=" + otherInfo + ", doctor=" + doctor
				+ ", patient=" + patient + ", agent=" + agent + "]";
	}


}
