package br.com.mv.mvcutsapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import br.com.mv.mvcutsapp.R;

public class ProfileFragment extends Fragment {

    private EditText editTextName, editTextEmail;
    private ImageView imageViewProfile;
    private Button buttonSaveProfile;

    public ProfileFragment() {
        // Requer um construtor vazio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout do fragmento
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        // Inicializa os componentes da interface
        editTextName = rootView.findViewById(R.id.editTextName);
        editTextEmail = rootView.findViewById(R.id.editTextEmail);
        imageViewProfile = rootView.findViewById(R.id.imageViewProfile);
        buttonSaveProfile = rootView.findViewById(R.id.buttonSaveProfile);

        // Carregar imagem de perfil (pode ser uma URL ou recurso local)
        Glide.with(this)
            .load("https://example.com/profile_image.jpg") // URL ou caminho do arquivo local
            .into(imageViewProfile);

        // Definindo valores iniciais (fictícios para exemplo)
        editTextName.setText("João da Silva");
        editTextEmail.setText("joao.silva@email.com");

        // Ação do botão salvar
        buttonSaveProfile.setOnClickListener(v -> saveProfile());

        return rootView;
    }

    private void saveProfile() {
        String name = editTextName.getText().toString();
        String email = editTextEmail.getText().toString();

       
    }
}
