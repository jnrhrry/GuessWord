package com.januar.guessword

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

data class Quiz(var question: String, var correctAnswer: String)

class Data{
    companion object{
        val getData: List<Quiz>
        get() {
            return listOf(
                Quiz("Idol Group paling laku saat ini", "BTS"),
                Quiz("Salah satu sistem operasi ponsel", "android"),
                Quiz("Badan Antariksa Amerika", "nasa"),
                Quiz("Ibukota Kanada", "ottawa"),
                Quiz("Situs berbagi konten video", "youtube"),
                Quiz("Jalan pikiran yang masuk akal", "logika"),
                Quiz("Alat yang berbunyi saat mobil akan dicuri", "alarm"),
                Quiz("Kota di Jerman", "Köln"),
                Quiz("Sayuran hijau", "pakcoi"),
                Quiz("punten", "mangga"),
                Quiz("Karangan seseorang yang belum diterbitkan", "naskah"),
                Quiz("Makanan pokok dari sagu", "papeda"),
                Quiz("Danau terbesar di Mongolia", "khövsgöl"),
                Quiz("Sungai paling kaya", "amazon"),
                Quiz("Nama negara di asia", "kazakhstan"),
                Quiz("Permukaan yang dapat membuat tergelincir", "jidat"),
                Quiz("Kain penutup baju yang dipakai saat memasak", "apron"),
                Quiz("Berasal dari masa lampau tapi tak ketinggalan zaman", "klasik"),
                Quiz("Vibrate everywhere", "kyuhyun"),
                Quiz("Tan", "malaka"),
                Quiz("Ruang yang dipakai untuk menyiarkan siaran televisi", "studio"),
                Quiz("Anime paling bagus", "naruto"),
                Quiz("Cerita berdialog dalam pertunjukan teater", "drama"),
                Quiz("Nama negara di Oceania", "samoa"),
                Quiz("Kota di Italia", "milan"),
                Quiz("Penyanyi paling bagus suaranya di Korea", "Ailee"),
                Quiz("Gunung tertinggi di Oceania", "wilhelm"),
                Quiz("Sistem jalur yang rumit, berliku, banyak jalan buntu", "labirin")
            )
        }
    }
}

fun Context.showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

fun AppCompatActivity.showAlertDialog(counter: Int, onReset: () -> Unit){
    AlertDialog.Builder(this).apply {
        setTitle("Quiz Finished")
        setMessage("You successfully completed the quiz by $counter trials")
        setCancelable(false)
        setPositiveButton("PLAY AGAIN"){_, _ -> onReset()}
        setNegativeButton("QUIT") {_, _ -> finish()}
    }.create().show()
}