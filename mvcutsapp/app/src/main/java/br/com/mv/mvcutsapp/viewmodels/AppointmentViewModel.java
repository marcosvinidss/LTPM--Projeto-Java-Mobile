package br.com.mv.mvcutsapp.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import br.com.mv.mvcutsapp.domain.Appointment;

public class AppointmentViewModel extends AndroidViewModel {

    private MutableLiveData<Appointment> appointmentLiveData;

    public AppointmentViewModel(Application application) {
        super(application);
        appointmentLiveData = new MutableLiveData<>();
    }

    public LiveData<Appointment> getAppointment() {
        return appointmentLiveData;
    }

    public void setAppointment(Appointment appointment) {
        appointmentLiveData.setValue(appointment);
    }

    public void loadAppointmentData() {
        Appointment appointment = new Appointment("João da Silva", "Corte de cabelo", "2024-11-30 14:00");
        setAppointment(appointment);
    }

    public void updateAppointment(String customerName, String service, String dateTime) {
        Appointment updatedAppointment = appointmentLiveData.getValue();
        if (updatedAppointment != null) {
            updatedAppointment.setCustomerName(customerName);
            updatedAppointment.setService(service);
            updatedAppointment.setDateTime(dateTime);
            setAppointment(updatedAppointment);
        }
    }
}
