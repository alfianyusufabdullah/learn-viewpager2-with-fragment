package alfianyusufabdullah.viewpager2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPageFragment.MainPageListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainPageAdapter = MainPageAdapter(this)
        mainPageAdapter.addPage(MainPageFragment.createInstance("Page 1"))
        mainPageAdapter.addPage(MainPageFragment.createInstance("Page 2"))
        mainPageAdapter.addPage(MainPageFragment.createInstance("Page 3"))

        mainViewPager.adapter = mainPageAdapter
    }

    override fun onPageChange() {
        if (mainViewPager.orientation == ViewPager2.ORIENTATION_VERTICAL) {
            mainViewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        } else {
            mainViewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        }
    }
}
