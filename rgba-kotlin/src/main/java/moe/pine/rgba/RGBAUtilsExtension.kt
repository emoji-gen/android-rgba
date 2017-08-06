@file:JvmName("RGBAUtilsExtension")

package moe.pine.rgba

import pine.moe.rgba.RGBAUtils

fun String.toColor() = RGBAUtils.RGBAToColor(this)

fun Int.toRGBA() = RGBAUtils.colorToRGBA(this)