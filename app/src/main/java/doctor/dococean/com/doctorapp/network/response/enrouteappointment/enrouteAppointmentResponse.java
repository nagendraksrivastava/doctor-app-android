package doctor.dococean.com.doctorapp.network.response.enrouteappointment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import doctor.dococean.com.doctorapp.network.response.Status;
import doctor.dococean.com.doctorapp.network.response.appointmentresponse.Appointment;

public class EnrouteAppointmentResponse {

    @SerializedName("status")
    @Expose
    private Status status;


    /**
     * @return The status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}