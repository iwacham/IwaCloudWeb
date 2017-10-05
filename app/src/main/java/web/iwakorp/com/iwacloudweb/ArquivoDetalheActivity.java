package web.iwakorp.com.iwacloudweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ArquivoDetalheActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arquivo_detalhe);

        Button download = (Button) findViewById(R.id.btnDownload);
        Button deletar = (Button) findViewById(R.id.btnDelete);
        Button share = (Button) findViewById(R.id.btnShare);

        share.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ArquivoDetalheActivity.this, CompartilharActivity.class);
                startActivity(intent);
            }
        });

        deletar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ArquivoDetalheActivity.this, "Arquivo Deletado", Toast.LENGTH_SHORT).show();
            }
        });

        download.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(ArquivoDetalheActivity.this, "Efetuando download...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
