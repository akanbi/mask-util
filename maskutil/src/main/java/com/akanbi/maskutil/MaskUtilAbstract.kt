package com.akanbi.maskutil

import java.lang.StringBuilder

abstract class MaskUtilAbstract(val formatMaskType: MaskTypes) {

    open fun mask(valueForMask: String): String {
        if (valueForMask.isEmpty())
            return ""

        val valueMasked = maskedValueOfFormat(valueForMask)
        return valueMasked
    }

    private fun maskedValueOfFormat(valueForMask: String): String {
        var index = 0
        var valueBuilder = StringBuilder()
        formatMaskType.format.toCharArray().forEach {
            if (it != '#') {
                valueBuilder.append(it)
                return@forEach
            }
            valueBuilder.append(valueForMask[index])
            index++
        }
        return valueBuilder.toString()
    }

}