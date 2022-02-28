package com.example.minimart.utills

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class MSPEditText (context: Context, attires: AttributeSet): AppCompatEditText(context,attires) {


    init {

        applyfont()
    }

    private fun applyfont(){

        Typeface.createFromAsset(
            context.assets,"montserrat-Bold.ttf")

        typeface = typeface
    }


}