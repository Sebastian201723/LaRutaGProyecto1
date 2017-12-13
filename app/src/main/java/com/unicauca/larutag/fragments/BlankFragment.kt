
package com.unicauca.larutag.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.unicauca.larutag.R
import com.unicauca.larutag.adapters.DestinoAdapter
import com.unicauca.larutag.util.Data
import kotlinx.android.synthetic.main.fragment_blank.*
class BlankFragment : Fragment() {

    val adapter:DestinoAdapter = DestinoAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_blank,container, false)
    }

    override fun onResume() {
        super.onResume()
        list.adapter = adapter
        list.layoutManager = LinearLayoutManager(activity)
        //En este momento asociamos los datos:
        adapter.data = Data.destinos
    }

    companion object {
        fun instance(): BlankFragment = BlankFragment()
    }
}
