package com.example.fortunetoday

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val sentences = listOf(
        "큰 행운과 기쁨이 찾아 올 거에요",
        "풀리지 않던 진실이 곧 밝혀질 것입니다",
        "예상치 못한 기회가 당신을 성공으로 이끌 것입니다",
        "앞으로 어려운 결정을 준비하세요",
        "당신의 노력은 곧 놀라운 방식으로 성과를 거둘 것입니다",
        "일시적인 좌절은 당신의 결심을 시험할 것입니다",
        "긍정적인 변화가 곧 다가오고 있습니다",
        "거짓 약속과 숨겨진 의도를 조심하세요",
        "새로운 우정은 당신의 삶을 풍요롭게 해줄 것입니다",
        "예기치 못한 장애물이 당신의 계획을 방해할 수도 있습니다"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val button: Button = findViewById(R.id.button)
        val textView: TextView = findViewById(R.id.textView)

        button.setOnClickListener {
            // Pick a random sentence from the list
            val randomSentence = sentences.random()
            // Display the sentence in the TextView
            textView.text = randomSentence
        }
    }
}