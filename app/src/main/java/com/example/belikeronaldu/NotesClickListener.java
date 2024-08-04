package com.example.belikeronaldu;

import androidx.cardview.widget.CardView;

import com.example.belikeronaldu.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
