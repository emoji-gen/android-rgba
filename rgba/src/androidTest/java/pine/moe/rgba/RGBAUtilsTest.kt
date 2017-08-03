package pine.moe.rgba


import android.graphics.Color
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import pine.moe.rgba.RGBAUtils.RGBAToColor


@RunWith(AndroidJUnit4::class)
class RGBAUtilsTest {
    @Test
    fun testRGBAToColor() {
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000000ff"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("ff000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("00ff0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("0000ff00"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000000FF"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("FF000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("00FF0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("0000FF00"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("#00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("#000000ff"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("#ff000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("#00ff0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("#0000ff00"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("#00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("#000000FF"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("#FF000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("#00FF0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("#0000FF00"))
    }
}
