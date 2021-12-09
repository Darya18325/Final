package com.example.afinal

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_calculator.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception


class calculator : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater , container: ViewGroup? ,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calculator , container , false)

        view.findViewById<Button>(R.id.button_0).setOnClickListener{this
                input.text = addToInputText("0")}

        view.findViewById<Button>(R.id.button_clear).setOnClickListener{this
            input.text = ""
            output.text = ""}

        view.findViewById<Button>(R.id.button_bracket_left).setOnClickListener{this
            input.text = addToInputText(")")}

        view.findViewById<Button>(R.id.button_bracket_right).setOnClickListener{this
            input.text = addToInputText("(")}

        view.findViewById<Button>(R.id.button_1).setOnClickListener{this
            input.text = addToInputText("1")}

        view.findViewById<Button>(R.id.button_2).setOnClickListener{this
            input.text = addToInputText("2")}

        view.findViewById<Button>(R.id.button_3).setOnClickListener{this
            input.text = addToInputText("3")}

        view.findViewById<Button>(R.id.button_4).setOnClickListener{this
            input.text = addToInputText("4")}

        view.findViewById<Button>(R.id.button_5).setOnClickListener{this
            input.text = addToInputText("5")}

        view.findViewById<Button>(R.id.button_6).setOnClickListener{this
            input.text = addToInputText("6")}

        view.findViewById<Button>(R.id.button_7).setOnClickListener{this
            input.text = addToInputText("7")}

        view.findViewById<Button>(R.id.button_8).setOnClickListener{this
            input.text = addToInputText("8")}

        view.findViewById<Button>(R.id.button_9).setOnClickListener{this
            input.text = addToInputText("9")}

        view.findViewById<Button>(R.id.button_dot).setOnClickListener{this
            input.text = addToInputText(".")}


        view.findViewById<Button>(R.id.button_division).setOnClickListener{this
            input.text = addToInputText("÷")}

        view.findViewById<Button>(R.id.button_multiply).setOnClickListener{this
            input.text = addToInputText("×")}

        view.findViewById<Button>(R.id.button_subtraction).setOnClickListener{this
            input.text = addToInputText("-")}

        view.findViewById<Button>(R.id.button_addition).setOnClickListener{this
            input.text = addToInputText("+")}

        view.findViewById<Button>(R.id.button_equals).setOnClickListener{this
            showResult()}



        return view


    }
    private fun addToInputText(buttonValue: String): String {
        return "${input.text}$buttonValue"
    }

    private fun getInputExpression(): String {
        var expression = input.text.replace(Regex("÷") , "/")
        expression = expression.replace(Regex("×") , "*")
        return expression
    }

    private fun showResult() {
        try {
            val ex = ExpressionBuilder(input.text.toString()).build()
            val result = ex.evaluate()
            val longRes = result.toLong()
            if (result == longRes.toDouble())
                output.text = longRes.toString()
            else
                output.text = result.toString()

        } catch (e: Exception) {
            Log.d("Error", "messege:${e.message}")
        }


    }
}








