
// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../net/android/keystore.h

package org.chromium.net;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    PrivateKeyType.RSA, PrivateKeyType.ECDSA, PrivateKeyType.INVALID
})
@Retention(RetentionPolicy.SOURCE)
public @interface PrivateKeyType {
  int RSA = 0;
  /**
   * Obsolete: DSA = 1,
   */
  int ECDSA = 2;
  int INVALID = 255;
}
