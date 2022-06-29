package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import apps.winline.fonbet.fon.bet.fonbet.ru.sport.pinup.pin.R


class layout_number6_fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment6, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        option()

    }

    private fun option() {
        val num1 = 1
        val num2 = 2
        val res= num1 * num2
    }

}