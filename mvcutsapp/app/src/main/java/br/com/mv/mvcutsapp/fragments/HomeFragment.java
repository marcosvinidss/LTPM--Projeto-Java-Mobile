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
import br.com.mv.mvcutsapp.domain.Barber;
import br.com.mv.mvcutsapp.ui.adapter.BarberAdapter;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private BarberAdapter barberAdapter;
    private List<Barber> barberList;

    public HomeFragment() {
        // Requer um construtor vazio
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout do fragmento
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        // Inicializa o RecyclerView
        recyclerView = rootView.findViewById(R.id.recyclerViewBarbers);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Cria uma lista fictícia de barbeiros
        barberList = new ArrayList<>();
        barberList.add(new Barber(1, "João", "Corte de Cabelo"));
        barberList.add(new Barber(2, "Maria", "Barba e Corte"));
        barberList.add(new Barber(3, "Pedro", "Corte de Cabelo e Barba"));

        // Configura o adaptador
        barberAdapter = new BarberAdapter(getContext(), barberList);
        recyclerView.setAdapter(barberAdapter);

        return rootView;
    }
}
