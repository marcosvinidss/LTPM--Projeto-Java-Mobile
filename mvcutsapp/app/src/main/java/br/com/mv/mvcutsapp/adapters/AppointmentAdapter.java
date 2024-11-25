package br.com.mv.mvcutsapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.Appointment;

public class AppointmentAdapter extends RecyclerView.Adapter<AppointmentAdapter.AppointmentViewHolder> {

    private Context context;
    private List<Appointment> appointmentList;

    // Construtor do adaptador
    public AppointmentAdapter(Context context, List<Appointment> appointmentList) {
        this.context = context;
        this.appointmentList = appointmentList;
    }

    @Override
    public AppointmentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Infla o layout para cada item da lista
        View view = LayoutInflater.from(context).inflate(R.layout.item_appointment, parent, false);
        return new AppointmentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppointmentViewHolder holder, int position) {
        // Obtém o agendamento da lista
        Appointment appointment = appointmentList.get(position);

        // Preenche os campos do item com os dados do agendamento
        holder.tvDate.setText(appointment.getDate());
        holder.tvBarber.setText("Barbeiro: " + appointment.getBarber());
        holder.tvService.setText("Serviço: " + appointment.getService());
        holder.tvStatus.setText("Status: " + appointment.getStatus());
    }

    @Override
    public int getItemCount() {
        // Retorna o número de itens na lista
        return appointmentList.size();
    }

    // Classe ViewHolder para o item de agendamento
    public class AppointmentViewHolder extends RecyclerView.ViewHolder {

        TextView tvDate, tvBarber, tvService, tvStatus;

        public AppointmentViewHolder(View itemView) {
            super(itemView);
            // Inicializa os elementos da UI do item de agendamento
            tvDate = itemView.findViewById(R.id.tvDate);
            tvBarber = itemView.findViewById(R.id.tvBarber);
            tvService = itemView.findViewById(R.id.tvService);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }
}
