package com.akanbi.maskutil

object MaskUtil {

    fun maskContent(type: MaskTypes, valueForMask: String): String {
        val maskUtil = MaskFactory().get(type)
        return maskUtil!!.mask(valueForMask);
    }

    fun unmask(value: String): String {
        return value.replace("[.]".toRegex(), "").replace("[-]".toRegex(), "")
            .replace("[/]".toRegex(), "").replace("[(]".toRegex(), "")
            .replace("[)]".toRegex(), "").replace("[ ]".toRegex(), "");
    }

}