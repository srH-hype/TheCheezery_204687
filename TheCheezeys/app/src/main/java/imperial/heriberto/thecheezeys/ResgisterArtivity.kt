package imperial.heriberto.thecheezeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResgisterArtivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resgister_artivity)


        val button: Button = findViewById(R.id.sign_in_button)
        button.setOnClickListener{
            var intent: Intent = Intent (this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}