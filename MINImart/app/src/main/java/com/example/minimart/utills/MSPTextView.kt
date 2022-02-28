package com.example.minimart.utills

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class MSPTextView (context: Context, attires: AttributeSet): AppCompatTextView(context,attires) {



    init {

        applyfont()
    }

    private fun applyfont(){

        Typeface.createFromAsset(
            context.assets,"montserrat-Medium.ttf")

        typeface = typeface
    }


}