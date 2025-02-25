package guilherme26bc.com.github.android_helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Associa a Activity ao layout definido em activity_main.xml
        setContentView(R.layout.activity_main)
    }
}