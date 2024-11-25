package br.com.mv.mvcutsapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.Appointment;
import br.com.mv.mvcutsapp.ui.adapter.AppointmentAdapter;

public class ScheduleFragment extends Fragment {

    private RecyclerView recyclerView;
    private AppointmentAdapter appointmentAdapter;
    private List<Appointment> appointmentList;

    public ScheduleFragment() {
        // Requer um construtor vazio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout do fragmento
        View rootView = inflater.inflate(R.layout.fragment_schedule, container, false);

        // Inicializa o RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerViewAppointments);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Cria uma lista fictícia de agendamentos
        appointmentList = new ArrayList<>();
        appointmentList.add(new Appointment(1, "João", "2024-11-30", "10:00", "Corte de Cabelo"));
        appointmentList.add(new Appointment(2, "Maria", "2024-12-01", "14:00", "Barba e Corte"));
        appointmentList.add(new Appointment(3, "Pedro", "2024-12-02", "11:30", "Corte de Cabelo e Barba"));

        // Configura o adaptador
        appointmentAdapter = new AppointmentAdapter(getContext(), appointmentList);
        recyclerView.setAdapter(appointmentAdapter);

        return rootView;
    }
}
