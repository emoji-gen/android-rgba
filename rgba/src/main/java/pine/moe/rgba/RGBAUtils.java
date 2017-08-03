package pine.moe.rgba;

import android.graphics.Color;
import android.support.annotation.NonNull;

/**
 * Created by pine on 2017/08/04.
 */

public class RGBAUtils {
    public static int RGBAToColor(@NonNull String rgba) {
        if (rgba.isEmpty()) {
            throw new IllegalArgumentException("empty string not allowed");
        }

        int pos = rgba.charAt(0) == '#' ? 1 : 0;
        if (rgba.length() - pos == 4) {
            int red = Integer.valueOf(rgba.substring(pos, pos + 1), 16);
            int green = Integer.valueOf(rgba.substring(pos + 1, pos + 2), 16);
            int blue = Integer.valueOf(rgba.substring(pos + 2, pos + 3), 16);
            int alpha = Integer.valueOf(rgba.substring(pos + 3, pos + 4), 16);
            return Color.argb(alpha, red, green, blue);
        }
        if (rgba.length() - pos == 8) {
            int red = Integer.valueOf(rgba.substring(pos, pos + 2), 16);
            int green = Integer.valueOf(rgba.substring(pos + 2, pos + 4), 16);
            int blue = Integer.valueOf(rgba.substring(pos + 4, pos + 6), 16);
            int alpha = Integer.valueOf(rgba.substring(pos + 6), 16);
            return Color.argb(alpha, red, green, blue);
        }

        throw new IllegalArgumentException("string length should be 4, 5, 8 or 9");
    }
}
