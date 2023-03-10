package com.example.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import java.time.Instant
import java.util.*


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //On navigue vers le nouveau fragment
        view.findViewById<Button>(R.id.buttonToDetail).setOnClickListener {
            val direction = HomeFragmentDirections
                .actionHomeFragmentToDetailFragment(
                    User("Doe","john", Date(),"aaa@aaa.fr")
                )
            Navigation.findNavController(view)
                .navigate(direction)
        }

    }
}










