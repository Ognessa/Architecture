package com.bullet.architecture.core.ui.view.ktx

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bullet.architecture.core.ktx.getString
import com.bullet.architecture.core.ui.view.model.TextProvider

@BindingAdapter("setText")
fun TextView.setText(textProvider: TextProvider?) {
    textProvider?.let { text = textProvider.getString(context) }

}