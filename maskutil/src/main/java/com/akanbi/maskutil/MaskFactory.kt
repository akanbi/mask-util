package com.akanbi.maskutil

class MaskFactory {

    fun get(type: MaskTypes): MaskUtilAbstract? {
        when(type) {
            MaskTypes.CNPJ -> return MaskCNPJ()
            MaskTypes.CPF -> return MaskCPF()
            MaskTypes.UPPERCASE -> return MaskUppercase()
            MaskTypes.LOWERCASE -> return MaskLowercase()
            MaskTypes.PHONE_TEN_DIGITS -> return MaskPhoneTenDigits()
            MaskTypes.PHONE_ELEVEN_DIGITS -> return MaskPhoneElevenDigits()
        }
    }

}