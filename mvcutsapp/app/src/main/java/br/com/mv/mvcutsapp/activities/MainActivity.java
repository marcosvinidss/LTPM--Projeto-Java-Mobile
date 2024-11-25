package br.com.mv.mvcutsapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.User;

public class MainActivity extends Activity {

    private TextView tvWelcomeMessage;
    private Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Layout da tela principal

        // Inicializa os componentes da UI
        tvWelcomeMessage = findViewById(R.id.tvWelcomeMessage);
        btnLogout = findViewById(R.id.btnLogout);

        // Recebe o usuário logado (pode ser passado por Intent ou SharedPreferences)
        User loggedUser = new User(1, "Vinicius", "vinicius@email.com", "999999999", "senha123", "");

        // Exibe a mensagem de boas-vindas com o nome do usuário
        tvWelcomeMessage.setText("Bem-vindo, " + loggedUser.getName() + "!");

        // Define o comportamento do botão de logout
        btnLogout.setOnClickListener(view -> logoutUser());
    }

    private void logoutUser() {
        // Desfaz o login e volta para a LoginActivity
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
        finish(); // Finaliza a MainActivity para que o usuário não possa voltar a ela
    }
}
