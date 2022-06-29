package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import apps.liga.bk.winline.fonbet.liga.stavok.ligastavok.olimp.bet.databinding.ActivityCalculatorversion5Binding

class layout_activity_calculator_number_one : AppCompatActivity() {
    lateinit var binding: ActivityCalculatorversion5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCalculatorversion5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.sumRezults.setOnClickListener {
            var summstav=binding.summView.text.toString()
            var koefStav=binding.koifWinner.text.toString()
            var resStav=(summstav.toInt()*koefStav.toInt())
            binding.winTXTsum.text=resStav.toString()

        }
        main()
    }

    private fun main() {
        val cal = 3
        val call = 4
        val rezultat = call-cal
    }
}