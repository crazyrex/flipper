/*
 *  Copyright (c) 2004-present, Facebook, Inc.
 *
 *  This source code is licensed under the MIT license found in the LICENSE
 *  file in the root directory of this source tree.
 *
 */
package com.facebook.flipper.android;

import com.facebook.jni.HybridClassBase;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.soloader.SoLoader;
import com.facebook.flipper.BuildConfig;

@DoNotStrip
class EventBase extends HybridClassBase {
  static {
    if (BuildConfig.IS_INTERNAL_BUILD) {
      SoLoader.loadLibrary("flipper");
    }
  }

  EventBase() {
    initHybrid();
  }

  @DoNotStrip
  native void loopForever();

  @DoNotStrip
  private native void initHybrid();
}
