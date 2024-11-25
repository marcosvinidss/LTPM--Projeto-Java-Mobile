package br.com.mv.mvcutsapp.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.User;

public class ProfileActivity extends Activity {

    private EditText etName, etEmail, etPhone, etPassword;
    private Button btnSave;
    private User currentUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile); // Layout da tela de perfil

        // Inicializa os componentes da UI
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        btnSave = findViewById(R.id.btnSave);

        // Carrega os dados do usuário (pode ser via Intent, SharedPreferences ou banco de dados)
        currentUser = new User(1, "Vinicius", "vinicius@email.com", "999999999", "senha123", "");

        // Preenche os campos com os dados do usuário
        etName.setText(currentUser.getName());
        etEmail.setText(currentUser.getEmail());
        etPhone.setText(currentUser.getPhone());
        etPassword.setText(currentUser.getPassword());

        // Define o comportamento do botão de salvar
        btnSave.setOnClickListener(view -> saveProfile());
    }

    private void saveProfile() {
        String name = etName.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Validação dos campos
        if (TextUtils.isEmpty(name)) {
            etName.setError("Nome é obrigatório");
            return;
        }
        if (TextUtils.isEmpty(email)) {
            etEmail.setError("E-mail é obrigatório");
            return;
        }
        if (TextUtils.isEmpty(phone)) {
            etPhone.setError("Telefone é obrigatório");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            etPassword.setError("Senha é obrigatória");
            return;
        }

        // Atualiza os dados do usuário com as informações fornecidas
        currentUser.setName(name);
        currentUser.setEmail(email);
        currentUser.setPhone(phone);
        currentUser.setPassword(password);

        // Simula o processo de salvamento (substitua com a lógica de backend ou banco de dados)
        // Aqui, você pode atualizar os dados no banco ou enviar para um servidor.

        // Exibe uma mensagem de sucesso
        Toast.makeText(this, "Perfil atualizado com sucesso!", Toast.LENGTH_SHORT).show();

        // Finaliza a atividade ou retorna para a tela anterior
        finish();
    }
}
