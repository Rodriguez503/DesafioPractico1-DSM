package sv.edu.udb

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    lateinit var resultadoText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        resultadoText = findViewById(R.id.tvResultado)

        val resultado = intent.getStringExtra("resultado")
        resultadoText.text = "Resultado: $resultado"

    }
}