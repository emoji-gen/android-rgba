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
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("0000"))
        assertEquals(Color.argb(0x11, 0x00, 0x00, 0x00), RGBAToColor("0001"))
        assertEquals(Color.argb(0x22, 0x00, 0x00, 0x00), RGBAToColor("0002"))
        assertEquals(Color.argb(0x33, 0x00, 0x00, 0x00), RGBAToColor("0003"))
        assertEquals(Color.argb(0x44, 0x00, 0x00, 0x00), RGBAToColor("0004"))
        assertEquals(Color.argb(0x55, 0x00, 0x00, 0x00), RGBAToColor("0005"))
        assertEquals(Color.argb(0x66, 0x00, 0x00, 0x00), RGBAToColor("0006"))
        assertEquals(Color.argb(0x77, 0x00, 0x00, 0x00), RGBAToColor("0007"))
        assertEquals(Color.argb(0x88, 0x00, 0x00, 0x00), RGBAToColor("0008"))
        assertEquals(Color.argb(0x99, 0x00, 0x00, 0x00), RGBAToColor("0009"))
        assertEquals(Color.argb(0xaa, 0x00, 0x00, 0x00), RGBAToColor("000a"))
        assertEquals(Color.argb(0xbb, 0x00, 0x00, 0x00), RGBAToColor("000b"))
        assertEquals(Color.argb(0xcc, 0x00, 0x00, 0x00), RGBAToColor("000c"))
        assertEquals(Color.argb(0xdd, 0x00, 0x00, 0x00), RGBAToColor("000d"))
        assertEquals(Color.argb(0xee, 0x00, 0x00, 0x00), RGBAToColor("000e"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000f"))

        assertEquals(Color.argb(0xaa, 0x00, 0x00, 0x00), RGBAToColor("000A"))
        assertEquals(Color.argb(0xbb, 0x00, 0x00, 0x00), RGBAToColor("000B"))
        assertEquals(Color.argb(0xcc, 0x00, 0x00, 0x00), RGBAToColor("000C"))
        assertEquals(Color.argb(0xdd, 0x00, 0x00, 0x00), RGBAToColor("000D"))
        assertEquals(Color.argb(0xee, 0x00, 0x00, 0x00), RGBAToColor("000E"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000F"))


        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000f"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("f000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("0f00"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("00f0"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000000ff"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("ff000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("00ff0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("0000ff00"))
        assertEquals(Color.argb(0xff, 0xff, 0xff, 0xff), RGBAToColor("ffffffff"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("000000FF"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("FF000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("00FF0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("0000FF00"))
        assertEquals(Color.argb(0xff, 0xff, 0xff, 0xff), RGBAToColor("FFFFFFFF"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("#00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("#000000ff"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("#ff000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("#00ff0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("#0000ff00"))
        assertEquals(Color.argb(0xff, 0xff, 0xff, 0xff), RGBAToColor("#ffffffff"))

        assertEquals(Color.argb(0x00, 0x00, 0x00, 0x00), RGBAToColor("#00000000"))
        assertEquals(Color.argb(0xff, 0x00, 0x00, 0x00), RGBAToColor("#000000FF"))
        assertEquals(Color.argb(0x00, 0xff, 0x00, 0x00), RGBAToColor("#FF000000"))
        assertEquals(Color.argb(0x00, 0x00, 0xff, 0x00), RGBAToColor("#00FF0000"))
        assertEquals(Color.argb(0x00, 0x00, 0x00, 0xff), RGBAToColor("#0000FF00"))
        assertEquals(Color.argb(0xff, 0xff, 0xff, 0xff), RGBAToColor("#FFFFFFFF"))
    }
}
