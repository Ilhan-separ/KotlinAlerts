package com.example.kotlinalerts
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view : View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Hey!!")
        alert.setMessage("Do You Like My App?")
        alert.setPositiveButton("Yes",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(applicationContext,"( ͡° ͜ʖ ͡°)",Toast.LENGTH_LONG).show()
        })
        alert.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(applicationContext,"(╯°□°）╯︵ ┻━┻",Toast.LENGTH_LONG).show()
        })
        alert.show()

    }


}

