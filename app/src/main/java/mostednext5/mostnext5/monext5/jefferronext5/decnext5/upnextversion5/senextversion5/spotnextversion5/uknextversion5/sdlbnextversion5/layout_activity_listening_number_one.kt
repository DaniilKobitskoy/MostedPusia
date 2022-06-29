package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import apps.liga.bk.winline.fonbet.liga.stavok.ligastavok.olimp.bet.databinding.ActivityListeningversion5Binding
import mostednext5.jecaa.most.fragments.layout_number2_fragment
import mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.adapters.*
import mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.fragments.*

class layout_activity_listening_number_one : AppCompatActivity() {
    lateinit var adaptVersionNamber9: adaptVersionNamber9
    lateinit var adaptVersionNamber9_2: adaptVersionNamber9_2
    lateinit var adaptVersionNamber9_3: adaptVersionNamber9_3
    lateinit var adaptVersionNamber9_4: adaptVersionNamber9_4
    lateinit var adaptVersionNamber9_5: adaptVersionNamber9_5
    lateinit var adaptVersionNamber9_6: adaptVersionNamber9_6
    lateinit var binding: ActivityListeningversion5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityListeningversion5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val pos = intent.getIntExtra("position", 0)
        when (pos) {
            1 -> {
                val array = ArrayList<Fragment>()
                array.add(layout_number1_fragment())
                array.add(layout_number2_fragment())
                adaptVersionNamber9 = adaptVersionNamber9(array, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)
            }
            2 -> {
                val array2 = ArrayList<Fragment>()
                array2.add(layout_number3_fragment())
                array2.add(layout_number4_fragment())
                adaptVersionNamber9_2 = adaptVersionNamber9_2(array2, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9_2
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)
            }
            3 -> {
                val array3 = ArrayList<Fragment>()
                array3.add(layout_number5_fragment())
                array3.add(layout_number6_fragment())
                adaptVersionNamber9_3 = adaptVersionNamber9_3(array3, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9_3
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)
            }
            4 -> {
                val array4 = ArrayList<Fragment>()
                array4.add(layout_number7_fragment())
                val add = array4.add(layout_number8_fragment())
                adaptVersionNamber9_4 = adaptVersionNamber9_4(array4, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9_4
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)

            }
            5 -> {
                val array5 = ArrayList<Fragment>()
                array5.add(layout_number9_fragment())
                array5.add(layout_number10_fragment())
                adaptVersionNamber9_5 = adaptVersionNamber9_5(array5, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9_5
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)

            }
            6 -> {
                val array6 = ArrayList<Fragment>()
                array6.add(layout_number11_fragment())
                array6.add(layout_number12_fragment())
                adaptVersionNamber9_6 = adaptVersionNamber9_6(array6, supportFragmentManager)
                binding.PlayerPadewView.adapter = adaptVersionNamber9_6
                binding.tabbarLayout.setupWithViewPager(binding.PlayerPadewView)

            }
        }
        main()
    }

    private fun main() {
        val cal = 3
        val call = 4
        val rezultat = call-cal
    }
}