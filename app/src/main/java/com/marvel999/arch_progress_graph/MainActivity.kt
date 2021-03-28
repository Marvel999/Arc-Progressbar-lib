package com.marvel999.arch_progress_graph

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.marvel999.acr.ArcProgress

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arc_img:ArcProgress=findViewById(R.id.arc_img)
        val click=findViewById<Button>(R.id.progress)
        var progress=10f;
        arc_img.setOnClickListener {
            Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show();
        }
        click.setOnClickListener {
            progress+=10f
          Log.d( "Arc Progress",arc_img.getProgress().toString())
//            arc_img.setProgress(progress)
            Toast.makeText(this,"Progress"+arc_img.getProgress()+"/100",Toast.LENGTH_SHORT).show()
            arc_img.setProgressWithAnimation(progress)
        }
//        arc_img.setColor(R.color.white)
//        arc_img.setProgressThickness(50f)
//        arc_img.setProgressBackgroundColor(Color.CYAN)
//        arc_img.setProgressColor(Color.YELLOW)
//        arc_img.setProgress(130f)

    }

}