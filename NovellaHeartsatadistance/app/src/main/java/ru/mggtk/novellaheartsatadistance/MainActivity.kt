package ru.mggtk.novellaheartsatadistance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var count = 1
    var count1 = 0
    var count11 = 0
    var count12 = 0
    var count2 = 0
    fun btnClick(view: View) {

        val background: ImageView = findViewById(R.id.imageView1)
        val imageView: ImageView = findViewById(R.id.imageView2)
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)
        val imageView2: ImageView = findViewById(R.id.imageView3)
        val textView3: TextView = findViewById(R.id.textView3)
        val btnAct1: Button = findViewById(R.id.button4)
        val btnAct2: Button = findViewById(R.id.button5)

        when(count){
            1 -> {
                count += 1
                imageView.visibility = View.VISIBLE
                textView1.visibility = View.GONE
                textView2.setText(R.string.text1)
                textView2.visibility = View.VISIBLE
                background.setBackgroundResource(R.drawable.background1)
            }
            2 -> {
                count += 1
                textView2.setText(R.string.text2)
            }
            3 -> {
                count +=1
                textView2.setText(R.string.text3)
            }
            4 -> {
                count +=1
                textView2.setText(R.string.text4)
            }
            5 -> {
                count +=1
                textView2.setText(R.string.text5)
            }
            6 -> {
                background.setBackgroundResource(R.drawable.boy)
                count +=1
                textView2.setText(R.string.text6)
            }
            7 -> {
                count +=1
                imageView2.visibility = View.VISIBLE
                textView3.visibility = View.VISIBLE
                textView3.setText(R.string.name1)
                textView2.setText(R.string.text7)
            }
            8 ->{
                count +=1
                textView3.setText(R.string.name2)
                textView2.setText(R.string.text8)
            }
            9 ->{
                count +=1
                btnAct1.visibility = View.VISIBLE
                btnAct1.setText(R.string.action1)


                btnAct1.setOnClickListener{
                    count1 = 1
                    background.setBackgroundResource(R.drawable.background1)
                    btnAct1.visibility = View.GONE
                    btnAct2.visibility = View.GONE
                    textView3.setText(R.string.name3)
                    textView2.setText(R.string.text1A1)
                    when (count1){
                        1->{
                            textView3.setText(R.string.name2)
                            textView2.setText(R.string.text2A1)

                            btnAct1.visibility = View.VISIBLE
                            btnAct1.setText(R.string.action1A11)
                            btnAct2.visibility = View.VISIBLE
                            btnAct2.setText(R.string.action1A12)

                            btnAct1.setOnClickListener{
                                count11 = 1
                                background.setBackgroundResource(R.drawable.bg)
                                btnAct1.visibility = View.GONE
                                btnAct2.visibility = View.GONE
                                textView3.setText(R.string.name3)
                                textView2.setText(R.string.text1A1)
                                when (count11){
                                    1->{
                                        textView3.setText(R.string.name3)
                                        textView2.setText(R.string.text1A11)

                                        background.setBackgroundResource(R.drawable.bg1)
                                        btnAct1.visibility = View.GONE
                                        btnAct2.visibility = View.GONE
                                    }
                                }
                            }

                            btnAct2.setOnClickListener{
                                count12 = 1
                                background.setBackgroundResource(R.drawable.bg)
                                btnAct1.visibility = View.GONE
                                btnAct2.visibility = View.GONE
                                textView3.setText(R.string.name3)
                                textView2.setText(R.string.text1A11)
                                when (count12){
                                    1->{
                                        textView3.setText(R.string.name3)
                                        textView2.setText(R.string.text1A12)

                                        background.setBackgroundResource(R.drawable.bg)
                                        btnAct1.visibility = View.GONE
                                        btnAct2.visibility = View.GONE
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}