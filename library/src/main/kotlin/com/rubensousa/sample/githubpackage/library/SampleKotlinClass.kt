package com.rubensousa.sample.githubpackage.library

/**
 * Kotlin documentation sample.
 *
 * Unlike [SampleJavaClass], this is a Kotlin class with kdocs
 *
 * @param value some random value
 */
data class SampleKotlinClass(val value: Int) {

    /**
     * @return the modulo of [value]
     */
    fun getPositiveValue(): Int {
        return Math.abs(value)
    }
}