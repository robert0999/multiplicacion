package topete.salazar.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fallaste.*
import topete.salazar.myapplication.R

class FelicitacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_felicitacion)

        btnRegresar.setOnClickListener {
            val regresarIntent = Intent(this, MainActivity::class.java)
            startActivity(regresarIntent)
        }
    }
}
