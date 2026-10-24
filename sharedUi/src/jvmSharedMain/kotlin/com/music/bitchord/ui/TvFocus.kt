import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester

@Composable
fun MainScreen() {
    val initialFocusRequester = remember { FocusRequester() }

    // Requests focus automatically as soon as the screen loads
    LaunchedEffect(Unit) {
        initialFocusRequester.requestFocus()
    }

    // Attach to your main interactive element (e.g., search bar or play button)
    IconButton(
        onClick = { /* action */ },
        modifier = Modifier
            .focusRequester(initialFocusRequester)
            .tvFocusable()
    ) {
        // Icon content
    }
}
