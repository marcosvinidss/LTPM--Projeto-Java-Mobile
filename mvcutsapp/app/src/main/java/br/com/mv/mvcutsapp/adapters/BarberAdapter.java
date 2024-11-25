package br.com.mv.mvcutsapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.mv.mvcutsapp.R;
import br.com.mv.mvcutsapp.domain.Barber;

public class BarberAdapter extends RecyclerView.Adapter<BarberAdapter.BarberViewHolder> {

    private Context context;
    private List<Barber> barberList;

    // Construtor do adaptador
    public BarberAdapter(Context context, List<Barber> barberList) {
        this.context = context;
        this.barberList = barberList;
    }

    @Override
    public BarberViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Infla o layout para cada item da lista de barbeiros
        View view = LayoutInflater.from(context).inflate(R.layout.item_barber, parent, false);
        return new BarberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BarberViewHolder holder, int position) {
        // Obtém o barbeiro da lista
        Barber barber = barberList.get(position);

        // Preenche os campos do item com os dados do barbeiro
        holder.tvName.setText(barber.getName());
        holder.tvSpecialty.setText("Especialidade: " + barber.getSpecialty());
    }

    @Override
    public int getItemCount() {
        // Retorna o número de itens na lista de barbeiros
        return barberList.size();
    }

    // Classe ViewHolder para o item do barbeiro
    public class BarberViewHolder extends RecyclerView.ViewHolder {

        TextView tvName, tvSpecialty;

        public BarberViewHolder(View itemView) {
            super(itemView);
            // Inicializa os elementos da UI para cada item de barbeiro
            tvName = itemView.findViewById(R.id.tvName);
            tvSpecialty = itemView.findViewById(R.id.tvSpecialty);
        }
    }
}
