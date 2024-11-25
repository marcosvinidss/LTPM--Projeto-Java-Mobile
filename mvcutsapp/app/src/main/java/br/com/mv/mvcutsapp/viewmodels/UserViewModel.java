package br.com.mv.mvcutsapp.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import br.com.mv.mvcutsapp.domain.User;

public class UserViewModel extends AndroidViewModel {

    private MutableLiveData<User> userLiveData;

    public UserViewModel(Application application) {
        super(application);
        userLiveData = new MutableLiveData<>();
    }

    public LiveData<User> getUser() {
        return userLiveData;
    }

    public void setUser(User user) {
        userLiveData.setValue(user);
    }

    public void loadUserData() {
        User user = new User("João da Silva", "joao.silva@email.com", "https://example.com/profile.jpg");
        setUser(user);
    }

    public void updateUserProfile(String name, String email, String profileImageUrl) {
        User updatedUser = userLiveData.getValue();
        if (updatedUser != null) {
            updatedUser.setName(name);
            updatedUser.setEmail(email);
            updatedUser.setProfileImageUrl(profileImageUrl);
            setUser(updatedUser);
        }
    }
}
