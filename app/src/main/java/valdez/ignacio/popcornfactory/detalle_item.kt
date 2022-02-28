package valdez.ignacio.popcornfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detalle_item : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_item)

        val iv_item_imagen: ImageView = findViewById(R.id.iv_peliculaImagen)
        val tv_item_desc: TextView = findViewById(R.id.tv_peliculaDescripcion)

        val bundle=intent.extras

        if(bundle!=null){
            iv_item_imagen.setImageResource(bundle.getInt("header"))
            tv_item_desc.setText(bundle.getString("sinopsis"))
        }

    }
}