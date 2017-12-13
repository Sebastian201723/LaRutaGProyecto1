package com.unicauca.larutag.util

import android.databinding.BindingAdapter
import android.net.Uri
import android.widget.ImageView
import com.squareup.picasso.Picasso
/**
 * Created by Sebastian on 09/12/2017.
 Binding adaptar transforma el nombre del atributo
 */
@BindingAdapter("app:imgUrl")
fun setImageUrl(img: ImageView, url:String){
    Picasso.with(img.context)
            .load(Uri.parse(url))
            .into(img)
}