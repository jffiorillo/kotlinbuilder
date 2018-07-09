package com.masabi.kotlin

import org.kotlin.annotationProcessor.JvmBuilder

@JvmBuilder
data class Param1Int(val param1: Int)

@JvmBuilder
data class Param2Int(val param1: Int, val param2: Int)

@JvmBuilder
data class Param9Int(val param1: Int, val param2: Int, val param3: Int, val param4: Int, val param5: Int, val param6: Int, val param7: Int, val param8: Int, val param9: Int)

@JvmBuilder
data class Param1KotlinString(val param1: String)

@JvmBuilder
data class Param1NullableString(val nullableString: String?)

@JvmBuilder
data class NullableAndMandatoryMixed(val nullableString: String?, val nonNullableString: String)