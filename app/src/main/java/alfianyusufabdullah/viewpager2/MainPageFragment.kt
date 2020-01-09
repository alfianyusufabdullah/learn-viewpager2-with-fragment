package alfianyusufabdullah.viewpager2

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainPageFragment private constructor() : Fragment() {

    private lateinit var mainPageListener: MainPageListener

    companion object {
        fun createInstance(args: String): MainPageFragment {
            val data = Bundle().apply { putString("ARGS", args) }
            return MainPageFragment().apply {
                arguments = data
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = arguments?.getString("ARGS")

        (view.findViewById<TextView>(R.id.itemTextMain)).text = data
        (view.findViewById<TextView>(R.id.itemChangeOrientation)).setOnClickListener {
            mainPageListener.onPageChange()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)

        mainPageListener = context as MainPageListener
    }

    interface MainPageListener {
        fun onPageChange()
    }
}