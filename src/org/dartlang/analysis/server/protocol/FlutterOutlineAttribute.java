/*
 * Copyright 2018 The Chromium Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the LICENSE file.
 */
package org.dartlang.analysis.server.protocol;

import com.google.common.collect.Lists;
import com.google.dart.server.utilities.general.ObjectUtilities;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * An attribute for a FlutterOutline.
 *
 * @coverage dart.server.generated.types
 */
@SuppressWarnings({"unused", "LocalCanBeFinal"})
public class FlutterOutlineAttribute {

  public static final FlutterOutlineAttribute[] EMPTY_ARRAY = new FlutterOutlineAttribute[0];

  public static final List<FlutterOutlineAttribute> EMPTY_LIST = Lists.newArrayList();

  /**
   * The name of the attribute.
   */
  private final String name;

  /**
   * The label of the attribute value, usually the Dart code. It might be quite long, the client
   * should abbreviate as needed.
   */
  private final String label;

  /**
   * The boolean literal value of the attribute. This field is absent if the value is not a boolean
   * literal.
   */
  private final Boolean literalValueBoolean;

  /**
   * The integer literal value of the attribute. This field is absent if the value is not an integer
   * literal.
   */
  private final Integer literalValueInteger;

  /**
   * The string literal value of the attribute. This field is absent if the value is not a string
   * literal.
   */
  private final String literalValueString;

  /**
   * Constructor for {@link FlutterOutlineAttribute}.
   */
  public FlutterOutlineAttribute(String name,
                                 String label,
                                 Boolean literalValueBoolean,
                                 Integer literalValueInteger,
                                 String literalValueString) {
    this.name = name;
    this.label = label;
    this.literalValueBoolean = literalValueBoolean;
    this.literalValueInteger = literalValueInteger;
    this.literalValueString = literalValueString;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof FlutterOutlineAttribute) {
      FlutterOutlineAttribute other = (FlutterOutlineAttribute)obj;
      return
        ObjectUtilities.equals(other.name, name) &&
        ObjectUtilities.equals(other.label, label) &&
        ObjectUtilities.equals(other.literalValueBoolean, literalValueBoolean) &&
        ObjectUtilities.equals(other.literalValueInteger, literalValueInteger) &&
        ObjectUtilities.equals(other.literalValueString, literalValueString);
    }
    return false;
  }

  public static FlutterOutlineAttribute fromJson(JsonObject jsonObject) {
    String name = jsonObject.get("name").getAsString();
    String label = jsonObject.get("label").getAsString();
    Boolean literalValueBoolean =
      jsonObject.get("literalValueBoolean") == null ? null : jsonObject.get("literalValueBoolean").getAsBoolean();
    Integer literalValueInteger = jsonObject.get("literalValueInteger") == null ? null : jsonObject.get("literalValueInteger").getAsInt();
    String literalValueString = jsonObject.get("literalValueString") == null ? null : jsonObject.get("literalValueString").getAsString();
    return new FlutterOutlineAttribute(name, label, literalValueBoolean, literalValueInteger, literalValueString);
  }

  public static List<FlutterOutlineAttribute> fromJsonArray(JsonArray jsonArray) {
    if (jsonArray == null) {
      return EMPTY_LIST;
    }
    ArrayList<FlutterOutlineAttribute> list = new ArrayList<>(jsonArray.size());
    Iterator<JsonElement> iterator = jsonArray.iterator();
    //noinspection WhileLoopReplaceableByForEach
    while (iterator.hasNext()) {
      list.add(fromJson(iterator.next().getAsJsonObject()));
    }
    return list;
  }

  /**
   * The label of the attribute value, usually the Dart code. It might be quite long, the client
   * should abbreviate as needed.
   */
  public String getLabel() {
    return label;
  }

  /**
   * The boolean literal value of the attribute. This field is absent if the value is not a boolean
   * literal.
   */
  public Boolean getLiteralValueBoolean() {
    return literalValueBoolean;
  }

  /**
   * The integer literal value of the attribute. This field is absent if the value is not an integer
   * literal.
   */
  public Integer getLiteralValueInteger() {
    return literalValueInteger;
  }

  /**
   * The string literal value of the attribute. This field is absent if the value is not a string
   * literal.
   */
  public String getLiteralValueString() {
    return literalValueString;
  }

  /**
   * The name of the attribute.
   */
  public String getName() {
    return name;
  }

  @Override
  public int hashCode() {
    return name.hashCode();
  }

  public JsonObject toJson() {
    JsonObject jsonObject = new JsonObject();
    jsonObject.addProperty("name", name);
    jsonObject.addProperty("label", label);
    if (literalValueBoolean != null) {
      jsonObject.addProperty("literalValueBoolean", literalValueBoolean);
    }
    if (literalValueInteger != null) {
      jsonObject.addProperty("literalValueInteger", literalValueInteger);
    }
    if (literalValueString != null) {
      jsonObject.addProperty("literalValueString", literalValueString);
    }
    return jsonObject;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    builder.append("name=");
    builder.append(name + ", ");
    builder.append("label=");
    builder.append(label + ", ");
    builder.append("literalValueBoolean=");
    builder.append(literalValueBoolean + ", ");
    builder.append("literalValueInteger=");
    builder.append(literalValueInteger + ", ");
    builder.append("literalValueString=");
    builder.append(literalValueString);
    builder.append("]");
    return builder.toString();
  }
}
