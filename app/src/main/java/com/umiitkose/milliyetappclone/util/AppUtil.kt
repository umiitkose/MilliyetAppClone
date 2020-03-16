package com.umiitkose.milliyetappclone.util

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Build
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, className))
    finish()
}

infix fun Context.extGetDrawable(@DrawableRes drawableId: Int): Drawable =
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        resources.getDrawable(drawableId, theme)
    } else {
        resources.getDrawable(drawableId)
    }

infix fun Context.extToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}