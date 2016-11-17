package com.example.leotoscana.myapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class ContactoAdaptador extends RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {

    private ArrayList<Contacto> contactos;

    public ContactoAdaptador(ArrayList<Contacto> contactos){
        this.contactos = contactos;
    }

    @Override
    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.nombre,parent,false);
        return new ContactoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder, int position) {
        Contacto contacto=contactos.get(position);
        contactoViewHolder.nombre.setText(contacto.getNombre());
        contactoViewHolder.telefono.setText(contacto.getTelefono());
        contactoViewHolder.image.setImageResource(contacto.getImage());
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre;
        private TextView telefono;
        private ImageView image;


        public ContactoViewHolder(View itemView) {
            super(itemView);
            nombre   = (TextView)    itemView.findViewById(R.id.nombre);
            telefono = (TextView)    itemView.findViewById(R.id.numero);
            image    = (ImageView)   itemView.findViewById(R.id.image);
        }
    }
}
