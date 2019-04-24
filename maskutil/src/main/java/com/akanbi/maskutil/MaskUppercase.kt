package com.akanbi.maskutil

class MaskUppercase : MaskUtilAbstract(MaskTypes.UPPERCASE) {

    override fun mask(valueForMask: String): String {
        if (valueForMask.isEmpty())
            return ""

        return valueForMask.toUpperCase()
    }

}