package trivedi.kotlinappdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

/**
 * Created by TI A1 on 11-11-2017.
 */
class demo : AppCompatActivity() {

    val value = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // textView2 = findViewById<TextView>(R.id.textView2)
        val textView2 = findViewById<TextView>(R.id.textView2) as TextView
        val edtname = findViewById<EditText>(R.id.edtname) as EditText

        textView2.setOnClickListener {
          // edtname.text = value
         /*   var value: String? = null
            value = edtname.text.toString()*/
            if(!edtname.text.toString().equals(""))
            {
                Toast.makeText(this@demo, "Please enter value."+edtname.text, Toast.LENGTH_SHORT).show()
                val intent = Intent(this@demo, next::class.java)
                intent.putExtra("key",edtname.text.toString())
                startActivity(intent)
            }
            else
            Toast.makeText(this@demo, "You clicked me."+edtname.text, Toast.LENGTH_SHORT).show()
        }
    }
}