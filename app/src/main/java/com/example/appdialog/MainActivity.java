package com.example.appdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    CharSequence[] elementos={"Caso0","Caso1","Caso2","Caso3","Caso4","Caso5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder /*.setMessage("Ejemplo Dialogo")*/
                .setTitle("Titulo de diálogo")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("Primero", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int id) {
                        Toast toast = Toast.makeText(getApplicationContext(),"Boton Positivo",Toast.LENGTH_LONG);
                        toast.show();
                    }
                })
                .setNegativeButton("Segundo", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int id) {

                    }
                })
                .setNeutralButton("tercero", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialogInterface, int id) {

                    }
                })
                .setItems(elementos, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int id) {
                        Toast toast = Toast.makeText(MainActivity.this,"seleccionaste"+elementos[id],Toast.LENGTH_LONG);
                        toast.show();
                    }
                });
       // AlertDialog dialog = builder.create();
        builder.show();

    }
}