package com.example.ferreteria;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cargar extends AppCompatActivity {

    private DatabaseReference mDatabase;

    EditText nombre, descripcion, aclaracion, marca, precio, cantidad, vencimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cargar);
        //myRef.setValue("LLEGUE");
        mDatabase = FirebaseDatabase.getInstance().getReference();
        Button buttonvol = findViewById(R.id.vi_btn);
        Button buttonOne = findViewById(R.id.cargar_btn);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                nombre = (EditText) findViewById(R.id.nom_val);
                descripcion = (EditText) findViewById(R.id.des_val);
                aclaracion = (EditText) findViewById(R.id.acl_val);
                marca = (EditText) findViewById(R.id.mar_val);
                precio = (EditText) findViewById(R.id.pre_val);
                cantidad = (EditText) findViewById(R.id.can_val);
                vencimiento = (EditText) findViewById(R.id.ven_val);

                int precio2 = Integer.parseInt(precio.getText().toString());
                int cantidad2 = Integer.parseInt(cantidad.getText().toString());
                String myText = "";
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                Date myDate;
                try {
                    myDate = df.parse(String.valueOf(vencimiento));
                    myText = myDate.getDate() + "-" + (myDate.getMonth() + 1) + "-" + (1900 + myDate.getYear());
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                String nombre2 = nombre.getText().toString();
                String descripcion2 = descripcion.getText().toString();
                String aclaracion2 = aclaracion.getText().toString();
                String marca2 = marca.getText().toString();

                //(String nombre, String descripcion, String aclaracion, String marca, Integer precio, Integer cantidad, Date vencimiento) {
                Producto prod = new Producto(nombre2, descripcion2, aclaracion2, marca2, precio2, cantidad2, myText);

                mDatabase.child("users").child(nombre2).setValue(prod);
                Context context = getApplicationContext();
                CharSequence text = "Producto Creado";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


            }
        });

        buttonvol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent activity2Intent = new Intent(cargar.this, MainActivity.class);
                startActivity(activity2Intent);
            }
        });
    }
}