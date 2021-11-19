package org.geeksforgeeks.removeifromiv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaring and initializing constants for ImageView and Button from the layout (activity_main.xml)
        val mImageView1 = findViewById<ImageView>(R.id.imageview_1)
        val mButton1 = findViewById<Button>(R.id.button_1)


        // When button is clicked, ImageView is attempted to set to null with a Toast message.
        // Else, the exception is handled along with a Toast message.
        mButton1.setOnClickListener {
            try {
                mImageView1.setImageDrawable(null)
                Toast.makeText(applicationContext,"Image removed!", Toast.LENGTH_SHORT).show()
            }
            catch (e:IOException){
                e.printStackTrace()
                Toast.makeText(applicationContext,"Some error occurred!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}