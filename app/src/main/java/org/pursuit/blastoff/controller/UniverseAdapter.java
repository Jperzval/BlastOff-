package org.pursuit.blastoff.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.pursuit.blastoff.R;
import org.pursuit.blastoff.fragments.FragmentInterface;
import org.pursuit.blastoff.model.Universe;
import org.pursuit.blastoff.view.UniverseViewHolder;

import java.util.List;

public class UniverseAdapter extends RecyclerView.Adapter<UniverseViewHolder> {

    private List<Universe> universeList;
    private FragmentInterface fragmentInterface;

    public UniverseAdapter(List<Universe> universeList,
                           FragmentInterface fragmentInterface) {
        this.universeList = universeList;
        this.fragmentInterface = fragmentInterface;
    }

    @NonNull
    @Override
    public UniverseViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.universe_itemview, viewGroup, false);
        return new UniverseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UniverseViewHolder spaceViewHolder, int i) {
        spaceViewHolder.onBind(universeList.get(i), fragmentInterface);
    }

    @Override
    public int getItemCount() {
        return universeList.size();
    }
}