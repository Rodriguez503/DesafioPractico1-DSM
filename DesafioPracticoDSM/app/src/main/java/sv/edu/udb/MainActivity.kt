package sv.edu.udb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var resultado: TextView
    lateinit var btnSuma: Button
    lateinit var btnResta: Button
    lateinit var btnMultiplicacion: Button
    lateinit var btnDivision: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        n1 = findViewById(R.id.edtN1)
        n2 = findViewById(R.id.edtN2)
        resultado = findViewById(R.id.tvResultado)
        btnSuma = findViewById(R.id.btnSumar)
        btnResta = findViewById(R.id.btnRestar)
        btnMultiplicacion = findViewById(R.id.btnMultiplicar)
        btnDivision = findViewById(R.id.btnDividir)

        btnSuma.setOnClickListener {
            var num1 = n1.text.toString().toFloat()
            var num2 = n2.text.toString().toFloat()
            val res = num1 + num2
            resultado.text = res.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        }

        btnResta.setOnClickListener {
            var num1 = n1.text.toString().toFloat()
            var num2 = n2.text.toString().toFloat()
            val res = num1 - num2
            resultado.text = res.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        }

        btnMultiplicacion.setOnClickListener {
            var num1 = n1.text.toString().toFloat()
            var num2 = n2.text.toString().toFloat()
            val res = num1 * num2
            resultado.text = res.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        }

        btnDivision.setOnClickListener {
            var num1 = n1.text.toString().toFloat()
            var num2 = n2.text.toString().toFloat()
            val res = num1 / num2
            resultado.text = res.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("resultado", res.toString())
            startActivity(intent)
        }
    }
}