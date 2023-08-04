package com.jayo.ec03.fragmets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.jayo.ec03.databinding.FragmentHomeBinding;
import com.jayo.ec03.model.Tipo;
import com.jayo.ec03.model.Region;
import com.jayo.ec03.model.Platos;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvPlatosResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.VERTICAL, false);
        binding.rvPlatosResume.setLayoutManager(layoutManager);
    }


    private List<Platos> getData(){
        List<Platos> platos = new ArrayList<>();
        platos.add(new Tipo("Ceviche conchas Negras","https://comidasperuanas.net/wp-content/uploads/2019/11/Ceviche-de-Conchas-Negras.jpg","Marino"));
        platos.add(new Tipo("Seco de Cabrito","https://www.comidastipicasperuanas.com/wp-content/uploads/2023/03/Receta-de-seco-de-cabrito-a-la-nortena-Comidas-Peruanas.jpg","Norte"));
        platos.add(new Tipo("Lomo Saltado","https://imgmedia.buenazo.pe/1200x660/buenazo/original/2022/06/20/62aea00d119a8801813a563b.jpg","Criollo"));
        platos.add(new Tipo("Tallarines verdes","https://comidasperuanas.net/wp-content/uploads/2023/02/Tallarines-Verdes-con-Bistec.jpg","Criollo"));
        platos.add(new Tipo("Trucha Frita","https://decomidaperuana.com/wp-content/uploads/2020/04/trucha-frita.jpg","Norte"));
        platos.add(new Tipo("Mondonguito","https://www.comidastipicasperuanas.com/wp-content/uploads/2023/04/Receta-de-mondonguito-a-la-italiana-Comidas-Peruanas.jpg","Norte"));
        platos.add(new Tipo("Seco de Pollo","https://cocer.deagapornis.com/wp-content/uploads/2021/02/seco-de-pollo.png","Criollo"));
        platos.add(new Tipo("Carapulcra","https://www.comedera.com/wp-content/uploads/2021/08/carapulcra-peruana.jpg","Criollo"));
        platos.add(new Tipo("Juane","https://recetascocinaperuana.com/wp-content/uploads/2020/05/juane.jpg","Selva"));
        platos.add(new Tipo("Arroz con pollo","https://www.comidastipicasperuanas.com/wp-content/uploads/2022/04/Receta-de-arroz-con-pollo-Comidas-Tipicas-Peruanas.gif","Criollo"));

        return platos;
    }
}