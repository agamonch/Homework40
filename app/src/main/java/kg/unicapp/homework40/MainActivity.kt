package kg.unicapp.homework40

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val transaction = supportFragmentManager.beginTransaction()

        when (item.itemId) {
            R.id.fragment1ID -> transaction.run {
                replace(R.id.container, FragmentA(), FragmentA.TAG)
                addToBackStack(null)
                commit()

            }
            R.id.fragment2ID -> transaction.run {
                replace(R.id.container2, FragmentB(), FragmentB.TAG)
                addToBackStack(null)
                commit()
            }
            R.id.fragment3ID -> transaction.run {
                replace(R.id.container3, FragmentC(), FragmentC.TAG)
                addToBackStack(null)
                commit()
            }
            R.id.close_app -> finish()

        }
        return true

    }
}