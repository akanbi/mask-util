package com.akanbi.maskutil

class MaskLowercase : MaskUtilAbstract(MaskTypes.LOWERCASE) {

    override fun mask(valueForMask: String): String {
        if (valueForMask.isEmpty())
            return ""

        return valueForMask.toLowerCase()
    }
}