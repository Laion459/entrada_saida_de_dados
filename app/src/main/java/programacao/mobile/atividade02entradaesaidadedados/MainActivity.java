package programacao.mobile.atividade02entradaesaidadedados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Float calculaPorcentagemPresenca(Float presencas, Float faltas){
        Float porcentagemDeFaltas;
        porcentagemDeFaltas = (faltas / 100) * presencas;
        String porcentagem = porcentagemDeFaltas.toString();
        System.out.printf(porcentagem);
        return porcentagemDeFaltas;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Um algoritmo que leia a quantidade de aulas em um semestre, a quantidade de faltas de um
        //aluno, e apresente como saída: o percentual de presença, e a mensagem “reprovado” se este
        //percentual for inferior a 70%.

        // Lê 1º botão
        findViewById(R.id.button2).setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText presenca = (EditText) findViewById(R.id.editTextTextPersonName2);
                        EditText faltas = (EditText) findViewById(R.id.editTextTextPersonName3);
                        String textInput=presenca.getText().toString();
                        String textInput2 = faltas.getText().toString();
                        Log.i("Presenças:", textInput);
                        Float a = Float.valueOf(presenca.getText().toString()).floatValue();
                        Float b = Float.valueOf(textInput2).floatValue();

                        final Button button = (Button) findViewById(R.id.button2);
                        button.setOnClickListener(new View.OnClickListener() {
                            public void onClick(View v) {
                                TextView tv= (TextView) findViewById(R.id.resultadoPorcentagem);
                                tv.setText("Resultado..." + R.id.resultadoPorcentagem + 100);
                            }
                        });

                        System.out.println(calculaPorcentagemPresenca(a,b));
                    }
                }
        );
    }
}