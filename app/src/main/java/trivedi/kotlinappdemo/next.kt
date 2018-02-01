package trivedi.kotlinappdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

/**
 * Created by TI A1 on 13-11-2017.
 */
class next : AppCompatActivity() {

    val literals = arrayOf("January", "February", "March")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.next)

        val ss: String = intent.getStringExtra("key")
        if (ss.equals(""))
            Log.e("ss...", ss + " : null")
        else
            Log.e("ss...", ss + " : not null")

        for (i in 0 until 5) {
            Log.e("+Ve : ", "" + i)
        }

        for (i in -5 until 0) {
            Log.e("-Ve : ", "" + i)
        }
        for (i in 0 until literals.size) {
            Log.e("Month : ", "" + literals[i])
        }
    }
}