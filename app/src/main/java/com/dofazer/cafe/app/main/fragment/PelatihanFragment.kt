package com.dofazer.cafe.app.main.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dofazer.cafe.R

class PelatihanFragment : Fragment() {

    companion object{
        fun newInstance() = PelatihanFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pelatihan, container, false)
    }

}
