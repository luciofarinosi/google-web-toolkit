/*
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package elemental.js.util;

import com.google.gwt.core.client.JavaScriptObject;

import elemental.util.MapFromIntToString;

/**
 * JavaScript native implementation of {@link MapFromIntToString}.
 */
public final class JsMapFromIntToString extends JavaScriptObject implements MapFromIntToString {
  /**
   * Create a new empty map instance.
   */
  public static JsMapFromIntToString create() {
    return JavaScriptObject.createArray().cast();
  }

  protected JsMapFromIntToString() {
  }

  public native String get(int key) /*-{
    return this[key];
  }-*/;

  public boolean hasKey(int key) {
    return JsMapFromIntTo.hasKey(this, key);
  }

  public JsArrayOfInt keys() {
    return JsMapFromIntTo.keys(this);
  }

  public native void put(int key, String value) /*-{
    this[key] = value;
  }-*/;

  public void remove(int key) {
    JsMapFromIntTo.remove(this, key);
  }

  public native void set(int key, String value) /*-{
    this[key] = value;
  }-*/;

  public JsArrayOfString values() {
    return JsMapFromStringTo.values(this);
  }
}
