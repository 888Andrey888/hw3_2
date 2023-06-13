package com.example.hw3_2a

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw3_2a.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private var counter = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.counter.text = counter.toString()

        initListener()
    }

    private fun initListener(){
        binding.btnPlus.setOnClickListener{
            counter++
            binding.counter.text = counter.toString()
        }

        binding.btnMinus.setOnClickListener{
            counter--
            binding.counter.text = counter.toString()
        }

        binding.btnToSecondFragment.setOnClickListener{
            val bundle = Bundle()
            bundle.putInt("Count", counter)
            val secondFragment = SecondFragment()
            secondFragment.arguments = bundle
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fl_container, secondFragment).addToBackStack(null).commit()
        }
    }
}