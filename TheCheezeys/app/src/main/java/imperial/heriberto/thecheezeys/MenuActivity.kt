package imperial.heriberto.thecheezeys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.coldDrinksButton) as Button
        var btnHot: Button = findViewById(R.id.hotDrinksButton) as Button
        var btnSweet: Button = findViewById(R.id.sweetsButton) as Button
        var btnSalt: Button = findViewById(R.id.saltiesButton) as Button

        btnCold.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo","coldDrinks")
            startActivity(intent)
        }
        btnHot.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo","hotDrinks")
            startActivity(intent)
        }
        btnSweet.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo","sweets")
            startActivity(intent)
        }
        btnSalt.setOnClickListener{
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("tipo","salties")
            startActivity(intent)
        }

    }
}