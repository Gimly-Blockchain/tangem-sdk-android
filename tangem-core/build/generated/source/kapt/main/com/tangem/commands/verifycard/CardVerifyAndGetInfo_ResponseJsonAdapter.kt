// Code generated by moshi-kotlin-codegen. Do not edit.
package com.tangem.commands.verifycard

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class CardVerifyAndGetInfo_ResponseJsonAdapter(
  moshi: Moshi
) : JsonAdapter<CardVerifyAndGetInfo.Response>() {
  private val options: JsonReader.Options = JsonReader.Options.of("results")

  private val nullableListOfItemAdapter: JsonAdapter<List<CardVerifyAndGetInfo.Response.Item>?> =
      moshi.adapter(Types.newParameterizedType(List::class.java,
      CardVerifyAndGetInfo.Response.Item::class.java), emptySet(), "results")

  @Volatile
  private var constructorRef: Constructor<CardVerifyAndGetInfo.Response>? = null

  override fun toString(): String = buildString(51) {
      append("GeneratedJsonAdapter(").append("CardVerifyAndGetInfo.Response").append(')') }

  override fun fromJson(reader: JsonReader): CardVerifyAndGetInfo.Response {
    var results: List<CardVerifyAndGetInfo.Response.Item>? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          results = nullableListOfItemAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
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
    val localConstructor: Constructor<CardVerifyAndGetInfo.Response> = this.constructorRef ?:
        CardVerifyAndGetInfo.Response::class.java.getDeclaredConstructor(List::class.java,
        Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef =
        it }
    return localConstructor.newInstance(
        results,
        mask0,
        null
    )
  }

  override fun toJson(writer: JsonWriter, value: CardVerifyAndGetInfo.Response?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("results")
    nullableListOfItemAdapter.toJson(writer, value.results)
    writer.endObject()
  }
}
