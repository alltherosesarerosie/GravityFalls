package com.geektech.gravityfalls

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.geektech.gravityfalls.Character
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.geektech.gravityfalls.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var character: ArrayList<Character> = ArrayList()
    companion object{
        const val CHARACTER = "CHAR"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val adapter = CharacterAdapter(character, this::onClick)
        binding.charRv.adapter = adapter
    }

    private fun onClick(position: Int){
        var charactrr = Character(character[position].name, character[position].age, character[position].img)
        findNavController().navigate(R.id.secondFragment, bundleOf(CHARACTER to charactrr))




//    val bundle = Bundle()
//    bundle.putString("img", songs[position].title.toString())
//    bundle.putString("title", songs[position].title.toString())
//    bundle.putString("artist",songs[position].artist.toString())
//    val secondFragment = SecondFragment()
//    val fragmentTransaction: FragmentTransaction =
//        activity?.supportFragmentManager?.beginTransaction()!!
//    bundle.putString("key", "value") // use as per your need
//
//    secondFragment.setArguments(bundle)
//    fragmentTransaction.addToBackStack(null)
//    fragmentTransaction.replace(R.id.fragment_container, secondFragment)
//    fragmentTransaction.commit()
    }



    private fun loadData() {
        character.add(Character("Bill Cipher", "1500", "https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Mabel Pines","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Dipper Pines","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Grunkle Stan","56","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Grunkle Ford","56","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Soos","28","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Wendy","16","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Pacifica","14","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Waddles","1","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Candy Chiu","13","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
        character.add(Character("Grenda","14","https://images.squarespace-cdn.com/content/v1/59a1884ca803bb46c7993ddc/1504372132594-WGT166AOUNGIKXJRIOT0/GravityFalls.jpg"))
    }


}