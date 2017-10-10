package com.programacaobrasil.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    private ImageView imgEmpresa;
    private ImageView imgServicos;
    private ImageView imgClientes;
    private ImageView imgContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeControls();
        initializeEventsControls();
    }

    private void initializeControls()
    {
        imgEmpresa = (ImageView)findViewById(R.id.imgEmpresa);
        imgServicos = (ImageView)findViewById(R.id.imgServicos);
        imgClientes = (ImageView)findViewById(R.id.imgClientes);
        imgContato = (ImageView)findViewById(R.id.imgContato);
    }

    private void initializeEventsControls()
    {
        imgEmpresa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        imgServicos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        imgClientes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ClienteActivity.class));
            }
        });

        imgContato.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });
    }
}
