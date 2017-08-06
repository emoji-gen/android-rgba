package pine.moe.rgba

import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import moe.pine.rgba.toColor
import moe.pine.rgba.toRGBA
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RGBAUtilsExtensionTest {
    @Test
    fun testToColor() {
        assertEquals(Color.argb(0xff, 0x01, 0x23, 0x45), "#012345FF".toColor())
    }

    @Test
    fun testToRGBA() {
        assertEquals("112233FF", Color.argb(0xff, 0x11, 0x22, 0x33).toRGBA())
    }
}
