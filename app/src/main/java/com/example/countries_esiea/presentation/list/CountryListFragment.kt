package com.example.countries_esiea.presentation.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.countries_esiea.R

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class CountryListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private val adapter = CountryAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R. layout.fragment_country_list,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView= view.findViewById(R.id.country_recyclerview)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter

        val countList : ArrayList<Country> = arrayListOf<Country>().apply{
            add(Country("France"))
            add(Country("Germany"))
            add(Country("China"))
            add(Country("Japan"))
            add(Country("England"))
            add(Country("Italy"))
            add(Country("Portugal"))
        }

        adapter.updateList(countList)

    }
}