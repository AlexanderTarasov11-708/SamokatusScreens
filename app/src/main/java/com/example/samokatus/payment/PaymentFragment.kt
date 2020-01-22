package com.example.samokatus.payment

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.samokatus.MainActivity
import com.example.myapplication.R
import kotlinx.android.synthetic.main.fragment_pay_n_delivery.*

class PaymentFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.fragment_pay_n_delivery, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)
        (activity as MainActivity).setSupportActionBar(toolbar_payment)
        toolbar_payment.setNavigationOnClickListener{activity?.onBackPressed()}
        toolbar_payment.overflowIcon?.setTint(resources.getColor(R.color.black))
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        activity?.menuInflater?.inflate(R.menu.navigation,menu)
    }
}