package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private FloatingActionButton fbtnAgregar;
    private Aplicacion app;

    private Alumno alumno;
    private int posicion = -1;

    private Button btnCerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //btnCerrar = (Button) findViewById(R.id.btnCerrar);
        fbtnAgregar = (FloatingActionButton) findViewById(R.id.agregar);

        Aplicacion app = (Aplicacion) getApplication();
        recyclerView = (RecyclerView) findViewById(R.id.recId);
        recyclerView.setAdapter(app.getAdaptador());

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        fbtnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alumno = null;
                Intent intent = new Intent(MainActivity.this, AlumnoAlta.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("alumno", alumno);
                intent.putExtras(bundle);

                startActivityForResult(intent, 0);
            }
        });

        app.getAdaptador().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                posicion = recyclerView.getChildAdapterPosition(v);
                alumno = app.getAlumnos().get(posicion);

                Intent intent = new Intent(MainActivity.this, AlumnoAlta.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("alumno", alumno);
                intent.putExtra("posicion", posicion);
                intent.putExtras(bundle);

                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);

        recyclerView.getAdapter().notifyDataSetChanged();
        posicion = -1;
    }
}