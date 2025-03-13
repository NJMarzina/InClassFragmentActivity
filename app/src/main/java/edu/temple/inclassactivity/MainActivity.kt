package edu.temple.inclassactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch images into IntArray called imageArray
        val typedArray = resources.obtainTypedArray(R.array.image_ids)
        val imageArray = IntArray(typedArray.length()) {typedArray.getResourceId(it, 0)}
        typedArray.recycle()

        // Attach an instance of ImageDisplayFragment using factory method

        val images_array = intArrayOf (
            R.drawable.ccf_caramelapple,
            R.drawable.ccf_celebration,
            R.drawable.ccf_chocolatecaramelicious
        )

        val fragment1 = ImageDisplayFragment.newInstance(imageArray)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView2, fragment1).commit()
    }
}