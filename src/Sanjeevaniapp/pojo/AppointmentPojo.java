/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.pojo;

/**
 *
 * @author saksh
 */
public class AppointmentPojo {

    public AppointmentPojo(String patientId, String patientName, String opd, String status, String appointmentDate, String doctorName, String mobileNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.opd = opd;
        this.status = status;
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
        this.mobileNo = mobileNo;
    }
    public AppointmentPojo(){
    
    }

    @Override
    public String toString() {
        return "AppointmentPojo{" + "patientId=" + patientId + ", patientName=" + patientName + ", opd=" + opd + ", status=" + status + ", appointmentDate=" + appointmentDate + ", docotorName=" + doctorName + ", mobileNo=" + mobileNo + '}';
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getDocotorName() {
        return doctorName;
    }

    public void setDocotorName(String docotorName) {
        this.doctorName = docotorName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
     private String patientId;
    private String patientName;
    private String opd;
    private String status;
    private String appointmentDate;
    private String doctorName;
    private String mobileNo;
}
