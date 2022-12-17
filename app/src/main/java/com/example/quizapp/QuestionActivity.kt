package com.example.quizapp

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {

    private var name:String?=null
    private var score:Int=0
    private var currentPosition:Int=1
    private var questionList:ArrayList<QuestionData> ?=null
    private var selectedOption:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        name=intent.getStringExtra(setData.name)
        //setData.getQuestion()

        questionList=setData.getQuestion()
        setQuestion()

        opt1.setOnClickListener{
            selectedOptionStyle(opt1,1)
        }

        opt2.setOnClickListener{
            selectedOptionStyle(opt2,2)
        }

        opt3.setOnClickListener{
            selectedOptionStyle(opt3,3)
        }

        opt4.setOnClickListener{
            selectedOptionStyle(opt4,4)
        }

        submit.setOnClickListener{
            if(selectedOption!=0){
                val question=questionList!![currentPosition-1]

                if(selectedOption!=question.correct_ans){

                    setColor(selectedOption,R.drawable.wrong_quetion_option)

                }
                else{
                    score++
                }
                setColor(question.correct_ans, R.drawable.correct_quetion_option)
                 if(currentPosition==questionList!!.size){
                     submit.text="FINISH"
                 }
                else{
                    submit.text="GO TO NEXT"
                 }
            }
            else{
                currentPosition++
                when{
                    currentPosition<=questionList!!.size->{
                        setQuestion()
                    }
                    else->{
                        var intent=Intent(this,Result::class.java)
                        intent.putExtra(setData.name,name.toString())
                        intent.putExtra(setData.score,score.toString())
                        intent.putExtra("total size",questionList!!.size.toString())
                        startActivity(intent)
                        finish()
                    }
                }

            }
            selectedOption=0

        }


    }

    fun setColor(opt: Int,color:Int){

        when(opt){
            1->{
                opt1.background=ContextCompat.getDrawable(this,color)
            }
            2->{
                opt2.background=ContextCompat.getDrawable(this,color)
            }
            3->{
                opt3.background=ContextCompat.getDrawable(this,color)
            }
            4->{
                opt4.background=ContextCompat.getDrawable(this,color)
            }

        }

    }



    fun setQuestion(){
        val question = questionList!![currentPosition-1]
        setOptionStyle()
        progress_bar.progress=currentPosition
        progress_bar.max=questionList!!.size
        progress_text.text="${currentPosition}"+"/"+"${questionList!!.size}"
        question_text.text=question.question
        opt1.text=question.option_one
        opt2.text=question.option_two
        opt3.text=question.option_three
        opt4.text=question.option_four

    }

    fun setOptionStyle(){
        var optionList:ArrayList<TextView> = arrayListOf()
        optionList.add(0,opt1)
        optionList.add(1,opt2)
        optionList.add(2,opt3)
        optionList.add(3,opt4)

        for(op in optionList){
            op.setTextColor(Color.parseColor("#555151"))
            op.background=ContextCompat.getDrawable(this,R.drawable.quetion_option)
            op.typeface= Typeface.DEFAULT
        }
    }

    fun selectedOptionStyle(view:TextView,opt:Int){
        setOptionStyle()
        selectedOption=opt
        view.background=ContextCompat.getDrawable(this,R.drawable.selected_quetion_option)
        view.typeface=Typeface.DEFAULT_BOLD
        view.setTextColor(Color.parseColor("#000000"))
    }


}