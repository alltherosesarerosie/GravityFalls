package com.geektech.gravityfalls
import com.geektech.gravityfalls.Character

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.geektech.gravityfalls.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding:FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val character = arguments?.getSerializable(FirstFragment.CHARACTER) as Character
        binding.apply {
//            Glide.with(imgIv2).load(character.img).into(imgIv2)

            nameTv2.text = character.name
            ageTv2.text = character.age

        }

    }

}