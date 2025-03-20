package jp.ac.jec.cm0199.githubgeminicodeassistdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import jp.ac.jec.cm0199.githubgeminicodeassistdemo.ui.theme.GithubGeminiCodeAssistDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GithubGeminiCodeAssistDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
    companion object {
        // jp) 未使用の変数を追加することで、GithubのGemini Code Assistが機能するか確認する
        // en) Add an unused variable to check if Github's Gemini Code Assist works
        private const val TAG = "MainActivity"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // jp) 未使用の変数を追加することで、GithubのGemini Code Assistが機能するか確認する
    // en) Add an unused variable to check if Github's Gemini Code Assist works
                val text = "Hello $name!"
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GithubGeminiCodeAssistDemoTheme {
        Greeting("Android")
    }
}