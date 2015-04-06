package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes) {
    var onAbort : String by attributeStringOnAbort
    var onLoadedMetaData : String by attributeStringOnLoadedMetaData
    var onScroll : String by attributeStringOnScroll
    var onSeeking : String by attributeStringOnSeeking
    var onLoad : String by attributeStringOnLoad
    var onDragStart : String by attributeStringOnDragStart
    var onInput : String by attributeStringOnInput
    var onTimeUpdate : String by attributeStringOnTimeUpdate
    var onShow : String by attributeStringOnShow
    var onClick : String by attributeStringOnClick
    var onFocus : String by attributeStringOnFocus
    var onStalled : String by attributeStringOnStalled
    var onProgress : String by attributeStringOnProgress
    var onVolumeChange : String by attributeStringOnVolumeChange
    var onCanPlay : String by attributeStringOnCanPlay
    var onContextMenu : String by attributeStringOnContextMenu
    var onError : String by attributeStringOnError
    var onFormChange : String by attributeStringOnFormChange
    var onSeeked : String by attributeStringOnSeeked
    var onLoadedData : String by attributeStringOnLoadedData
    var onDurationChange : String by attributeStringOnDurationChange
    var onMouseOver : String by attributeStringOnMouseOver
    var onMouseWheel : String by attributeStringOnMouseWheel
    var onDrag : String by attributeStringOnDrag
    var onDragLeave : String by attributeStringOnDragLeave
    var onPlaying : String by attributeStringOnPlaying
    var onFormInput : String by attributeStringOnFormInput
    var onKeyUp : String by attributeStringOnKeyUp
    var onRateChange : String by attributeStringOnRateChange
    var onKeyDown : String by attributeStringOnKeyDown
    var onMouseDown : String by attributeStringOnMouseDown
    var onChange : String by attributeStringOnChange
    var onKeyPress : String by attributeStringOnKeyPress
    var onDoubleClick : String by attributeStringOnDoubleClick
    var onReadyStateChange : String by attributeStringOnReadyStateChange
    var onDragEnter : String by attributeStringOnDragEnter
    var onWaiting : String by attributeStringOnWaiting
    var onPause : String by attributeStringOnPause
    var onEmptied : String by attributeStringOnEmptied
    var onSelect : String by attributeStringOnSelect
    var onLoadStart : String by attributeStringOnLoadStart
    var onDragOver : String by attributeStringOnDragOver
    var onSuspend : String by attributeStringOnSuspend
    var onMouseUp : String by attributeStringOnMouseUp
    var onMouseMove : String by attributeStringOnMouseMove
    var onMouseOut : String by attributeStringOnMouseOut
    var onPlay : String by attributeStringOnPlay
    var onCanPlayThrough : String by attributeStringOnCanPlayThrough
    var onEnded : String by attributeStringOnEnded
    var onBlur : String by attributeStringOnBlur
    var onDrop : String by attributeStringOnDrop
    var onInvalid : String by attributeStringOnInvalid
    var onSubmit : String by attributeStringOnSubmit

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes) {
    var value : String by attributeString
    var name : String by attributeString

}

