package com.example.android.tourguide.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.android.tourguide.Item;
import com.example.android.tourguide.ItemAdapter;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_main, container, false);

        pageViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                if (s.equalsIgnoreCase("Visit")) {
                    // Create a list of words.
                    final ArrayList<Item> items = new ArrayList<Item>();
                    items.add(new Item("Place de la Bourse", "Quai du Maréchal Lyautey"));
                    items.add(new Item("Cathédrale Saint-André", "66 Rue Trois Conils"));
                    items.add(new Item("Le Grand Théâtre", "Place de la Comédie"));
                    items.add(new Item("Basilique Saint-Seurin", "Place des Martyrs de la Résistance"));
                    items.add(new Item("Basilique Saint-Michel", "Place Meynard"));
                    items.add(new Item("Musée des Beaux-Arts", "20 Cours d'Albret"));
                    items.add(new Item("Musée d'Aquitaine", "20 Cours Pasteur"));
                    items.add(new Item("Esplanade des Quinconces", "Place des Quinconces"));
                    items.add(new Item("Palais Gallien", "Rue du Docteur Albert Barraud"));
                    items.add(new Item("Pont de Pierre", "Garonne River"));
                    items.add(new Item("Grosse Cloche", "Rue Saint-James Cours"));

                    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
                    // adapter knows how to create list items for each item in the list.
                    final ItemAdapter adapter = new ItemAdapter(getContext(), items, R.color.category_visit);

                    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
                    // There should be a {@link ListView} with the view ID called list, which is declared in the
                    // item_list.xml layout file.
                    final ListView listView = root.findViewById(R.id.list);

                    listView.setAdapter(adapter);

                } else if (s.equalsIgnoreCase("Rest")) {
                    // Create a list of words.
                    final ArrayList<Item> items = new ArrayList<Item>();
                    items.add(new Item("Le Boutique Hotel", "3 Rue Lafaurie de Monbadon"));
                    items.add(new Item("L'Hôtel Particulier", "44 Rue Vital Carles"));
                    items.add(new Item("YNDO Hotel", "108 Rue Abbé de l'Épée"));
                    items.add(new Item("Seeko'o", "54 Quai de Bacalan"));
                    items.add(new Item("La Maison Bord'eaux", "113 Rue du Docteur Albert Barraud"));

                    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
                    // adapter knows how to create list items for each item in the list.
                    final ItemAdapter adapter = new ItemAdapter(getContext(), items, R.color.category_rest);

                    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
                    // There should be a {@link ListView} with the view ID called list, which is declared in the
                    // item_list.xml layout file.
                    final ListView listView = root.findViewById(R.id.list);

                    listView.setAdapter(adapter);

                } else if (s.equalsIgnoreCase("Eat")) {
                    // Create a list of words.
                    final ArrayList<Item> items = new ArrayList<Item>();
                    items.add(new Item("La Brasserie Bordelaise", "50 Rue Saint-Rémi"));
                    items.add(new Item("La Tupina", "6 Rue Porte de la Monnaie"));
                    items.add(new Item("Le 7 Restaurant", "4 Rue de Pontac"));
                    items.add(new Item("Le Chien de Pavlov", "45 Rue de la Devise"));
                    items.add(new Item("Symbiose", "4 Quai des Chartrons"));
                    items.add(new Item("Le Canopée Café", "1 Chemin de Pouchon"));

                    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
                    // adapter knows how to create list items for each item in the list.
                    final ItemAdapter adapter = new ItemAdapter(getContext(), items, R.color.category_eat);

                    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
                    // There should be a {@link ListView} with the view ID called list, which is declared in the
                    // item_list.xml layout file.
                    final ListView listView = root.findViewById(R.id.list);

                    listView.setAdapter(adapter);

                } else if (s.equalsIgnoreCase("Enjoy")) {
                    // Create a list of words.
                    final ArrayList<Item> items = new ArrayList<Item>();
                    items.add(new Item("Matmut Atlantique Stadium", "Cours Jules-Ladoumègue"));
                    items.add(new Item("Chaban Delmas Stadium", "Rue Frantz Despagnet"));
                    items.add(new Item("Grand Théâtre", "Place de la Comédie"));
                    items.add(new Item("Bowling", "Terrasse Front du Médoc"));
                    items.add(new Item("Tennis", "30 Rue Claude Bonnier"));



                    // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
                    // adapter knows how to create list items for each item in the list.
                    final ItemAdapter adapter = new ItemAdapter(getContext(), items, R.color.category_enjoy);

                    // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
                    // There should be a {@link ListView} with the view ID called list, which is declared in the
                    // item_list.xml layout file.
                    final ListView listView = root.findViewById(R.id.list);

                    listView.setAdapter(adapter);
                }
            }
        });
        return root;
    }
}