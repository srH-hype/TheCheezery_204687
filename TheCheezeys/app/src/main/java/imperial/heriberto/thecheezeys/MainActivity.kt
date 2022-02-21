package imperial.heriberto.thecheezeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.bt_getStarted)
        button.setOnClickListener{
            var intent: Intent = Intent (this, ResgisterArtivity::class.java)
            startActivity(intent)
        }
    }
}