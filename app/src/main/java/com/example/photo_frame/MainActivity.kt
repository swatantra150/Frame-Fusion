package com.example.photo_frame

import android.annotation.SuppressLint
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.photo_frame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var currentImage=0
   private lateinit var image:ImageView
    private lateinit var binding: ActivityMainBinding
    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding=ActivityMainBinding.inflate((layoutInflater))
        setContentView(binding.root)
        binding.prev.setOnClickListener{
            val idCurrImgStr="pic$currentImage"
            //convert current string id into integer address associated with it
            val idCurrImgInt=this.resources.getIdentifier(idCurrImgStr,"id",packageName)
           image=findViewById(idCurrImgInt)
            image.alpha=0f
            currentImage = (currentImage + 2) % 3
            val idImgToshowStr="pic$currentImage"
            //convert current string id into integer address associated with it
            val idImgToshowInt=this.resources.getIdentifier(idImgToshowStr,"id",packageName)
            image=findViewById(idImgToshowInt)
            image.alpha=1f
        }
       binding.next.setOnClickListener{
           val idCurrImgStr="pic$currentImage"
           //convert current string id into integer address associated with it
           val idCurrImgInt=this.resources.getIdentifier(idCurrImgStr,"id",packageName)
           image=findViewById(idCurrImgInt)
           image.alpha=0f
           currentImage = (currentImage + 2) % 3
           val idImgToshowStr="pic$currentImage"
           //convert current string id into integer address associated with it
           val idImgToshowInt=this.resources.getIdentifier(idImgToshowStr,"id",packageName)
           image=findViewById(idImgToshowInt)
           image.alpha=1f

       }
    }
}