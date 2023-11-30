import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.configureWebResources
import org.jetbrains.compose.resources.urlResource

@OptIn(ExperimentalResourceApi::class, ExperimentalComposeUiApi::class)
fun main() {
    configureWebResources {
        setResourceFactory {
            urlResource("./$it")
        }
    }
    CanvasBasedWindow(title = "LoveHut", canvasElementId = "lovehutCanvas") {
        App()
    }
}
