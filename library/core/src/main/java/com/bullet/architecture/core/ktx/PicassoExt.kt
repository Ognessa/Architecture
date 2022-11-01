package com.bullet.architecture.core.ktx

import android.net.Uri
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.squareup.picasso.Picasso
import com.squareup.picasso.RequestCreator
import java.io.File

fun ImageView.loadImage(
    url: String?,
    extras: RequestCreator.() -> RequestCreator = { this }
) = Picasso
    .get()
    .load(url)
    .extras()
    .into(this)

fun ImageView.loadImage(
    uri: Uri?,
    extras: RequestCreator.() -> RequestCreator = { this }
) = Picasso
    .get()
    .load(uri)
    .extras()
    .into(this)

fun ImageView.loadImage(
    file: File,
    extras: RequestCreator.() -> RequestCreator = { this }
) = Picasso
    .get()
    .load(file)
    .extras()
    .into(this)

fun ImageView.loadImage(
    @DrawableRes resourceId: Int,
    extras: RequestCreator.() -> RequestCreator = { this }
) = Picasso
    .get()
    .load(resourceId)
    .extras()
    .into(this)