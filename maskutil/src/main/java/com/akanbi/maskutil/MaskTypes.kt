package com.akanbi.maskutil

enum class MaskTypes(val format: String) {
    CNPJ("##.###.###/####-##"),
    CPF("###.###.###-##"),
    PHONE_TEN_DIGITS("(##) ####-####"),
    PHONE_ELEVEN_DIGITS("(##) #####-####"),
    UPPERCASE(""),
    LOWERCASE("");
}