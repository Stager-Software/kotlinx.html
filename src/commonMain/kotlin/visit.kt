package kotlinx.html

inline fun <T : Tag> T.visitTag(block: T.() -> Unit) {
    consumer.onTagStart(this)
    this.block()
    // removed the exception handling, hoping to speed up compilation of DSL code
    consumer.onTagEnd(this)
}

inline fun <T : Tag, R> T.visitTagAndFinalize(consumer: TagConsumer<R>, block: T.() -> Unit): R {
    if (this.consumer !== consumer) {
        throw IllegalArgumentException("Wrong exception")
    }

    visitTag(block)
    return consumer.finalize()
}
