package com.procuraservico;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout tela = new LinearLayout(this);
        tela.setOrientation(LinearLayout.VERTICAL);
        tela.setPadding(30, 40, 30, 30);

        TextView titulo = new TextView(this);
        titulo.setText("🔎 Procura Serviço");
        titulo.setTextSize(28);
        titulo.setTextColor(Color.rgb(20, 120, 70));
        titulo.setGravity(Gravity.CENTER);

        TextView cidade = new TextView(this);
        cidade.setText("Novo Cruzeiro e região");
        cidade.setTextSize(18);
        cidade.setGravity(Gravity.CENTER);

        EditText busca = new EditText(this);
        busca.setHint("Digite o serviço que procura");

        Button pesquisar = new Button(this);
        pesquisar.setText("Pesquisar");

        TextView resultado = new TextView(this);
        resultado.setText(
            "Serviços disponíveis:\n\n" +
            "• Ajudante de pedreiro\n" +
            "• Auxiliar de produção\n" +
            "• Serviços gerais\n" +
            "• Trabalho rural\n" +
            "• Comércio e lojas\n" +
            "• Entregas e transporte"
        );
        resultado.setTextSize(17);
        resultado.setPadding(10, 30, 10, 10);

        tela.addView(titulo);
        tela.addView(cidade);
        tela.addView(busca);
        tela.addView(pesquisar);
        tela.addView(resultado);

        setContentView(tela);
    }
}
