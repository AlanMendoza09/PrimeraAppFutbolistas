package com.example.futbol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_futbolista.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [FutbolistaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FutbolistaFragment : Fragment() {
    private val args by navArgs<FutbolistaFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_futbolista, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        fotoFutbolista.setImageResource(args.futbolista.picture)
        name.text = args.futbolista.name
        description.text = args.futbolista.description
        Toast.makeText(getContext(), args.futbolista.fraseFutbolista, Toast.LENGTH_SHORT).show();
    }
}