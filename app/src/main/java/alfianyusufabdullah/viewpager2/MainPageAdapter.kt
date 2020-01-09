package alfianyusufabdullah.viewpager2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainPageAdapter(fragmentManager: FragmentActivity) : FragmentStateAdapter(fragmentManager) {

    private val pages = mutableListOf<Fragment>()

    fun addPage(page: Fragment) {
        pages.add(page)
    }

    override fun getItemCount() = pages.size

    override fun createFragment(position: Int) = pages[position]
}