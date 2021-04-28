package com.marvel999.arch_progress_graph

import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.marvel999.acr.ArcProgress


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FullScreencall()
        val arc_img:ArcProgress=findViewById(R.id.arc_img)
        var progress=10f;
//        arc_img.setOnClickListener {
//            Toast.makeText(this,"Button is clicked",Toast.LENGTH_LONG).show();
//        }
//        click.setOnClickListener {
//            progress+=10f
//          Log.d( "Arc Progress",arc_img.getProgress().toString())
////            arc_img.setProgress(progress)
//            Toast.makeText(this,"Progress"+arc_img.getProgress()+"/100",Toast.LENGTH_SHORT).show()
//            arc_img.setProgressWithAnimation(progress)
//        }
//        arc_img.setColor(R.color.white)
//        arc_img.setProgressThickness(50f)
//        arc_img.setProgressBackgroundColor(Color.CYAN)
//        arc_img.setProgressColor(Color.YELLOW)
//        arc_img.setProgress(130f)

    }

    fun FullScreencall() {
        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) { // lower api
            val v = this.window.decorView
            v.systemUiVisibility = View.GONE
        } else if (Build.VERSION.SDK_INT >= 19) {
            //for new api versions.
            val decorView = window.decorView
            val uiOptions =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            decorView.systemUiVisibility = uiOptions
        }
    }

}