// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tangem.commands.verifycard

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class ArtworkInfoJsonAdapter(
  moshi: Moshi
) : JsonAdapter<ArtworkInfo>() {
  private val options: JsonReader.Options = JsonReader.Options.of("id", "hash", "date")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "id")

  @Volatile
  private var constructorRef: Constructor<ArtworkInfo>? = null

  override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("ArtworkInfo").append(')') }

  override fun fromJson(reader: JsonReader): ArtworkInfo {
    var id: String? = null
    var hash: String? = null
    var date: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          id = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("id", "id", reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          hash = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("hash", "hash", reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          date = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("date", "date", reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    @Suppress("UNCHECKED_CAST")
    val localConstructor: Constructor<ArtworkInfo> = this.constructorRef ?:
        ArtworkInfo::class.java.getDeclaredConstructor(String::class.java, String::class.java,
        String::class.java, Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
        this.constructorRef = it }
    return localConstructor.newInstance(
        id,
        hash,
        date,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: ArtworkInfo?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("id")
    stringAdapter.toJson(writer, value.id)
    writer.name("hash")
    stringAdapter.toJson(writer, value.hash)
    writer.name("date")
    stringAdapter.toJson(writer, value.date)
    writer.endObject()
  }
}