package guilherme26bc.com.github.android_helloworld

import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import guilherme26bc.com.github.android_helloworld.R.id.textViewMessage
import guilherme26bc.com.github.android_helloworld.ui.theme.Android_HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Referências para os componentes do layout binding
        val etName = findViewById<EditText>(R.id.etName)
        val tvHelloMessage =findViewById<TextView>(R.id.textHelloMessage)

        etName.setOnEditorActionListener{textView, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE){
             val name = textView.text.toString().trim()
             if(name.isNotEmpty()){
                 tvHelloMessage.text = "Hello World, $name!"
             }else{
                 tvHelloMessage.text = "HelloWorld"
             }
                true
            }else {
                false
            }
        }

        //Associação bidimensional com o XML
        setContentView(R.layout.activity_main)
    }
}