public class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes) {
    var onAbort : String by attributeStringOnAbort
    var onLoadedMetaData : String by attributeStringOnLoadedMetaData
    var onScroll : String by attributeStringOnScroll
    var onSeeking : String by attributeStringOnSeeking
    var onLoad : String by attributeStringOnLoad
    var onDragStart : String by attributeStringOnDragStart
    var onInput : String by attributeStringOnInput
    var onTimeUpdate : String by attributeStringOnTimeUpdate
    var onShow : String by attributeStringOnShow
    var onClick : String by attributeStringOnClick
    var onFocus : String by attributeStringOnFocus
    var onStalled : String by attributeStringOnStalled
    var onProgress : String by attributeStringOnProgress
    var onVolumeChange : String by attributeStringOnVolumeChange
    var onCanPlay : String by attributeStringOnCanPlay
    var onContextMenu : String by attributeStringOnContextMenu
    var onError : String by attributeStringOnError
    var onFormChange : String by attributeStringOnFormChange
    var onSeeked : String by attributeStringOnSeeked
    var onLoadedData : String by attributeStringOnLoadedData
    var onDurationChange : String by attributeStringOnDurationChange
    var onMouseOver : String by attributeStringOnMouseOver
    var onMouseWheel : String by attributeStringOnMouseWheel
    var onDrag : String by attributeStringOnDrag
    var onDragLeave : String by attributeStringOnDragLeave
    var onPlaying : String by attributeStringOnPlaying
    var onFormInput : String by attributeStringOnFormInput
    var onKeyUp : String by attributeStringOnKeyUp
    var onRateChange : String by attributeStringOnRateChange
    var onKeyDown : String by attributeStringOnKeyDown
    var onMouseDown : String by attributeStringOnMouseDown
    var onChange : String by attributeStringOnChange
    var onKeyPress : String by attributeStringOnKeyPress
    var onDoubleClick : String by attributeStringOnDoubleClick
    var onReadyStateChange : String by attributeStringOnReadyStateChange
    var onDragEnter : String by attributeStringOnDragEnter
    var onWaiting : String by attributeStringOnWaiting
    var onPause : String by attributeStringOnPause
    var onEmptied : String by attributeStringOnEmptied
    var onSelect : String by attributeStringOnSelect
    var onLoadStart : String by attributeStringOnLoadStart
    var onDragOver : String by attributeStringOnDragOver
    var onSuspend : String by attributeStringOnSuspend
    var onMouseUp : String by attributeStringOnMouseUp
    var onMouseMove : String by attributeStringOnMouseMove
    var onMouseOut : String by attributeStringOnMouseOut
    var onPlay : String by attributeStringOnPlay
    var onCanPlayThrough : String by attributeStringOnCanPlayThrough
    var onEnded : String by attributeStringOnEnded
    var onBlur : String by attributeStringOnBlur
    var onDrop : String by attributeStringOnDrop
    var onInvalid : String by attributeStringOnInvalid
    var onSubmit : String by attributeStringOnSubmit

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes) {
    var onAbort : String by attributeStringOnAbort
    var onLoadedMetaData : String by attributeStringOnLoadedMetaData
    var onScroll : String by attributeStringOnScroll
    var onSeeking : String by attributeStringOnSeeking
    var onLoad : String by attributeStringOnLoad
    var onDragStart : String by attributeStringOnDragStart
    var onInput : String by attributeStringOnInput
    var onTimeUpdate : String by attributeStringOnTimeUpdate
    var onShow : String by attributeStringOnShow
    var onClick : String by attributeStringOnClick
    var max : String by attributeString
    var onFocus : String by attributeStringOnFocus
    var onStalled : String by attributeStringOnStalled
    var onProgress : String by attributeStringOnProgress
    var onVolumeChange : String by attributeStringOnVolumeChange
    var onCanPlay : String by attributeStringOnCanPlay
    var onContextMenu : String by attributeStringOnContextMenu
    var onError : String by attributeStringOnError
    var onFormChange : String by attributeStringOnFormChange
    var onSeeked : String by attributeStringOnSeeked
    var value : String by attributeString
    var onLoadedData : String by attributeStringOnLoadedData
    var onDurationChange : String by attributeStringOnDurationChange
    var onMouseOver : String by attributeStringOnMouseOver
    var onMouseWheel : String by attributeStringOnMouseWheel
    var onDrag : String by attributeStringOnDrag
    var onDragLeave : String by attributeStringOnDragLeave
    var onPlaying : String by attributeStringOnPlaying
    var onFormInput : String by attributeStringOnFormInput
    var onKeyUp : String by attributeStringOnKeyUp
    var onRateChange : String by attributeStringOnRateChange
    var onKeyDown : String by attributeStringOnKeyDown
    var onMouseDown : String by attributeStringOnMouseDown
    var onChange : String by attributeStringOnChange
    var onKeyPress : String by attributeStringOnKeyPress
    var onDoubleClick : String by attributeStringOnDoubleClick
    var onReadyStateChange : String by attributeStringOnReadyStateChange
    var onDragEnter : String by attributeStringOnDragEnter
    var onWaiting : String by attributeStringOnWaiting
    var onPause : String by attributeStringOnPause
    var onEmptied : String by attributeStringOnEmptied
    var onSelect : String by attributeStringOnSelect
    var onLoadStart : String by attributeStringOnLoadStart
    var onDragOver : String by attributeStringOnDragOver
    var onSuspend : String by attributeStringOnSuspend
    var onMouseUp : String by attributeStringOnMouseUp
    var onMouseMove : String by attributeStringOnMouseMove
    var onMouseOut : String by attributeStringOnMouseOut
    var onPlay : String by attributeStringOnPlay
    var onCanPlayThrough : String by attributeStringOnCanPlayThrough
    var onEnded : String by attributeStringOnEnded
    var onBlur : String by attributeStringOnBlur
    var onDrop : String by attributeStringOnDrop
    var onInvalid : String by attributeStringOnInvalid
    var onSubmit : String by attributeStringOnSubmit

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

