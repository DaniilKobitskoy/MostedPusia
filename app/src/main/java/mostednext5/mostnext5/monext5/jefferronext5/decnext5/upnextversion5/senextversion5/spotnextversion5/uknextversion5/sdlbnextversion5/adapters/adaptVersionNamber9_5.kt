package mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.fragments.layout_number9_fragment
import mostednext5.mostnext5.monext5.jefferronext5.decnext5.upnextversion5.senextversion5.spotnextversion5.uknextversion5.sdlbnextversion5.fragments.layout_number10_fragment

class adaptVersionNamber9_5 (var arraymostedversion6: ArrayList<Fragment>, fragmentManageradaptersVersions6: FragmentManager)
    : FragmentPagerAdapter(fragmentManageradaptersVersions6, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int = 2

    override fun getItem(posadapterversion6: Int): Fragment {
        return when (posadapterversion6) {
            0 -> layout_number9_fragment()
            1 -> layout_number10_fragment()
            else -> layout_number9_fragment()

        }
    }
}