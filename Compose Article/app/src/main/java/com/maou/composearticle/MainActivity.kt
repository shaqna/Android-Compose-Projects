package com.maou.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maou.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        firstText = stringResource(id = R.string.first_text),
                        secondText = stringResource(id = R.string.second_text),
                        thirdText = stringResource(id = R.string.third_text),
                        image = painterResource(id = R.drawable.bg_compose_background)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(
    firstText: String,
    secondText: String,
    thirdText: String,
    image: Painter,
    modifier: Modifier = Modifier
) {
    Column {
        Image(painter = image, contentDescription = null)
        Text(text = firstText, fontSize = 24.sp, modifier = modifier.padding(16.dp))
        Text(
            text = secondText,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = thirdText,
            modifier = modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {
        Article(
            firstText = stringResource(id = R.string.first_text),
            secondText = stringResource(id = R.string.second_text),
            thirdText = stringResource(id = R.string.third_text),
            image = painterResource(id = R.drawable.bg_compose_background)
        )
    }
}