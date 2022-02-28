package valdez.ignacio.popcornfactory

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_signin: Button = findViewById(R.id.btn_login)

        btn_signin.setOnClickListener {
            var intent = Intent(this, Catalogo::class.java)
            startActivity(intent)
        }

    }
}