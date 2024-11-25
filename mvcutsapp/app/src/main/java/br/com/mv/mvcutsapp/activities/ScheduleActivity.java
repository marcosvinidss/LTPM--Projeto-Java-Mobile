package br.com.mv.mvcutsapp.ui;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.Appointment;

public class ScheduleActivity extends Activity {

    private EditText etDate, etTime, etBarber, etService;
    private Button btnSchedule;
    private int selectedYear, selectedMonth, selectedDay, selectedHour, selectedMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule); // Layout da tela de agendamento

        // Inicializa os componentes da UI
        etDate = findViewById(R.id.etDate);
        etTime = findViewById(R.id.etTime);
        etBarber = findViewById(R.id.etBarber);
        etService = findViewById(R.id.etService);
        btnSchedule = findViewById(R.id.btnSchedule);

        // Define os ouvintes de clique para escolher data e hora
        etDate.setOnClickListener(view -> showDatePicker());
        etTime.setOnClickListener(view -> showTimePicker());

        // Define o comportamento do botão de agendamento
        btnSchedule.setOnClickListener(view -> scheduleAppointment());
    }

    private void showDatePicker() {
        Calendar calendar = Calendar.getInstance();
        selectedYear = calendar.get(Calendar.YEAR);
        selectedMonth = calendar.get(Calendar.MONTH);
        selectedDay = calendar.get(Calendar.DAY_OF_MONTH);

        // Cria um DatePickerDialog para escolher a data
        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                (view, year, month, dayOfMonth) -> {
                    selectedYear = year;
                    selectedMonth = month;
                    selectedDay = dayOfMonth;
                    etDate.setText(String.format("%02d/%02d/%d", selectedDay, selectedMonth + 1, selectedYear));
                }, selectedYear, selectedMonth, selectedDay);

        datePickerDialog.show();
    }

    private void showTimePicker() {
        Calendar calendar = Calendar.getInstance();
        selectedHour = calendar.get(Calendar.HOUR_OF_DAY);
        selectedMinute = calendar.get(Calendar.MINUTE);

        // Cria um TimePickerDialog para escolher a hora
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                (view, hourOfDay, minute) -> {
                    selectedHour = hourOfDay;
                    selectedMinute = minute;
                    etTime.setText(String.format("%02d:%02d", selectedHour, selectedMinute));
                }, selectedHour, selectedMinute, true);

        timePickerDialog.show();
    }

    private void scheduleAppointment() {
        String date = etDate.getText().toString().trim();
        String time = etTime.getText().toString().trim();
        String barber = etBarber.getText().toString().trim();
        String service = etService.getText().toString().trim();

        // Validação dos campos
        if (TextUtils.isEmpty(date)) {
            etDate.setError("Data é obrigatória");
            return;
        }
        if (TextUtils.isEmpty(time)) {
            etTime.setError("Hora é obrigatória");
            return;
        }
        if (TextUtils.isEmpty(barber)) {
            etBarber.setError("Escolha o barbeiro");
            return;
        }
        if (TextUtils.isEmpty(service)) {
            etService.setError("Escolha o serviço");
            return;
        }

        // Cria um agendamento com as informações fornecidas
        Appointment appointment = new Appointment();
        appointment.setDate(String.format("%s %s", date, time));
        appointment.setStatus("Confirmado");  // Pode ser 'Confirmado', 'Pendente', 'Cancelado', etc.

        // Simula o processo de agendamento (substitua com a lógica de backend ou banco de dados)
        // Aqui, você poderia salvar o agendamento no banco ou em uma API.
        Toast.makeText(this, "Agendamento realizado com sucesso!", Toast.LENGTH_SHORT).show();

        // Limpa os campos após o agendamento
        etDate.setText("");
        etTime.setText("");
        etBarber.setText("");
        etService.setText("");
    }
}
