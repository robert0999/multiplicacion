package topete.salazar.myapplication


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import topete.salazar.myapplication.R
import kotlin.random.Random

/*
* Lo que hacemos es implementar la interfaz
* OnclickListener de la clase View, para poder "escuchar los clicks"
* en ciertos elementos
* */
class MainActivity : AppCompatActivity() {
    //Variables globales
    var resultado = 0
    val listaOperaciones = arrayOf("+","-","*")
    var operacionElegida = listaOperaciones.random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiplicar()

        if (operacionElegida == "+"){
            btnVerificar.setOnClickListener{

                if (etMulti.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }
        if (operacionElegida == "-"){
            btnVerificar.setOnClickListener{

                if (etMulti.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }
      /**  if (operacionElegida == "/"){
            btnVerificar.setOnClickListener{

                if (etMulti.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }**/
        if (operacionElegida == "*"){
            btnVerificar.setOnClickListener{

                if (etMulti.text.isNotEmpty()){
                    verificarRespuesta()
                }else {
                    m("Ingrese una respuesta!!")
                }
            }
        }

    }


    fun m(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }

    fun verificarRespuesta(){
        if (operacionElegida == "+"){
            btnVerificar.setOnClickListener{
                if (etMulti.text.isNotEmpty()){
                    if (etMulti.getText().toString().toInt()==resultado){
                        m("Correcto!!")
                        val miIntent = Intent(this, FelicitacionActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        m("Incorrecto!!")
                        val miIntent2 = Intent(this, FallasteActivity::class.java)
                        startActivity(miIntent2)

                    }
                    operacionNueva()
                }else{
                    m("Ingrese una respuesta")
                }
            }
        }
        if (operacionElegida == "-"){
            btnVerificar.setOnClickListener{
                if (etMulti.text.isNotEmpty()){
                    if (etMulti.getText().toString().toInt()==resultado){
                        m("Correcto!!")
                        val miIntent = Intent(this, FelicitacionActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        m("Incorrecto!!")
                        val miIntent2 = Intent(this, FallasteActivity::class.java)
                        startActivity(miIntent2)

                    }
                    operacionNueva()
                }else{
                    m("Ingrese una respuesta")
                }
            }
        }
        /**if (operacionElegida == "/"){
            btnVerificar.setOnClickListener{
                if (etMulti.text.isNotEmpty()){
                    if (etMulti.getText().toString().toInt()==resultado){
                        m("Correcto!!")

                    }else{
                        m("Incorrecto!!")

                    }
                    operacionNueva()
                }else{
                    m("Ingrese una respuesta")
                }
            }
        }*/
        if (operacionElegida == "*"){
            btnVerificar.setOnClickListener{
                if (etMulti.text.isNotEmpty()){
                    if (etMulti.getText().toString().toInt()==resultado){
                        m("Correcto!!")
                        val miIntent = Intent(this, FelicitacionActivity::class.java)
                        startActivity(miIntent)

                    }else{
                        m("Incorrecto!!")
                        val miIntent2 = Intent(this, FallasteActivity::class.java)
                        startActivity(miIntent2)

                    }
                    operacionNueva()
                }else{
                    m("Ingrese una respuesta")
                }

            }
        }
    }

    fun multiplicar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvMulti.text = "$num1 x $num2 = ?"
        resultado=num1*num2
        etMulti.text.clear()
    }
    fun sumar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvMulti.text = "$num1 + $num2 = ?"
        resultado=num1+num2
        etMulti.text.clear()
    }
   /** fun dividir(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvMulti.text = "$num1 / $num2 = ?"
        resultado=num1/num2
        etMulti.text.clear()
    }*/
    fun restar(){
        val num1 = Random.nextInt(1,11)
        val num2 = Random.nextInt(1,11)
        tvMulti.text = "$num1 - $num2 =?"
        resultado=num1-num2
        etMulti.text.clear()
    }
    fun operacionNueva(){
       operacionElegida = listaOperaciones.random()
        if (operacionElegida == "+"){
            sumar()
        }
        if (operacionElegida == "-"){
            restar()
        }
        /*if (operacionElegida == "/"){
            dividir()
        }*/
        if (operacionElegida == "*"){
            multiplicar()
        }
    }
   /** fun pantallaNueva(){
        btnVerificar.setOnClickListener {
            if (etMulti.text.isNotEmpty()){
                if (etMulti.getText().toString().toInt()==resultado){
                    val miIntent = Intent(this, FelicitacionActivity::class.java)
                    startActivity(miIntent)

                }else{
                    val miIntent2 = Intent(this, FallasteActivity::class.java)
                    startActivity(miIntent2)

                }
                operacionNueva()
            }else{
                m("Ingrese una respuesta")
            }


        }
    }*/

    private fun initUI() {

    }



    }

