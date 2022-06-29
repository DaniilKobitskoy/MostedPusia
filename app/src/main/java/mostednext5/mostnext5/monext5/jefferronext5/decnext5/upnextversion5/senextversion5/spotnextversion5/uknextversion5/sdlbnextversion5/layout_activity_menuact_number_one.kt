package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import apps.winline.fonbet.fon.bet.fonbet.ru.sport.pinup.pin.databinding.ActivityMenuactivitysecBinding

class layout_activity_menuact_number_one : AppCompatActivity() {
    lateinit var binding: ActivityMenuactivitysecBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuactivitysecBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.cardrazdel1.setOnClickListener{
            (binding.cardrazdel1.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel2.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie1.visibility= View.VISIBLE
            binding.socritie2.visibility= View.GONE
            binding.buttonOpen1.visibility= View.VISIBLE
            binding.buttonOpen2.visibility= View.GONE
        }
        binding.cardrazdel2.setOnClickListener{
            (binding.cardrazdel2.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel1.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie1.visibility= View.GONE
            binding.socritie2.visibility= View.VISIBLE
            binding.buttonOpen1.visibility= View.GONE
            binding.buttonOpen2.visibility= View.VISIBLE

        }
        binding.cardrazdel3.setOnClickListener{
            (binding.cardrazdel3.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel4.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie3.visibility= View.VISIBLE
            binding.socritie4.visibility= View.GONE
            binding.buttonOpen3.visibility= View.VISIBLE
            binding.buttonOpen4.visibility= View.GONE
        }
        binding.cardrazdel4.setOnClickListener{
            (binding.cardrazdel4.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel3.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie3.visibility= View.GONE
            binding.socritie4.visibility= View.VISIBLE
            binding.buttonOpen3.visibility= View.GONE
            binding.buttonOpen4.visibility= View.VISIBLE

        }
        binding.cardrazdel5.setOnClickListener{
            (binding.cardrazdel5.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel6.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie5.visibility= View.VISIBLE
            binding.socritie6.visibility= View.GONE
            binding.buttonOpen5.visibility= View.VISIBLE
            binding.buttonOpen6.visibility= View.GONE
        }
        binding.cardrazdel6.setOnClickListener{
            (binding.cardrazdel6.layoutParams as LinearLayout.LayoutParams).weight=2f
            (binding.cardrazdel5.layoutParams as LinearLayout.LayoutParams).weight=1f
            binding.socritie5.visibility= View.GONE
            binding.socritie6.visibility= View.VISIBLE
            binding.buttonOpen5.visibility= View.GONE
            binding.buttonOpen6.visibility= View.VISIBLE

        }
        binding.buttonOpen1.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one, layout_activity_calculator_number_one::class.java)
            intent.putExtra("position", 1)
            startActivity(intent)
        }
        binding.buttonOpen2.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one,layout_activity_listening_number_one::class.java)
            intent.putExtra("position", 2)
            startActivity(intent)
        }
        binding.buttonOpen3.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one,layout_activity_listening_number_one::class.java)
            intent.putExtra("position", 3)
            startActivity(intent)
        }
        binding.buttonOpen4.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one,layout_activity_listening_number_one::class.java)
            intent.putExtra("position", 4)
            startActivity(intent)
        }
        binding.buttonOpen5.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one,layout_activity_listening_number_one::class.java)
            intent.putExtra("position", 5)
            startActivity(intent)
        }
        binding.buttonOpen6.setOnClickListener {
            val intent = Intent(this@layout_activity_menuact_number_one,layout_activity_listening_number_one::class.java)
            intent.putExtra("position", 6)
            startActivity(intent)
        }
    }
}