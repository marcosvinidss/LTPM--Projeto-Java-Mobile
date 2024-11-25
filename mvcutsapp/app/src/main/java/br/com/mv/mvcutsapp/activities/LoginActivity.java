package br.com.mv.mvcutsapp.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.User;

public class LoginActivity extends Activity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Layout com os campos de email e senha

        // Inicializa os componentes da UI
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Define o comportamento do botão de login
        btnLogin.setOnClickListener(view -> loginUser());
    }

    private void loginUser() {
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validação dos campos de login
        if (TextUtils.isEmpty(email)) {
            etEmail.setError("O e-mail é obrigatório");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            etPassword.setError("A senha é obrigatória");
            return;
        }

        // Simulação de um processo de login (pode ser substituído por uma verificação real)
        if (validateUser(email, password)) {
            // Se a validação for bem-sucedida, redireciona para a próxima tela
            Intent intent = new Intent(LoginActivity.this, MainActivity.class); // Redireciona para a tela principal
            startActivity(intent);
            finish(); // Finaliza a LoginActivity para que o usuário não possa voltar a ela
        } else {
            // Caso o login falhe
            Toast.makeText(this, "Credenciais inválidas. Tente novamente.", Toast.LENGTH_SHORT).show();
        }
    }

    // Método que valida o usuário (substitua essa lógica por uma verificação real, como em um banco de dados ou API)
    private boolean validateUser(String email, String password) {
        // Simulação de um usuário cadastrado
        User registeredUser = new User(1, "Vinicius", "vinicius@email.com", "999999999", "senha123", "");

        // Valida as credenciais
        return email.equals(registeredUser.getEmail()) && password.equals(registeredUser.getPassword());
    }
}
