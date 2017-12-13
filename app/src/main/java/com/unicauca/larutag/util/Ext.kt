package com.unicauca.larutag.util

import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Sebastian on 09/12/2017.
 */
fun ViewGroup.inflate(layout:Int) = LayoutInflater
        .from(context).inflate(layout, this,false)