package com.example.afinal

import android.content.Intent
import android.net.Uri
import android.net.UrlQuerySanitizer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfoFragment : Fragment() {
lateinit var developersRecyclerView: RecyclerView
lateinit var showWebSiteButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view= inflater.inflate(R.layout.fragment_info, container, false)

        val developersName:List<String> = listOf("Darya", "Darya1")

showWebSiteButton=view.findViewById(R.id.web)
        developersRecyclerView=view.findViewById(R.id.developer_recycler_view)
        developersRecyclerView.layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        developersRecyclerView.adapter=DeveloperAdapter(developersName)
        showWebSiteButton.setOnClickListener{
            val link=Uri.parse("https://www.google.com/")
val intent=Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)
        }


        return view

    }

}