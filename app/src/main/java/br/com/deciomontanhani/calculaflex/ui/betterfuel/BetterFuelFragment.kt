package br.com.deciomontanhani.calculaflex.ui.betterfuel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.deciomontanhani.calculaflex.R

/**
 * A simple [Fragment] subclass.
 */
class BetterFuelFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_better_fuel, container, false)
    }

}
