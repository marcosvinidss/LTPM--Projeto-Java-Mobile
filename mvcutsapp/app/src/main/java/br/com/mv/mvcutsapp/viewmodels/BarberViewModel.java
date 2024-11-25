package br.com.mv.mvcutsapp.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import br.com.mv.mvcutsapp.domain.Barber;

public class BarberViewModel extends AndroidViewModel {

    private MutableLiveData<Barber> barberLiveData;

    public BarberViewModel(Application application) {
        super(application);
        barberLiveData = new MutableLiveData<>();
    }

    public LiveData<Barber> getBarber() {
        return barberLiveData;
    }

    public void setBarber(Barber barber) {
        barberLiveData.setValue(barber);
    }

    public void loadBarberData() {
        Barber barber = new Barber("Carlos", "Corte de cabelo", "https://example.com/barber.jpg");
        setBarber(barber);
    }

    public void updateBarberProfile(String name, String service, String profileImageUrl) {
        Barber updatedBarber = barberLiveData.getValue();
        if (updatedBarber != null) {
            updatedBarber.setName(name);
            updatedBarber.setService(service);
            updatedBarber.setProfileImageUrl(profileImageUrl);
            setBarber(updatedBarber);
        }
    }
}
